
package mx.itson.brocoli.negocio;

/**
 * contine metodos para trabajear con tipos de datos string.
 * @author Lusy
 */
public class Operacion {
    
    public String [] separar (String valor){
        
        /**
         * separa una cadena de texto a partir de la expresion guion medio.
         * @param valor cadena de tecto que sera separada a partir de la expresion dada.
         * @return array de string donde dada posicion representa una division de la cadena de texto.
         */
        //hola guapo
        
        String[] elementos = valor.split("-");
        return elementos;
                }
}
