class OSFactory{
    public OSFactory(){
        //Default Constructor
    }
    public OS createInstance(String OSType){
        if(OSType.equals("Ubuntu")) return new Ubuntu();
        else if(OSType.equals("Windows")) return new Windows(10);
        else return new OSX();
    }
}