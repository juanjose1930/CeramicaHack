# MaterialesHack

## OBJETIVOS
*MaterialesHack* está diseñado para facilitar la creación de carpetas de materiales y el acomodo de archivos dentro de éstas.

## INSTALACIÓN

### Windows

1. Ubica la carpeta ZIP proporcionada, **MaterialesHack**. Extráela dando clic derecho y seleccionando la opción `Extraer todo…`.
2. Aparecerá la carpeta **MaterialesHack**. Entra a `MaterialesHack > target` y selecciona con doble clic el archivo **jdk-21_windows-x64_bin.exe**. Sigue los pasos del instalador.  
   Si ya contabas con el **jdk-21** este paso no será necesario. Ejecutar **jdk-21_windows-x64_bin.exe** solo será necesario la primera vez.
3. Una vez instalado el JDK por **ÚNICA OCASIÓN**, siempre que quieras podrás correr la aplicación dando doble clic sobre **MaterialesHack-1.0-SNAPSHOT**.

### MacOS

1. Ubica la carpeta ZIP proporcionada, **MaterialesHack**. Extráela dando doble clic.
2. Aparecerá la carpeta `target`. Entra y ejecuta el archivo **jdk-21_macos-x64_bin.dmg**. Sigue los pasos del instalador.  
   Si ya contabas con el **jdk-21** este paso no será necesario. Ejecutar **jdk-21_macos-x64_bin.dmg** solo será necesario la primera vez.
3. Para ejecutar **MaterialesHack** tendrás que abrir la **Terminal** y ejecutarlo desde ahí:  
   - Desde tu dispositivo encuentra la aplicación *Finder*.  
   - En la parte superior derecha, busca “Terminal” y selecciona el ícono correspondiente.  
   - Dentro de la Terminal escribe el siguiente comando:  

   !!!bash
   java -jar [dirección del archivo]/MaterialesHack-1.0-SNAPSHOT
   !!!

   > **Nota:** Luego de escribir `java -jar` es necesario colocar un espacio antes de la dirección. Puedes copiar la dirección o arrastrar el archivo a la Terminal.

   - Presiona **Enter** y el programa estará listo para correr.

## CREAR CARPETAS

La estructura establecida para las carpetas de materiales es la siguiente: **Cerámica**, **Estucos**, **Lítica**, **Malacología**, **Metales** y **Óseo** comparten la misma estructura.

- Dentro de cada carpeta de materiales están contenidas las respectivas carpetas de claves de excavación.  
- La carpeta **Cédula anterior** no se encuentra dentro de todas las claves.  
- La carpeta **Cédula CATSA** tampoco se encuentra dentro de todas las claves.

En la pantalla principal **CREAR CARPETAS**, podrás crear toda esta estructura automáticamente en segundos.  
*(IMAGEN 1, IMAGEN 2)*

### Link para convertir Excel a JSON

*MaterialesHack* necesita que indiques las cédulas de excavación de las cuáles quieres que se creen sus respectivas carpetas.

1. Crea o reutiliza un archivo Excel con **cualquier nombre**.
2. Estructura tu archivo Excel así:  
   - Lista en la columna `Clave` todas las claves de excavación. Esto creará una carpeta por clave con la estructura mostrada en la *IMAGEN 1*.  
   - Crea dos campos más: `Cédula anterior` y `CATSA`. Marca con una `x` (minúscula) las claves que sí contarán con éstas.  

   > **Nota:** Los campos en Excel deben llamarse exactamente: `Clave`, `Cédula anterior` y `CATSA`. Variaciones (mayúsculas o acentos) harán fallar el procedimiento.

3. Guarda tu archivo Excel y conviértelo a JSON.  
   Usa el enlace en la ventana principal (*IMAGEN 2*) para entrar a una página que convertirá fácilmente Excel a JSON.  
   *(IMAGEN 3, IMAGEN 4, IMAGEN 5)*

   > **Nota:** La página es ajena a MaterialesHack. Puedes usar cualquier otro método.

4. Descarga tu archivo JSON.

### URL del archivo JSON (Lista de claves)

Una vez listo el archivo JSON, cárgalo en el apartado correspondiente.  
Copia y pega la dirección en tu computadora o usa el botón de búsqueda.  

> **Nota:** Solo se permiten archivos `.json`.

### URL donde se crearán las carpetas

En tu dispositivo debes tener una estructura similar a la siguiente:  
Con *MaterialesHack*, puedes generar automáticamente el contenido de cada carpeta en segundos.

