package pl.bykowski.homework6.homework6.Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.bykowski.homework6.homework6.service.MailService;

@Aspect
@Controller
public class MovieAspect {

    private MailService mailService;

    @Autowired
    public MovieAspect(MailService mailService) {
        this.mailService = mailService;
    }

    @After("@annotation(SendMail)")
    public void Mailer () {
        mailService.sendMail("<adres do wysłania>", "Test", "Dodano nowy film i wysłano tego maila");
    }
}
