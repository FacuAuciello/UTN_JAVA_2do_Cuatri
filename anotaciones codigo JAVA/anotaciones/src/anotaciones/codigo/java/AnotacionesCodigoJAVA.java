
/*
---------------------------------------------------------------------------------------------------------------------------
COMENTARIOS EN JAVA:
-----------------------------------------------------------------------------------------------------------------------------
//comentar una sola linea

/* comentario de bloque
comentar 
y cerrar
*/

/*
---------------------------------------------------------------------------------------------------------------------------
MOVER LINEAS DE CODIGO SIN CORTAR Y PEGAR, SELECCIONADO Y USANDO FLECHAS:
---------------------------------------------------------------------------------------------------------------------------
Seleccionas las lineas de codigo que quieras poner mas arriba o mas abajo
SHIFT + ALT + flecha para arriba o para abajo moves las lineas. Burbujeo.

---------------------------------------------------------------------------------------------------------------------------
NETBEANS AYUDA: AUTOSUGERIR NOMBRES
---------------------------------------------------------------------------------------------------------------------------
CTRL + ESPACIO para sugeriencias mientras comienzo a escribir algo.

-----------------------------------------------------------------------------------------------------------------------------
TIPOS DE DATOS EN JAVA: DATOS PRIMITIVOS, no representan un objeto
-----------------------------------------------------------------------------------------------------------------------------
#DATOS NUMERICOS
int = nuermo entero (tambien tiene byte,short y long, la diferencia cuanto ocupan y rango de valores. Ver documentacion).
double = numeros decimales (tambien esta float que guarda menos decimales). USAR DOUBLE.

#DATOS ALFANUMERICOS
char = caracter simple ('a', '@', '2' por ejemplo)
String = cadena de caracteres ("Hola", "Lo que sea", "@"). String CON S MAYUSCULA.

#DATOS LOGICOS
boolean = true o false
-----------------------------------------------------------------------------------------------------------------------------
DEFINIR VARIABLES EN JAVA:
-----------------------------------------------------------------------------------------------------------------------------
tipoDeDato nombreDeLaVariable;          SIEMPRE CERRAR CON ;

algunos ejemplos:
int edad;
double salario;
String nombreUsuario;
boolean esDeNoche;

#DEFINICION DE VARIABLES DEL MISMO TIPO EN UNA LINEA:
tipo var1, var2,...,varN;

algunos ejemplos:
int nota1, nota2, nota3;
String nombre, apellido;

#CONVENCION DE NOMBRES DE VARIABLES:
Notacion para llamar variables en java, lowerCamelCase, emulando las jorobas de un camello

#DECLARAR VARIABLE Y LUEGO ASIGNAR VALOR:
declaracion: int edad;
asignacion edad = 18;
Esto se usa si necesitás declarar la variable antes (por ejemplo, fuera de un bloque if, for, etc.) y asignarle valor despues.

int edad = 18 LA NORMAL
------------------------------------------------------------------------------------------------------------------------------
DEFINIR OBJETO DE TIPO SCANNER:
------------------------------------------------------------------------------------------------------------------------------
Scanner input = new Scanner(System.in); tiene una referencia al objeto scanner,
este nos permite ser el intermediario entre nosotros y el usuario que agrega datos en la consola y luego devolverlo

input NO ES OBLIGATRIO. Pero es logico si esperamos un input.... 

Toca el foquito para que te importe la libreria de Scanner

⚠️⚠️⚠️⚠️CUIDADO CON SCANNER:⚠️⚠️⚠️⚠️⚠️
Si la entrada es tipo cadena no hay que convertir nada, pero...

Cada vez que usamos los metodos next. estoy estaneando un valor de la consola sin tener en cuenta la tecla ENTER
Esta tecla produce un caracter mas que la pc puede interpretar
El next line lee absolutamente todo lo que hay en la consola incluyendo ese salto de linea del ENTER

SI USO NEXT LINE JUSTO DESPUES DE ALGUNA INSTRUCCON next int, double, float o next se produce un error que es:
tomar esa tecla ENTER que queda boyando en la consola y da la sensacion de que el usuario toco el ENTER sin aver puesto ningun ingreso

Entonces siempre que quiera leer un entero: primero leemos la entrada como cadena y luego convertirlo a entero
ejemplo:
int = Integer.parseInt(input.nextLine());
double = Double.parseDouble(input.nextLine());


#EJEMPLO LECTURA DE UN ENTERO:
Scanner input = new Scanner(System.in);
int edad;

edad = input.nextInt(); 
NEXT IN permite escanear lo que el usuario escribe en la consola y despues lo convierte y devuelve

#EJEMPLO LECTURA DE UN DOUBLE:
Scanner input = new Scanner(System.in);
double = salariol;

salario = input.nextDouble();

#EJEMPLO LECTURA DE UN BOOLEAN:
Scanner input = new Scanner(System.in);
boolean tieneHijos;

tieneHijos = input.nextBoolean();

#EJEMPLO LECTURA DE UNA CADENA:
Scanner input = new Scanner(System.in);
String nombre;

nombre = input.nextLine();

#EJEMPLO LECTURA DE UN CARACTER SIMPLE:
Scanner input = new Scanner(System.in);
char letra;

letra = input.nextLine(),charAt(0); 
Primero lee el dato de la consola y devuelte como string
charart permite devolver el primer caracter (por eso el numero 0) como char en este caso
Si queremos leer una letra o solo un caracter usar esta forma

#ANTES DE CADA INSTRUCCION DE ENTRADA:
poner una salida que indique al usuario que debe hacer

System.out.printIn("ingresa nombre") el ln para salto de linea. print solo para escribir en la misma linea
Scanner input = new Scanner(System.in);

------------------------------------------------------------------------------------------------------------------------------
CONCATENAR DATOS EN JAVA:
------------------------------------------------------------------------------------------------------------------------------
Para concatenar cuando hay una cadena en la expresion, se utiliza el +

Se puede utilizar tanto dentro del metodo imprimir como en una variable saludo = "Hola " + nombre;

------------------------------------------------------------------------------------------------------------------------------
#CARACTERES DE ESCAPE:
------------------------------------------------------------------------------------------------------------------------------
\" si quiero mostrar una doble comilla en el print, por ejemplo "una cita de un autor textual"
print("Descartes dijo: \"Pienso, luego existo\"") para desambiguar
print("C:\\Users\\Fulano") la primer barra es para escapar el caracter que sigue, que es la otra barra

#CARACTERES DE ESCAPE PARA REALIZAR CONTROLES DEL FLUJO DE SALIDA DE NUESTRA PC:
\n salto de linea(de renglon), es como tocar la tecla ENTER en el teclado
\t salto de tabulacion(tipo una sangria)
\b retroceso, borrar un caracter
\r retorno de carro, simula tocar la tecla de inicio, pone el cursor al principio de la linea actual. CUIDADO

------------------------------------------------------------------------------------------------------------------------------
OPERADORES ARITMETICOS: 
------------------------------------------------------------------------------------------------------------------------------
PEMDAS (parentesis, exponentes, multiplicacion, division, suma y resta). En este orden se resuelve
+
-
*
/ division con resultado entero 12/5 = 2

⚠️⚠️⚠️⚠
En los lenguajes deribados de C, como JAVA, las operaciones con enteros devuleven como resultado un valor entero
por ejemplo: estamos trabajando con porcentajes
Para que la division RETORNE un resultado con DECIMALES(double), al menos uno de los valores debe tener DECIMALES(double)
porcAprobados = (aprobados / total) * 100; funciona mal porque ninguno es double
porcAprobados = (aprobados * 1.0 / total) * 100; es valido porque lo multiplicamos 1.0 entonce se transforma en tipo double
porcAprobados = ((double)aprobados / total) * 100; la mejor opcion: CASTING, transformar EN ESE INSTANTE (no a la variable) tratarlo como si fuera otro tipo de dato
La variable seguira siendo int pero en ese momento de ejecucion es double
⚠️⚠️⚠️⚠

% modulo o residuo, devuelve el resto de la division 9%5 = el resultado es 1, pero te muestra lo QUE TE SOBRA, 9%5 = 4

------------------------------------------------------------------------------------------------------------------------------
OPERADORES 

------------------------------------------------------------------------------------------------------------------------------

AND → &&

OR → ||

NOT → !

---------------------------------------------------------------------------------------------------------------------------
CONSTANTES:
---------------------------------------------------------------------------------------------------------------------------
es un contenedo de meroria donde se aloja un dato, como una variable, a diferencia el VALOR NO PUEDE CAMBIAR

Las constantes las debemos poner fuera del main, pero sigue adentro de la class

Para que se convierta en una constante debemos utilizar la palabra: final 

las constantes se suelen nombrar en mayuscula y con guiones bajos por convencion, asi son mas faciles de detectar
ejemplo: final static double CANT_HORAS_TRABAJADAS = 5;

Por que el static? las constantes declaradas fuera del main deben ser static para que funcionen dentro del mismo. Paradigma orientado a objetos

ACOSTUMBRARSE A PONER EL VALOR DE LA CONSTANTE AFUERA CUANDO LA DECLARAS

------------------------------------------------------------------------------------------------------------------------------
CASTING:
------------------------------------------------------------------------------------------------------------------------------
es un metodo que nos permite tratar a un valor como si fuera de otro tipo. Si una variable es declarada de tipo entero, en todo el programa sera, de tipo int,
recibe datos int pero en otra linea necesitamos que se comporte como un double. Entonces usamos CASTING.

#CASTING POR ENSANCHAMIENTO (de int a double)
Cuando tenemos un valor y lo queremos representar por un tipo de dato que pudiera ser mas abarcativo
por ejemplo:
int z = 6;
double x = 3.12;

double valorDouble = x; esto imprime 3.12
double valorDouble = z; estamos intentando guardar un valor de tipo entero en una varialbe tipo double. Esto imprime 6.0
Tomamos al 6 y al guardarlo/tratarlo como una variable de tipo double es 6.0, se le aniade el valor decimal
JAVA HACE EL CASTING DE FORMA IMPLICITA, AUTOMATICAMENTE. Manual: double valorDouble = z;

#CASTING POR ESTRECHAMIENTO
todo lo contrario, tenemos un valor que necesita cierta capacida de memoria para representarse, y estamos usando una variable de menos capacidad para alojarlo.
por ejemplo:
int z = 6;
double x = 3.12;

int valorEntero = z; esto imprime 6
int valorEntero = x; error DE COMPILACION, como se debe perder informacion (el .12) java no hace el CASTING automatico, implicito.
Debemos hacerlo manual, EXPLICITO.
int valorEntero = (int)x; ahora si, imprime 3



-------------------------------------------------------------------------------------------------------------------------------------------------------------
PROGRAMACION ESTRUCTURADA (OPERADORES Y ESTRUCTURAS CONDICIONALES, REPETICION/CICLOS, FUNCIONES Y PROGRAMACION MODCULAR, RECURSIVIDAD Y ESTRUCTURA DE DATOS)
-------------------------------------------------------------------------------------------------------------------------------------------------------------
###OPERADORES RELACIONALES###

toman numero pero devuelven como resultado un valor logico. TRUE OR FALSE
< menor
<= menor o igual
> mayor
>= mayor o igual
!= distinto
== comparacion (4 == 5) falso

⚠️⚠️⚠️⚠
El operador de comparacion tiene un problema al usarse para comparar cadenas de caracteres con el tipo de dato String
Las cadenas de caracteres en JAVA son objetos, el doble igual compara la identidad de esos objetos. Al ser objetos diferentes por mas que la persona
ingrese el mismo nombre por consola que nosotros guardamos en una variable, va a dar FALSE.

Para comparar cada letra de la cadena y solucionar este error:
tomar una cadena que quieras comparar, poner punto y usar equals comparando la otra cadena dentro del parentesis

String nombreEsperado = "Juan";
System.out.println(nombreDePersona.equals(nombreEsperado)); Estos es TRUE pero si juan esta en minuscula dara false

.equalsIgnoreCase
evalua a las cadenas caracter por caracter para ver si son iguales pero ignorando mayusculas y minusculas
⚠️⚠️⚠️⚠

###SWITCH CASE###
switch(variable){
    case:
        algo
    case:
        algo
        break
    default

si quiero poner un char(un simbolo) con comillas simples, ejemplo case '+':

default es el ultimo caso en el switch por si no se apreta lo correcto

debo poner ambas por ambiguedad, por si la persona ingresa mayuscula o minuscula:
case 'x':
case 'X':

DENTRO DE CASA CASE PUEDO HACER LO QUE QUIERO, por ejemplo or para poder divir por cero o no
case '/':
    if (num2 != 0) {
        print resultado
    }else{
        print no se puede dividir por cero
}

###REPETICION O ITERACION###
while: se repite una o mas instrucciones mientras la condicion sea verdadera. Si la condicion es falsa el codigo de adentro no se ejecuta. Condicion se evalua al PRINCIPIO

do-while: si queremos asegurarnos que se ejecute una vez el codigo de adentro. La condicion se evalua al FINAL.

⚠️⚠️⚠️⚠PARA QUE LOS CICLOS NO SEAN INFINITOS: COMO CONTROLARLOS?
Contador: cuando llegamos a un numero determinado de veces que antes ya sabiamos

Centinela o bandera: no sabe cuantos ciclos se van a ejecutar, solo espera DETERMINADO EVENTO
⚠️⚠️⚠️⚠

###CICLO WHILE###
si la condicion del while nunca se vuelve falsa se genera un ciclo infinito
while(poner la condicion){
    codigo que se repite
}

while con contador

int cont = 1
while(condicion){
    codigo que se repite
    cont = cont + 1 actualizacion
}

###CICLO FOR###
permite escribir ciclos por contador de una manera mas corta

for(int variable = valor inicial; condicion de permanencia(hasta donde); actualizacion){ 
    codigo que se repite
}

ejemplo de 1 hasta 5:
for(int cont = 1; cont <= 5; cont++){
    codigo que se repite
}

###CICLO DO-WHILE###
Se utiliza en ciertos casos particulares
siempre ejecuta al menos una vez porque primero corre el codigo y recien despues evalua la condicion

do(significa hacer){
    instrucciones
}while(condicion); //aca evalua la condicion. TRUE repite el bloque. FALSE sale del ciclo
    instrucciones

-------------------------------------------------------------------------------------------------------------------------------------------------------------
PROGRAMACION MODULAR Y FUNCIONES
-------------------------------------------------------------------------------------------------------------------------------------------------------------
En vez de tener todo en un solo codigo, en un solo programa principal con 1000 lineas. Vamos a procurar tener un programa que se apoye en otros mas pequenios.

UN PROBLEMA COMPLEJO, DIVIDO EN PARTES PEQUENIAS, INDIVIDUALES ENTRE SI. De esta manera tenemos mas ventaja cuando lo unificamos.

Ademas es mas facil encontrar fallos en partes pequenias

###FUNCIONES/PROCEDIMIENTOS###
explicacion basica con ejemplo y teoria:

-DEFINICION: PONER UN NOMBRE REPRESENTATIVO DE QUE HACE. En este caso, que tiene que hacer la funcion siguiente.
siguiente(n) = n + 1 tenemos una funcion llamada siguiente, recibe cualquier numero n y nos devuelve el valor n + 1
Si lo leemos, el siguiente de un numero n es numero + 1

-LLAMADO: invocacion 
siguiente(4) --> devuelve 5 porque el siguiente de 4 es 5, n + 1

si vemos a la funcion como una caja, la ENTRADA es un 4, el PROCESO es la caja de siguiente y la SALIDA es un 5

⚠️⚠️⚠️⚠
-ABSTRACCION: ME IMPORTA EL QUE, NO EL COMO. En este caso no me importa hay dentro de la caja siguiente, solo el valor que devuelve
⚠️⚠️⚠️⚠

-ARGUMENTOS: A los valores concretos que hay que enviarles a las funciones para que hagan bien su trabajo
Estos argumentos luego se transoforman dentro de la funcion en parametros.

Los parametros son los valores que recibe la funcion, desde afuera de la funcion vos envias un argumento.

Hay algunas funciones que tienen VALOR DE RETORNO donde por ejemplo hacen una cuenta y necesitamos el resultado y otras no devuelven nada.

###COMO IMPLEMENTAR LAS FUNCIONES###
nombre_funcion(argumentos). Los parentesis pueden quedar vacios o recibir uno o mas argumentos. 

ejemplos:
saltarRenglon()
saludar("Maria")
sumar(5,3)

public static void main() ES LA FUNCION PRINCIPAL DE JAVA

JAVA es ORIENTADO A OBJETOS. Entonces todas las funciones que hagamos estan metidas dentro de una clase

⚠️⚠️⚠️⚠
DIFERENCIA 
FUNCION: puede ser llamda desde cualquier parte de nuestro programa
METODO: estan encapsulados adentro de una clase, para poder invocarlos tenemos que hacer referencia a una clase o a un objeto de esa clase.
por ejemplo nextLine(), print(), parseInt() son funciones que le pertenecen a una clase/objeto, entonces son metodos.
⚠️⚠️⚠️⚠

###DEFINIR FUNCIONES(METODOS)###

-Hay funciones devuelve un valor calculado a partir de los parametros que le llegan por afuera
El tipo de retorno tiene que ser coherente con el valor a retornar

static<tipo_retorno><nombre_funcion>(parametros){
    <instrucciones a ejecutar>
    return <valor a retornar>
}

-Cuando hay funciones que no necesitan retornar nada. Ponemos VOID, que significa vacio.

static void <nombre_funcion>(parametros){
    <instrucciones a ejecutar>
}

EJEMPLO COMPLETO CON LA CLASE, llamamos la funcion dentro (imprimir simbolo). La funcion no retorna nada (VOID)

public class FuncionesVoid{

    public static void main(String[] args) {
        imprimirSimbolo('x', 5); //podemos llamar mucha veces a la funcion con diferentes opciones
        imprimirSimbolo('@', 8);
        imprimirSimbolo('3', 3);
    }

}
    static void imprimirSimbolo(char simbolo, int veces){
        for(int i = 0; i < veces; i++){
        System.out.print(simbolo); imprime por pantalla lo que leyo de los parametros ingresados y la cuenta que hizo. NO RETORNA es VOID vacia
    }
}

ejemplo con retorno:

public class FuncionesVoid{

    public static void main(String[] args) {
        
        String s = sucesionDeSimbolos('#', 7);
        System.out.println(s);
        
    }

}

static String sucecionDeSimbolos(char simbolo, int veces){
        String sucecion = ""; //empieza la variable siendo una cadena vacia
        for(int i = 0; i < veces; i++){
        sucecion = sucecion + simbolo; //tomamos a la variable y le sumamos lo que va aumentando. de a poco va creciendo
        return sucecion;  //return de simbolos, en cadena de caracteres
    }
}


###DOCUMENTAR METODOS CON JAVADOC###

Seria guardar funciones que hice para luego poder reeutilizarlas en otro codigo sin tener que repensarlas o escribirlas de nuevo. ESTA BUENO

utils. ahi aparece la lista de funciones guardadas

Cuando tenemos una funcion que queramos guardar, tenemos que poner /** en el renglon de arriba y tocar enter

cuando tocamos enter aparece esto:

/**
*poner una descripcion de que hace la funcion
*param a un entero que sera dividio por b
*param b un numero entero que dividira a
* etc true si a es multiplo de b
static boolean esMultiplo(int a, int b){
    return obtenerResto(a,b) == 0;
}

click derecho a el proyecto. GENERATE JAVA DOC y hace una documentacion completa del proyecto en una pagina web
solo muestra lo que en la clase sea public

podemos configurar las cosas que no sean publicas:
click derecho, propierties, documenting y tildamos include private and package private members.

-------------------------------------------------------------------------------------------------------------------------------------------------------------
RECURSIVIDAD
-------------------------------------------------------------------------------------------------------------------------------------------------------------
resolver un problema a partir de los resultados del mismo problema pero en versiones cada vez mas pequenias hasta llegar a un caso base.

UNA FUNCION QUE SE LLAMA A SI MISMA

La mayor funcion es hacer programas cortos y muy expresivos

https://www.youtube.com/watch?v=Sh1xrDAOPyY&ab_channel=CharlyCimino


-------------------------------------------------------------------------------------------------------------------------------------------------------------
ESTRUCTURAS DE DATOS(ejemplos de algunos). SABER SELECCIONAR CUAL PARA QUE ES CLAVE. BUSCAR
-------------------------------------------------------------------------------------------------------------------------------------------------------------
alojar todos los mismos valores en una estructura y referenciandola a traves de una unica variable

###VECTOR(ARRAY)### Una sola dimension

ej. int[] edades; si necesito varias edades coleccionadas en un array. Primero debo alojar en una variable ese array
Strings[] palabras; 
y asi con las demas variables

int[] edades = new int[6 indica la dimension del array]; ASI SE ESCRIBE. toma los valores default generalmente 0 o sin datos

int[] edades = {23,69,4,5,7} ASI CUANDO LE PONEMOS LOS VALORES

print(edades[2]) para mostar un determiunado valor

ciclo for para imprimir todo el vector completo
for(int i = 0; i < palabras2.length; i++){
    String(variable temporal)nombreVariable = palabras2[i]
    print(nombreVariable)
}

Tomamos los datos y las ponemos uno al lado del otro en su celda. Cada dato tiene su numero de indice(empieza en cero). Son faciles de recorrer y manipular. 
TODOS LOS DATOS DEBEN SER DEL MISMO TIPO
recorrer el array de punta a punta en sencillo con un contador que vaya tomando sus valores hacia adelante o atras

VENTAJA:acceder a un dato por su posicion
DESVENTAJA: una vez creados no pueden modificar su tamanio, ni agregar ni sacar, si cambiar un valor de un elemento

Si a cada celda de un vector le ponemos mas vectores tenemos:
###MATRICES(ARRAY DE ARRAYS)###

es una estructura de 2 dimensiones, array de arrays.

LOS ARRAYS NO NOS PERMITEN AGREGAR Y QUITAR DATOS, SON DE TAMANIO FIJO

###LISTAS ENLAZADAS(LINKED LISTS)###

para tener una lista enlazada necesitamos un nodo(una estructura/objeto) que guarda solo dos valores:
1)el dato que necesitamos alojar
2)la referencia hacia donde esta otro nodo como el

SI LOGRAMOS QUE CADA NODO APUNTE HACIA EL SIGUIENTE SUCESIVAMENTE HASTA LOGRAR QUE EL ULTIMO APUNTE A NADA (null) y nos guardamos DONDE COMIENZA LA LISTA(inicio)
estamos en presencia de una lista ligada simple. ej: blockchain, crypto monedas

SI QUEREMOS RECORRER LA LISTA EN AMBOS SENTIDOS(derecha a izq y viceversa). TOMAMOS CADA NODO Y LE DAMOS UNA REFERENCIA HACIA ADELANTE O ATRAS
.ej: spotify cuando elegimos cancion hacia atras o adelante

SI QUEREMOS TOMAR EL ULTIMO NODO Y REFERENCIAMOS AL PRIMERO
lista circular. Ruleta, tragamoneras, rueda de la fortuna, juego de mesa con turno

###PILAS(STACKS) Y COLAS(QUEUES)###

Las pilas son conocidas como estructuras L.I.F.O(last in, firt out). Invierten el orden de los elementos ingresados.
el primer dato que ingreso va a ser el primero que logre sacar porque esta en el tope.
el primer dato que se ingreso a la pila, va a ser el ultimo que pueda salir


Las colas son conocidas como estructuras F.I.F.O(first in, firt out). El primero en entrar es el primero en salir.

###ARBOLES(TREES)###
si tomamos a un nodo y le ponemos referencias izq y der y repetimos estos pasos para sus hijos
padre, raiz, hoja, etc. Como un arbol genealogico, o las carpetas de windows se va ramidifcando

###GRAFOS(GRAPHS)###
ej aplicacion de mapas, redes solciales

###DICCIONARIOS###
clave,valor

*/




















