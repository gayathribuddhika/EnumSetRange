
package enumsetrange;

import java.util.EnumSet;
public class EnumSetRange {

    
    public static void main(String[] args) {
        for(NewClass people : NewClass.values()){
            System.out.printf("%s\t%s\t%s\n",people,people.getDesc(), people.getYear());
        }
        System.out.println("\nThe range of constants");
        
        for(NewClass people : EnumSet.range(NewClass.mary,NewClass.erin)){
            System.out.printf("%s\t%s\t%s\n",people,people.getDesc(), people.getYear());
        }
    }
    
}
