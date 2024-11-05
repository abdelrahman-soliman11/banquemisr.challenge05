package banquemisr.challenge05.task_management.controller;

import banquemisr.challenge05.task_management.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
public class MailController {

    private final MailService mailService;

    @Autowired
    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/send")
    public String sendMail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) {
        mailService.sendSimpleMail(to, subject, text);
        return "Email sent successfully!";
    }
}
