public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private int idade;

    public Cliente(String nome, String sobrenome, String cpf, String rg, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void visualizar() {
        System.out.println("nome: " + nome + "\n" +
                "sobrenome: " + sobrenome + "\n" +
                "cpf: " + cpf + "\n" +
                "rg: " + rg + "\n" +
                "idade: " + idade + "\n");
    }
}
********************************************************************_
public class TestaCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("José", "Ferreira", "456.872.982-18", "91.987.987-8", 30);
        Cliente c2 = new Cliente("João", "Oliveira", "789.867.123-13", "29.342.987-9", 25);

        c1.visualizar();
        c2.visualizar();
    }
}
**************************************************************************
public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    private String tamanho;
    private String dataValidade;

    public Produto(int codigo, String nome, double valor, String tamanho, String dataValidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.tamanho = tamanho;
        this.dataValidade = dataValidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void visualizar() {
        System.out.println("codigo: " + codigo + "\n" +
                "nome: " + nome + "\n" +
                "valor: " + valor + "\n" +
                "tamanho: " + tamanho + "\n" +
                "dataValidade: " + dataValidade + "\n");
    }
}
**************************************************************************************
public class TestaGame {
    public static void main(String[] args) {
        Produto c1 = new Produto(591, "Teclado Gamer", 200.00, "M", "30/02/2023");
        Produto c2 = new Produto(176, "Cadeira Gamer",900.00, "M", "15/06/2023");

        c1.visualizar();
        c2.visualizar();
    }
}