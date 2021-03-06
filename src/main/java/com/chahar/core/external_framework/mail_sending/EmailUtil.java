package com.chahar.core.external_framework.mail_sending;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailUtil {
	
	public static void sendEmail(Session session, String toEmail, String subject, String body) {
		MimeMessage msg = new MimeMessage(session);
		
		try {
			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
			msg.addHeader("format", "flowed");
			msg.addHeader("Content-Transfer-Encoding", "8bit");

			msg.setFrom(new InternetAddress("no_reply@example.com", "NoReply-JD"));
			msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));

			msg.setSubject(subject, "UTF-8");
			msg.setText(body, "UTF-8");
			msg.setSentDate(new Date());

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));

			System.out.println("Message is ready to send.");
			Transport.send(msg);

			System.out.println("EMail Sent Successfully!!");
		} catch (MessagingException |UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
