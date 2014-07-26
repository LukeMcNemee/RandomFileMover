/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomfilemover;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author LukeMcNemee
 */
public class RandomFileMover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File folder;
        folder = new File("./");
        File dir;
        String path = "";        
        int i = 0;
        
        File[] listOfFiles = folder.listFiles();
        List<File> files = new ArrayList<>(Arrays.asList(listOfFiles));
        Collections.shuffle(files);
        
        for (File nextFile : files) {
            if(nextFile.getName().contains(".mp3")){
                if(i % 10 == 0){
                    path = Integer.toString(i/10);
                    dir = new File(path);
                    dir.mkdir();
                }
                i++;
                nextFile.renameTo(new File(path + "/"+ nextFile.getName()));
            }
        }
    }

}
