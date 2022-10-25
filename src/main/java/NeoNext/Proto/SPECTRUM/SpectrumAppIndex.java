package NeoNext.Proto.SPECTRUM;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpectrumAppIndex {
    @GetMapping("/index")
    public String index() {
        return "Working In Progress";
    }
}
