package homework;

public class Box {

    int param1;
    int param2;
    int param3;

    public  Box(int param1, int param2, int param3)
    {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;

        int volume=this.param1*this.param2*this.param3;
        System.out.println("Volume is"+volume +"cm3");
        }


    public Box(int param1, int param2)
     {
            this.param1 = param1;
            this.param2 = param2;
            this.param3 = 100;
        int volume=this.param1*this.param2*this.param3;
        System.out.println("Volume is"+volume +"cm3");
    }

    public Box() {
        this.param1 = 50;
        this.param2 = 40;
        this.param3 = 100;
        int volume = this.param1 * this.param2 * this.param3;
        System.out.println("Volume is" + volume + "cm3");
    }

     public Box(int param1)
     {
         this.param1 = param1;
         this.param2=40;
         this.param3 = 100;
         int volume=this.param1*this.param2*this.param3;
         System.out.println("Volume is"+volume +"cm3");
}

public void printVolume(){
    int volume =param1*param2*param3;
    System.out.println("Volume is"+volume +"cm3");
}
public void printVolume(int a,int b,int c ) {
        int volume = a*b*c;
    System.out.println("Volume from second method is");

}
public int getParam1(){
    return  param1;
}public int getParam2(){
        return  param2;
    }
    public int getParam3(){
        return  param3;
    }
}