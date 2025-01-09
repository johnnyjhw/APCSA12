public class FractionDriver {
    
    public static void main(String [] args){
        
        fraction whole = new fraction(1,2);
        fraction half = new fraction(1,2);
        fraction third = new fraction("1/3");
        fraction anotherhalf = new fraction(half);
        
        System.out.println(whole);
        System.out.println(half);
        System.out.println(third);
        System.out.println(third);
        /*
        System.out.println(anotherhalf.getNum());
        System.out println(anotherhalf.getDem());
        System.out.println(anotherhalf.toDouble(());
        */
        fraction pair = new fraction(252, 105);
        System.out.println(pair);
        
        //fraction sum = new fraction(half, half);
        //System.out.println(sum);
        
        fraction impfraction = new fraction(5,10);
        System.out.println(impfraction);
        
                
        
    }
    

}