public class MainRunner{
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS os = osf.createInstance("Windows");
        os.show();
    }
}