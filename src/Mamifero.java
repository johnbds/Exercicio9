
public abstract class Mamifero extends Animal{
    private int patas;
    
    public Mamifero(String n, int p){
        super(n);
        setPatas(p);
    }
    
    public int getPatas(){
        return patas;
    }
    
    public void setPatas(int p){
        this.patas = p;
    }
    
    public abstract void talk();
}
