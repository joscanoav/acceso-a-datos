/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.ficheros;
    import java.io.*;
/**
 *
 * @author josca
 */
public class BufferedRW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nuevaRuta = "BufferWR.txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nuevaRuta))){
            for(int i=0; i<100000; i++){
                writer.write(i + "\n");
            }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nuevaRuta))){
            String line;
            //while((line = reader.readLine()) != null ){
                // convertir el line en number con Integer.parseInt()
           //     int number = Integer.parseInt(line);
           //     System.out.println(number);
           // }   
           while((line = reader.readLine()) != null){
               System.out.println(line);
           }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
}
