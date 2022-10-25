package NeoNext.Proto.SPECTRUM.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class generation {
    @GetMapping("/beta-rev-1")
    public String rev1String() {
        return "Beta Rev 1";
    }
}
