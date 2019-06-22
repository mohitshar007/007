import java.awt.*;
import java.awt.event.*;
public class bmmain extends Frame 
{
    Button ch1,ch2;
    Label l1,l2,line,d,d1;
    list1 s=new list1();
    list2 s1=new list2();
    static int res=0;
    Label getline(int x,int y,int l,int b,Color color)
    {
        line=new Label("");
        line.setBackground(color);
        add(line);
        line.setBounds(x,y,l,b);
        return line;
    }
    public bmmain()
    {
        setTitle("Black Magic");
        setLayout(null);
        setBackground(new Color(100,250,250));
        addWindowListener(new WindowHandler());
        
        ch1=new Button("                                            Numerical");
        ch2=new Button("Names                                                                      ");
               
        l1=new Label("Created by:Mohit Sharma");
        l1.setForeground(Color.black);
        l1.setBackground(new Color(200,200,0));
        
        Font ft=new Font("Berlin Sans FB",Font.BOLD,40);       
        l2=new Label("Black Magic",Label.CENTER);
        l2.setForeground(new Color(75,25,75));
        l2.setFont(ft);
        l2.setBackground(new Color(200,200,0));        
        
        d=new Label("");
        d.setBackground(Color.black);
        d1=new Label("");
        d1.setBackground(new Color(200,200,0));
        
        
        
        Font ft1=new Font("Arial",Font.ITALIC,35);       
        ch1.setForeground(new Color(200,100,0));
        ch1.setBackground(Color.white);
        ch2.setForeground(new Color(200,100,0));
        ch2.setBackground(Color.white);
        ch1.setFont(ft1);
        ch2.setFont(ft1);
        
        add(ch1);add(ch2);add(d);
        ch1.setBounds(0,455,670,150);
        ch2.setBounds(700,455,910,150);
        
        add(l1);add(l2);
        
        l1.setBounds(10,25,200,25);
        l2.setBounds(0,20,1365,85);        
        
        d.setBounds(0,450,1365,160);
        getline(0,105,1365,5,Color.white);
        getline(0,445,1365,5,Color.white);
        getline(0,610,1365,5,Color.white);
        
        d1=new Label("");
        d1.setBackground(new Color(200,200,0));
        add(d1);
        d1.setBounds(0,615,1365,500);       

        ch1.addActionListener(new ButtonHandler());
        ch2.addActionListener(new ButtonHandler());
    } 
    
    public void paint(Graphics g)
    {
        Font ft=new Font("Script",Font.ITALIC,20);
        g.setFont(ft);
        g.drawString("==>You will be provided a list of 20 items. ",10,200);
        g.drawString("==>You need to choose one word.   ",10,240);
        g.drawString("==>Five rounds will be held. ",10,280);
        g.drawString("==>Finally we will predict the word ",10,320);
        g.drawString("Choose the way you want to play ==>",20,425); 
    }
    
    public static void main()
    {
        bmmain p=new bmmain();
        p.show();
        p.setBounds(1,1,1365,730);
    }

    class WindowHandler extends WindowAdapter
    {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }

    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
                String arg=e.getActionCommand().trim();
                if(arg.equals("Names"))                
                {
                    setVisible(false);                    
                    s.main();
                    s.paint(null);
                }
                if(arg.equals("Numerical"))                
                {
                    setVisible(false);
                    s1.main();
                    s1.paint(null);
                }                
            }
            catch(Exception f){}
        }        
    }
}