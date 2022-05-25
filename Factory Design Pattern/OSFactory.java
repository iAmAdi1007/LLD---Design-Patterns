class OSFactory{
    public OSFactory(){
        //Default Constructor
    }
    public OS createInstance(String OSType){
        if(OSType.equals("Android")) return new Android();
        else if(OSType.equals("Windows")) return new Windows(10);
        else return new IOS();
    }
}