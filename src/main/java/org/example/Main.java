package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //

        String cedula;
        LocalDate fecha = LocalDate.now();
        String nombreCliente;

        String nombreEmpleado;
        String contrasenaEmpleado;
        String nombreEmpleadoBD="juanorlas";
        String contrasenaEmpleadoBD="admin123";

        Integer opcion;
        Scanner lea = new Scanner(System.in);

        System.out.println("******Pandebonos Nairo******");
        System.out.println("****************************");
        System.out.println("Apreciado empleado, inicie sesion por favor: ");
        boolean loginExitoso = false;

        while (!loginExitoso){
            System.out.print("Digite su usuario: ");
            nombreEmpleado=lea.nextLine();
            System.out.print("Digite su contraseña: ");
            contrasenaEmpleado=lea.nextLine();


            //login
            if (nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD)){
                System.out.println("Cargando sistema....");
                loginExitoso = true;
                }else {
                System.out.println("Usuario o contraseña incorrectos");
                }

        }


        do {
            System.out.println("\n .....pandesoftware.....");
            System.out.println("1. Agregar compra");
            System.out.println("2. Calcular total");
            System.out.println("3. Modificar compra");
            System.out.println("4. SALIR");
            System.out.print("Seleccione una opcion: ");
            opcion = lea.nextInt();

            Integer cantidadTradicional=0;
            Integer cantidadGuayaba=0;
            Integer cantidadArequipe=0;
            Integer cantidadQuesos=0;
            Integer cantidadBebidas=0;

            Integer productoSeleccionado;

            switch (opcion){
                case 1:
                    System.out.println("1. Pandebono Tradicional ($8000)");
                    System.out.println("2. Pandebono Guayaba ($9500)");
                    System.out.println("3. Pandebono Arequipe ($12000)");
                    System.out.println("4. Pandebono 7 Quesos ($20000)");
                    System.out.println("5. Bebida Caliente, chocolate o cafe ($9500)");
                    System.out.println("6. Terminar pedido");
                    System.out.println("................................................");

                    do {
                        System.out.println("Digite producto deseado: ");
                        productoSeleccionado=lea.nextInt();
                        switch (productoSeleccionado){
                            case 1:
                                System.out.print("Digita cuantos pandebonos Tradicionales desea: ");
                                cantidadTradicional=lea.nextInt();
                                break;
                            case 2:
                                System.out.print("Digita cuantos pandebonos Guayaba desea: ");
                                cantidadGuayaba=lea.nextInt();
                                break;
                            case 3:
                                System.out.print("Digita cuantos pandebonos Arequipe desea: ");
                                cantidadArequipe=lea.nextInt();
                                break;
                            case 4:
                                System.out.print("Digita cuantos pandebonos 7 Quesos desea: ");
                                cantidadQuesos=lea.nextInt();
                                break;
                            case 5:
                                System.out.print("Digita cuantas Bebidas calientes desea: ");
                                break;
                            case 6:
                                System.out.println("Orden terminada");
                                break;
                            default:
                                System.out.println("Producto no encontrado");
                                break;

                        }
                    }while (productoSeleccionado!= 6);


                    break;
                case 2:
                    Integer totalSinPropina=((cantidadTradicional*8000)+(cantidadGuayaba*95000)+
                            (cantidadArequipe*12000)+(cantidadQuesos*20000)+(cantidadBebidas*9500));

                    System.out.println("Incluye propina");

                    Double totalConPropina=((totalSinPropina)+(totalSinPropina*0.1));

                    //Rutina para mostrar un mensaje con o sin propina

                    System.out.print("Total servicio: "+totalSinPropina);
                    System.out.print("Total Propina: "+totalConPropina);
                    break;

                case 3:
                    //Volver a pedir cada uno de los 6 productos
                    //En que estan asignados cada uno de los contadores
                    break;
                case 4:
                    System.out.println("Compra terminada");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;

            }
        }while (opcion != 4);





    }
}