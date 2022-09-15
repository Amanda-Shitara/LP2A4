
public class ExercicioThreads implements Runnable {
	static int contador = 0;
	
	@Override
	public void run() {
		while( contador < 1000000 ) contador++;		
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("Estamos na " + Thread.currentThread());
		Runnable runnable = new ExercicioThreads();
		Thread t = new Thread(runnable);
		t.start();
		System.out.println("START: contador = " + contador);
		
		//Pausa a execução por 5 milissegundos
		Thread.sleep(5);
		System.out.println("SLEEP: contador = " + contador);
		
		//Espera a Thread terminar.
		t.join();
		System.out.println("JOIN : contador = " + contador);
	}
}
