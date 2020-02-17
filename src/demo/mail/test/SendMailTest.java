package demo.mail.test;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import demo.mail.util.MailUtils;

/**
 * 发送邮件的demo
 * @author mazhuang
 * time 2019年10月18日 15:38:52
 */
public class SendMailTest {

    public static void main(String[] args) throws MessagingException, javax.mail.MessagingException {
        while (true){
            MailUtils.sendMail("798441104@qq.com","111","22");
            System.out.println("发送成功");
        }
    }
}
