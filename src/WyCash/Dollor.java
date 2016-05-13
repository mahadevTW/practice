package WyCash;

/**
 * Created by mahadev on 13/5/16.
 */
public class Dollor {

    public int amount;

    public Dollor(int i) {
        this.amount = i;
    }

    public Dollor times(int i) {
        return new Dollor(amount*=i);
    }
    @Override
    public boolean equals(Object dollor){
        Dollor d = (Dollor)dollor;
        if(amount == d.amount){
            return true;
        }
        return  false;
    }
    @Override
    public int hashCode(){
        return  amount;
    }
    @Override
    public  String toString(){
        return amount+"";
    }

}
