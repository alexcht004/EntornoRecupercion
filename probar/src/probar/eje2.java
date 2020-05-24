package probar;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class eje2 {
	
	static eje0 x=null;
	static int operacionesRealizadas = 0;


	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		x = new eje0();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		operacionesRealizadas++;
		System.out.println("Ejecutando test "+ operacionesRealizadas);
	}
	
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se ha ejecutado el test: "+operacionesRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		x = new eje0();
	}
	
	
	
	
	
	
	
	
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test1() {
		String palabra ="alex";
		String palabra2="ticona";
		
        assertEquals(3, x.funcion2(palabra,palabra2)); //Test Correcto
	}
	
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test2() {
		String palabra ="chalo";
		String palabra2="ticona";
		
        assertEquals(3, x.funcion2(palabra,palabra2)); //Test Correcto
	}
	
	
	
	@DisplayName("Primera Prueba Caja Negra  negativo")
	@Test
	void Test3() {
		String palabra ="alex";
		String palabra2="ticona";
		
        assertNotEquals(2, x.funcion2(palabra,palabra2)); //Test Correcto
	}
	
	
	
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test4() {
		String palabra ="messi";
		String palabra2="ronaldo";
		
        assertEquals(3, x.funcion2(palabra,palabra2)); //Test Correcto
	}
	
	
	
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test5() {
		String palabra ="alex";
		String palabra2="ticona";
		
        assertEquals(3, x.funcion2(palabra,palabra2)); //Test Correcto
	}
	
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test6() {
		String palabra ="chalo";
		String palabra2="ticona";
		
        assertEquals(3, x.funcion2(palabra,palabra2)); //Test Correcto
	}
	/*
	
	@DisplayName("Primera Prueba Caja Negra  negativo")
	@Test
	void Test7() {
		String palabra ="alex";
		String palabra2="ticona";
		
        assertNotEquals(2, x.funcion2(palabra,palabra2)); //Test Correcto
	}
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test8() {
		String palabra ="messi";
		String palabra2="ronaldo";
		
        assertEquals(3, x.funcion2(palabra,palabra2)); //Test Correcto
	}*/
	
	
	@DisplayName("Primera Prueba Caja Blanca condiciones")
	@Test
	void Test7() {
		String palabra ="primeramente";
		String palabra2="ticona";
		
        assertEquals(5, x.funcion2(palabra,palabra2)); //Test Correcto
        
        String palabra3 ="prueba";
		String palabra4="seguramente";
		
        assertEquals(5, x.funcion2(palabra,palabra2)); //Test Correcto

	}
	
	
	@DisplayName("Primera Prueba Caja Blanca caminos 1")
	@Test
	void Test8() {
		String palabra ="";
		String palabra2="";
		
        assertEquals(0, x.funcion2(palabra,palabra2)); //Test Correcto
	}
    	@DisplayName("Primera Prueba Caja Blanca caminos 2")
    	@Test
    	void Test11() {    
        
        
        
        String palabra3 ="aei";
		String palabra4="aeiou";
    	
		
        assertEquals(5, x.funcion2(palabra3,palabra4)); //Test Correcto
    	}
    	
    	
    	@DisplayName("Primera Prueba Caja Blanca caminos 3")
    	@Test
    	void Test9() {   
        
        
        String palabra5 ="aeio";
		String palabra6="aei";
		
        assertEquals(4, x.funcion2(palabra5,palabra6)); //Test Correcto

	}
	
	
	



}
