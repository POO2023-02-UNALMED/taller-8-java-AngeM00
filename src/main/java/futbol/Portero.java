package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;


    public Portero(){
        super("Maradona",30,"Portero");

    }

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos(){
        return true;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Portero){
            return Math.abs(this.golesRecibidos-((Portero) o).golesRecibidos);
        } else {
            return this.golesRecibidos;
        }
        
    }

    @Override
    public String toString(){
        return super.toString()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
    }
}
