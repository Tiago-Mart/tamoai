<template>
  <NuxtLink v-bind:to="`/questao/1`">
    <b-button class="botao">
      <img src="../static/start.JPG" />
    </b-button>
  </NuxtLink>
</template>

<script>
export default {
  props: ["questaoId"],
}
</script>

<style>
.botao {
  display: block;
  background-color: black;
  padding: 50px 50px 50px 60px;
  border-radius: 37px;
  margin: auto;
  justify-content: center;
  box-shadow: 2px 2px 2px #c4c4c4;
}
.botao:hover{
  background-color: black;
  border: 3px dashed white;
}
.botao img {
  margin: auto;
}
@media only screen and (max-device-width: 550px){
  .botao{
    width: 100px;
    height: 100px;
    padding: 0;
    padding-left: 5px;
  }
  .botao img{
    width: 50px;
    height: 50px;
  }
}
</style>