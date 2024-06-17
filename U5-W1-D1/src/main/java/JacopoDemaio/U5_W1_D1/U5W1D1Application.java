package JacopoDemaio.U5_W1_D1;

import JacopoDemaio.U5_W1_D1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5W1D1Application.class, args); // <---- NON ELIMINARE PER IL CORRETTO FUNZIONAMENTO DELL'APP

//		andiamo a instanziare il nostro application Context dove potremmo poi prendere i nostri beans
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

//		qua andiamo a prendere il nostro unico bean con la classe MENU per questo non genera errore
		Menu menu = ctx.getBean(Menu.class);

//		qui richiamiamo il metodo della classe
		menu.getMenu();

//		anche qua c'è bisogno della chiusura sempre per buona prassi
		ctx.close();
	}

}
