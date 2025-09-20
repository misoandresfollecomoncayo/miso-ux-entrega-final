<template>
    <div :class="isSelected ? 'switch selected' : 'switch'" @click="toggle()">
        <div style="height: 19px; width: 19px; background-color: white; border-radius: 100%;"></div>
    </div>
</template>

<script setup>
    import { ref } from 'vue'

    const props = defineProps({
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
    .switch {
        align-items: center;
        background-color: var(--color-red);
        border-radius: 100px;
        cursor: pointer;
        display: flex;
        height: 25px; 
        padding: 3px;
        user-select: none;
        width: 45px;
    }

    .selected {
        background-color: var(--color-green);
        justify-content: flex-end;
    }
</style>