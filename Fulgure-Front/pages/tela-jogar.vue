<template>
  <div>
    <itemNav class="nav"></itemNav>
    <b-container class="bv-example-row">
      <b-row>
        <b-col>
          <b-jumbotron>
            <h1>Fulgure, Brasil!</h1>
            <p>Lorem Ipsum is simply dummy text of the printing and typesetting
              industry. Lorem Ipsum has been the industry's standard dummy text ever
              since the 1500s, when an unknown printer took a galley of type and
              scrambled it to make a type specimen book. It has survived not only
              five centuries, but also the leap into electronic typesetting,
              remaining essentially unchanged. It was popularised in the 1960s with
              the release of Letraset sheets containing Lorem Ipsum passages, and
              more recently with desktop publishing software like Aldus PageMaker
              including versions of Lorem Ipsum.</p>
            <itemCarrossel></itemCarrossel>
          </b-jumbotron>
        </b-col>
        <b-col>
          <b-card title="Fácil" class="facil mb-2">
            <b-card-text>
              Some quick example text to build on the card title and make up the bulk of the card's content.
            </b-card-text>

            <b-button href="#" v-on:click="rotaFacil" class="bttn">Jogar</b-button>
          </b-card>
          <b-card title="Médio" class="medio mb-2">
            <b-card-text>
              Some quick example text to build on the card title and make up the bulk of the card's content.
            </b-card-text>

            <b-button href="#" v-on:click="rotaMedio" class="bttn">Jogar</b-button>
          </b-card>
          <b-card title="Difícil" class="dificil mb-2">
            <b-card-text>
              Some quick example text to build on the card title and make up the bulk of the card's content.
            </b-card-text>
            <b-button href="#" v-on:click="rotaDificil" class="bttn">Jogar</b-button>
          </b-card>
        </b-col>
      </b-row>
    </b-container>
    <itemFooter></itemFooter>
  </div>
</template>

<script>
import itemNav from '~/components/itemNav.vue'
import itemCarrossel from '~/components/itemCarrossel.vue'
import itemFooter from '~/components/itemFooter.vue'

export default {
  components: { itemNav, itemFooter, itemCarrossel },
  methods: {
    rotaFacil() {
      this.$router.push('/questao/facil')
    },
    rotaMedio() {
      this.$router.push('/questao/medio')
    },
    rotaDificil() {
      this.$router.push('/questao/dificil')
    }
  }
}

</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');

* {
  width: auto;
  height: auto;
  box-sizing: border-box;
  text-align: justify;
}

body {
  background-color: white !important;
}

.card {
  border-radius: 5px;
  border-color: transparent;
}

.jumbotron,
.col {
  margin: 0;
}

.col {
  margin-top: 20px;
}

.jumbotron {
  background-color: #ffff;
  padding: 40px;
  box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px;

}

.facil {
  background-color: #4ec96fe3;
}

.medio {
  background-color: #f3d500;
}

.dificil {
  background-color: #6bbef9;
}

.bttn {
  background-color: white;
  border-color: transparent;
  box-shadow: rgba(50, 50, 93, 0.25) 0px 50px 100px -20px, rgba(0, 0, 0, 0.3) 0px 30px 60px -30px;
  color: black;
}

.bttn:hover {
  background-color: white;
  font-weight: bolder;
  border-color: transparent;
  color: black;
}

@media only screen and (max-device-width: 900px) {
  .row {
    display: block;
  }
}
</style>