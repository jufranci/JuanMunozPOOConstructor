package juanmunoz.pooconstructor;
public class persona {
    int dni = 0;
    String nombre="", apellido="";
    public persona(){
        System.out.println("Creando persona...");
    }
    public persona(int dni){
        this.dni = dni;        
    }
    public persona (int dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
    }
    public persona (int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void imprimir(){
        if(dni !=0 && !nombre.equals("") && !apellido.equals("")){
            System.out.println("DNI N°" + dni + "\nNombre y apellido: " + nombre + " " + apellido);
        } else if (dni !=0 && !nombre.equals("")){
            System.out.println("DNI N°" + dni + "\nNombre: " + nombre);
        } else if (dni !=0) {
            System.out.println("DNI N°" + dni);
        }
        
    }
    
    
}
