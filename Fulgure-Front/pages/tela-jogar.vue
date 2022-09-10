<template>
  <div>
    <barraNav class="nav"></barraNav>
    <b-container>
      <menuHamburguer class="menu"></menuHamburguer>

      <div class="jogar">
        <h1>Fulgure, Brasil</h1>
        <iniciarJogo v-bind:questaoId="0" class="componente"></iniciarJogo>
      </div>
    </b-container>
    <img src="~/static/main.png" class="fundo" />
  </div>
</template>

<script>
import menuHamburguer from '~/components/menuHamburguer.vue'
import barraNav from '~/components/barraNav.vue'
import iniciarJogo from '~/components/iniciarJogo.vue'
export default {
  components: { iniciarJogo, menuHamburguer, barraNav },
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');
body {
  background-image: url("../static/main2.png");
  background-repeat: no-repeat;
  background-size: cover;
}

.jogar {
  width: 50%;
  height: 100%;
  float: right;
  display: grid;
  place-items: center;
}

.jogar h1 {
  text-align: center;
  font-size: 90px;
  font-family: 'League Spartan', sans-serif;
  font-weight: bolder;
  margin-top: 15%;
  margin-bottom: 10%;
}

.fundo {
  display: none;
}

.menu {
  display: none;
}

@media only screen and (max-device-width: 1000px) {
  body {
    background-image: none !important;
  }

  .fundo {
    display: block;
    width: 100% !important;
  }

  .jogar {
    width: 100%;
    padding-bottom: 40px;
    font-size: 60px;
  }

  .jogar h1 {
    margin-top: 10%;
  }

  .menu {
    display: block;
  }

  .nav {
    display: none;
  }
}

@media only screen and (min-device-width: 1800px) {
  .jogar h1 {
    font-size: 120px;
  }

  .jogar {
    width: 100%;
    transform: translateX(35%);
  }

}
</style>