public class Desenvolvedor extends Funcionario{
    protected int salario;

    public Desenvolvedor(int salario, String nome){
        super(nome);
        this.salario = salario;
    }
    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public String descreverResponsabilidades() {
        return this.nome+ " Participa ativamente do desenvolvimento de novos projetos";
    }
}
