package probar;



import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class eje3Test {
	
	
	static eje0 x =null;
	
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

	
	
	

	@DisplayName("Primera Prueba Caja Negra partción Equivalente grupo positivo")
	@Test
	void testFuncioneje1() {
		x=new eje0();
		int[] alex = { 11, 19};
		assertEquals(30,x.funcion3(alex));
		
	}
	@DisplayName("Primera Prueba Caja Negra partción Equivalente grupo negativo")

	@Test
	void testFuncioneje2() {
		x=new eje0();
		int[] alex = { 16, 22, 5 };
		assertNotEquals(38,x.funcion3(alex));
		
	}
	
	@DisplayName("Segunda Prueba Caja negra valor limite Inferior")

	@Test
	void testFuncioneje3() {
		x=new eje0();
		int[] alex = { 11, 11, 11 };
		assertEquals(33,x.funcion3(alex));
		
	}
	@DisplayName("Segunda Prueba Caja negra valor limite superio")

	@Test
	void testFuncioneje4() {
		x=new eje0();
		int[] alex = { 19, 19 };
		assertEquals(38,x.funcion3(alex));
		
	}
	@DisplayName("Test de Caja Blanca Solo Primera Condicion correcta")

	@Test
	void testFuncioneje5() {
		x=new eje0();
		int[] alex = { 5, 5, 5 };	
	   assertEquals(0, x.funcion3(alex));
	   assertNotEquals(15, x.funcion3(alex)); 
	}
		
	
	@DisplayName("Test de Caja Blanca Solo Segunda Condicion correcta")

	@Test
	void testFuncioneje6() {
		x=new eje0();
		int[] alex = { 20, 20,40};	
	   assertEquals(0, x.funcion3(alex));
	   assertNotEquals(80, x.funcion3(alex)); 
	}
	
	@DisplayName("Test de Caja Blanca Primera y Segunda Condicion correcta")

	@Test
	void testFuncioneje7() {
		x=new eje0();
		int[] alex = { 13, 11, 13};
		assertEquals(37, x.funcion3(alex));
		assertNotEquals(0, x.funcion3(alex)); 
		
	}
	@DisplayName("Test de Caja Blanca ninguna Condicion es correcta")

	@Test
	void testFuncioneje8() {
		x=new eje0();
		int[] alex = { 3, 24, 34 };
		assertEquals(0, x.funcion3(alex));
		assertNotEquals(41, x.funcion3(alex)); 
		
	}
}