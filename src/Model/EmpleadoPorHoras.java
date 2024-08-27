package src.Model;



public class EmpleadoPorHoras extends Empleado {

    private Integer horasTrabajadas;

    //constructor
    public EmpleadoPorHoras(String nombre,Double salario){
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    //getter and setter
    public Integer getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    public void setHorasTrabajadas(Integer horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }


    //metodo override

    @Override
    public Double calcularPago() {

        return getSalario() * horasTrabajadas;
    }

}
