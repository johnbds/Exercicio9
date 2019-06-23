
public abstract class Ave extends Animal{
    private boolean voa;
    
    public Ave(String n, boolean v){
        super(n);
        setVoa(v);
    }
    
    //boolean vira "is" e não get
    public boolean isVoa(){
        return voa;
    }

    public void setVoa(boolean voa){
        this.voa = voa;
    }
    
    public void talk(){
        System.out.println("Piu-Piu");
    }
}
