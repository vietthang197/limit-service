package vn.neo.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.neo.limitservice.config.LimitConfiguration;
import vn.neo.limitservice.obj.Limit;

@RestController
@RequestMapping("/")
public class LimitController {

    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/")
    public Limit getLimit() {
        return new Limit(limitConfiguration.getMin(), limitConfiguration.getMax());
    }
}
