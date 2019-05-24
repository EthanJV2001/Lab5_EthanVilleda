public class Estudiante {
    private String nombre;
    private String apellido;
    private int num_Cuenta;
    private int edad;
    private int genero;
    private int facultad;
    private String n_Facultad;
    private Carrera carrera;
    
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int num_Cuenta, int edad, int genero, int facultad, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_Cuenta = num_Cuenta;
        this.edad = edad;
        this.genero = genero;
        this.facultad=facultad;
        setFacultad(facultad);
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNum_Cuenta() {
        return num_Cuenta;
    }

    public void setNum_Cuenta(int num_Cuenta) {
        this.num_Cuenta = num_Cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", num_Cuenta=" + num_Cuenta + ", edad=" + edad + ", genero=" + genero + ", facultad=" + facultad + ", n_Facultad=" + n_Facultad + ", carrera=" + carrera + '}';
    }
    
    
}
