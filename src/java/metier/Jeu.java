/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class Jeu {
	private int secret;
	private boolean fin;
	public Jeu(){
		fin=false;
		secret=(int)(Math.random()*100);
	}
	public String jouer(int nb){
		if(fin==false){
			if(nb<secret){
				return("Votre nombre est plus petit");
			}
			else if(nb>secret){
				return("Votre nombre est plus grand");
			}
			else{
				fin=true;
				return("Bravo vous avez gagné");
			}
		}
		else{
	return("Jeu terminé Le nombre cherché est: "+secret);
		}
	}
	
	public boolean isFin() {
		return fin;
	}
	public void setFin(boolean fin) {
		this.fin = fin;
	}
	public int getSecret() {
		return secret;
	}
	public void setSecret(int secret) {
		this.secret = secret;
	}
}
