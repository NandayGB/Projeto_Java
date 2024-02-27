package Ecommerce.model;

public class modeloPanela {

    private int id;
    private String nome;
    private String material;
    private float preco;
    private int quantidade;

    public modeloPanela(int id, String nome, String material, float preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.material = material;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para calcular o total de uma determinada quantidade de panelas
    public float calcularTotal(int quantidade) {
        return preco * quantidade;
    }

    // Método para atualizar a quantidade de panelas disponíveis após uma compra
    public void atualizarQuantidade(int quantidadeComprada) {
        quantidade -= quantidadeComprada;
    }
}