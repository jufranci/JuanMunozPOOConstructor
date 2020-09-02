package juanmunoz.pooconstructor;
public class persona {
    int dni = 0, edad = 0;
    String nombre="", apellido="";
    public persona(){
        this.dni = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }
    public persona(int dni){
        this();
        this.dni = dni;        
    }
    public persona (int dni, String nombre){
        this(dni);
        this.nombre = nombre;
    }
    public persona (int dni, String nombre, String apellido){
        this(dni,nombre);
        this.apellido = apellido;
    }
    public persona (int dni, String nombre, String apellido, int edad){
        this(dni,nombre,apellido);
        this.edad = edad;
    }
    public void imprimir(){
        if(dni !=0 && !nombre.equals("") && !apellido.equals("") && edad !=0){
            System.out.println("DNI N°" + dni + "\nNombre y apellido: " + nombre + " " + apellido + "\nEdad: " + edad);
        } else if (dni !=0 && !nombre.equals("") && !apellido.equals("")){
            System.out.println("DNI N°" + dni + "\nNombre y apellido: " + nombre + " " + apellido);
        } else if (dni !=0 && !nombre.equals("")) {
            System.out.println("DNI N°" + dni + "\nNombre: " + nombre);
        } else if (dni !=0){
            System.out.println("DNI N°" + dni);
        }
        
    }
    
    
}
