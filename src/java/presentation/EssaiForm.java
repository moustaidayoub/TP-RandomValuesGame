/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class EssaiForm {
   private int nombre;
   private List<String> msgs;
   
   public EssaiForm()
   {
   msgs=new ArrayList();
   }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<String> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<String> msgs) {
        this.msgs = msgs;
    }
    
    
}
