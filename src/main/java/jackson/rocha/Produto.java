package jackson.rocha;

public class Produto {

    private static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    public String nome;
    int quantidadeEstoque;

    Produto() {
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome) {
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome, int estoqueInicial) {
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
    }

}
