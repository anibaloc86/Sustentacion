// sustentación, Blioteca.
package sustentacion;

import java.util.Scanner;


public class Sustentacion {
    
    
     public static void main(String[] args) {
        PersonalData Datos[] = new PersonalData[100];
        Scanner lector = new Scanner (System.in);
        int opc, contUs=0, band=0;
        String name;
        
        do{
            System.out.println("\nMenú principal.");
            System.out.println("1. Ingresar Usuario.");
            System.out.println("2. Actualizar Usuario.");
            System.out.println("3. Eliminar Usuario.");
            System.out.println("4. Buscar Usuario.");
            System.out.println("5. Salir.");
            System.out.println("Seleccione una opción:");
            opc= lector.nextInt();
            
            switch (opc){
                case 1:
                    if(contUs<99){
                        
                    Datos[contUs] = new PersonalData();   
                    System.out.println("Ingreso de usuarios.");
                    System.out.print("Digite el nombre del usuario: ");
                    Datos[contUs].setNombre(lector.next());
                    System.out.print("Digite el apellido del usuario: ");
                    Datos[contUs].setApellido(lector.next());
                    System.out.print("Digite la fecha de nacimiento del usuario: ");
                    Datos[contUs].setFecha(lector.next());
                    System.out.print("Digite la cedula del usuario: ");
                    Datos[contUs].setCedula(lector.next());
                    System.out.print("Digite la dirección del usuario: ");
                    Datos[contUs].setDireccion(lector.next());
                    System.out.print("Digite el teléfono del usuario: ");
                    Datos[contUs].setTelefono(lector.next());
                    System.out.print("Digite el área de interes del usuario: química, física, tecnológia, cálculo o programación: ");
                    Datos[contUs].setAreas(lector.next());
                    contUs++;
                    }
                    else System.out.println("Memoria llena.");
                    
                    break;
                case 2:
                    System.out.println("\nActualizar datos.");
                    System.out.println("Digite el nombre a actualizar: ");
                    name = lector.next();
                    for (int i=0; i<contUs; i++){
                        if (name.equals(Datos[i].getNombre())){
                            band=1;
                    System.out.print("Digite la dirección del usuario: ");
                    Datos[i].setDireccion(lector.next());
                    System.out.print("Digite el teléfono del usuario: ");
                    Datos[i].setTelefono(lector.next());
                    System.out.print("Digite el área de interes del usuario: química, física, tecnológia, cálculo o programación: ");
                    Datos[i].setAreas(lector.next());
                            
                        }
                    }
                    if (band==0)
                        System.out.print("Usuario no encontrado");
                    else 
                        band=0;
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
            
          
     }while(opc!=5);
    }
    
}
