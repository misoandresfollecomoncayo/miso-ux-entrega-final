<template>
    <div class="root">
        <div class="main-container">
            <header class="main-container-header">
                <div>Nombre del usuario</div>
                <div class="user-photo"></div>
            </header>
            <aside class="main-container-menu">
                <div class="items-container">
                    <a :class='selected === "Mis alarmas" ? "item-selected" : ""' class="item" href="/alarmas">Mis alarmas</a>
                    <a :class='selected === "Mis dispositivos" ? "item-selected" : ""' class="item" href="/dispositivos">Mis dispositivos</a>
                    <a class="item" href="/">Cerrar sesión</a>
                </div>
            </aside>
            <main class="main-container-content">
                <slot></slot>
                <a v-show="addLink" class="btn-circle" :href="addLink"></a>
            </main>
        </div>
    </div>
</template>

<script setup>
    import { ref } from 'vue'

    const props = defineProps({
        selected: {
            type: String,
            required: true
        },
        addLink: {
            type: String,
            required: false
        }
    })
</script>

<style scoped>
    .root {
        display: flex;
        height: 100%;
        justify-content: center;
        padding: 0 0 20px 0;
        width: 100%;
    }

    .main-container {
        display: grid;
        grid-template-areas:
            "main-container-header main-container-header"
            "main-container-menu main-container-content"
            "main-container-menu main-container-content";
        grid-template-columns: 180px 1fr;
        grid-template-rows: 80px 1fr;
        height: 100%;
        max-width: 1000px;
        width: 100%;
    }

    .main-container-header {
        align-items: center;
        display: flex;
        gap: 20px;
        grid-area: main-container-header;
        justify-content: flex-end;
    }

    .main-container-menu {
        grid-area: main-container-menu;
    }

    .main-container-menu > .items-container {
        border: 2px solid var(--color-midnight-violet);
        border-radius: 15px 0 0 15px;
        border-right: none;
        display: flex;
        flex-direction: column;
    }

    .main-container-menu > .items-container > .item {
        border-bottom: 2px solid var(--color-midnight-violet);
        color: inherit;
        padding: 10px;
        text-decoration: none;
        width: 100%;
    }

    .main-container-menu > .items-container > .item:first-child {
        border-radius: 10px 0 0 0;
    }

    .main-container-menu > .items-container > .item:last-child {
        border: none;
        border-radius: 0 0 0 10px;
    }

    .main-container-menu > .items-container > .item-selected {
        background-color: var(--color-midnight-violet);
        color: white;
        font-weight: bold;
    }

    .main-container-content {
        border: 2px solid var(--color-midnight-violet);
        border-radius: 0 15px 15px 15px;
        grid-area: main-container-content;
        overflow: auto;
        padding: 40px;
        position: relative;
    }

    .user-photo {
        background-image: url(../assets/user.svg);
        border-radius: 100%;
        height: 45px;
        width: 45px;
    }
</style>