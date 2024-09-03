package jackson.rocha;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha");
        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);

        Produto produto2 = new Produto("Coxão mole", 10);
        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

        Produto produto3 = new Produto();
        System.out.println(produto3.nome);
        System.out.println(produto3.quantidadeEstoque);
    }
}
