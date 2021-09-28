package pam.tp1.alert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class AlertMail implements IAlertMessenger {

	@Autowired
	public JavaMailSender emailSender;
	
	@Override
	public void sendMessage(String message) {
		 SimpleMailMessage mail = new SimpleMailMessage(); 
		 mail.setTo("nicolas.marilleau@ird.fr"); 
		 mail.setSubject("alert"); 
		 mail.setText(message);
	     emailSender.send(mail);
	}

}
