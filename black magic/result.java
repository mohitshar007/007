import java.awt.*;
import java.awt.event.*;
import java.io.*;
class result extends Frame
{
    Label head,bot;
    String btt="",st="";
    public result(int bt,String s)
    {
        if(bt>20||bt==0)st="Error!!!";
        else
        st=s;
        btt=Integer.toString((int)(Math.random()*10)+1);
        setTitle("Result");
        setBackground(new Color(50,100,20));
        setLayout(null);
        addWindowListener(new WindowHandler());
        getline(0,105,1365,5,Color.white);      

        Font ft=new Font("Berlin Sans FB",Font.BOLD,45);       
        head=new Label("Press Button "+btt+" to get result.",Label.LEFT);
        head.setForeground(new Color(250,255,255));
        head.setFont(ft);
        head.setBackground(new Color(100,10,255));     
        add(head);
        head.setBounds(10,20,1365,85);
        for(int i=1;i<=10;i++)
        {
            bt(50,130+(i*40),1250,35,Integer.toString(i));            
        }
    }   

    public static void main(int bt,String s)
    {
        result p=new result(bt,s);
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
    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
                resultdisp rd=new resultdisp(st);
                String arg=e.getActionCommand();
                if(arg.equals(btt))
                {
                    setVisible(false);
                    rd.main(st);
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