package probar;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class eje1 {
	
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
	void sumarTest1() {
		String palabra ="alex";
        assertEquals(2, x.funcion1(palabra)); //Test Correcto
	}
	
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test2() {
		String palabra ="chalo";
        assertEquals(2, x.funcion1(palabra)); //Test Correcto
	}
	@DisplayName("Primera Prueba Caja Negra  positivo")
	@Test
	void Test3() {
		String palabra ="ticona";
        assertEquals(3, x.funcion1(palabra)); //Test Correcto
	}
	@DisplayName("Primera Prueba Caja Negra  negativo")
	@Test
	void Test4() {
		String palabra ="ticona";
        assertNotEquals(5, x.funcion1(palabra)); //Test Correcto
	}
	
	
	
	@DisplayName("Primera Prueba Caja blanca condicion1")
	@Test
	void Test5() {
		String palabra ="ticona";
        assertEquals(3, x.funcion1(palabra)); //Test Correcto
	}
	
	///////////////
	
	@DisplayName("Primera Prueba Caja blanca condicion2")
	@Test
	void Test6() {
		String palabra =" ";
        assertEquals(0, x.funcion1(palabra)); //Test Correcto
	}
	@DisplayName("Primera Prueba Caja blanca condicion3")
	@Test
	void Test7() {
		String palabra ="a";
        assertEquals(1, x.funcion1(palabra)); //Test Correcto
	}
	
	
	@DisplayName("Primera Prueba Caja blanca condicion 4")
	@Test
	void Test8() {
		String palabra ="e";
        assertEquals(1, x.funcion1(palabra)); //Test Correcto
	}
	
	
	
	
	

	



}
