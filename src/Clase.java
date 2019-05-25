public class Clase {
    private String nombre;
    private int seccion;
    private int edificio;
    private int salon;
    private boolean aireono;

    public Clase() {
    }

    public Clase(String nombre, int seccion, int edificio, int salon, boolean aireono) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.aireono = aireono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public boolean isAireono() {
        return aireono;
    }

    public void setAireono(boolean aireono) {
        this.aireono = aireono;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombre=" + nombre + ", seccion=" + seccion + ", edificio=" + edificio + ", salon=" + salon + ", aireono=" + aireono + '}';
    }
    
    
}
