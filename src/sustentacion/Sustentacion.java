// sustentación, Blioteca.
package sustentacion;

import java.util.Scanner;


public class Sustentacion {
    
    
     public static void main(String[] args) {
        PersonalData Datos[] = new PersonalData[100];
        Scanner lector = new Scanner (System.in);
        int opc, contUs=0, band=0, opcE;
        String name;
        
        do{
            System.out.println("\n\nMenú principal.");
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
                    System.out.println("\nIngreso de usuarios.");
                    System.out.print("\nDigite el nombre del usuario: ");
                    Datos[contUs].setNombre(lector.next());
                    System.out.print("\nDigite el apellido del usuario: ");
                    Datos[contUs].setApellido(lector.next());
                    System.out.print("\nDigite la fecha de nacimiento del usuario: ");
                    Datos[contUs].setFecha(lector.next());
                    System.out.print("\nDigite la cedula del usuario: ");
                    Datos[contUs].setCedula(lector.next());
                    System.out.print("\nDigite la dirección del usuario: ");
                    Datos[contUs].setDireccion(lector.next());
                    System.out.print("\nDigite el teléfono del usuario: ");
                    Datos[contUs].setTelefono(lector.next());
                    System.out.print("\nDigite el área de interes del usuario: química, física, tecnológia, cálculo o programación: ");
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
                    System.out.println("\nEliminar usuario.");
                    System.out.println("\nDigite el nombre a eliminar: ");
                    name = lector.next();
                    
                    System.out.println("\n¿Seguro que desea eliminar el usuario?");
                    System.out.println("\n  1. Para Confirmar.");
                    System.out.println("\n  2. Para Cancelar.");
                    opcE = lector.nextInt();
                    
                    if(opcE==1){
                        
                        for (int i=0; i<contUs; i++){
                        if (name.equals(Datos[i].getNombre())){
                            band=1;
                                                                
                    Datos[i] = null;
                    
                    System.out.println("\nUsuario eliminado.");
                           
                        }
                                               
                    }
                    if (band==0)
                        System.out.print("Usuario no encontrado");
                    else 
                        band=0;
                                                
                    }else                 
                    
                    break;
                case 4:
                    System.out.println("\nEliminar usuario.");
                    System.out.println("\nDigite el nombre a buscar: ");
                    name = lector.next();
                    
                    for (int i=0; i<contUs; i++){
                        if (name.equals(Datos[i].getNombre())){
                            band=1;
                            
                    System.out.print("\nNombre de usuario: "+Datos[i].getNombre());
                    System.out.print("\nApellido: "+Datos[i].getApellido());
                    System.out.print("\nFecha de nacimiento: "+Datos[i].getFecha());
                    System.out.print("\nCedula: "+Datos[i].getCedula());
                    System.out.print("\nDirección: "+Datos[i].getDireccion());
                    System.out.print("\nTelefono: "+Datos[i].getTelefono());
                    System.out.print("\nArea de interés: "+Datos[i].getAreas());
                                                                
                        }
                    }
                    if (band==0)
                        System.out.print("Usuario no encontrado");
                    else 
                        band=0;
                    
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
