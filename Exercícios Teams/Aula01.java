import java.util.ArrayList;
import java.util.List;

// Classe produto que represente um produto com código, descrição, preço e quantidade
class Produto {
    int codigo;
    String descProduto;
    double preco;
    int quantidade;

    Produto(int codigo, String descProduto, double preco, int quantidade) {
        this.codigo = codigo;
        this.descProduto = descProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    // Mostra a descrição sobre o produto
    void listarDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descProduto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-----------------------------");
    }
}

// Classe CarrinhoCompra para adicionar produto, exibir os produtos dentro do carrinho e calcular o valor total da compra
class CarrinhoCompra {
    List<Produto> itens = new ArrayList<>();

    void adicionarProduto(Produto p) {
        itens.add(p);
    }

    void exibeCarrinho() {
        for (Produto p : itens) {
            p.listarDados();
        }
    }

    double fecharCompra() {
        double total = 0;
        for (Produto p : itens) {
            total += p.preco * p.quantidade;
        }
        return total;
    }
}

// Classe Main (principal) para executar o programa
public class Programa {
    public static void main(String[] args) {
        CarrinhoCompra carrinho = new CarrinhoCompra();

        Produto p1 = new Produto(1, "Shampoo", 15.90, 2);
        Produto p2 = new Produto(2, "Sabonete", 3.50, 5);
        Produto p3 = new Produto(3, "Refrigerante", 6.99, 3);
        Produto p4 = new Produto(4, "Arroz", 25.00, 1);
        Produto p5 = new Produto(5, "Feijão", 8.75, 2);
        Produto p6 = new Produto(6, "Pasta de dente", 4.40, 3);
        Produto p7 = new Produto(7, "Detergente", 2.30, 4);
        Produto p8 = new Produto(8, "Perfume", 190.30, 1);
        Produto p9 = new Produto(9, "Carne", 20.30, 1);
        Produto p10 = new Produto(10, "Condicionador", 6.30, 2);
        

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);
        carrinho.adicionarProduto(p4);
        carrinho.adicionarProduto(p5);
        carrinho.adicionarProduto(p6);
        carrinho.adicionarProduto(p7);
        carrinho.adicionarProduto(p8);
        carrinho.adicionarProduto(p9);
        carrinho.adicionarProduto(p10);

        System.out.println("Produtos no carrinho:");
        carrinho.exibeCarrinho();

        double totalCompra = carrinho.fecharCompra();
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}
