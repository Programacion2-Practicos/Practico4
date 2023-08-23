# ARTÍCULOS NACIONALES e IMPORTADOS
### 1- a) **(Diagrama de clases)**: Al diagrama realizado en la tarea anterior sobre la clase **Articulo**, se le agregan dos clases relacionadas por herencia con Articulo:
#### • **Nacional**: Incluye además los atributos departamento (String) y subsidiado (boolean).
#### • **Importado**: Incluye además los atributos impuesto (double) y anioImportacion (int).
### Ambas incluyen una versión sobre-escrita al método precioVenta().
 >** Nota:** Para realizar el diagrama puede usar el programa Dia (como se muestra en la grabación de la clase del día 3 de junio). Una vez realizado lo puedo subir aquí mismo, desde los tres puntos - upload file

### b) (Clase Articulo):
#### Fue desarrollada en la tarea anterior, copie el código a este proyecto 
### 2)  (Desarrollo de Nacional): 
#### •**public double precioVenta()**: Los artículos Nacionales subsidiados mantienen el precioVenta original (super.precioVenta()), en tanto que los no subsidiados suman un 15% extra si el departamento es Montevideo y un 10% si son del interior.
#### • **public String toString()**: Imprime la información de los atributos de la clase (y los que hereda), además del valor de precio de venta.

### 3) (La clase Principal): 
#### • Crear el objeto n de tipo Nacional con el constructor por defecto. Cargar sus valores con los setters correspondientes. Visualizar el objeto con toString.

### La clase IMPORTADOS

### public double precioVenta(): Los artículos Importados suman al precioVenta original un 80% de su impuesto si su anioImportacion es menor o igual a 2008. Caso contrario se agrega un 100% del valor del impuesto.

### ATENCIÓN: Cuando suban su proyecto como vimos en clase, borran la carpeta que deje que se llama **Nacionales**
