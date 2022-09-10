<template>
  <b-container>
    <div id="menu-bar">
      <img src="../static/iconFechar.png" @click="mostrarMenu" />
      <a href="">Sobre nós</a>
      <hr />
      <a href="">Entrar em contato</a>
      <hr />
      <a href="">Reportar problema</a>
      <a href="/tela-jogar/" id="jogar">Jogar</a>
    </div>
    <div id="menu" @click="mostrarMenu">
      <div></div>
      <div></div>
      <div></div>
    </div>
  </b-container>
</template>

<script>
export default {
  methods: {
    mostrarMenu() {
      const menu = document.getElementById('menu-bar')
      if (menu.style.display === 'block') {
        menu.style.display = 'none'
      } else {
        menu.style.display = 'block'
      }
    },
  },
}
</script>

<style>
#menu {
  width: 27px;
  height: 27px;
  cursor: pointer;
  margin-bottom: 47px;
  margin-top: 47px;
  margin-left: -10px;
}

#menu div {
  background-color: black;
  width: 30px;
  height: 5px;
  margin-bottom: 3px;
  border-radius: 6px;
}

#menu-bar {
  z-index: 3;
  position: fixed;
  float: left;
  background-color: black;
  color: white;
  height: 100%;
  width: 280px;
  padding-left: 40px;
  padding-top: 58px;
  box-shadow: 3px 3px 3px #9b9b9b;
  left: 0;
  top: 0;
  display: none;
}

#menu-bar a {
  display: block;
  text-decoration: none;
  color: white;
  font-weight: 100;
}

#menu-bar img {
  cursor: pointer;
  width: 27px;
  height: 27px;
  border-radius: 50%;
  display: block;
  margin-bottom: 40px;
}

#jogar {
  margin-top: 35px;
}
</style>