Selecciona una carpeta (Cerámica, Estucos, Lítica, Malacología, Metales u Óseo).  
El programa generará la estructura para cada clave indicada en el JSON.  

> **Nota:** Si seleccionas una carpeta con nombre distinto (por acento o mayúscula), será rechazada.

!!!text
ceramica -> Cerámica
!!!

Por último, da clic en el botón para generar las carpetas automáticamente.  
Repite el proceso para cada carpeta de materiales.  

### IMPORTANTE

- Puedes crear nuevas carpetas cuando quieras, ya sea con un JSON nuevo o ampliando el existente.  
- Si alguna clave ahora incluye una cédula adicional (CATSA o anterior), repite el proceso: se añadirán las faltantes **sin afectar** lo ya creado ni los archivos existentes.

## ORGANIZAR ARCHIVOS

**ORGANIZAR ARCHIVOS** de *MaterialesHack* copiará y acomodará automáticamente todos los archivos (JPG o PDF) desde una carpeta de origen hacia las carpetas de destino.  
*(IMAGEN 6)*

### Especificaciones

Este procedimiento toma un banco de archivos de una carpeta de origen y los copia a sus respectivas carpetas de clave, siguiendo la estructura de la *IMAGEN 1*.

Ejemplo: carpeta `01_iniciales` con imágenes de claves como:

- `T2_14217_226_0000452`  
- `T2_00060_229_0000379`  
- `T2_04035_224_0004019`

Luego selecciona la carpeta de materiales donde están las claves (Cerámica, Estucos, etc.), y después la carpeta final de destino (por ejemplo: **Inicio - DIMENSIONADAS**).  

Las opciones incluyen:  

- Alta resolución (si existe)  
- Baja resolución (si existe)  
- Cédula automatizada  
- Deterioros – DIMENSIONADAS  
- Finales – DIMENSIONADAS  
- Inicio – DIMENSIONADAS  
- Procesos – DIMENSIONADAS  
- Cédula CATSA (si existe)  
- Deterioros - TAMAÑO ORIGINAL  
- Finales - TAMAÑO ORIGINAL  
- Inicio - TAMAÑO ORIGINAL  
- Procesos - TAMAÑO ORIGINAL  
- Todas - TAMAÑO ORIGINAL  

Resultado: cada imagen se copiará en automático a su lugar según la clave.  

### Pasos

1. **URL donde se encuentran los archivos**: pega la dirección o usa el buscador. *(IMAGEN 7)*  
   > No importa el nombre de la carpeta.  
2. **URL de la carpeta de material**: selecciona una carpeta válida (Cerámica, Estucos, etc.).  
   > Si tiene un nombre distinto, será rechazada.  
3. **Carpeta donde se copiarán los archivos**: elige la carpeta final (ver *IMAGEN 1*).  

Da clic en **ORGANIZAR** y espera a que se complete el proceso.  

¡Listo! Los archivos se habrán distribuido y copiado en sus respectivas carpetas.  

### Consideraciones

#### Copia de archivos
- Los archivos originales **NO se moverán ni alterarán**.  
- Siempre podrás acceder a ellos incluso después del proceso.

#### Actualiza sin riesgos
- Repetir el proceso no borrará archivos ya existentes en destino, solo añadirá los nuevos.

#### Copia solo si existen las carpetas de destino
- Si se detectan claves sin carpeta de destino, sus archivos no se copiarán. Esto se reflejará en el reporte.

### Reportes

Al organizar archivos se generará un reporte en formato `.xlsx` en la carpeta de materiales seleccionada.  
El reporte incluirá:

- **Clave**: claves detectadas en base a los archivos de origen.  
- **Estatus**: indica si la carpeta de clave ya existe (*CARPETA CREADA* o *CARPETA NO CREADA*).  
- Número de archivos en la carpeta original.  
- Número de archivos que ya estaban en destino.  
- Número de archivos nuevos en destino.  
- Total en destino tras el proceso.  
- Archivos sin copiar (carpeta inexistente).  

#### Recomendación importante: Selecciona bien la carpeta de origen

*MaterialesHack* toma los archivos y, según la carpeta final seleccionada y la nomenclatura esperada, detecta las claves.  

Ejemplo: si la carpeta final es **Cédula CATSA**, los archivos esperados deben tener formato:  

!!!
UTM_clave-de-excavación.pdf
!!!

Si el formato es distinto, puede haber errores en la detección.  

> **No te preocupes:** solo se copiarán archivos si la carpeta de clave ya existe.  
