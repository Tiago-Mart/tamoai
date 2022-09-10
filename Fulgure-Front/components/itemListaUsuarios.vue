<template>
  <div class="item-perfis mb-2 pt-3 pb-3">
    <b-row>
      <b-col cols="2" class="d-flex align-items-center justify-content-center">
        <b-avatar class="img"></b-avatar>
      </b-col>
      <b-col cols="10" class="d-flex align-items-center justify-content-center">
        <NuxtLink :to="`usuario/${idUsuario}`">{{ usuario }}</NuxtLink>
      </b-col>
    </b-row>
  </div>
</template>

<script>
export default {
  name: 'usuarioPage',
  props: ['idUsuario', 'usuario' ],
}
</script>

<style>
.item-perfis{
    background-color: rgb(255, 255, 255);
    border-radius: 10px;
    width: 60%;
    height: 80px;
    margin: auto;
    box-shadow: 3px 3px 3px 2px rgb(182, 182, 182);
  }
      
  a{
    color: black;
  }

  .img{
    width: 50px;
    height: 50px;
    margin-left: 50px;
    border: solid #f0aa15 0.5px;
  }
</style>