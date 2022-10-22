<template>
  <div>
    <itemNav class="nav"></itemNav>
    <b-container class="bv-example-row">
      <b-row>
        <b-col>
          <b-jumbotron>
            <h1>Fulgure, Brasil!</h1>
            <p class="justify">Lorem Ipsum is simply dummy text of the printing and typesetting
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
          <b-card title="Fácil" class="dificuldade mb-2">
            <b-card-text>
              Some quick example text to build on the card title and make up the bulk of the card's content.
              Some quick example text to build on the card title and make up the bulk of the card's content.
            </b-card-text>

            <b-button href="#" variant="primary" v-on:click="rotaFacil">Jogar</b-button>
          </b-card>
          <b-card title="Médio" class="dificuldade mb-2">
            <b-card-text>
              Some quick example text to build on the card title and make up the bulk of the card's content.
            </b-card-text>

            <b-button href="#" variant="primary" v-on:click="rotaMedio">Jogar</b-button>
          </b-card>
          <b-card title="Difícil" class="dificuldade mb-2">
            <b-card-text>
              Some quick example text to build on the card title and make up the bulk of the card's content.
            </b-card-text>
            <b-button href="#" variant="primary" v-on:click="rotaDificil">Jogar</b-button>
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
    rotaFacil(){
      this.$router.push('/questao/facil')
    },
    rotaMedio(){
      this.$router.push('/questao/medio')
    },
    rotaDificil(){
      this.$router.push('/questao/dificil')
    }
  }
}

</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');

body{
  background-color: white !important;
}

.dificuldade{
  border: 0.5px rgb(151, 205, 151) solid;
  border-radius: 5px;
}

.jumbotron, .col{
  margin: 0;
}

.card-body{
  text-align: justify;
}

.col{
  margin-top: 20px;
}

.jumbotron{
  background-color: rgb(255, 244, 226);
  padding: 40px;
  border: solid 1px  #efefef;
}

* {
  box-sizing: border-box;
}

.justify {
  text-align: justify;
}

@media only screen and (max-device-width: 900px){
  .row{
    display: block;
  }
}

@media only screen and (max-device-width: 900px){
  .row{
    display: block;
  }
}

</style>