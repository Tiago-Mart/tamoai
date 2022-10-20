<template>
    <div>
        <b-button v-b-modal.modal-1><img src="~/static/lampada.png" width="20px" height="20px"/>Dica</b-button>
        <b-modal ok-only id="modal-1" title="Título da dica">
            <p class="my-4">Texto da dica</p>
        </b-modal>
    </div>
</template>

<script>
export default {

}
</script>

<style>
img{
    margin-right: 5px;
}
</style>