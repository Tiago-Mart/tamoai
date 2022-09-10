<template>
  <div>
    <barraNav class="nav"></barraNav>

    <b-container>
      <menuHamburguer class="menu"></menuHamburguer>

      <b-container class="containerQuestao">
        <b-button class="vidas" type="button">
          <img src="~/static/coracao.png" />
          <span>3</span>
        </b-button>

        <b-button class="timer" type="button">
          <span>00:30</span>
          <img src="~/static/relogio.png" />
        </b-button>
        <b-container id="containerDica">
          <h1>
            Dica
            <img src="~/static/iconFechar.png" @click="showDica" />
          </h1>
          <b-container class="conteudoDica">
            <p>{{ questao.dica }}</p>
            <p align="center">Você possui 9 dicas restantes.</p>
          </b-container>
        </b-container>

        <h1 class="identificador">Questão {{ questao.id }}</h1>
        <b-container class="questao">
          <p align="justify">
            {{ questao.comando }}
          </p>
          <b-form-radio-group id="grupo1">
            <b-form-radio
              v-for="alternativa in questao.alternativas"
              :key="alternativa"
              class="alternativa"
            >
              {{ alternativa }}</b-form-radio
            >
            <span></span>
          </b-form-radio-group>
        </b-container>
        <b-button-toolbar class="botoes">
          <NuxtLink v-bind:to="`/questao/${questao.id - 1}`">
            <b-button class="voltar">
              <img src="~/static/voltar.png" />
            </b-button>
          </NuxtLink>
          <b-button-group class="centralizar">
            <b-button class="dica" @click="showDica">
              Dica
              <img src="~/static/lampada.PNG" />
            </b-button>
            <b-button class="pular">
              Pular
              <img src="~/static/coracaoPartido.PNG" />
            </b-button>
          </b-button-group>
          <NuxtLink v-bind:to="`/questao/${questao.id + 1}`">
            <b-button class="avancar">
              <img src="~/static/avancar.png" />
            </b-button>
          </NuxtLink>
        </b-button-toolbar>
        <b-button class="responder">
          Responder
          <img src="~/static/seta.PNG" />
        </b-button>
      </b-container>
    </b-container>
  </div>
</template>

<script>
import menuHamburguer from '~/components/menuHamburguer.vue'
import barraNav from '~/components/barraNav.vue'
export default {
  components: { menuHamburguer, barraNav },

  async asyncData({ $axios, route }) {
    const idQuestao = route.params.questao
    const resposta = await $axios.get('/questao/' + idQuestao)
    const questao = resposta.data
    return { questao }
  },

  data() {
    return {}
  },
  methods: {
    showDica() {
      const dica = document.getElementById('containerDica')
      if (dica.style.display === 'block') {
        dica.style.display = 'none'
      } else {
        dica.style.display = 'block'
      }
    },
  },
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');
body {
  background-image: url('../../static/main2.png') !important;
  background-repeat: no-repeat;
  background-size: cover;
  font-family: 'Montserrat', sans-serif;
  font-size: 16px;
}

.menu {
  display: none;
}

.fundo {
  float: left;
  width: 50%;
  top: 0;
  left: 0;
}

.containerQuestao {
  float: right;
  width: 50%;
}

.dicaTxt {
  margin-top: 30px;
  display: none;
}

.vidas {
  width: 80px;
  height: 40px;
  border-radius: 37px;
  color: white;
  display: inline-block;
  flex-direction: left;
  background-color: #345fcd;
  border: none;
  box-shadow: 2px 2px 2px #c4c4c4;
  font-weight: bolder;
}

.vidas img {
  width: 26px;
  height: 20px;
}

.timer {
  background-color: transparent;
  border: none;
  color: black;
  width: 125px;
  height: 50px;
  border-radius: 37px;
  float: right;
  font-weight: bolder;
  font-size: 22px;
}

.timer img {
  width: 30px;
  height: 28px;
}

.timer:hover {
  background-color: transparent;
  color: black;
}

.questao,
.identificador {
  box-shadow: 3px 3px 3px #9b9b9b;
  border-radius: 6px;
}

.voltar,
.avancar {
  background-color: transparent;
  border: none;
}

.voltar img,
.avancar img {
  width: 20px;
  height: 30px;
}

.dica,
.pular {
  font-size: 14px;
  font-weight: bolder;
  color: black;
  background-color: #ffc700;
  width: 85px;
  height: 41px;
  border-radius: 37px;
  border: none;
  box-shadow: 2px 2px 2px #c4c4c4;
}

.dica img {
  height: 21px;
  width: 20px;
}

.pular {
  width: 90px;
}

.pular img {
  height: 14px;
  width: 18px;
}

.responder {
  font-weight: bold;
  color: white;
  background-color: #3d9a8a;
  width: 150px;
  height: 41px;
  border-radius: 37px;
  display: block;
  flex-direction: center;
  border: none;
}

.responder img {
  width: 21px;
  height: 19px;
}

.identificador {
  background-color: black;
  font-size: 30px;
  font-weight: bolder;
  text-align: center;
  color: white;
  margin-top: 10%;
  margin-bottom: 10px;
  padding: 4px 0;
}

.questao p {
  color: black;
  margin-top: 0;
}

.botoes {
  width: 100%;
  margin-top: 60px;
  display: flex;
  justify-content: center;
}

.responder {
  margin: 0 auto;
  margin-top: 50px;
  margin-bottom: 50px;
}

.centralizar {
  margin-left: 5%;
  margin-right: 5%;
}

.alternativa {
  display: block;
}

.dica:hover,
.pular:hover {
  background-color: #ffc700;
}

.vidas:hover {
  background-color: #345fcd;
}

.responder:hover {
  background-color: #3d9a8a;
}

#containerDica {
  z-index: 3;
  display: none;
  margin-top: 20px;
  text-align: center;
}

#containerDica h1,
.conteudoDica {
  box-shadow: 3px 3px 3px #9b9b9b;
  border-radius: 6px;
}

#containerDica h1 {
  background-color: black;
  font-size: 30px;
  font-weight: bolder;
  text-align: center;
  color: white;
  padding: 4px 0;
  margin-bottom: 5px;
}

.conteudoDica {
  color: black;
  margin-top: 0;
}

#containerDica h1 img {
  cursor: pointer;
  width: 27px;
  height: 27px;
  border-radius: 50%;
  display: block;
  float: right;
  margin-right: 5px;
}

@media only screen and (max-device-width: 1000px) {
  body {
    background-image: none !important;
  }

  .containerQuestao {
    width: 100%;
  }

  .nav {
    display: none;
  }

  .menu {
    display: block;
  }
}

@media only screen and (min-device-width: 1800px) {
  .containerQuestao {
    width: 80%;
    transform: translateX(35%);
  }
}

@media only screen and (min-device-width: 2000px) {
  .containerQuestao {
    width: 100%;
    transform: translateX(40%);
  }

  .questao {
    margin: 0;
  }
}
</style>