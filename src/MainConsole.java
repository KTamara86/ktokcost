/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva 2024-02-26, Kukta Tamara
 */

import java.util.Scanner;

public class MainConsole {

    String szallitas = "";
    String uzlet = "";
    String javitas = "";  
    Scanner scanner;

    public MainConsole() {
        drawHeader();
        try (Scanner scanner = new Scanner(System.in)){
            this.scanner = scanner;
            startInput();
        }

        Koltseg koltseg = new Koltseg(szallitas, uzlet, javitas);
        Filehandler filehandler = new Filehandler();
        filehandler.writeToTextFile(koltseg);
    }    

    private void drawHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");        
    }   
    
    private void startInput() {
        szallitas = input("Szállítási költség: ");
        uzlet = input("Üzleti költség: ");
        javitas = input("Javítási költség: ");
    }

    private String input (String ktg){
        System.out.println("──────────────────────────────────────────");
        System.out.print(ktg);
        return scanner.nextLine();
    }
}
