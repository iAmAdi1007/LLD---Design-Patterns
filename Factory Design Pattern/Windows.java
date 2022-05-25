public class Windows implements OS{
    private int OSVersion;

    public Windows(int OSVersion){
        this.OSVersion = OSVersion;
    }

    @Override
    public void show(){
        System.out.println("Most Common OS");
    }
}