package tp2.programacion.estructurada;

import java.util.Scanner;


public class Tp2ProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //ejercicio_1(input);
        //ejercicio_2(input);
        //ejercicio_3(input);
        //ejercicio_4(input);
        //ejercicio_5(input);
        //ejercicio_6(input);
        //ejercicio_7(input);
        //ejercicio_8(input);
        //ejercicio_9(input);
        //ejercicio_10(input);
        //ejercicio_11(input);
        //ejercicio_12(input);
        //ejercicio_13(input);
    }
    
    static void ejercicio_1(Scanner input){
        int anio;
        
        System.out.print("Ingresa un anio: ");
        anio = Integer.parseInt(input.nextLine());
    
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println(anio + " es bisiesto");
        }else{
            System.out.println(anio + " no es bisiesto");
        }
    }
    
    static void ejercicio_2(Scanner input){
        int num1, num2, num3, mayor;
        
        System.out.print("Ingresa el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa el tercer numero: ");
        num3 = Integer.parseInt(input.nextLine());
        
        mayor = num1;
        
        if(num2 > mayor) {
            mayor = num2;
        }if(num3 > mayor) {
            mayor = num3;   
        }
        System.out.println("El mayor es: " + mayor);
        }
    
    static void ejercicio_3(Scanner input){
        int edad;
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if(edad < 12) {
            System.out.println("Niño");
        }else if(edad >= 12 && edad <= 17 ) {
            System.out.println("Adolescente");
        }else if(edad >= 18 && edad <= 59 ) {
            System.out.println("Adulto");
        }else{
            System.out.println("Adulto mayor");
    }
    
   }
    
    static void ejercicio_4(Scanner input){
        double precio, precioFinal;
        String categoria;
        
        System.out.print("Ingrese precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la categoria del producto (Selecciona: A, B o C): ");
        categoria = input.nextLine();
        
        if(categoria.equalsIgnoreCase("A")) {
            precioFinal = precio - (precio * 0.10);
            System.out.println("Descuento aplicado: 10%");
        } else if(categoria.equalsIgnoreCase("B")) {
            precioFinal = precio - (precio * 0.15);
            System.out.println("Descuento aplicado: 15%");
        }else if(categoria.equalsIgnoreCase("C")){
            precioFinal = precio - (precio * 0.20);
            System.out.println("Descuento aplicado: 20%");
        }else{
            System.out.println("Ingresa una de las tres opciones (A, B o C)");
            return;
        }
        System.out.println("Precio final: " + precioFinal);
    }
        
    static void ejercicio_5(Scanner input){
        int sumaPares = 0, numeros;
        
        System.out.print("Ingresa un numero(0 para terminar): ");
        numeros = input.nextInt(); 
        while (numeros != 0) {            
            if (numeros % 2 == 0) {
                sumaPares += numeros;
            }
            System.out.print("Ingresa un numero: (0 para terminar)");
            numeros = input.nextInt();
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        
    }
    
    static void ejercicio_6(Scanner input){
        int positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el numero " + i + " : ");
            int numero = input.nextInt();
            
            if(numero > 0){
                positivos++;
            }else if(numero < 0){
                negativos++;
            }else{
                ceros++;
            }
        }
         System.out.println("Resultados: ");
         System.out.println("Positivos: " + positivos);
         System.out.println("Negativos: " + negativos);
         System.out.println("Ceros: " + ceros);
    }
    
    static void ejercicio_7(Scanner input){
        int nota;
        
        do {            
            System.out.print("Ingresa una nota entre 0 y 10: ");
            nota = input.nextInt();
            
            if(nota < 0 || nota > 10){
            System.out.println("Error: Nota invalida. Ingresa una nota entre 0 y 10");
            }
        
        } while(nota < 0 || nota > 10);
          
        System.out.println("Nota guardada correctamente");
    }
    
    static void ejercicio_8(Scanner input){
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());
         
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
         
        double impuestoMonto = precioBase * (impuesto / 100.0);
        double descuentoMonto = precioBase * (descuento / 100.0);

        System.out.println("Precio base: " + precioBase);
        System.out.println("Impuesto: " + impuesto + "% = " + impuestoMonto);
        System.out.println("Descuento: " + descuento + "% = " + descuentoMonto);
        System.out.println("Precio final: " + precioFinal);
         
    }
   
    static double calcularPrecioFinal(double precioBase, double impuestoPorcentaje, double descuentoPorcentaje){
        double impuesto = impuestoPorcentaje / 100.0;
        double descuento = descuentoPorcentaje / 100.0;
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    
    static void ejercicio_9(Scanner input){
        double precioProducto, peso;
        String zona;
        
        System.out.print("Ingresa el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Ingresa el peso del producto en kg: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingresa la zona de envio del producto: ");
        zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo del envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
        
    }
    
    static double calcularCostoEnvio(double peso, String zona){
        
        if(zona.equalsIgnoreCase("Nacional")){
            return peso * 5.0;
        }else if(zona.equalsIgnoreCase("Internacional")){
            return peso * 10.0;
        }else{
            System.out.println("ERROR. Ingresa nacional o internacional");
            return 0.0;
        }
    }
        
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        return precioProducto + costoEnvio;
        }
    
    static void ejercicio_10(Scanner input){
        int stockActual, cantidadVendida, cantidadRecibida;
        
        System.out.print("Ingresa el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
  
    static double descuentoEspecial = 0.10;
    
    static void ejercicio_11(Scanner input){
        double precioProducto;
        
        System.out.print("Ingresa el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        calcularDescuentoEspecial(precioProducto);
        
        
    }
     
    static void calcularDescuentoEspecial(double precio){
    
       double descuentoAplicado = precio * descuentoEspecial;
       double precioFinal = precio - descuentoAplicado;
        
       System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
       System.out.println("El descuento especial aplicado es: " + precioFinal);
    }
    
    static void ejercicio_12(Scanner input){
    
        double[] precios = {199.99, 2299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        for(int i = 0; i < precios.length; i++){
        System.out.println("Precio: $" + precios[i]);
        }
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        for(int i = 0; i < precios.length; i++){
        System.out.println("Precio: $" + precios[i]);
        }
    }

    static void ejercicio_13(Scanner input){
    
        double[] precios = {199.99, 2299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        recursiva(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        recursiva(precios, 0);
    
    }
    
    static void recursiva(double[] array, int indice){
    
        if(indice < array.length){
        
            System.out.println("Precio: $" + array[indice]);
            recursiva(array, indice + 1);
        
        }
    
    }


}
    
    
    
    

    

