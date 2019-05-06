
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Estudiante
 */
public class ControladorCliente {
    
    
     private Set<Cliente> lista;
    private int codigo;

    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public void create(Cliente objeto){
        codigo++;
        objeto.setCodigo(this.codigo);
        lista.add(objeto);
    }
    
    public Cliente read(int codigo){
        for(Cliente cliente : lista){
            if(codigo == cliente.getCodigo()){
                return cliente;
            }
        }
        return null;
    }
    
    public void update(Cliente objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        
        for(Cliente objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
        
    }
    
    public void imprimir(){
        for (Cliente cliente : lista) {
            //System.out.println(cliente.getTipoAnimal());
        }
    }
}
