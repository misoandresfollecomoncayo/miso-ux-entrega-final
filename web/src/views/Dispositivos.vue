<template>
  <popup v-show="showPopup===true" title="Eliminar dispositivo" text="¿Confirmas eliminar el dispositivo?" @cancel="showPopup=false" @confirm="showPopup=false"></popup>
  <MainContainer selected="Mis dispositivos" add-link="/dispositivos/crear">
    <div v-for="a in dispositivos" class="dispositivo-item">
      <div>
        <div class="subtitulo" style="margin-bottom:10px">{{a.title}}</div>
        <div>{{a.conexion}} dispositivos</div>
      </div>
      <div style="display:flex; gap: 10px">
        <a class="btn btn-sm btn-midnight-violet" href="/dispositivos/editar">
          <div class="icon icon-edit"></div>
        </a>
        <button @click="showPopup=true" class="btn btn-sm btn-red">
          <div class="icon icon-delete"></div>
        </button>
      </div>
    </div>
  </MainContainer>
</template>

<script setup>
  import {ref} from 'vue'
  import MainContainer from '../components/MainContainer.vue'
  import Popup from '../components/Popup.vue'
  
  const showPopup = ref(false)

  const dispositivos = [
    {
      title: "Bombillo baño",
      conexion: "Conectado"
    },
    {
        title: "Bombillo cocina",
        conexion: "No conectado"
    },
    {
        title: "Parlante sala",
        conexion: "Conectado"
    },
    {
        title: "Cortina habitación",
        conexion: "Conectado"
    }
  ]
</script>

<style scoped>
  .dispositivo-item {
    align-items: center;
    border: 1px solid var(--color-midnight-violet-25pc);
    border-radius: 10px;
    display: flex;
    justify-content: space-between;
    padding: 20px;
    margin-bottom: 20px;
  }
</style>