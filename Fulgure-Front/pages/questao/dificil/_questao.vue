<template>
  <div>
    <itemNav></itemNav>
    <itemProgress></itemProgress>
    <b-card class="bttns" name="bttns">
      <b-button name="relogio" class="left relogio"
        ><img src="~/static/relogio.png" width="30px" height="30px" />
        <span id="hour">00</span>:<span id="second">00</span>
      </b-button>
      <b-button class="right coracao"
        ><img
          src="~/static/coracao.png"
          width="22px"
          height="22px"
        />3</b-button
      >
    </b-card>
    <b-card class="mb-2 box">
      <b-card-title> Questão {{ questao.id }}</b-card-title>
      <b-card-text> {{ questao.comando }} </b-card-text>
      <b-form-radio-group id="grupo1">
        <b-form-radio
          v-for="alternativa in questao.alternativas"
          :key="alternativa"
          class="alternativas"
        >
          {{ alternativa }}
        </b-form-radio>
      </b-form-radio-group>
    </b-card>
    <b-card class="bttns bottom">
      <b-button-toolbar
        class="teste"
        key-nav
        aria-label="Toolbar with button groups"
      >
        <NuxtLink v-bind:to="`/questao/dificil/${questao.id - 1}`"
          ><b-button class="left seta inferior">&lsaquo;</b-button></NuxtLink
        >
        <itemDica class="inferior"></itemDica>
        <b-button class="enviar inferior">Enviar</b-button>
        <b-button class="pular inferior"
          ><img
            src="~/static/coracaoPartido.png"
            width="20px"
            height="20px"
          />Pular</b-button
        >
        <NuxtLink v-bind:to="`/questao/dificil/${questao.id + 1}`"
          ><b-button class="right seta inferior">&rsaquo;</b-button></NuxtLink
        >
      </b-button-toolbar>
    </b-card>
    <itemFooter class="footer"></itemFooter>
  </div>
</template>

<script>
import itemNav from '~/components/itemNav.vue'
import itemFooter from '~/components/itemFooter.vue'
import itemProgress from '~/components/itemProgress.vue'
import itemDica from '~/components/itemDica.vue'

export default {
  components: { itemNav, itemFooter, itemProgress, itemDica },

  async asyncData({ $axios, route }) {
    const idQuestao = route.params.questao
    const resposta = await $axios.get('/questao/' + idQuestao)
    const questao = resposta.data
    return { questao }
  },
}
</script>

<style>
* {
  width: auto;
  height: auto;
  box-sizing: border-box;
  text-align: justify;
}

img {
  width: 24px;
  height: 24px;
}

body {
  height: 100%;
}

.nav {
  margin-bottom: 0;
}

.card {
  width: 80%;
  margin: 0 auto;
}

.alternativas {
  display: block;
}

.btn-toolbar {
  display: flex;
  justify-content: center;
  margin-top: 25px;
  width: 100%;
}

.enviar {
  margin: 0 5px;
}

.bttns {
  border: none;
}

.start {
  display: flex;
  justify-content: flex-start;
}

.end {
  display: flex;
  justify-content: flex-end;
}

.bttns .left {
  display: inline-block;
  flex-direction: left;
}

.bttns .right {
  float: right;
}

.left img {
  margin-right: 5px;
}

.btn-toolbar {
  height: 100%;
}

.bottom .left {
  margin-right: 10px;
}

.bottom .right {
  margin-left: 10px;
}

.relogio {
  background-color: #434343;
}

.seta {
  background-color: #007bff;
}

.coracao {
  background-color: red;
}

.relogio:active {
  background-color: white;
}

.pular {
  background-color: rgb(251, 192, 30);
}

.enviar {
  background-color: rgb(0, 137, 9);
}

.btn {
  border: none;
}

.inferior {
  margin: 0 20px;
}

.box {
  box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;
}

@media only screen and (max-device-width: 500px) {
  .card {
    border: none;
    width: 100%;
  }
}
</style>