import java.awt.*;
import java.awt.event.*;
class resultdisp extends Frame
{
    List lt=new List();
    bmmain bm=new bmmain();
    Button y;
    public resultdisp(String st)
    {
        setTitle("Result");
        setLayout(null);
        setBackground(Color.orange);
        addWindowListener(new WindowHandler()); 
        
        Label l1,l2;
        Font ft=new Font("Script",Font.BOLD,25);
        l2=new Label("==>                         <==",Label.CENTER);
        l2.setFont(ft);l2.setForeground(new Color(0,50,250));
        
        
        l1=new Label(st,Label.CENTER);
        l1.setFont(ft);l1.setForeground(new Color(250,10,25));
        
        add(l1);
        l1.setBounds(120,80,165,50);
        add(l2);
        l2.setBounds(0,80,400,50);
        
        l2=new Label ("Press ==>         to play again!",Label.CENTER);
        l2.setFont(ft);
        bt(160,164,50,23,"YES");
        add(l2);
        l2.setBounds(0,150,400,50);
        
        
    }
    public static void main(String s)
    {        
        resultdisp p=new resultdisp(s);
        p.show();bmmain.res=0;
        p.setBounds(400,300,400,300);
    }    
    class WindowHandler extends WindowAdapter
    {
        public void windowClosing(WindowEvent we)
        {
            setVisible(false);
        }
    }
    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
                String arg=e.getActionCommand();
                if(arg.equals("YES"))
                {
                    setVisible(false);
                    bm.main();
                }
            }
            catch(Exception f){}
        }        
    }
    Button bt(int x,int y,int l,int b,String st)
    {
        Font ft=new Font("Script",Font.BOLD,20);
        Button line=new Button(st);
        line.setFont(ft);
        add(line);
        line.addActionListener(new ButtonHandler());
        line.setBounds(x,y,l,b);        
        return line;
    }
}