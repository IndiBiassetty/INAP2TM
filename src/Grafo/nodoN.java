/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

public class nodoN{

 	public String Ruta;		//Ruta 
 	public int Distancia;           //Distgancia arrecorrer desde punto "x" a puto "y"
        public int Tiempo;              //Tiempo entre punto "x" y punto "y"



//////////////Constructores/////////////////// 	
        
        public nodoN(){
            Ruta = null;
            Distancia = 0;
            Tiempo =0;
	}

////////////Constructor de Ruta///////////////
        
	public nodoN(String r, int d ,int t){
		this.Ruta = r;
		this.Distancia = d;
                this.Tiempo = t;
	}
   ////////////Lista de rutas//////////////
	public String listaRutas(){
		return "\n>>> Ruta = "+Ruta +"\n>>> Distancia a recorrer ="+Distancia+"\n>>> Tiempo de recorrido ="+Tiempo+" "+">>>";
	}

}