public class Conta{

    private String nome;
    private int idade;
    private String username;
    private String senha;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }

  public Conta(String nome, int idade, String username, String senha){
    this.nome=nome;
    this.idade=idade;
    this.username=username;
    this.senha=senha;
  }
    //Usuario = new Usuario("Leonardo",17,"LeoValle","Lele1234");
  public Conta (){

  }

  public boolean verificarSenha(String senha){
        return this.senha.equals(senha);
  }

  public void alterarSenha(String novaSenha){
        this.senha = novaSenha;
  }
}