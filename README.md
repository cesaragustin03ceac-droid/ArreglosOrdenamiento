Nombre:Cesar Emilio Agustin Cortes
Grupo y grado:4-B
Materia:Estructura de Datos

Bubble Sort tradicional

El método tradicional ordena los elementos mediante comparaciones e intercambios entre elementos adyacentes. Recorre el arreglo completo en cada pasada, aunque los datos ya estén ordenados.

Su complejidad temporal es O(n²), porque realiza aproximadamente (n \times n) comparaciones en el peor caso y también mantiene ese orden de crecimiento en el mejor caso si siempre recorre el arreglo completo.

Bubble Sort mejorado

El método mejorado utiliza una variable booleana para detectar si ocurrió algún intercambio durante una pasada. Si no se realiza ningún intercambio, significa que el arreglo ya está ordenado y el algoritmo termina anticipadamente.

Su complejidad temporal en el mejor caso es O(n), porque, si el arreglo ya está ordenado, realiza una sola pasada con aproximadamente (n-1) comparaciones y termina sin necesitar más pasadas.


2. Pruebas realizadas

Se probaron ambos métodos con arreglos de números enteros. El primer método utiliza un arreglo desordenado y el segundo un arreglo parcialmente ordenado.

3. Salida de consola

<img width="571" height="192" alt="image" src="https://github.com/user-attachments/assets/7c6672a0-bd1f-4d29-9438-bea43059d7c5" />

Ejemplo del formato esperado:

Prueba 1
Arreglo inicial: [64, 34, 25, 12, 22, 11, 90]
Arreglo ordenado: [11, 12, 22, 25, 34, 64, 90]

Prueba 2
Arreglo inicial: [2, 4, 6, 8, 12, 10, 14]
Arreglo ordenado: [2, 4, 6, 8, 10, 12, 14]

