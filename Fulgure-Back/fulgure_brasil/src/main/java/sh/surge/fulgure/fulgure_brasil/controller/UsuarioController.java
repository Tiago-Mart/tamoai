package sh.surge.fulgure.fulgure_brasil.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sh.surge.fulgure.fulgure_brasil.model.Usuario;
import sh.surge.fulgure.fulgure_brasil.repository.UsuarioRepository;

@CrossOrigin
@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuario")
    public List<Usuario> recuperaQuestoes() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> RecuperaUsuarioPeloId(@PathVariable("id") Long id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping("/usuario")
    public void adicionaUsuario(@RequestBody Usuario novoUsuario) {
        usuarioRepository.save(novoUsuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void deletaUsuario(@PathVariable("id") Long id) {
        usuarioRepository.deleteById(id);
    }
}
