
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana extends JFrame implements ActionListener
{
     private JButton img, img2,guardar,ok;
     private JPanel panel,panel2;
     private JTextField nombre;
     private JLabel label,label2;
         
     private String dato1;
     private ImageIcon[] listaImagen;
     private ImageIcon imagen1,imagen2;
    public Ventana()
    {
        setLayout(null);
        setBounds(100,100,600,550);
        setVisible(true);
        
        listaImagen = new ImageIcon[2];

        img = new JButton ("imagen1");
        img.addActionListener(this);
        img.setBounds(10,60,100,35);
        img.setVisible(true);
        add(img);
        
        img2 = new JButton ("imagen2");
        img2.addActionListener(this);
        img2.setBounds(10,100,100,35);
        img2.setVisible(true);
        add(img2);
       
        guardar = new JButton ("guardar nombre");
        guardar.addActionListener(this);
        guardar.setBounds(10,187,150,35 );
        guardar.setVisible(true);
        add(guardar);
       
        nombre = new JTextField();
        nombre.setBounds(10,145,150,40);  
        nombre.setVisible(true);
        add(nombre);
       
        label=new JLabel ();
        label.setBounds(180,40,200,200);
        label.setVisible(true);
        add(label);
        
        label2=new JLabel ();
        label2.setBounds(105,265,150,35);
        label2.setVisible(true);
        add(label2);
       
        panel=new JPanel();
        panel.setBounds(100,270,150,60);
        panel.setVisible(true);
        panel.setBackground(Color.white);
        add(panel);
       
        panel2=new JPanel();
        panel2.setBounds(0,0,500,400);
        panel2.setVisible(true);
        panel2.setBackground(Color.black);
        add(panel2);
       
       
        imagen1 = new ImageIcon(getClass().getResource("imagen1.jpg"));
        imagen2 = new ImageIcon(getClass().getResource("imagen2.jpg"));
        
        llenarListaImagen();        
       
        ok = new JButton ("ok");
        ok.addActionListener(this);
        ok.setBounds(100,300,150,30);
        ok.setVisible(true);
        add(ok);
    }
   
    public static void main(String[] args)
        {
         Ventana v = new Ventana();
        }
    public void llenarListaImagen()
        {
         listaImagen[0]=imagen1;
         listaImagen[1]=imagen2;
        }

    public void actionPerformed(ActionEvent e)
        {
            Object objeto = e.getSource();
            if(objeto == img)
            {
               label.setVisible(true);
               label.setIcon(imagen1);
            }
            if(objeto == img2)
            { 
               label.setVisible(true);
               label.setIcon(imagen2);
            }
            if(objeto == guardar)
            {
              dato1=this.nombre.getText();
              label2.setText(label2.getText()+dato1);
            }
            if(objeto==ok)
            {
                //borra los datos que pondremos
                label2.setText("");
            }

        }  
    
}