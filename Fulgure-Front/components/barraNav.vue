<template>
  <nav>
    <ul>
      <li><a>Sobre nós</a></li>
      <li><a>Entrar em contato</a></li>
      <li><a>Reportar problema</a></li>
    </ul>
  </nav>
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

nav {
  background-color: white;
  width: 100%;
  height: 50px;
  left: 0;
  z-index: 4;
  padding-top: 10px;
}

nav ul li {
  padding: 10px;
  height: 100%;
  color: black;
  text-decoration: none;
  cursor: pointer;
  display: inline;
  margin-right: 30px;
  font-size: 16px;
  transition: 1s;
}


nav ul li:hover {
  height: 105%;
  font-size: 20px;
  background-color: black;
  color: white;
}
</style>