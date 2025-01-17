
package programas;
//paquete de datos e/s datos por consola
import java.util.Scanner;

public class DatoEmpleado {
//metodo principal
public static void main(String args []){
//declaración de variables
String empleado;
double ht,th,sb,d,sn;
//creando el objeto lectura
Scanner lectura=new Scanner (System.in);
//Entrada de datos
System.out.print("Nombre del empleado: ");
empleado=lectura.next();
System.out.print ("Horas trabajadas: ");
ht=lectura.nextDouble();
System.out.print ("Tarifa por hora: ");
th=lectura.nextDouble();
//proceso de datos
sb=ht*th;
d=sb*0.13;
sn=sb-d;
//salida de datos
System.out.println("Sueldo bruto: "+sb);
System.out.println("Descuento: "+d);
System.out.println("Sueldo Neto: "+sn);
 }    
}
