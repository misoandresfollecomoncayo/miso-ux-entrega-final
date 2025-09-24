<template>
  <MainContainer selected="Mis dispositivos">
    <div style="width:100%;height:100%;display:flex;align-items:center;justify-content:center;flex-direction:column;gap:40px">
      <div class="subtitulo">Dispositivo vinculado</div>
      <div class="confirmLogo"></div>
      <div style="max-width: 350px; text-align:center">Tu dispositivo se vinculó correctamente.</div>
      <div style="width:200px;display:flex;align-items:center;justify-content:center;flex-direction:column;gap:40px">
        <div style="display: flex; flex-direction:column; gap: 15px; width:100%">
          <button class="btn btn-orange" @click="continuar()">CONTINUAR</button>
        </div>
      </div>
    </div>
  </MainContainer>
</template>

<script setup>
  import MainContainer from '../components/MainContainer.vue'

    const continuar = () => {
    document.location.href = "/dispositivos"
  }
</script>

<style scoped>
  .confirmLogo {
    background-image: url(../assets/confirm.svg);
    background-position: center;
    background-repeat: no-repeat;
    height: 200px;
    width: 200px;
  }
</style>