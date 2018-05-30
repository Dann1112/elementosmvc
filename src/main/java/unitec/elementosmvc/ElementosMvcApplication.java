package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner{
    //Permite ejecutar otro metodo para probar en linea de comandos en ambiente
    //web 

    @Autowired ServicioTarjeta servicio; //Atributo a nivel de clase
       //Autowired reemplaza la clase que regresa con la interfaz que devuelve
    @Autowired RepositorioMensaje repoMensaje;
	public static void main(String[] args) {
		SpringApplication.run(ElementosMvcApplication.class, args);
                
                
	}

    @Override
    public void run(String... args) throws Exception {
        
        LocalDate fecha = LocalDate.now();
        //repoMensaje.save(new Mensaje("hola",fecha,"Puerco"));
        //repoMensaje.save(new Mensaje("Mensaje"));
        
        //Buscar todos los mensajes ya
        for( Mensaje mensa: repoMensaje.findAll()){
            System.out.println(mensa);
        }
        
        System.out.println(repoMensaje.findByCuerpo("cerdito"));
        
        
        //Buscar por id
        //repoMensaje.findById("5b08c893b1ff2b18782b4e64").get();
        
        
        
        
    }
}
