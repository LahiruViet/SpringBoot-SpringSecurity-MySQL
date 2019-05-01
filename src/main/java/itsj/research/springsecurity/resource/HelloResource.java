package itsj.research.springsecurity.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping("rest/secured/hello")
    public String helloSecured(){
        return "I am a secured page";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("rest/secured/admin")
    public String adminAccessOnly(){
        return "This is accessed by Admin role only";
    }
}
