package pers.sasa.feign;

import org.springframework.stereotype.Component;

@Component
public class IHelloServiceHystrix implements IHelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "Error " + name;
    }
}
