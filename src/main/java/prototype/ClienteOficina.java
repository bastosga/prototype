package prototype;

public class ClienteOficina implements Cloneable {
    private int login;
    private String nome;
    private static Endereco endereco;


    public ClienteOficina(int login, String nome, Endereco endereco)
    {
        this.login = login;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getlogin() {
        return login;
    }

    public void setlogin(int login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public ClienteOficina clone() throws CloneNotSupportedException {
        ClienteOficina ClienteOficinaClone = (ClienteOficina) super.clone();
        ClienteOficina.endereco = (Endereco) ClienteOficina.endereco.clone();
        return ClienteOficinaClone;
    }

    @Override
    public String toString() {
        return "ClienteOficina{" +
                "login=" + login +
                ", nome='" + nome + '\'' +
                ", endereco=" + endereco ;
    }
}
