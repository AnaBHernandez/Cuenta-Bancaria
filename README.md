🏦 **Gestión de Cuentas Bancarias**
=====================================

Un proyecto diseñado para manejar dos tipos de cuentas bancarias: Cuenta Corriente y Cuenta de Ahorros.

🚀 **Características Principales**
===============================
📘 Cuenta de Ahorros
🟢 Estado Activo: La cuenta se considera activa si el saldo es igual o mayor a 10,000.
💰 Comisión Extra: Se cobra una comisión de 1,000 por cada retiro adicional después de 4 retiros en el mismo mes.
📈 Intereses Mensuales: Los intereses son calculados basados en una tasa anual.

📕 **Cuenta Corriente**
======================
🛑 Sobregiro: Permite retirar más dinero del saldo disponible, registrando el excedente como un sobregiro.
💸 Consignaciones Inteligentes: Las consignaciones primero reducen el sobregiro, y si hay excedente, incrementan el saldo.
❌ Sin Comisiones Mensuales: Ideal para operaciones simples sin cargos adicionales.

🛠️ **¿Cómo Funciona el Proyecto?**
===============================
Clases Principales
Cuenta: Clase base con métodos y atributos compartidos por ambas cuentas.
CuentaAhorros: Extiende de Cuenta y agrega la lógica para comisiones e intereses.
CuentaCorriente: Extiende de Cuenta y maneja los sobregiros.

Pruebas Unitarias
Contamos con pruebas detalladas para asegurar el correcto funcionamiento de las clases CuentaAhorros y CuentaCorriente.

🧪 **Ejecución de Pruebas**
=========================
Clonación del Repositorio
Clona este repositorio en tu máquina con el siguiente comando:
```bash
git clone <URL_DEL_REPOSITORIO>
```

Ejecutar las Pruebas
Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, etc.) y ejecuta las pruebas unitarias utilizando JUnit o Maven:
```bash
mvn test
```

💡 **Contribuir**
================
¡Toda contribución es bienvenida! Por favor, crea un pull request con tus cambios y asegúrate de incluir pruebas unitarias para validar tu implementación.

📜 **Licencia**
================
Este proyecto está bajo la Licencia MIT. Siéntete libre de usar y mejorar el código.
