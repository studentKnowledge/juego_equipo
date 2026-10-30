package com.mycompany.mavenproject1;
import java.util.Scanner;

public class EscapeEstacionJuego {
    
    static void ascii_bye(){
        System.out.println("        __________               ");
        System.out.println("        \\______   \\___.__. ____  ");
        System.out.println("        |    |  _<   |  |/ __ \\ ");
        System.out.println("        |    |   \\\\___  \\  ___/ ");
        System.out.println("        |______  // ____|\\___  >");
        System.out.println("               \\/ \\/         \\/");
    }
    
    static void ascii_intro(){
        System.out.println("___________         __                .__               ");
        System.out.println("\\_   _____/ _______/  |______    ____ |__| ____   ____  ");
        System.out.println(" |    __)_ /  ___/\\   __\\__  \\ _/ ___\\|  |/  _ \\ /    \\ ");
        System.out.println(" |        \\\\___ \\  |  |  / __ \\\\  \\___|  (  <_> )   |  \\");
        System.out.println("/_______  /____  > |__| (____  /\\___  >__|\\____/|___|  /");
        System.out.println("        \\/     \\/            \\/     \\/               \\/ ");
        System.out.println("                                   .__       .__        ");
        System.out.println("  ____   _________________    ____ |__|____  |  |       ");
        System.out.println("_/ __ \\ /  ___/\\____ \\__  \\ _/ ___\\|  \\__  \\ |  |       ");
        System.out.println("\\  ___/ \\___ \\ |  |_> > __ \\\\  \\___|  |/ __ \\|  |__     ");
        System.out.println(" \\___  >____  >|   __(____  /\\___  >__(____  /____/     ");
        System.out.println("     \\/     \\/ |__|       \\/     \\/        \\/           ");
    }
    
    static void ganar(){
        System.out.println("=====================================================================================");
        System.out.println("=====================================================================================");
        System.out.println("______       _       ____  _____       _       ______   _________  ________  _  ");
        System.out.println(" .' ___  |     / \\     |_   \\|_   _|     / \\    .' ____ \\ |  _   _  ||_   __  || | ");
        System.out.println("/ .'   \\_|    / _ \\      |   \\ | |      / _ \\   | (___ \\_||_/ | | \\_|  | |_ \\_|| | ");
        System.out.println("| |   ____   / ___ \\     | |\\ \\| |     / ___ \\   _.____`.     | |      |  _| _ | | ");
        System.out.println("\\ `.___]  |_/ /   \\ \\_  _| |_\\   |_  _/ /   \\ \\_| \\____) |   _| |_    _| |__/ ||_| ");
        System.out.println(" `._____.'|____| |____||_____|\\____||____| |____|\\______.'  |_____|  |________|(_) ");
        System.out.println("=====================================================================================");
        System.out.println("=====================================================================================");
    }
    
    static void perder(){
        System.out.println("=====================================================================================");
        System.out.println("=====================================================================================");
        System.out.println("_______  ________  _______     ______   _____   ______   _________  ________  _  ");
        System.out.println("|_   __ \\|_   __  ||_   __ \\   |_   _ `.|_   _|.' ____ \\ |  _   _  ||_   __  || | ");
        System.out.println("  | |__) | | |_ \\_|  | |__) |    | | `. \\ | |  | (___ \\_||_/ | | \\_|  | |_ \\_|| | ");
        System.out.println("  |  ___/  |  _| _   |  __ /     | |  | | | |   _.____`.     | |      |  _| _ | | ");
        System.out.println(" _| |_    _| |__/ | _| |  \\ \\_  _| |_.' /_| |_ | \\____) |   _| |_    _| |__/ ||_| ");
        System.out.println("|_____|  |________||____| |___||______.'|_____| \\______.'  |_____|  |________|(_) ");
        System.out.println("=====================================================================================");
        System.out.println("=====================================================================================");
    }
    
