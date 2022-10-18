<template>
  <b-nav pills class="back">
    <b-nav-item>Home</b-nav-item>
    <b-nav-item>Sobre Nós</b-nav-item>
    <b-nav-item>Entrar em Contato</b-nav-item>
  </b-nav>
</template>

<script>
export default {
  head: {
    title: 'Fulgure, Brasil!',
    link: [
      {
        rel: 'preconnect',
        href: 'https://fonts.googleapis.com',
      },
      {
        rel: 'preconnect',
        href: 'https://fonts.gstatic.com',
      },
      {
        rel: 'stylesheet',
        href: 'https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap',
      },
    ],
  },
}
</script>

<style>
body {
  font-family: 'Monteserrat', sans-serif;
}
.back{
  background-color: white;
}
</style>