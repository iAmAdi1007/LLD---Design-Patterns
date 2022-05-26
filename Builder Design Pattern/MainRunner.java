public class MainRunner{
    public static void main(String[] args) {
        PhoneBuilder phone = new PhoneBuilder();
        phone.setBattery(5000);
        phone.setOs("Android");
        phone.setProcessor("Qualcomm");

        phone.getInstance();
        System.out.println(phone);

        PhoneBuilder winPhone = new PhoneBuilder();
        winPhone.setRam(8);
        winPhone.setOs("Windows");
        System.out.println(winPhone);
    }
}