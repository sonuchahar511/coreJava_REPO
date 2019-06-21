package com.chahar.core.external_framework.mail_sending;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class MailSenderApp {

	public static void main(String[] args) {

		Properties props = System.getProperties();
		props.put("mail.debug", "true"); 
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
//		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		
//		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS not working 21June2019
		props.put("mail.smtp.EnableSSL.enable","true");

		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
		props.setProperty("mail.smtp.socketFactory.fallback", "false");   
		props.setProperty("mail.smtp.port", "465");   
		props.setProperty("mail.smtp.socketFactory.port", "465");
		
		Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("demo123456777@gmail.com", "Rocket90");
			}
		};
		Session session = Session.getInstance(props, auth);
		
		EmailUtil.sendEmail(session, "csonu33@gmail.com","SimpleEmail Testing Subject"+new Date(), "SimpleEmail Testing Body");
	}

}
