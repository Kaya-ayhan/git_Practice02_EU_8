package week14_OOP;

public class Browser {

    private String browserType;  // crome ,safari, edge,
    private static  String operatingSystem;  // windows , ios, linux


    public Browser(String name){
        browserType=name;

    }
    static {
        operatingSystem="Windows";
    }


    public String getName(){ return  browserType;}
    public void closeBrowser(){ browserType=null;} // this method is created so we can use

    public void setBrowserType(String name){
        if(browserType==null){
            this.browserType=name;
        }else
            System.out.println("there is already open a browser "+ browserType);
    }
    public static String getOSname(){ return  operatingSystem;   }
}
