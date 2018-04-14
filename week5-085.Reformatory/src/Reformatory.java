public class Reformatory {

    private int weightsMeasured = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        this.weightsMeasured++;
        return person.getWeight();
    }

    public void feed(Person person){
       int feed = this.weight(person) +1;
       person.setWeight(feed);
               
         }
    
    public int totalWeightsMeasured(){
        return weightsMeasured;
    }
}
