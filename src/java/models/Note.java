/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 612944
 */
public class Note implements Serializable{
    private String title;
    private String noteEntry;
    
    
    public Note(){
        
    }

    public Note(String path){
        try {
            BufferedReader br = new BufferedReader(new FileReader(new
                File(path)));
            
            title = br.readLine();
            noteEntry = br.readLine();
            
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNoteEntry() {
        return noteEntry;
    }

    public void setNoteEntry(String noteEntry) {
        this.noteEntry = noteEntry;
    }
    
    
}
