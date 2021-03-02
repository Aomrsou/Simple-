package com.zzy.service.Impl;

import com.zzy.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * @author yyf
 * @Description
 * @Date 创建于 2020/5/15 21:10
 */
@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private MailSender sender;

    @Value("${spring.mail.username}")
    private String from;

    /**
     * 简单邮件发送
     *
     * @param to      收件人
     * @param content 内容
     * @param title   主题
     */
    @Override
    public void simpleSendMail(String to, String title, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(title);
        message.setText(content);
        sender.send(message);
    }
}
