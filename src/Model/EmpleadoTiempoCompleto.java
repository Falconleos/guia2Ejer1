package src.Model;

public class EmpleadoTiempoCompleto extends Empleado{
    //constructor
    public EmpleadoTiempoCompleto(String nombre,Double salario){
        super(nombre, salario);
    }

    @Override
    public Double calcularPago() {

        return this.getSalario();
    }


}
