/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyMusic;

import java.io.File;
import javax.swing.filechooser.FileFilter;


/**
 *
 * @author user
 */
public class FileTypeFilter extends FileFilter{
    
    //File Extensions String
    private final String extension;
    //
    private final String description;
    
    //Constructor Method
    public FileTypeFilter(String extension, String description){
        // Set Constructor Values
        this.extension = extension;
        this.description = description;
    }
    
    @Override
    public boolean accept(File file) {
        // If file in returning directory
        if(file.isDirectory()){
            return true;
        }
        // Return File Name with extension
        return file.getName().endsWith(extension);
    }
    
    @Override
    public String getDescription() {
        // Return To Display File Type and Description
        return description + String.format(" (*%s)", extension);
    }
}
