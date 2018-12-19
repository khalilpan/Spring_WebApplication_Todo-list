package com.khalilpan;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getHelloMessage(String user) {
        return "Hello "+user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Weolcome to this Demo Application";
    }
}
