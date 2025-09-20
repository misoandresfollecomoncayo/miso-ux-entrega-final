// src/router/index.js
import { createRouter, createWebHistory } from 'vue-router'

// Importar tus componentes
import Autenticacion from '../views/Autenticacion.vue'
import AutenticacionDosFactores from '../views/2FA.vue'
import Alarmas from '../views/Alarmas.vue'
import AlarmasCrear from '../views/AlarmasCrear.vue'
import AlarmasEditar from '../views/AlarmasEditar.vue'
import AlarmasQR from '../views/AlarmasQR.vue'

const routes = [
  { path: '/', name: 'Autenticación', component: Autenticacion },
  { path: '/2fa', name: 'Autenticación dos factores', component: AutenticacionDosFactores },
  { path: '/alarmas', name: 'Alarmas', component: Alarmas },
  { path: '/alarmas/crear', name: 'Crear alarma', component: AlarmasCrear },
  { path: '/alarmas/editar', name: 'Editar alarma', component: AlarmasEditar },
  { path: '/alarmas/codigo-qr', name: 'Código QR alarma', component: AlarmasQR },
]

const router = createRouter({
  history: createWebHistory(), // Para navegación normal
  routes
})

export default router