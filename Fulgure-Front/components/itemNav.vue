<template>
  <b-nav tabs fill>
    <b-nav-item><NuxtLink to="/tela-jogar" class="link">Home</NuxtLink></b-nav-item>
    <b-nav-item><NuxtLink to="/tela-jogar" class="link">Sobre Nós</NuxtLink></b-nav-item>
    <b-nav-item><NuxtLink to="/tela-jogar" class="link">Entrar em Contato</NuxtLink></b-nav-item>
  </b-nav>
</template>

<script>
export default {
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');

*{
  font-family: 'Monteserrat', sans-serif;
}
.nav{
  margin-bottom: 20px;
}
.link:hover{
  text-decoration: none;
}
</style>