
package voting_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Admin extends JFrame implements ActionListener{
    
    JLabel admin=new JLabel("Welcome Admin");
  JButton voter=new JButton("Voters Registration");
  JButton voter_view=new JButton("Voter View");
  JButton Candidates=new JButton("Candidates Registration");
  JButton Candidates_view=new JButton("Candidates View");  
    
   Admin(){
       Frame();
        
   
   admin.setBounds(50, 50, 300, 50);
         add(admin); 
   
  voter.setBounds(300, 200, 100, 30);
         add(voter);
   voter_view.setBounds(300, 400, 100, 30);
         add(voter_view);
         
    Candidates.setBounds(500, 200, 100, 30);
         add(Candidates);
        Candidates_view.setBounds(500, 400, 100, 30);
         add(Candidates_view);   
   voter.addActionListener(this);
   voter_view.addActionListener(this);
   Candidates.addActionListener(this);
   Candidates_view.addActionListener(this);
   
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
       new VoterRegistration();
       dispose();
    }
    

}
