import java.awt.*;
import java.awt.event.*;
class Converter extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1;
    Button b1,b2,b3,b4;
    Converter()
    {
        super("Converter");
        setLayout(null);
        setSize(500,400);
        l1=new Label("Enter the decimal number");
        l2=new Label("After converting");
        l3=new Label(null);
        t1=new TextField();
        setVisible(true);
        b1=new Button("BINARY");
        b2=new Button("OCTAL");
        b3=new Button("HEXADECIMAL");
        b4=new Button("CLEAR");
        l1.setBounds(100,50,120,20);
        add(l1);
        t1.setBounds(240,50,50,20);
        add(t1);
        l2.setBounds(100,140,130,20);
        add(l2);
        l3.setBounds(240,140,100,20);
        add(l3);
        b1.setBounds(130,80,50,20);
        add(b1);
        b2.setBounds(200,80,50,20);
        add(b2);
        b3.setBounds(270,80,100,20);
        add(b3);
        b4.setBounds(130,110,50,20);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        int a,b;
        if(ae.getSource()==b1)
        {
            a = Integer.parseInt(t1.getText());
            l3.setText(Integer.toString(Integer.parseInt(Integer.toBinaryString(a))));
        }
        else if(ae.getSource()==b2){
            a = Integer.parseInt(t1.getText());
            l3.setText(Integer.toString(Integer.parseInt(Integer.toOctalString(a))));
        }
        else if(ae.getSource()==b3){
            a = Integer.parseInt(t1.getText());
            if(a>10 && a<16){
                l3.setText(Integer.toHexString(a));
            }
            l3.setText(Integer.toString(Integer.parseInt(Integer.toHexString(a))));
        }
        else
        {
            t1.setText(null);
            l3.setText(null);
        }
    }
    public static void main(String[] args)
    {
        Converter ob = new Converter();
    }
}