<template>
  <div>
    <itemNav></itemNav>
    <itemProgress></itemProgress>
    <b-card class="bttns">
      <b-button name = "relogio" class="left relogio"><img src="~/static/relogio.png" width="30px" height="30px" />
        <span id  = "hour">00</span>:<span id = "second">00</span>
      </b-button>      <b-button class="right coracao"><img src="~/static/coracao.png" width="20px" height="20px" />3</b-button>
    </b-card>
    <b-card class="mb-2">
      <b-card-title> Questão 1</b-card-title>
      <b-card-text>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sit amet tellus vitae neque dignissim accumsan
        id
        sed ipsum. Nulla non tempor purus. Phasellus pulvinar elit ante, ullamcorper scelerisque nisi faucibus in.
        Maecenas pretium malesuada ligula non sodales. Suspendisse potenti. Interdum et malesuada fames ac ante ipsum
        primis in faucibus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
        Nunc
        ex enim, euismod nec cursus ac, mattis at purus. Aliquam libero erat, ultricies in lacus a, fermentum pharetra
        orci. </b-card-text>
      <b-form-radio-group id="grupo1">
        <b-form-radio class="alternativas">
          Lorem ipsum
        </b-form-radio>
        <b-form-radio class="alternativas">
          Lorem ipsum
        </b-form-radio>
        <b-form-radio class="alternativas">
          Lorem ipsum
        </b-form-radio>
        <b-form-radio class="alternativas">
          Lorem ipsum
        </b-form-radio>
        <b-form-radio class="alternativas">
          Lorem ipsum
        </b-form-radio>
      </b-form-radio-group>

    </b-card>
    <b-card class="bttns bottom">
      <b-button-toolbar key-nav aria-label="Toolbar with button groups">
        <b-button class="left seta">&lsaquo;</b-button>
        <itemDica class = "inferior"></itemDica>
        <b-button class="enviar inferior">Enviar</b-button>
        <b-button class="pular inferior"><img src="~/static/coracaoPartido.png" width="20px" height="20px" />Pular</b-button>
        <b-button class="right seta inferior">&rsaquo;</b-button>
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

export default {
  components: { itemNav, itemFooter, itemProgress, itemDica },
}
</script>

<style>
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


.relogio{
   background-color: #434343;
}

.seta {
  background-color: #007bff;
}

.coracao{
  background-color: red;
}

.relogio:active{
  background-color: white;
}

.pular{
  background-color: rgb(251, 192, 30);
}

.enviar{
  background-color: rgb(0, 137, 9);
}

.btn{
  border: none;
}

.inferior{
  margin: 0 20px;
}

@media only screen and (max-device-width: 500px) {
  .card {
    border: none;
    width: 100%;
  }
}
</style>