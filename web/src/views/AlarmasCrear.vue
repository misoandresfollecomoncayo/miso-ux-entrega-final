<template>
  <MainContainer selected="Mis alarmas">
    <div style="height: 100%; display: grid; grid-template-rows: 1fr auto">
      <div style="display: flex; flex-direction: column; gap: 30px">
        <div style="display: flex; align-items: center; gap: 20px">
          <a style="width: 30px; height: 30px;" class="icon-back" href="/alarmas"></a>
          <div class="subtitulo">Crear alarma</div>
        </div>
        <div>
          <label>Nombre</label>
          <input :class="errorName === true ? 'input-error' : ''" @blur="validateName" v-model="name" placeholder="Digita el nombre de la alarma" />      
        </div>
        <div>
          <label>Días que se repite</label>
          <div style="display:flex; gap: 10px">
            <tab v-for="d in days" :text="d.name" :selected="d.selected"></tab>
          </div>
        </div>
        <div>
          <label>Hora</label>
          <input type="time" />
        </div>
        <div>
          <label style="margin-bottom: 15px">Dispositivos a activar</label>
          <div v-for="d in devices" style="display:grid; gap: 10px; grid-template-columns: 20px auto; margin-bottom: 5px">
            <input type="checkbox" :checked="d.selected" />
            <div>{{d.name}}</div>
          </div>
        </div>
        <div style="display:flex; gap: 20px; align-items: center">
          <label>¿Alarma activa?</label>
          <switch2 :selected="active"></switch2>
        </div>
      </div>
      <button class="btn btn-orange" @click="create()">CREAR</button>
    </div>
  </MainContainer>
</template>

<script setup>
  import { ref } from 'vue'
  import MainContainer from '../components/MainContainer.vue'
  import Tab from '../components/Tab.vue'
  import Switch2 from '../components/Switch.vue'

  const name = ref('')
  const errorName = ref(false)

  const days = [
    {
      name: "Lunes",
      selected: false
    },
    {
      name: "Martes",
      selected: false
    },
    {
      name: "Miércoles",
      selected: false
    },
    {
      name: "Jueves",
      selected: false
    },
    {
      name: "Viernes",
      selected: false
    },
    {
      name: "Sábado",
      selected: false
    },
    {
      name: "Domingo",
      selected: false
    }
  ]

  const time = ref('')
  
  const devices = [
    {
      name: "Bombillo baño",
      selected: false
    },
    {
      name: "Bombillo cocina",
      selected: false
    },
    {
      name: "Parlante sala",
      selected: false
    },
    {
      name: "Cortinas habitación",
      selected: false
    },
  ]

  const active = ref(false)

  const validateName = () => {
    if (name.value.trim() === "") {
      errorName.value=true
    } else {
      errorName.value=false
    }
  }

  const create = () => {
    validateName()
    if (errorName.value === false) {
      document.location.href = "/alarmas/codigo-qr"
    }
  }
</script>

<style scoped>
  
</style>