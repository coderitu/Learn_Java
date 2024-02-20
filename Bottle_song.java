public class GreenBottle{
    
    public static void main(String[] args){
        int bottleNum = 10;
        String word = "bottles";
        
        
    while(bottleNum > 0){
        
        if(bottleNum == 1){
            word = "bottle";
        }
        
        System.out.println(bottleNum + " green " + word + " hanging on the wall,");
        
        System.out.println(bottleNum + " green " + word + " hanging on the wall,");
        System.out.println("And if one green bottle should accidentally fall,\n");
        bottleNum = bottleNum - 1;
        if(bottleNum > 0){
        System.out.println("There'll be " + bottleNum + " green " + word + " hanging on the wall" );
        }else{
            System.out.println("There will be no green bottle on the wall");
        }
    }
    }
    
}

// Ten green bottles hanging on the wall,
// Ten green bottles hanging on the wall,
// And if one green bottle should accidentally fall,
// There'll be nine green bottles hanging on the wall.
