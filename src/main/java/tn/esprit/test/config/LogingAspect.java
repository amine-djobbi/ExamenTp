package tn.esprit.test.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogingAspect {

    @Before("execution(* tn.esprit.test.services.*.*(..))")
    public void logMeth(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        if(name.startsWith("ajouter"))
            log.info(" Début de la méthode " + name + " : ");
    }

}
