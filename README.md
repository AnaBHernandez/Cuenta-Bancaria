🏦 Gestión de Cuentas Bancarias
Un proyecto para manejar dos tipos de cuentas bancarias: Cuenta Corriente y Cuenta de Ahorros.

🚀 Características Principales
📘 Cuenta de Ahorros
🟢 Estado Activo: Activa si el saldo es igual o mayor a 10,000.

💰 Comisión Extra: Se cobra 1,000 por cada retiro adicional después de 4 retiros en el mismo mes.

📈 Intereses Mensuales: Basados en una tasa anual.

📕 Cuenta Corriente
🛑 Sobregiro: Posibilidad de retirar más del saldo disponible, registrando el excedente como sobregiro.

💸 Consignaciones Inteligentes: Reducen primero el sobregiro y, si hay excedente, incrementan el saldo.

❌ Sin Comisiones Mensuales: Perfecto para operaciones simples.

🛠️ ¿Cómo funciona el proyecto?
Clases principales:

Cuenta: Clase base con métodos y atributos compartidos.

CuentaAhorros: Extiende Cuenta con lógica para comisiones e intereses.

CuentaCorriente: Extiende Cuenta con manejo de sobregiros.

Pruebas unitarias:

Comprobaciones detalladas para asegurar el correcto funcionamiento de ambas clases.

🧪 Ejecución de Pruebas
Clona este repositorio en tu máquina:

bash
git clone <URL_DEL_REPOSITORIO>
Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, etc.).

Ejecuta las pruebas unitarias con JUnit o Maven:

bash
mvn test
💡 Contribuir
¡Toda contribución es bienvenida! Por favor, crea un pull request con tus cambios y asegúrate de incluir pruebas unitarias para validar tu implementación.

📜 Licencia
Este proyecto está bajo la Licencia MIT. Siéntete libre de usar y mejorar el código. 🎉
