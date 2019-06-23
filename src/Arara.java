
public class Arara extends Ave{
    
    public Arara(String n, boolean v){
        super(n,v);
    }
       
    public void talk(){
        //super.talk(); caso eu queria imprimir o talk de ave
        System.out.println("arara, arara");
    }
}
