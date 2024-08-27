package src.Model;

public abstract class Empleado {

    //atributos
    private String nombre;
    private Double salario;

    //constructor
    public Empleado(String nombre, Double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    //getter y setters
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Double getSalario(){
        return this.salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }

    //método abstracto sin cuerpo
    public abstract Double calcularPago();
}



