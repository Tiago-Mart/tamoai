<template>
  <div>
    <head>
      <!-- Latest compiled and minified CSS -->
      <link
        rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
      />

      <!-- jQuery library -->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

      <!-- Latest compiled JavaScript -->
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <barraNav class="nav"></barraNav>

    <div class="jumbotron">
      <div class="container">
        <h1>Fulgure, Brasil!</h1>
        <p>
          Lorem Ipsum is simply dummy text of the printing and typesetting
          industry. Lorem Ipsum has been the industry's standard dummy text ever
          since the 1500s, when an unknown printer took a galley of type and
          scrambled it to make a type specimen book. It has survived not only
          five centuries, but also the leap into electronic typesetting,
          remaining essentially unchanged. It was popularised in the 1960s with
          the release of Letraset sheets containing Lorem Ipsum passages, and
          more recently with desktop publishing software like Aldus PageMaker
          including versions of Lorem Ipsum.
        </p>
        <p>
          <a class="btn btn-primary btn-lg" href="#" role="button"
            >Learn more</a
          >
        </p>
      </div>
    </div>

    <b-container>
      <itemRow :nivel="'Fácil'" :descricao="'lorem ipsum'" :imagem="'https://img.freepik.com/vetores-premium/piano_81698-1779.jpg?w=2000'" :imagem2="''" :imagem3="''" :rota="''"></itemRow>
      <itemRow :nivel="'Médio'" :descricao="'lorem ipsum 1'" :imagem="'https://img.freepik.com/vetores-premium/piano_81698-1779.jpg?w=2000'" :imagem2="''" :imagem3="''" :rota="''"></itemRow>
      <itemRow :nivel="'Difícil'" :descricao="'lorem ipsum 3'" :imagem="'https://img.freepik.com/vetores-premium/piano_81698-1779.jpg?w=2000'" :imagem2="''" :imagem3="''" :rota="''"></itemRow>
    </b-container>
  </div>
</template>

<script>
import barraNav from '~/components/barraNav.vue'
import itemRow from '~/components/itemRow.vue'
export default {
  components: { barraNav, itemRow },
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');
</style>