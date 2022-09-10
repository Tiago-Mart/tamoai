<template>
  <b-container>
    <b-container id="perfil">
        <b-avatar src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3d8QKDpPCuKQ8e1y0KuxR5dzT5mKeMtxANIVLM7s2YByc-ZDJmDOazuEV1ZsRTBCo3-s&usqp=CAU" class="img"></b-avatar>
        <h1 id>{{ usuario.nome }}</h1>
        <p id = "email">O email do usuário é: {{ usuario.email }}</p>
        <p id = "senha">A senha do usuário é: {{ usuario.senha }}</p>
        <b-button class="button" v-on:click="deletaUsuario">Excluir</b-button>
        <p id="delete"></p>
    </b-container>
    <b-container id="lixeira"></b-container>
  </b-container>
</template>

<script>
export default {
  async asyncData({ $axios, route }) {
    const idUsuario = route.params.usuario
    const resposta = await $axios.get('/usuario/' + idUsuario)
    const usuario = resposta.data
    return { usuario }
  },
  methods: {
    deletaUsuario() {
      const id = this.$route.params.usuario
      this.$axios.delete('/usuario/' + id)
      const resposta = document.getElementById("delete")
      resposta.innerHTML = "Usuário excluído com sucesso! Volte para a página anterior."
    },
  },
}

</script>

<style>
  #perfil {
    border-radius: 10px;
    margin-bottom: 20px;
    width: 85%;
    margin: auto;
    box-shadow: 3px 3px 3px 3px #9b9b9b;
    background-color: white;
    margin-top: 120px;
    padding: 30px;
  }

  #perfil .img{
    display: block;
    margin: 10px auto;
    height: 80px;
    width: 80px;
    border: solid 0.5px blue;
  }

  h1{
    margin: 20px 0;
  }

  .button{
    background-color: red;
    box-shadow: 2px 2px 2px #b6b4b4;
    border: none;
    font-weight: bold;
  }

  #delete{
    display: block;
    margin: auto;
    margin-top: 20px;
    margin-bottom: 0px;
  }

</style>