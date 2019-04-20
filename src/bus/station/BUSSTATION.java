/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author logynmedhat
 */
public class BUSSTATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        File f =new File("user.txt");
        FileWriter fw =new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("test syrigsfs");
        bw.close();
       Buss gui= new Buss();
        Buss.main(new String[0]);
        // TODO code application logic here
    }
    
}
