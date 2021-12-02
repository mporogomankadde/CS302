package myutil;

class Electronic{
    private int serialNum;

    public int getSerialNum() {
        return serialNum;
    }

    public Electronic(int serialNum) {
        this.serialNum = serialNum;
    }
}
 class Appliances {
    private int serialNum;
     public int getSerialNum() {
         return serialNum;

     }

     public Appliances(int serialNum) {
         this.serialNum = serialNum;
     }
     public  void isAvail(int serialnum) {
         if(this.getSerialNum()==serialnum)
             System.out.println("true");
         else
             System.out.println("false");
     }
 }
class Automobiles {
    private int serialNum;
    public int getSerialNum() {
        return serialNum;
    }

    public Automobiles(int serialNum) {
        this.serialNum = serialNum;
    }
}
class Furniture {
    private int serialNum;
    public int getSerialNum() {
        return serialNum;
    }

    public Furniture(int serialNum) {
        this.serialNum = serialNum;
    }
}
class CompactDisk {
    private int serialNum;
    public int getSerialNum() {
        return serialNum;
    }

    public CompactDisk(int serialNum) {
        this.serialNum = serialNum;
    }
}