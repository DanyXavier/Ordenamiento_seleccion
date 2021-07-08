# Algoritmo: ordenamiento por seleccion
Ordenar un lista de elementos de forma ascendente o descendete puede ayudarnos o ayudar a una computadora a encontrar elementos de una manera más rápida, puede ser al usar un algoritmo como la **busqueda binaria**, los lenguajes de porgramacion cuentan con librerias de ordenamiento, pero nosotros vamos a entender un ordenamiento.
## Contextualización 
Este algoritmo lleva el nombre de **ordenamiento por seleccion** porque selecciona el siguiente elemento mas bajo y lo intercambi en su lugar
### Encontrar el índice del elemento mínimo en un arreglo
Por ejemplo, si tenemos un arreglo [10,7,3,13,2], primero tenemos que encontrar el indice del valor más pequeño, como **2** es el valor mas pequeño, el indice del valor mas pequeño es **4**.

El ordenamiento por selección cambiaría el valor en el índice 4 con el valor en el índice 0, dando [2,7,3,13,10], Ahora tenemos que encontrar el índice del segundo valor más pequeño para intercambiarlo al índice 1.

Puede ser difícil escribir el código que encuentre el índice del segundo valor más pequeño en un arreglo, si seguimos el paso inicial de a todos los elementos nos demorariamos mas, entonces hay una mejor manera. 

Observemos como el valor más pequeño ya fue intercambiado al índice 0, lo que realmente queremos es encontrar el valor más pequeño en la parte del arreglo que inicia en el índice 1, **A una sección de un arreglo la llamamos un subarreglo**, así que en este caso, queremos el índice del valor más pequeño en el subarreglo que comienza en el índice 1.

Para nuestro ejemplo, si el arreglo completo es [2,7,3,13,10], entonces el valor más pequeño en el que empieza en el índice **1** es **3**, y tiene índice **2** en el arreglo original. Así que el índice **2** es la ubicación del segundo elemento más pequeño del arreglo completo.

Y asi intentamos para los siguientes elementos
### **Pseudocódigo**
<ul>

    1. Encuentra primer el indice con elemento mas bajo. Intercámbiala con el primer indice (0).
    2. Encuentra el segundo indice con elemento mas bajo. Intercámbiala con el segundo indice (1).
    3. Encuentra el tercer indice con elemento mas bajo. Intercámbiala con el tercer indice (2).
    4. Repite encontrar el siguiente  indice con elemento mas bajo e intercambiarla en la posición correcta hasta que el arreglo esté ordenado.
</ul>
