Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Conversión de Monedas y Tasas de Cambio (Clases Abstractas y Inyección de Dependencias en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos ni servicios externos de red):

---

# 💱 Simulación de Conversión de Divisas y Proveedores de Tasa (POO y Patrón Strategy en Java)

Este proyecto es una aplicación en Java que modela un sistema flexible de conversión monetaria capaz de consultar tipos de cambio provenientes de diferentes fuentes (Banco Central o cotizaciones de mercado). Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como **clases abstractas**, **inyección de dependencias por constructor**, **polimorfismo** y el **Patrón de Comportamiento Strategy** en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una superclase abstracta que define el contrato de consulta y múltiples implementaciones especializadas para cada proveedor de tasas:

* **`ProveedorTasaCambio` (Clase Abstracta)**: Define la plantilla obligatoria que cualquier proveedor de tasas debe cumplir mediante el método `obtenerTasa(String monedaOrigen, String monedaDestino)`.
* **`TasaBancoCentral`**: Modela el proveedor de tipo de cambio oficial o regulado.
* **Comportamiento:** Simula la consulta al ente regulador emitiendo un mensaje por consola y retornando una tasa fija de referencia (`1400.0`).


* **`TasaMercadoLibre`**: Modela un proveedor de tasas basado en el mercado abierto o cotizaciones alternativas.
* **Comportamiento:** Simula la consulta de mercado retornando una tasa de cotización distinta (`1450.0`).


* **`ConversorMoneda`**: Actúa como el contexto o invocador principal que ejecuta la operación matemática de conversión.
* **Atributos:** Mantiene una referencia privada al proveedor de tasa activo (`ProveedorTasaCambio proveedor`).
* **Métodos principales:**
* Constructor `ConversorMoneda(ProveedorTasaCambio proveedor)`, que recibe e inyecta la estrategia de cotización deseada.
* `convertir(double monto, String origen, String destino)`, que invoca de forma polimórfica la obtención de la tasa y multiplica el monto base.




* **`Main`**: Punto de entrada de la aplicación. Instancia los diferentes proveedores de tasas, los inyecta en el conversor y simula la conversión de montos (ej. 10 USD a ARS) alternando dinámicamente de fuente.

---

## ⚙️ Conceptos Clave de POO Aplicados

1. **Inyección de Dependencias por Constructor:** La clase `ConversorMoneda` no está acoplada a una fuente de datos fija; recibe la estrategia de obtención de tasas desde el exterior, facilitando el mantenimiento y la prueba de componentes.
2. **Patrón Strategy:** Permite encapsular algoritmos de consulta de tipos de cambio independientes dentro de clases separadas, haciendo que la lógica de conversión sea completamente agnóstica al origen de los datos.
3. **Polimorfismo:** El conversor interactúa de manera idéntica a través de la referencia abstracta, sin importar si la tasa proviene del Banco Central o del mercado libre.
4. **Principio Abierto/Cerrado (OCP):** Facilita la incorporación de nuevos proveedores de cotización (ej. `TasaCripto`, `TasaBancaPrivada`) creando una nueva clase que extienda de `ProveedorTasaCambio`, sin necesidad de alterar la lógica interna del conversor.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
Consultando tasa del Banco Central...
Resultado Banco Central: 14000.0
--------------------
Consultando tasa del mercado...
Resultado Mercado: 14500.0

```

---

## 🚀 Ventajas de este Diseño

* **Desacoplamiento Estricto:** Separa la operación matemática de conversión de las reglas particulares de cada entidad financiera.
* **Flexibilidad Operativa:** Permite cambiar la fuente de cotización en tiempo de ejecución con solo reasignar la instancia inyectada.

---

### 💡 Materiales de Apoyo y Videos

Los videos recomendados arriba ilustran cómo aplicar el **Patrón Strategy** y la **Inyección de Dependencias** en Java para construir sistemas financieros modulares y desacoplados.
