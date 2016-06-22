
package voting_system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VoterRegistration extends JFrame implements ActionListener{
    
     JLabel name=new JLabel("Name");
      JLabel fname=new JLabel("Father Name");
       JLabel age=new JLabel("Age");
        JLabel cnic=new JLabel("CNIC");
         JLabel gender=new JLabel("Gender");
          JLabel status=new JLabel("Status");
           JLabel address=new JLabel("Address");
            JLabel picture=new JLabel("Picture");
            JButton UploadPicture=new JButton("Upload Picture");
     JTextField nametext=new JTextField(15);
      JTextField fnametext=new JTextField(15);
       JTextField agetext=new JTextField(15);
        JTextField cnictext=new JTextField(15);
         JTextField statustext=new JTextField(15);
           JTextField addresstext=new JTextField(15);
               JTextField picturetext=new JTextField(15); 
             
             JRadioButton male=new JRadioButton("Male");
          JRadioButton female=new JRadioButton("Female");
          ButtonGroup groups=new ButtonGroup();
          
          
          
          
           JTextField usertext=new JTextField();
    VoterRegistration (){
        Frame();
     
   name.setBounds(50, 50, 300, 50);
         add(name); 
          
   fname.setBounds(20, 120, 300, 50);
         add(fname); 
          
   age.setBounds(50, 200, 300, 50);
         add(age); 
          
   cnic.setBounds(50, 300, 300, 50);
         add(cnic); 
          
   status.setBounds(50, 400, 300, 50);
         add(status); 
          
    gender.setBounds(50, 500, 50, 50);
         add(gender); 
         male.setBounds(100, 500, 100, 50);
         groups.add(male);
                         add(male);
             female.setBounds(200, 500, 100, 50);
              groups.add(female);
                         add(female);
        
         
        
         
    
    address.setBounds(50, 600, 300, 50);
         add(address); 
          
    
         
         
            nametext.setBounds(100, 50, 300, 50);
             add(nametext); 
          
             fnametext.setBounds(100, 120, 300, 50);
             add(fnametext); 
          
             agetext.setBounds(100, 200, 300, 50);
                 add(agetext); 
          
              cnictext.setBounds(100, 300, 300, 50);
                  add(cnictext); 
          
               statustext.setBounds(100, 400, 300, 50);
                      add(statustext); 
            
               addresstext.setBounds(100, 600, 300, 50);
                      add(addresstext); 
          
                
                          UploadPicture.setBounds(50, 700, 300, 50);
                         add(UploadPicture);
                         UploadPicture.addActionListener(this);
         
             
    
    
    
    
    
    
    
    
    
    }

    
    
    
    void Frame(){
        setSize(1400, 800);
        setTitle("Voters");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images & PNG", "jpg", "gif","png");
    chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        
    }
    
}
