public class Carrera {
    private int facultad;
    private String n_Facultad;
    private String nombre;
    private double costo_Mensual;
    private String jefe_Carrera;

    public Carrera() {
    }

    public Carrera(int facultad, String nombre, double costo_Mensual, String jefe_Carrera) {
        this.facultad = facultad;
        setFacultad(facultad);
        this.nombre = nombre;
        this.costo_Mensual = costo_Mensual;
        this.jefe_Carrera=jefe_Carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFacultad() {
        return facultad;
    }

    public void setFacultad(int facultad) {
        this.facultad = facultad;
        switch(facultad){
            case 0: n_Facultad="Licenciatura";
                break;
            case 1: n_Facultad="Ingenieria";
                break;
            case 2: n_Facultad="Ciencias de la salud";
                break;
        }
    }

    public double getCosto_Mensual() {
        return costo_Mensual;
    }

    public void setCosto_Mensual(double costo_Mensual) {
        this.costo_Mensual = costo_Mensual;
    }

    @Override
    public String toString() {
        return "Carrera{" + "facultad=" + facultad + ", n_Facultad=" + n_Facultad + ", nombre=" + nombre + ", costo_Mensual=" + costo_Mensual + ", jefe_Carrera=" + jefe_Carrera + '}';
    }

    
}
