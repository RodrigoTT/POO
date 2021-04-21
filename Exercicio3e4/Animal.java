public class Animal {
    public String nome;
    public int patas;

    public Animal (String nome, int idade){
        
        setNome(nome);
        setPatas(idade);  
      }

    public String getNome() {
        return nome;
    }
    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
