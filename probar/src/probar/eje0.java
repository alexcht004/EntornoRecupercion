package probar;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class eje0 {
	
	
	////////////FUNCION 1
	
public int  funcion1 (String Palabra) {

	int contador=0;

     for(int x=0;x<Palabra.length() ;x++) {
	 if ((Palabra.charAt(x)=='a') || (Palabra.charAt(x)=='e') || (Palabra.charAt(x)=='i') || (Palabra.charAt(x)=='o') || (Palabra.charAt(x)=='u')){ 
	    contador++;
	  }
	 
	}
     return contador;

}

	////////////////FUNCION 2
public int  funcion2 (String Palabra, String Palabra2) {

	int contador=0;
	int contadora=0;

     for(int x=0;x<Palabra.length() ;x++) {
	 if ((Palabra.charAt(x)=='a') || (Palabra.charAt(x)=='e') || (Palabra.charAt(x)=='i') || (Palabra.charAt(x)=='o') || (Palabra.charAt(x)=='u')){ 
	    contador++;
	  }
     }
     
	 for(int i=0;i<Palabra2.length() ;i++) {
	   	 if ((Palabra2.charAt(i)=='a') || (Palabra2.charAt(i)=='e') || (Palabra2.charAt(i)=='i') || (Palabra2.charAt(i)=='o') || (Palabra2.charAt(i)=='u')){ 
	   	    contadora++;
	   	  }
	 }
	 
	 
	  if(contador>contadora) {
		  return contador;
		  
	  }else{ 
		  return contadora;
	  }
	  
	 }



///FUNCION3 EJE 3  
		public int funcion3(int []vector) {
		int suma = 0;
		int edadmi = 12;
		int edadma = 20;
	
	
		for (int i = 0; i < vector.length; i++) {
			if ( (vector[i] < edadma) && (vector[i] > (edadma / 2))) {
				suma += vector[i];
	
			}
		}
		return suma;
	}
/// FUNCION 4
		
	    public String funcion4 (int vector[]) {

		    int suma=0;
		    float media=0;
		    //int [] alex ={5, 5, 5};//
		    
		    if(vector==null) {
		    	return null;
		    }
		    if(vector.length ==0) {
		    	return "vacio";
		    }
		    

		    for (int i=0; i<vector.length; i++) {///////// vector por que 
		    	suma+=vector[i]; 
		    }
		    media=(suma/vector.length);
		    
		    
		    
		    

		    if(media<5) {
		    	return "reprobado";
		    }
		    else if(media==5) {
		    	return "aprobado";
		    }
		    if(media==6) {
		    	return "bien";
		    }
		    else if(media>6 && media<=8) {
		    	return "notable";
		    }
		    else if(media>8 && media<=10) {
		    	return "sobresaliente";
		    }    
		    return null;
	    } 
	    
	    //////////////////////////////
	    
	  
	    
	    public int funcion5 (int numero1, int numero2, char alexx) {

		  
		  	int resultado=0;

		    if(alexx== '+'  ) {
		    	return numero1 + numero2;
		    }
		    if(alexx== '-'  ) {
		    	return numero1 - numero2;
		    }
		    if(alexx== '/'  ) {
		    	return numero1 / numero2;
		    }
		    if(alexx== '*'  ) {
		    	return numero1 * numero2;
		    }


		    return resultado;
	    }
	
	
	    
	    
	
}
