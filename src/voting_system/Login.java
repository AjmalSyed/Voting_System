
package voting_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame implements ActionListener{
    JLabel username=new JLabel("Username");
    JTextField usertext=new JTextField();
    JLabel passward=new JLabel("Passward");
    JPasswordField passtext=new JPasswordField();
    JButton login=new JButton("Log in");
  JLabel label=new JLabel("FOR ADMIN USER");
   JButton reset=new JButton("Reset");
   Login(){
        Frame();
    username.setBounds(50, 100, 300, 50);
         add(username);
       usertext.setBounds(200, 100, 200, 30);
         add(usertext);
         passward.setBounds(50, 200, 300, 50);
         add(passward);
   passtext.setBounds(200, 200, 200, 30);
         add(passtext); 

   login.setBounds(100, 300, 100, 30);
         add(login); 
   
   label.setBounds(50, 50, 300, 50);
         add(label); 
   
  reset.setBounds(300, 300, 100, 30);
         add(reset); 
         login.addActionListener(this);
       
   }
    
           
      void Frame(){
        setSize(1400, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Admin();
        dispose();
        
        
    }
    
    
}
