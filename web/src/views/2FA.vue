<template>
  <div class="root">
    <div class="container">
      <div class="titulo-principal">Autenticación de dos factores</div>
      <div style="text-align:center">Hemos enviado un código a tu correo electrónico, por favor digítalo a continuación.</div>
      <div style="display:flex; flex-direction:column; gap: 15px">
        <div>
          <label>Código de autenticación</label>
          <input @blur="validateCode()" :class="errorCode === true ? 'input-error' : ''" v-model="code" type="password" placeholder="Digita tu código de autenticación" />      
        </div>
        <button @click="login()" class="btn btn-orange">CONTINUAR</button>
        <button @click="goBack()" class="btn btn-orange-border">SALIR</button>
      </div>
    </div>
  </div>
</template>

<script setup>
  import { ref } from 'vue'

  const code = ref('')
  const errorCode = ref('false')

  const validateCode = () => {
    if (code.value.trim() === "") {
      errorCode.value=true
    } else {
      errorCode.value=false
    }
  }

  const login = () => {
    validateCode()
    if (errorCode.value===false) {
      document.location.href = "/alarmas"
    }
  }

  const goBack = () => {
    document.location.href = "/"
  }
</script>

<style scoped>
  .root {
    align-items: center;
    display: flex;
    height: 100%;
    justify-content: center;
    width: 100%;
  }

  .container {
    display: flex; 
    flex-direction: column;
    gap: 40px;
    max-width: 350px;
    width: 100%;
  }

  .logotype {
    background-image: url(../assets/logotype.svg);
    background-position: center;
    background-repeat: no-repeat;
    background-size: 50%;
    height: 200px;
    width: 100%;
  }
</style>