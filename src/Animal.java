
public abstract class Animal {
    private String nome;
    
    public Animal(String n){    
        setNome(n);
    }
        
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void imprime(){
        System.out.println("Nome: " + getNome());
    }
    
    public abstract void talk(); 
}
