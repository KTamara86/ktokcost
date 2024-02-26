/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva 2024-02-26, Kukta Tamara
 */


 import java.io.FileWriter;
 import java.io.IOException;
 import java.io.PrintWriter;
 
 public class Filehandler {
     public void writeToTextFile(Koltseg koltseg) {
         try (FileWriter fileWriter = new FileWriter("adat.txt", true);
              PrintWriter printWriter = new PrintWriter(fileWriter)) {
 
             printWriter.printf("%s:%s:%s%n", koltseg.getSzallitas(), koltseg.getUzlet(), koltseg.getJavitas());
 
         } catch (IOException e) {
            System.err.println("Hiba a fájlba való iráskor: " + e.getMessage());
         }
     }
 }
