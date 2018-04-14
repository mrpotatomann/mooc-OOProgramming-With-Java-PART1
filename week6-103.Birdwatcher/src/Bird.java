
public class Bird {
    private String name;
    private String latinname;
    private int observed;
    
    public Bird(String name,String latinname){
        this.name=name;
        this.latinname=latinname;
        this.observed=0;
    }
    
    public String name(){
        return name;
    }
    
    public String latinname(){
        return latinname;
    }
    
    public int observed(){
        return observed;
    }
    
    public void incrementObserved(){
        observed++;
    }
    
    public String toString(){
        return name + " (" + latinname + "): " + observed + " observations";
    }
}
