<template>
    <div>
        <b-progress :value="value" :max="max" :animated="true" :show-value="true" class="mb-3"></b-progress>
    </div>
</template>

<script>
export default {
    data() {
        return {
            value: 1,
            max: 5
        }
    }
}
</script>
