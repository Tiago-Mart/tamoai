<template>
  <b-container>
    <MenuHamburguer class="menu"> </MenuHamburguer>
    <h3>Cadastrar</h3>
    <p class="label instrucao">
      Insira os seus dados para realizar o cadastro.
    </p>
    <b-form @submit="onSubmit" @reset="onReset">
      <p class="label">Nome</p>
      <b-form-input
        class="nome input"
        type="text"
        placeholder="Seu nome"
        v-model="form.nome"
        required
      ></b-form-input>
      <p class="label">Email</p>
      <b-form-input
        class="email input"
        type="email"
        placeholder="example@mail.com"
        v-model="form.email"
        required
      >
      </b-form-input>
      <p class="label">Senha</p>
      <b-form-input
        class="senha input"
        type="password"
        placeholder="••••••••••••••••••"
        v-model="form.senha"
        required
      >
      </b-form-input>
      <b-form-checkbox class="check"
        >Eu li e concordo com os <span>termos de uso</span>.</b-form-checkbox
      >
      <b-button class="enviar" type="submit" v-on:click="criaCadastro"
        >Enviar</b-button
      >
      <b-button class="google" type="button">
        <img src="~/static/google.png" />
        Cadastrar com Google
      </b-button>
      <h1 id="resposta"></h1>
    </b-form>
  </b-container>
</template>

<script>
import menuHamburguer from '~/components/menuHamburguer.vue'
export default {
  components: { menuHamburguer },
  name: 'IndexPage',
 
  data() {
    return {
      form: {
        nome: '',
        email: '',
        senha: '',
      },
      show: true,
    }
  },
  methods: {
    onSubmit(event) {
      event.preventDefault()
      alert(JSON.stringify(this.form))
    },
    onReset(event) {
      event.preventDefault()
      this.form.nome = ''
      this.form.email = ''
      this.form.senha = null
      this.show = false
      this.$nextTick(() => {
        this.show = true
      })
    },
    criaCadastro() {
      this.$axios.post('/usuario', {
        nome: this.form.nome,
        email: this.form.email,
        senha: this.form.senha,
      })
      this.$router.push('/tela-usuario')
    },
  },
}
</script>
<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');
body {
  background-image: none !important;
  font-family: 'Montserrat', sans-serif;
  font-size: 16px;
  color: black;
}

h3 {
  font-weight: bolder;
}

.input,
.enviar,
.google,
h3 {
  margin-bottom: 24px;
}

.enviar,
.google {
  height: 44px;
  font-weight: bold;
  width: 100%;
  border: none;
  border-radius: 6px;
  box-shadow: 3px 3px 3px #9b9b9b;
  cursor: pointer;
}

.enviar {
  background-color: black;
  color: white;
  margin-top: 6px;
}

.enviar:hover {
  background-color: rgba(0, 0, 0, 87%);
}

.google {
  background-color: white;
  color: black;
}

.google img {
  width: 25px;
  height: 25px;
  margin-right: 10px;
}

.google:hover {
  background-color: transparent;
  color: blue;
}

.label {
  margin-bottom: 14px;
}

.check {
  color: rgb(129, 129, 129);
}

.check span {
  color: blue;
}

.instrucao {
  margin-bottom: 56px;
}
</style>
