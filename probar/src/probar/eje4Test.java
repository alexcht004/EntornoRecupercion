package probar;



import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class eje4Test {
	
	
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


	@DisplayName("Test de Caja Negra Lista de notas vacia")
	@Test
	void testfuncion1() {
		int [] vector = { };
		assertEquals("vacio", x.funcion4(vector)); 
	}
	
	
	@DisplayName("Test de Caja Negra Lista de notas null")
	@Test
	void testfuncion2() {
		int [] alex = null;
		assertEquals(null, x.funcion4(alex)); 
	}
	@DisplayName("Test de Caja Negra Lista de notas con un valor fuera del rango")
	@Test
	void testfuncion3() {
		int [] alex = {11, 11};
		assertEquals(null, x.funcion4(alex)); 
	}
	@DisplayName("Test de Caja condicion 1")
	@Test
	void testfuncion4() {
		int [] vector = {4, 4, 4};
		assertEquals("reprobado", x.funcion4(vector)); 
	}
	
	
	
	
	
	
	
	
	@DisplayName("Test de Caja Blanca condicion 2")

	@Test
	void testFuncioneje5() {
		x=new eje0();
		int[] vector = { 5, 5, 5 };	
	   assertEquals("aprobado", x.funcion4(vector));
	   assertNotEquals(0, x.funcion4(vector)); 
	}
		
	
	@DisplayName("Test de Caja Blanca condicion 3")

	@Test
	void testFuncioneje6() {
		x=new eje0();
		int[] alex = { 6, 6, 6 };	
	   assertEquals("bien", x.funcion4(alex));
	   assertNotEquals(0, x.funcion4(alex)); 
	}
	
	@DisplayName("Test de Caja Blanca condicion 4")

	@Test
	void testFuncioneje7() {
		x=new eje0();
		int[] alex = { 7, 7, 7 };	
	   assertEquals("notable", x.funcion4(alex));
	   assertNotEquals(0, x.funcion4(alex)); 
	}
	
	
	
	
	
	
	@DisplayName("Test de Caja Blanca ninguna Condicion quinta")

	@Test
	void testFuncioneje8() {
		x=new eje0();
		int[] alex = { 10, 10, 10 };
		assertEquals("sobresaliente", x.funcion4(alex));
		assertNotEquals(0, x.funcion4(alex)); 
		
	}
	

}