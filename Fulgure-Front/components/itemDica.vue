<template>
    <div>
        <b-button v-b-modal.modal-1 class="dica"><img src="~/static/lampada.png" width="20px" height="20px" />Dica
        </b-button>
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
img {
    margin-right: 5px;
}

.dica {
    background-color: rgb(251, 192, 30);
    border-color: transparent;
    font-weight: bold;
    box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
}

.dica:hover {
    background-color: rgb(206, 152, 3);
    border-color: transparent;
}
</style>