package juanmunoz.pooconstructor;
public class JuanMunozPOOConstructor {
    public static void main(String[] args) {
        persona p0,p1,p2,p3,p4;
        p0 = new persona();
        p1 = new persona (24356123);
        p2 = new persona (12345678, "Dario");
        p3 = new persona (98765432, "Esteban", "Rodriguez");
        p4 = new persona (31264598, "Lucas", "Lopez", 24);
        p0.imprimir();
        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
        p4.imprimir();
    }
    
}
