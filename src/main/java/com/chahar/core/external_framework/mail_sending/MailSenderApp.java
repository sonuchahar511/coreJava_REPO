package com.chahar.core.external_framework.mail_sending;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class MailSenderApp {

	public static void main(String[] args) {

		Properties props = System.getProperties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
		
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("demo123456777@gmail.com", "Rocket90");
			}
		};
		Session session = Session.getInstance(props, auth);
		
		EmailUtil.sendEmail(session, "yash929c@gmail.com","SimpleEmail Testing Subject"+new Date(), "SimpleEmail Testing Body");
	}

}
