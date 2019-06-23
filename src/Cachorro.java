
public class Cachorro extends Mamifero{
    
    private boolean lateAlto;
    
    public Cachorro (String n, int p, boolean l){
        super(n, p);
        setLateAlto(lateAlto);
    }
    
    public boolean isLateAlto(){
        return lateAlto;
    }

    public void setLateAlto(boolean l){
        this.lateAlto = l;
    }
    
    public void talk(){
        System.out.println("Au, au");
    }
    
    
}
