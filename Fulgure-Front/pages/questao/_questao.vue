<template>
  <div>
    <itemNav></itemNav>
    <itemProgress></itemProgress>
    <b-button-toolbar key-nav aria-label="Toolbar with button groups" class="toolbar-top">
      <b-button class="left box-btn" id="timer"><img src="~/static/relogio.png" /><span id="timer-span"></span>
      </b-button>
      <b-button class="right box-btn" variant="danger"><img src="~/static/coracao.png" width="20px" height="20px" />3</b-button>
    </b-button-toolbar>
    <b-card class="mb-2 box">
      <b-card-title> Questão 1</b-card-title>
      <b-card-text>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sit amet
        tellus vitae neque dignissim accumsan id sed ipsum. Nulla non tempor
        purus. Phasellus pulvinar elit ante, ullamcorper scelerisque nisi
        faucibus in. Maecenas pretium malesuada ligula non sodales. Suspendisse
        potenti. Interdum et malesuada fames ac ante ipsum primis in faucibus.
        Orci varius natoque penatibus et magnis dis parturient montes, nascetur
        ridiculus mus. Nunc ex enim, euismod nec cursus ac, mattis at purus.
        Aliquam libero erat, ultricies in lacus a, fermentum pharetra orci.
      </b-card-text>
      <b-form-radio-group id="grupo1">
        <b-form-radio class="alternativas"> Lorem ipsum </b-form-radio>
        <b-form-radio class="alternativas"> Lorem ipsum </b-form-radio>
        <b-form-radio class="alternativas"> Lorem ipsum </b-form-radio>
        <b-form-radio class="alternativas"> Lorem ipsum </b-form-radio>
        <b-form-radio class="alternativas"> Lorem ipsum </b-form-radio>
      </b-form-radio-group>
    </b-card>
    <b-card class="bttns bottom">
      <b-button-toolbar key-nav aria-label="Toolbar with button groups">
        <b-button class="left btn seta box-btn">&lsaquo;</b-button>
        <itemDica></itemDica>
        <b-button v-on:click="timerStart" class="enviar btn box-btn">Enviar</b-button>
        <itemPular></itemPular>
        <b-button class="right btn seta box-btn">&rsaquo;</b-button>
      </b-button-toolbar>
    </b-card>
    <itemFooter></itemFooter>
  </div>
</template>

<script>
import itemNav from '~/components/itemNav.vue'
import itemFooter from '~/components/itemFooter.vue'
import itemProgress from '~/components/itemProgress.vue'
import itemDica from '~/components/itemDica.vue'
import itemPular from '~/components/itemPular.vue'

export default {
  components: { itemNav, itemFooter, itemProgress, itemDica, itemPular },

  methods: {
    startTimer() {
      const duration = 60 * 2;
      const display = document.querySelector('#timer-span');
      let timer = duration;
      let minutes, seconds;
      setInterval(function () {
        minutes = parseInt(timer / 60, 10);
        seconds = parseInt(timer % 60, 10);
        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;
        display.textContent = minutes + ":" + seconds;
        if (--timer < 0) {
          timer = duration;
        }
      }, 1000);
    }
  },
  mounted() {
    this.startTimer() // Calls the method before page loads
  }

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
  background-image: none !important;
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

.toolbar-top {
  display: flex;
  margin-bottom: 20px;
  justify-content: space-between;
  width: 80%;
  margin: 0 auto;
  margin-bottom: 40px;
  margin-top: 40px;
}

.enviar {
  margin: 0 5px;
  background-color: rgb(0, 137, 9);

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

.toolbar-top .left {
  display: inline-block;
  flex-direction: left;
}

.toolbar-top .right {
  float: right;
}

.toolbar-top .left img {
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

.seta {
  background-color: #007bff;
}

.seta:hover{
  background-color: #0766cc;
}

.enviar:hover {
  background-color: rgb(3, 110, 10);
}

.btn {
  border: none;
}

.inferior {
  margin: 0 20px;
}

.box {
  box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px !important;
}

.box-btn {
  box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
}

.footer {
  margin-top: 200px;
}

#timer {
  background-color: transparent;
  display: block;
  color: black;
  cursor: default;
}

@media only screen and (max-device-width: 500px) {
  .card {
    border: none;
    width: 100%;
    box-shadow: none !important;
  }

  .footer {
    margin-top: 50px;
  }

  .toolbar-top {
    width: 90%;
  }
}
</style>