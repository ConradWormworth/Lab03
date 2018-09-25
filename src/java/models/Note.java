/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author 612944
 */
public class Note implements Serializable{
    private String title;
    private String noteEntry;
    
    
    public Note(){
        
    }

    public Note(String title, String noteEntry){
        this.title = title;
        this.noteEntry = noteEntry;
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
