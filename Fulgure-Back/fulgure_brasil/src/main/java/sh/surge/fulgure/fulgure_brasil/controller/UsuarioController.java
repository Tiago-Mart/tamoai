package sh.surge.fulgure.fulgure_brasil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import sh.surge.fulgure.fulgure_brasil.model.Usuario;
import sh.surge.fulgure.fulgure_brasil.repository.UsuarioRepository;
import sh.surge.fulgure.fulgure_brasil.security.jwt.JwtUtils;

@RestController
@CrossOrigin
public class UsuarioController {
    @Autowired
    UsuarioRepository UsuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;
    
    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/usuario")
    public ResponseEntity<String> createUsuario(@RequestBody Usuario usuarioNovo){
        // Se encontrar no banco, não poderá criar um novo usuário
        boolean exists = UsuarioRepository.findByNome(usuarioNovo.getNome()).stream().count() > 0;
        // Mas não existir, cra o novo usuário no banco
        if(!exists){
            //criptografa a senha do usuário para por no banco de dados
            usuarioNovo.setSenha(
                passwordEncoder.encode(usuarioNovo.getSenha())
            );
            UsuarioRepository.save(usuarioNovo);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).build();    
    }

    @GetMapping("/usuario")
    public List<Usuario> getAllUsuarios(){
        return (List<Usuario>)UsuarioRepository.findAll();
    }
    
    @GetMapping("/usuario/me")
    public Usuario getMyInformations(@RequestHeader("Authorization") String token){
        // String token = headers.firstValue("Authorization").get();
        System.out.println(token);
        token = token.substring(7, token.length());
        String nome = jwtUtils.getUserNameFromJwtToken(token);
        return UsuarioRepository.findByNome(nome).get(0);
    }
}
