<template>
  <div class="root">
    <div class="container">
      <div class="logotype"></div>
      <div>
        <label>Correo electrónico</label>
        <input :class="errorEmail === true ? 'input-error' : ''" @blur="validateEmail()" v-model="email" type="email" placeholder="Digita tu correo electrónico" />      
      </div>
      <div>
        <label>Contraseña</label>
        <input :class="errorPassword === true ? 'input-error' : ''" @blur="validatePassword()" v-model="password" type="password" placeholder="Digita tu contraseña" />      
      </div>
      <button @click="login()" class="btn btn-orange">INGRESAR</button>
      <button class="btn btn-orange-border">CREAR CUENTA</button>
    </div>
  </div>
</template>

<script setup>
  import { ref } from 'vue'

  const email = ref('')
  const errorEmail = ref('false')
  const password = ref('')
  const errorPassword = ref('false')

  const validateEmail = () => {
    if (email.value.trim() === "") {
      errorEmail.value=true
    } else {
      errorEmail.value=false
    }
  }

  const validatePassword = () => {
    if (password.value.trim() === "") {
      errorPassword.value=true
    } else {
      errorPassword.value=false
    }
  }

  const login = () => {
    validateEmail()
    validatePassword()
    if (errorEmail.value===false && errorPassword.value===false) {
      document.location.href = "/2fa"
    }
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
    gap: 15px;
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