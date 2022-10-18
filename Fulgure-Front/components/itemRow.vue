<template>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">

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
    width: 100% !important;
}
</style>