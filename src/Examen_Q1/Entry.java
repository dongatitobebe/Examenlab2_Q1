
package Examen_Q1;

public class Entry {
    public String username;
    public long posicion;
    public Entry siguiente;
    
    public Entry(String name, long posicion){
        this.username=name;
        this.posicion=posicion;
        siguiente = null;
    }
}
