<template>
  <div class="page-holder bg-gray-100 mt-5">
    <b-container class="bv-example-row">
      <h1>Usuários</h1>

      <div :key="usuario.id" v-for="usuario in usuarios">
        <ItemListaUsuarios :idUsuario="usuario.id" :usuario="usuario.nome">
        </ItemListaUsuarios>
      </div>
    </b-container>
    <div class="text-center">
    </div>
  </div>
</template>

<script>
import itemListaUsuarios from '~/components/itemListaUsuarios.vue'
export default {
  data() {
    return {
      usuarios: [],
      dados: '',
    }
  },
  async mounted() {
    const response = await this.$axios.get('/usuario')
    this.usuarios = response.data
  },
  components: { itemListaUsuarios },
}
</script>

<style>
  @import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');
  body {
      background-image: url("../static/fundoPerfil.png") !important;
      background-repeat: no-repeat;
      background-size: cover;
      font-family: 'Montserrat', sans-serif;
      font-size: 16px;
      color: black;
  }

  h1{
      margin: auto;
      margin-bottom: 20px;
      text-align: center;
      font-size: 50px;
      font-family: 'League Spartan', sans-serif;
      font-weight: bolder;
  }

  button{
      background-color: rgb(53, 53, 53);
      color: white;
      padding: 10px;
      border-radius: 10px;
      margin: auto;
      margin-top: 30px;
  }
</style>