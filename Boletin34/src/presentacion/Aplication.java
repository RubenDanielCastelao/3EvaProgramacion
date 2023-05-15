
package presentacion;

import java.io.File;


public class Aplication {


    public static void main(String[] args) {
        File f = new File("contratados.txt");
        File e = new File("destajados.txt");
        GUI obx = new GUI();
        obx.llevarElFile(f,e);
        obx.setVisible(true);
        
    }
}
