package utils;

import java.util.Properties;

public class MailUtils {
    public static void sendMail() {
        Properties props = new Properties();
        props.setProperty("mail.transport.protocal", "SMTPS");
        props.put("mail.smtp.host", "");
        props.put("mail.smtp.port", "");
        props.put("mail.smtp.socketFactory.port", "");
        props.put("mail.smtp.auth", "");
        props.put("mail.smtp.ssl.enable", "");
        props.put("mail.smtp.ssl.trust", "");

    }
}
