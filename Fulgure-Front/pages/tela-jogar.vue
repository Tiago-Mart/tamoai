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
        <p class="justify">
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
              <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
          <div class="item active">
            <img
              src="data:image/jpeg;base64,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"
              alt="Los Angeles"
            />
          </div>

          <div class="item">
            <img
              v-bind:src="imagem2" 
              alt="Chicago"
              width="600px"
            />
          </div>

          <div class="item">
            <img
              v-bind:src="imagem3" 
              alt="New York"
              width="600px"
            />
          </div>
        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>
      </div>
    </div>

    <b-container>
      <itemRow :nivel="'Fácil'" :descricao="'lorem ipsum'" :imagem="'https://img.freepik.com/vetores-premium/piano_81698-1779.jpg?w=2000'" :imagem2="''" :imagem3="''" :rota="''"></itemRow>
      <itemRow :nivel="'Médio'" :descricao="'lorem ipsum 1'" :imagem="'https://img.freepik.com/vetores-premium/piano_81698-1779.jpg?w=2000'" :imagem2="''" :imagem3="''" :rota="''"></itemRow>
      <itemRow :nivel="'Difícil'" :descricao="'lorem ipsum 3'" :imagem="'https://img.freepik.com/vetores-premium/piano_81698-1779.jpg?w=2000'" :imagem2="''" :imagem3="''" :rota="''"></itemRow>
    </b-container>
    <itemFooter></itemFooter>
  </div>
</template>

<script>
import barraNav from '~/components/barraNav.vue'
import itemRow from '~/components/itemRow.vue'
import itemFooter from '~/components/itemFooter.vue'
export default {
  components: { barraNav, itemRow, itemFooter },
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=League+Spartan:wght@600&family=Montserrat:wght@300&display=swap');
#myCarousel{
  width: 100% !important;
  height: 300px !important;
  margin: 0 auto !important;
}
.justify{
  text-align: justify;
}
</style>