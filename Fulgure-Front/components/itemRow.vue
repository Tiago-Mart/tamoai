<template>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
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
              v-bind:src="imagem" 
              alt="Los Angeles"
              width="600px"
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
      <div class="caption">
        <h3>{{ nivel }}</h3>
        <p>{{ descricao }}</p>
        <p>
          <a href="#" class="btn btn-primary" role="button">Jogar</a>
        </p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
    props: ['nivel', 'descricao', 'imagem', 'imagem2', 'imagem3', 'rota' ]
}
</script>

<style>
.col-sm-6, .col-md-4{
    width: 500px !important;
}
</style>