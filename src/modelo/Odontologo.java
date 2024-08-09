package modelo;

public class Odontologo {

    private Integer id;
    private Integer numeroDeMatricual;
    private String nombre;
    private String apellido;

    public Odontologo(Integer numeroDeMatricual, String nombre, String apellido) {
        this.numeroDeMatricual = numeroDeMatricual;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(Integer id, Integer numeroDeMatricual, String nombre, String apellido) {
        this.id = id;
        this.numeroDeMatricual = numeroDeMatricual;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumeroDeMatricual() {
        return numeroDeMatricual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumeroDeMatricual(Integer numeroDeMatricual) {
        this.numeroDeMatricual = numeroDeMatricual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
