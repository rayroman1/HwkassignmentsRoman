package HumansVsGnomes;

public class HumanInventory {
    private String weapon[];
    private String shield[];
    private String armor[];

    HumanInventory (){
     weapon=new String[]{ "sword","axe","bomb"};
     shield=new String[]{"big","dragon","wood"};
     armor=new String[]{"diamond","ruby","steel"};

   }
   public String getweapon(int x)
   {
       return weapon[x];
   }
   public String setweapon(String a,int x)
   {
       weapon[x]=a;
        return weapon[x];
   }
    public String getshield(int x)
    {
        return shield[x];
    }
    public String setshield(String a,int x)
    {
        weapon[x]=a;
        return shield[x];
    }

    public String getarmor(int x)
    {
        return armor[x];
    }
    public String setarmor(String a,int x)
    {
        weapon[x]=a;
        return armor[x];
    }

    public String toString(){//overriding the toString() method
        return weapon+" "+shield+" "+armor;
    }
}


