<template>
  <MainContainer selected="Mis dispositivos">
    <div style="height: 100%; display: grid; grid-template-rows: 1fr auto">
      <div style="display: flex; flex-direction: column; gap: 30px">
        <div style="display: flex; align-items: center; gap: 20px">
          <a style="width: 30px; height: 30px;" class="icon-back" href="/dispositivos"></a>
          <div class="subtitulo">Vincular dispositivo</div>
        </div>
        <div>
          <label>Nombre</label>
          <input :class="errorName === true ? 'input-error' : ''" @blur="validateName" v-model="name" placeholder="Digita el nombre de la alarma" />      
        </div>
        <div>
          <label style="margin-bottom: 15px">Tipo de dispositivo</label>
          <div v-for="d in devices" style="display:grid; gap: 10px; grid-template-columns: 20px auto; margin-bottom: 5px">
            <input type="radio" :value="d.name" v-model="selectedId"/>
            <div>{{d.name}}</div>
          </div>
        </div>
      </div>
      <button class="btn btn-orange" @click="create()">VINCULAR</button>
    </div>
  </MainContainer>
</template>

<script setup>
  import { ref } from 'vue'
  import MainContainer from '../components/MainContainer.vue'

  const name = ref('')
  const errorName = ref(false)

  const selectedId = ref(null)
  const errorDevice = ref(false)

 
  const devices = [
    {
      name: "Alarma IoT",
      selected: false
    },
    {
      name: "Altavoz",
      selected: false
    },
    {
      name: "Bombillo",
      selected: false
    },
    {
      name: "Reloj Smart",
      selected: false
    },
    {
      name: "Otro",
      selected: false
    },
  ]


  const validateName = () => {
    if (name.value.trim() === "") {
      errorName.value=true
    } else {
      errorName.value=false
    }
  }

  const validateDevice= () => {
    errorDevice.value = selectedId.value === null 
  }

  const create = () => {
    validateName()
    validateDevice()
    if (errorName.value === false && !errorDevice.value) {
      document.location.href = "/dispositivos/confirmacion"
    }
  }
</script>

<style scoped>
  
</style>