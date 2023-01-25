package Entidad;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintTDT;

    public Televisor() {
        crearTelevisor();
    }

    public Televisor(int resolucion, boolean sintTDT) {

        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public Televisor(float precio, float peso, String color, String consumoE, int resolucion, boolean sintTDT) {
        super(precio, peso, color, consumoE);
        this.resolucion = resolucion;
        this.sintTDT = sintTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean getSintTDT() {
        return sintTDT;
    }

    public void setSintTDT(boolean sintTDT) {
        this.sintTDT = sintTDT;
    }
    public void crearTelevisor() {
        String resp;
        crearElectrodomestico();
        System.out.println("Ingresar la resolución del televisor: ");
        setResolucion(leer.nextInt());
        System.out.println("Posee sintonizador DTV? S/N: ");
        resp = leer.next().toUpperCase();
        if (resp.equals("S")){
            setSintTDT(true);
        }else setSintTDT(false);
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", sintTDT=" + sintTDT +
                ", precio=" + precio +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumoE='" + consumoE + '\'' +
                '}';
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        System.out.println("vuelta de precio final televisor: " + getPrecio());

        if (getResolucion() > 40){
            setPrecio((float) (getPrecio() * 1.30));
        }
        System.out.println("precio post resol televisor: " + getPrecio());
        if (getSintTDT()){
            setPrecio((float) (getPrecio() + 500));
        }
        System.out.println("precio final televisor: " + getPrecio());
    }
}
