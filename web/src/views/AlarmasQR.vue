<template>
  <MainContainer selected="Mis alarmas">
    <div style="width:100%;height:100%;display:flex;align-items:center;justify-content:center;flex-direction:column;gap:40px">
      <div class="subtitulo">Código QR</div>
      <div class="qr"></div>
      <div style="max-width: 350px; text-align:center">Hemos generado este código QR que usarás para desactivar la alarma, por favor descárgalo, imprímelo y pégalo lejos de tu cama.</div>
      <div style="width:200px;display:flex;align-items:center;justify-content:center;flex-direction:column;gap:40px">
        <div style="display: flex; flex-direction:column; gap: 15px; width:100%">
          <button class="btn btn-orange">DESCARGAR</button>
          <a href="/alarmas" class="btn btn-orange-border">CONTINUAR</a>
        </div>
      </div>
    </div>
  </MainContainer>
</template>

<script setup>
  import MainContainer from '../components/MainContainer.vue'
</script>

<style scoped>
  .qr {
    background-image: url(../assets/qr.svg);
    background-position: center;
    background-repeat: no-repeat;
    height: 200px;
    width: 200px;
  }
</style>