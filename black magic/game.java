import java.util.*;
class game1
{
    static Scanner sc=new Scanner(System.in);
    static String name;
    static game1 p=new game1();
    void pln(String s){System.out.println(s);}
    void p(String s){System.out.print(s);}
    static int throwdice()
    {
        int d=10;
        while(d>6||d==0)
        {
            d=(int)(Math.random()*10);
        }        
        System.out.format("\t\t\t! dice turn up!!! "+d+"%46s","!");
        p.pln("");
        return d;
    }    
    static void delaysort()
    {
        int i=(int)(Math.random()*100);
        for(;i<Math.pow(10,6);i++){}
    }
    static void getname()
    {
        System.out.format("\t\t\t!%19s%5s%17s"," ","Enter your name(<8 letters):","!");
        System.out.println();
        System.out.format("\t\t\t!%29s"," ");        
        name=sc.nextLine();
        if(name.length()<=7)
        {
        }
        else
        {
            getname();
        }
    }    
    static void table(String n,int s1[],int s2[],int p1,int p2)
    {
        System.out.format("\t\t\t%20s"," ");
        for(int i=10;i<=21;i++)
        System.out.print(":-");
        System.out.print(":");
        System.out.format("\n\t\t\t%20s|%16s%8s","","Score Card","|");
        System.out.println();
        System.out.format("\t\t\t%20s"," ");
        System.out.print(":");
        for(int i=10;i<33;i++)
        System.out.print("-");
        System.out.print(":");
        System.out.format("\n\t\t\t%20s|%9s%3s%7s%5s","",n,"|","CPU","|");
        System.out.println();
        System.out.format("\t\t\t%20s"," ");
        System.out.print(":");
        for(int i=10;i<33;i++)
        System.out.print("-");
        System.out.print(":");
        int l=s1.length;
        for(int j=0;j<l;j++)
        {
            if(s1[j]!=0&&s1[j]!=0)
            System.out.format("\n\t\t\t%20s|%7s%5s%5s%7s","",s1[j],"|",s2[j],"|");
        }System.out.println();
        System.out.format("\t\t\t%20s"," ");
        System.out.print(":");
        for(int i=10;i<33;i++)
        System.out.print("-");
        System.out.print(":");
        System.out.println();
        System.out.format("\t\t\t%20s|%7s%5s%5s%7s","",p1,"|",p2,"|");
        System.out.println();
        System.out.format("\t\t\t%20s"," ");
        for(int i=10;i<=21;i++)
        System.out.print(":-");
        System.out.print(":");
    }
}
public class game
{
    public static void main()
    {
        game1 g=new game1();
        game1 p=new game1();
        String ch;int ps1=0,ps2=0;int sc1[]=new int[25],sc2[]=new int[25];int s;
        Scanner sc=new Scanner(System.in);int i=0;        
        p.pln("\t\t\t**********************WELCOME TO DICE GAME***********************");
        p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
        System.out.format("\t\t\t!%22s%8s%22s"," ","Press enter to begin","!");
        ch=sc.nextLine();
        g.getname();        
        p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
        System.out.format("\t\t\t! Please Wait for your turn%38s","!");
        p.pln("");
            g.delaysort();
        for(i=0;i>=0;i++){    
        p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
        System.out.format("\t\t\t!%20s%8s%19s"," ","Press enter to throw dice","!");        
        ch=sc.nextLine();
        g.delaysort();
        s=g.throwdice();
        ps1+=s;
        sc1[i]=s;
        if(ps1>=20&&ps1>ps2)
        {
            p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
            System.out.format("\t\t\t!%26s%8s%24s"," ","BRAVO! YOU WON","!");
            p.pln("");
            break;
        }
        System.out.format("\t\t\t!%22s%8s%19s"," ","Wait for CPU to play!!!","!");
        System.out.println();
        g.delaysort();        
        s=g.throwdice();
        sc2[i]=s;
        ps2+=s;        
        if(ps2>=20&&ps2>ps1)
        {
            p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
            System.out.format("\t\t\t!%26s%8s%25s"," "," WOO! CPU WON","!");
            p.pln("");
            break;
        }
        if(ps1==ps2&&ps1>=20)
        {
            p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
            System.out.format("\t\t\t!%25s%8s%23s"," ","YEAH! IT's A TIE","!");
            p.pln("");
            break;
        }
        }
        p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
        System.out.format("\n\t\t\t%18s%8s"," ","Press enter to display scorecard");        
        ch=sc.nextLine();
        p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
        g.table(g.name,sc1,sc2,ps1,ps2);
        p.pln("");
        p.pln("\t\t\t:~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~:");
        p.pln("\n\n\n\n\n\n\n\n");
    }
}
        