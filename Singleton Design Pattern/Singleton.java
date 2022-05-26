public class Singleton{
    private String name;
    // Step 1 : Private Constructor
    private Singleton(String name){
        this.name = name;
        //Implementation as per requirement
    }
    // Step 2 : Static Object
    static Singleton obj = null;

    // Step 3 : public static method to return the instance of the Class
    public static Singleton getInstance(String name){
        if(obj == null){
            obj = new Singleton(name);
        }
        return obj;
    }

    @Override
    public String toString(){
        return "Instance Name : " + this.name;
    }
}