public class Gerente extends Funcionario{
    protected int salario;

    public Gerente(int salario, String nome){
        super(nome);
        this.salario = salario;

    }
    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String descreverResponsabilidades() {
        return this.nome+ " Da ordem aos encarregados";
    }
}
