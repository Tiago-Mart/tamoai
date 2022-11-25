<template>
    <div>
        <b-modal ok-only id="modal-3" title="Curiosidade">
            <p class="my-4">{{ textoCuriosidade }}</p>
        </b-modal>
    </div>
</template>

<script>
export default {
props: ["textoCuriosidade"]
}
</script>

<style>

</style>