
package enumsetrange;


public enum NewClass {
    tom("chubby","22"),
    mary("beauty","18"),
    julia("pretty","20"),
    buny("cuity","16"),
    bully("differ","14"),
    erin("indian","19"),
    candy("italian","24");
    
    private final String desc;
    private final String year;
    
    NewClass(String description, String age){
        desc = description;
        year = age;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public String getYear(){
        return year;
    }
}
