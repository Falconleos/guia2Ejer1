package src.Model;

public class EmpleadoContratista extends Empleado{

    //atributos
    private Integer horaTrabajadas;
    private Double tarifaProyecto;

    //constructor
    public EmpleadoContratista(String nombre,Double salario){
        super(nombre, salario);
        this.horaTrabajadas = horaTrabajadas;
        this.tarifaProyecto = tarifaProyecto;
    }

    //getters y setters
    public Integer getHoraTrabajadas(){
        return this.horaTrabajadas;
    }
    public void setHoraTrabajadas(Integer horaTrabajadas){
        this.horaTrabajadas = horaTrabajadas;
    }
    public Double getTarifaProyecto(){
        return this.tarifaProyecto;
    }
    public void setTarifaProyecto(Double tarifaProyecto){
        this.tarifaProyecto = tarifaProyecto;
    }

    //metodo


    @Override
    public Double calcularPago() {
        return horaTrabajadas * tarifaProyecto;
    }
}