    public static void main(String[] args){
        // Declare Scanner object
        Scanner sc = new Scanner(System.in);

        // Main logic
        int vidas = 3;
        int oxigeno = 30;
        int puntos = 0;
        int pruebaSuperadas = 0;
        boolean playing = true;
        
        int intentos1 = 3;
        
        // Introduction
        ascii_intro();
        
        while (playing) {
            // Comprobar vidas, oxigeno y misiones
            if (vidas <= 0 || oxigeno <= 0){
                // pierde
                perder();
                return;
            } else if (pruebaSuperadas == 4){
                // ganamos
                ganar();
                return;
            }
            // Menu principal
            System.out.println("\n===***************===                        |=========*****************=========|");
            System.out.println("Elige la misión:                             | Vidas: " + (vidas >= 3 ? "MAX" : vidas) + "/3" + "                      |");
            System.out.println("[1] Mision 1                                 | Oxigeno: " + (oxigeno >= 30 ? "MAX" : oxigeno) + "/30" + "                   |");
            System.out.println("[2] Mision 2                                 | ==================================|");
            System.out.println("[3] Mision 3                                 | Puntos: " + puntos + "                         |");
            System.out.println("[4] Salir                                    | Misiones completadas: " + (pruebaSuperadas == 0 ? "ninguna" : pruebaSuperadas) + "/4" + "   |");
            System.out.println("===***************===                        |=========*****************=========|");
            

            // Ask the user
            System.out.print("> ");
            String mision = sc.next();
            System.out.println("");

            try {
                // Convalidar la opcion
                if (!mision.equals("1") && !mision.equals("2") && !mision.equals("3") && !mision.equals("4")){
                    System.out.println("===*** FAHHH! *** ===");
                    System.out.println("¡Opcion incorrecta!");
                    continue;
                }
            } catch (Exception error) {
                System.out.println("===*** FAHHH! *** ===");
                System.out.println("¡Opcion incorrecta!");
                continue;
            }
            // Opcion 4 == salir
            if (mision.equals("4")){
                ascii_bye();
                System.out.println("\n\n===*** Ha salido del videojuego... :(( ***===");
                return;
            }
            
            System.out.println("*********************************");
            System.out.println("=== Entramos en la mision: " + mision + " ===");
            System.out.println("*********************************");
            
            // ====================================================================================
            // ================================= Mision 1 ========================================
            // ====================================================================================
            
            if (mision.equals("1")){
                // Mision 1      
                intentos1 = 3;
                oxigeno -= 2;
                
                while (intentos1 > 0){ 
                    
                    if (intentos1 <= 0){
                        System.out.println("¡Ha suspendido la primera mision!");
                        break;
                    } 
                    
                    // Actualizar unidaded de oxigeno
                    oxigeno -= 1;
                    System.out.println("\n===*** Tienes " + intentos1 + " intentos ***===");

                    int code = 4;
                    System.out.println("=== Introduce el código entre el 1 y el 5 ===");
                    System.out.print("> ");
                    int intentocode = sc.nextInt();

                    if (intentocode == code) {
                        pruebaSuperadas+=1;
                        puntos+=5;
                        System.out.println("Prueba superada.\n");
                        break;

                    } else if (intentocode > 5 || intentocode < 1) {

                            System.out.println("=== Vuelva a intentar. No se ha consumido ningun intento ===\n");
                    } else {
                        intentos1 -= 1;
                        System.out.println("=== Intento fallido ===");
                        System.out.println("=== Reintentando... ===");
                        if (intentocode < 4) {
                            System.out.println("\n*** Pista: El numero secreto es mayor que " + intentocode + " ***");
                        } else {
                            System.out.println("\n*** Pista: El numero secreto es menor que " + intentocode + " ***");
                        }
                        
                        if (intentos1 <= 0){
                            System.out.println("¡Ha suspendido la primera mision!");
                            vidas--;
                            break;
                        }
                    }
                }
            } 
            
            // ====================================================================================
            // ================================= Mision 2 ========================================
            // ====================================================================================
              
            
            else if (mision.equals("2")){
                // Mision 2
                oxigeno -= 2;
                        
                System.out.println("¿Qué cantidad de energia queires asignar a los escudos?");
                //entrada escudors
                int unidades_asignada_escudos = sc.nextInt();
                System.out.println("¿Qué cantidad de energía quieres asignar a los motores?");
                //entrada motores
                int unidades_asignada_motores = sc.nextInt();
                int cantidad_total_asignada = unidades_asignada_escudos + unidades_asignada_motores;
                
                // Comprobar
                while (!(cantidad_total_asignada == 12 && cantidad_total_asignada >= 0)){
                   System.out.println("\n *** ¡Valores incorrectos! ***");
                   System.out.println("¿Qué cantidad de energia queires asignar a los escudos?");
                   //entrada escudors
                   unidades_asignada_escudos = sc.nextInt();
                   System.out.println("¿Qué cantidad de energía quieres asignar a los motores?");
                   //entrada motores
                   unidades_asignada_motores = sc.nextInt();
                   
                   cantidad_total_asignada = unidades_asignada_escudos + unidades_asignada_motores;
                }
                
                if (unidades_asignada_escudos >= 4 && unidades_asignada_motores >= 5 && cantidad_total_asignada == 12) {
                    puntos += 5;
                    System.out.println("=== ¡Prueba SUPERADA! ===");
                    System.out.println("*** Escudos: CARGADOS! ***");
                    System.out.println("*** Motores: CARGADOS! ***\n");
                    pruebaSuperadas++;
                } else {
                    System.out.println("=== ¡Prueba FALLADA! ===");
                    vidas--;
                }
                
            // ====================================================================================
            // ================================= Mision 3 ========================================
            // ====================================================================================
                
            } else if (mision.equals("3")) {
                // Mision 3
                System.out.println("Has iniciado la Prueba 3.");
                // Aquí irá la lógica de la prueba 3
                oxigeno -= 2;

                System.out.println();
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                System.out.println("- Ruta 1: ruta despejada. Se supera la prueba y se obtienen 3 puntos.");
                System.out.println("- Ruta 2: pasillo dañado. Se pierde 1 vida, pero se llega a la siguiente zona y se supera la prueba.");
                System.out.println("- Ruta 3: anillo exterior. Se gastan 4 unidades adicionales de oxígeno y se obtienen 6 puntos; la prueba queda superada.");
                System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

                System.out.println();
                System.out.print("- Selecciona una ruta (1-3): ");
                int ruta = sc.nextInt();


                while (ruta != 1 && ruta != 2 && ruta != 3) {
                    System.out.println("Opción inválida.");
                    System.out.print("- Selecciona una ruta válida (1-3): ");
                    ruta = sc.nextInt();
                    System.out.println();
                }

                // RUTA 1: ruta despejada

                if (ruta == 1){
                    System.out.println();
                    System.out.print("- Has elegido la ruta 1. Obtienes 3 puntos. Superas la prueba");
                    puntos += 3;
                    pruebaSuperadas += 1;

                }

                // RUTA 2: ruta despejada

                else if (ruta == 2) {
                    System.out.println();
                    System.out.print("- Has elegido la ruta 2. Pierdes 1 vida. Superas la prueba");
                    vidas -= 1;
                    pruebaSuperadas += 1;

                }

                // RUTA 3: ruta despejada

                else if (ruta == 3) {
                    System.out.println();
                    System.out.print("- Has elegido la ruta 3. Pierdes 4 de oxígeno y obtienes 6 puntos. Superas la prueba");
                    oxigeno -= 4;
                    puntos += 6;
                    pruebaSuperadas += 1;
                }
                
                System.out.println("\n");
            }
        } 
    }
}
