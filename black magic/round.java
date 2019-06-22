import java.awt.*;
import java.awt.event.*;
import java.io.*;
class round extends Frame
{
    Label head,bot;int getcount=0;
    Button y,n;String a[],a1[];
    String title="";
    public round(String s,String st)
    {
        a=s.split(":");
        a1=st.split(":");
        title=a[0];
        setTitle("Round "+title);
        setBackground(new Color(50,100,20));
        setLayout(null);
        addWindowListener(new WindowHandler());
        getline(0,105,1365,5,Color.white);
        getline(530,80,300,3,Color.red);
        getline(0,545,1365,5,Color.white);
        
        Font ft=new Font("Berlin Sans FB",Font.ITALIC,45);       
        head=new Label("Round "+title,Label.CENTER);
        head.setForeground(new Color(250,255,255));
        head.setFont(ft);
        head.setBackground(new Color(100,10,255));     
        add(head);
        head.setBounds(0,20,1365,85);
        
        
        Font ft1=new Font("Arial",Font.ITALIC,35);       
        y=new Button("Yes");
        y.setFont(ft1);
        add(y);
        y.setBounds(600,560,300,100);
        n=new Button("No");
        n.setFont(ft1);
        add(n);
        n.setBounds(1000,560,300,100);
                
        bot=new Label("");
        bot.setBackground(new Color(1,1,1));
        add(bot);
        bot.setBounds(0,550,1365,500);
        
        int i=1;       
        do
        {
            if(i<=10)
            {
                if(a1[1].equals("char"))
                print(50,130+(i*35),200,35,Color.white,(char)(i+64)+"."+a[i],20);            
                else
                print(50,130+(i*35),200,35,Color.white,(i)+"."+a[i],20);
            }
            else
            {
                if(a1[1].equals("char"))
                print(280,130+((i-10)*35),200,35,Color.white,(char)(i+64)+"."+a[i],20);
                else
                print(280,130+((i-10)*35),200,35,Color.white,(i)+"."+a[i],20);
            }
            i++;
        }while(i<a.length);
        
        print(625,175,375,50,Color.white,"Is the letter ",40);
        print(625,225,395,50,Color.white,"present in this list.",40);
        print(750,350,350,75,Color.white,"Press Yes/No ",40);
        
        y.addActionListener(new ButtonHandler1());
        n.addActionListener(new ButtonHandler1());
    }   

    public void paint(Graphics g)
    {
        Font ft=new Font("Script",Font.ITALIC,30);
        g.setFont(ft);
        g.drawRect(600,150,500,300);
    }

    public static void main(String s,String st)
    {
        round p=new round(s,st);
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
            try{
                list1 lt=new list1();
                list2 ltt=new list2();
                if(a1[0].equals("num")){a1=ltt.ar;}
                else {a1=lt.ar;}
                if(title.equals("1"))getcount=1;
                if(title.equals("2"))getcount=2;
                if(title.equals("3"))getcount=4;
                if(title.equals("4"))getcount=8;
                if(title.equals("5"))getcount=16;
                result rt=new result(bmmain.res,a1[bmmain.res]);
                String arg=e.getActionCommand();
                if(arg.equals("Yes"))
                {
                    bmmain.res+=getcount;
                    setVisible(false);
                    if(title.equals("5"))
                    {
                        rt.main(bmmain.res,a1[bmmain.res]);
                    }
                }
                if(arg.equals("No"))
                {
                    setVisible(false);
                    if(title.equals("5"))
                    {
                        rt.main(bmmain.res,a1[bmmain.res]);
                    }
                }                
            }
            catch(Exception f)
            {
                result rt=new result(0,"Error!!!");
                rt.main(0,"Error Occured!!!");
            }
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
}