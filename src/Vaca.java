
public class Vaca extends Mamifero{
    
    private boolean temLeite;
    
    public Vaca(String n, int p, boolean t){
        super(n, p);
        setTemLeite(t);
    }
    
    public boolean isTemLeite(){
        return temLeite;
    }
    
    public void setTemLeite(boolean t){
        this.temLeite = t;
    }
    
    public void talk(){
        System.out.println("Muuu");
    }
}
