<template>
    <div :class="isSelected ? 'tab selected' : 'tab'" @click="toggle()">
        {{text}}
    </div>
</template>

<script setup>
    import { ref } from 'vue'

    const props = defineProps({
        text: {
            type: String,
            required: true
        },
        selected: {
            type: Boolean,
            required: false,
            default: false
        }
    })

    const isSelected = ref(props.selected)

    const toggle = () => {
        isSelected.value = !isSelected.value
    }
</script>

<style scoped>
    .tab {
        border: 2px solid var(--color-orange);
        border-radius: 5px;
        color: var(--color-orange);
        cursor: pointer;
        display: inline-flex;
        padding: 5px 7px;
        user-select: none;
    }

    .selected {
        background-color: var(--color-orange);
        color: white;
    }
</style>