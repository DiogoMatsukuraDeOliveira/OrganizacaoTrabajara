
public class SistemRH {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor(1700, "Predo");
        Gerente gerente = new Gerente(1900, "Thiago");

        System.out.println(desenvolvedor.descreverResponsabilidades());
        System.out.println(desenvolvedor.calcularSalario());

        System.out.println(gerente.descreverResponsabilidades());
        System.out.println(gerente.calcularSalario());
    }
}