
package unitec.elementosmvc;

import org.springframework.data.mongodb.repository.MongoRepository;

//Automaticamente genera todos los metodos que estan dentro de la clase generica
//asignada, en este caso: Mensaje. Así que estos metodos pueden realizar busquedas
//con sus atributos definidos.
public interface RepositorioMensaje extends MongoRepository<Mensaje, String>{
    
    public Mensaje findByCuerpo(String cuerpo);
    
}
