package mt.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by shaojia on 2017/7/11.
 */
@RestController
/*@EnableAutoConfiguration*/
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private JdbcTemplate jdbcTempalte;

    @RequestMapping("/add")
    public String add() {
        System.out.println(jdbcTempalte);
        return "add";
    }

}
