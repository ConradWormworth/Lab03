/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 612944
 */
public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        // The getServletContext method gets servlet context/read path and ensures that the JSP can
        //run on other machines.
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        Note note = new Note(path);
        
        request.setAttribute("note", note);
        
        if(request.getParameter("edit") == null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);
            return; 
        }
        getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp").forward(request, response);
        
    }
   
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        Note newNote = new Note();
                
        newNote.setTitle(request.getParameter("title"));
        
        newNote.setNoteEntry(request.getParameter("noteEntry"));
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new 
            FileWriter(path, false)));
        
        pw.write(newNote.getTitle() + "\n");
        pw.write(newNote.getNoteEntry());
       
        pw.close();
       
        
        
        // Always strings!!! Have to convert if we want primitive data
        
        Note note = new Note(path);
        
        request.setAttribute("note", note);

        getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp").forward(request, response);   
    }
    
}
