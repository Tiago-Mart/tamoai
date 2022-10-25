<template>
  <div>
    <b-navbar toggleable="lg" variant="info" class="back-nav">
      <b-navbar-brand href="#" class="nav-item">Fulgure, Brasil!</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item href="#" class="nav-item">Home</b-nav-item>
          <b-nav-item href="#" class="nav-item">Sobre Nós</b-nav-item>
          <b-nav-item href="#" class="nav-item">Entrar em Contato</b-nav-item>
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-item-dropdown right>
            <!-- Using 'button-content' slot -->
            <template #button-content>
              <em>Usuário</em>
            </template>
            <b-dropdown-item href="#">Perfil</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>

<script>
export default {}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');

* {
  font-family: 'Montserrat', sans-serif;
}

.back-nav {
  margin-bottom: 20px;
  background-color: white !important;
  box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;
  width: 100%;
}

.back-nav *{
   color: black !important;
}

.link:hover {
  text-decoration: none;
  color: black;
}

a.nav-link:hover {
  background-color: rgb(219, 236, 255);
}

.link {
  color: black;
}

.nav-item{
  margin-right: 40px;
}

</style>