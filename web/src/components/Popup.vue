<template>
    <div class="popup">
        <div class="popup-container">
            <div class="subtitulo">{{title}}</div>
            <div>{{text}}</div>
            <div style="display: flex; justify-content: flex-end; gap: 10px;">
                <button @click="$emit('cancel')" class="btn btn-sm btn-midnight-violet-border">CANCELAR</button>
                <button @click="$emit('confirm')" class="btn btn-sm btn-red">CONFIRMAR</button>
            </div>
        </div>
    </div>
</template>

<script setup>
    import { ref } from 'vue'

    const emit = defineEmits(['cancel', 'confirm'])

    const props = defineProps({
        title: {
            type: String,
            required: false,
            default: "title"
        },
        text: {
            type: String,
            required: false,
            default: "text"
        },
    })
</script>

<style scoped>
    .popup {
        align-items: center;
        background-color:rgba(0,0,0,.75);
        display: flex;
        height:100%;
        justify-content: center;
        left:0;
        position: absolute;
        top:0;
        width: 100%;
        z-index:1;
    }

    .popup-container {
        background-color: white;
        border-radius: 15px;
        display: flex;
        flex-direction: column;
        gap: 20px;
        min-width: 300px;
        padding: 30px;
    }
</style>