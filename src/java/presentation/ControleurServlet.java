/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import metier.Jeu;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class ControleurServlet extends HttpServlet {
    private Jeu jeuMetier;

    @Override
    public void init() throws ServletException {
        jeuMetier=new Jeu();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        
        HttpSession session=req.getSession();
        EssaiForm essaiForm;
        if(session.getAttribute("essaiForm")==null)
        {
            essaiForm=new EssaiForm();
            session.setAttribute("essaiForm",essaiForm);
        }
        else{
        essaiForm=(EssaiForm)session.getAttribute("essaiForm");
        }
                 if(req.getParameter("btn").equals("rejouer"))
        {
            jeuMetier=new Jeu();
            essaiForm.setMsgs(new ArrayList());
        }
                 else{
        int nombre=Integer.parseInt(req.getParameter("nombre"));
        String result=jeuMetier.jouer(nombre);
        essaiForm.setNombre(nombre);
        essaiForm.getMsgs().add(nombre+" :"+result);
        req.setAttribute("essaiForm", essaiForm);
        }
        req.getRequestDispatcher("VueJeu.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("VueJeu.jsp").forward(req, resp);
    }
    
    
}
