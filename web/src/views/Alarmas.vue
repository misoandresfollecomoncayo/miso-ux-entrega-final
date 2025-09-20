<template>
  <popup v-show="showPopup===true" title="Eliminar alarma" text="¿Confirmas eliminar la alarma?" @cancel="showPopup=false" @confirm="showPopup=false"></popup>
  <MainContainer selected="Mis alarmas" add-link="/alarmas/crear">
    <div v-for="a in alarms" class="alarm-item">
      <div>
        <div class="subtitulo" style="margin-bottom:10px">{{a.title}}</div>
        <div>{{a.devices}} dispositivos</div>
        <div>{{a.days}}</div>
        <div>{{a.time}}</div>
      </div>
      <div style="display:flex; gap: 10px">
        <a class="btn btn-sm btn-midnight-violet" href="/alarmas/codigo-qr">
          <div class="icon icon-search"></div>
        </a>
        <a class="btn btn-sm btn-midnight-violet" href="/alarmas/editar">
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

  const alarms = [
    {
      title: "Alarma semana",
      devices: 3,
      days: "Lun, Mar, Mié, Jue, Vie",
      time: "6:00 a.m."
    }
  ]
</script>

<style scoped>
  .alarm-item {
    align-items: center;
    border: 1px solid var(--color-midnight-violet-25pc);
    border-radius: 10px;
    display: flex;
    justify-content: space-between;
    padding: 20px;
  }
</style>