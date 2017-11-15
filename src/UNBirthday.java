import javax.swing.JOptionPane;

public class UNBirthday {
public static void main(String[] args) {
	

	String date="11-14-17";
	
	String birthday=JOptionPane.showInputDialog("when is your birthday?");
	
	if(date.equals(birthday)){	
		
	JOptionPane.showMessageDialog(null, "Happy Birthday!!!" );
	
	
	
	
	
}
	
	
	else{ JOptionPane.showMessageDialog(null,"Happy Unbirthday!!!");
}

}
}