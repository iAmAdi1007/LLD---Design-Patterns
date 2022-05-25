class MobileFactory{
    public MobileFactory(){
        //Default Constructor
    }
    public MobileOS createInstance(String OSType){
        if(OSType.equals("Android")) return new Android();
        else if(OSType.equals("Windows Mobile")) return new WindowsMobile();
        else return new IOS();
    }
}