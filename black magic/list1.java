import java.awt.*;
import java.awt.event.*;
import java.io.*;
class list1 extends Frame
{
    Label head,bot;
    Button ch;
    static String ar[]={"","Guava","Tomato","Potato","Carrot","Reddish","Pineapple","Orange","Banana","Grapes","Spongeguard","Ladyfinger","Peas","Cabbage","Cauliflower","Watermelon","Melon","Apple","Coriander","Onion","Brinjal",};
    getrandom1 ck=new getrandom1(20);
    public list1()
    {
        setTitle("List");
        setBackground(new Color(50,100,20));
        setLayout(null);
        addWindowListener(new WindowHandler());
        getline(0,105,1365,5,Color.white);
        getline(530,80,300,3,Color.red);
        getline(0,545,1365,5,Color.white);

        Font ft=new Font("Berlin Sans FB",Font.ITALIC,45);       
        head=new Label("List of names",Label.CENTER);
        head.setForeground(new Color(250,255,255));
        head.setFont(ft);
        head.setBackground(new Color(100,10,255));     
        add(head);
        head.setBounds(0,20,1365,85);

        Font ft1=new Font("Arial",Font.ITALIC,35);       
        ch=new Button("Begin");
        ch.setFont(ft1);
        add(ch);
        ch.addActionListener(new ButtonHandler1());
        ch.setBounds(1000,560,300,100);

        bot=new Label("");
        bot.setBackground(new Color(1,1,1));
        add(bot);
        bot.setBounds(0,550,1365,500);
        
        for(int i=1;i<=20;i++)
        {
            int d=ck.get(i-1);
            if(i<=10)
            print(50,130+(i*35),200,35,Color.white,(i)+"."+ar[d],20);
            if(i>10)
            print(280,130+((i-10)*35),200,35,Color.white,(i)+"."+ar[d],20);
        }

        print(625,175,375,50,Color.white,"Choose a letter ",40);
        print(625,225,375,50,Color.white,"from this list.",40);
        print(750,350,350,75,Color.white,"Press Begin ",40);

    }
    public void paint(Graphics g)
    {
        Font ft=new Font("Script",Font.ITALIC,30);
        g.setFont(ft);
        g.drawRect(600,150,500,300);
    }
    public static void main()
    {
        list1 p=new list1();
        p.show();
        p.setBounds(1,1,1365,730);
    }   
    class WindowHandler extends WindowAdapter
    {
        public void windowClosing(WindowEvent we)
        {
            setVisible(false);
        }
    }
    class ButtonHandler1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                String st="";            
                String arg=e.getActionCommand();
                if(arg.equals("Begin"))
                {
                    int i=16,c=5;//;i>=1;i/=2,c--)
                    {
                        round r=new round(c+get(i),"alpha:int");
                        r.main(c+get(i),"alpha:int");
                        setVisible(false);    
                    }                    
                }
            }
            catch(Exception f){}
        }        
    }
    Label getline(int x,int y,int l,int b,Color color)
    {
        Label line=new Label("");
        line.setBackground(color);
        add(line);
        line.setBounds(x,y,l,b);
        return line;
    }
    Label print(int x,int y,int l,int b,Color color,String st,int size)
    {
        Font ft=new Font("Script",Font.BOLD,size);
        Label line=new Label(st);
        line.setForeground(color);
        line.setFont(ft);
        add(line);
        line.setBounds(x,y,l,b);
        return line;
    }
    int getval(int rn)
    {
        int c=0;
        for(int i=0;i<20;i++)
        {
            if(((i+1)/rn)%2!=0)
            {
                c++;
            }
        }
        return c;
    }
    static String get(int rno)
    {
        int c=0; 
        String r="";
        for(int i=1;i<=20;i++)
        {
            if((i/rno)%2!=0)
            {
                r=r+":"+ar[i];
                c++;
            }
        } 
        return r;
    }    
}