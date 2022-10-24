<template>
  <div>
    <b-row>
      <b-col class="left">
        <b-card>
          <img src="~/static/login.jpg" width="100%" height="100%" />
        </b-card>
      </b-col>
      <b-col class="right">
        <b-card>
          <h3>Entrar</h3>
          <p class="label instrucao">
            Insira os seus dados para realizar o login.
          </p>
          <b-form @submit="onSubmit" @reset="onReset">
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
            <b-button class="enviar-login" type="submit" v-on:click="criaLogin"
              >Enviar</b-button
            >
          </b-form>
        </b-card>
      </b-col>
    </b-row>
    <itemFooter></itemFooter>
  </div>
</template>

<script>
import itemFooter from '~/components/itemFooter.vue'
export default {
  components: { itemFooter },
  name: 'IndexPage',

  data() {
    return {
      form: {
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
    criaLogin() {
      this.$axios.post('/usuario', {
        nome: this.form.nome,
        email: this.form.email,
        senha: this.form.senha,
      })
      this.$router.push('/tela-jogar')
    },
  },
}
</script>
<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');

body {
  background-color: rgb(247, 239, 204);
  font-family: 'Montserrat', sans-serif;
  font-size: 16px;
  color: black;
}

h3 {
  font-weight: bold;
}

.input,
.enviar-login,
h3 {
  margin-top: 24px;
  margin-bottom: 24px;
}

.enviar-login {
  height: 44px;
  font-weight: bold;
  width: 100%;
  border: none;
  border-radius: 6px;
  box-shadow: 3px 3px 3px #9b9b9b;
  cursor: pointer;
  background-color: black;
  color: white;
  margin-top: 12px;
}

.enviar-login:hover {
  background-color: rgba(0, 0, 0, 87%);
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

.row {
  margin: 2%;
  margin-bottom: 4%;
  height: 100%;
}

.card {
  height: 100%;
  border: none;
  box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;
}

@media only screen and (max-device-width: 700px) {
  body {
    background-color: white;
  }

  .left {
    display: none !important;
  }

  .card {
    border: none;
    width: 100%;
    height: 100%;
    box-shadow: none;
  }
}
</style>