package site.chushiyan.lawyer.app;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Properties;

@SpringBootApplication(scanBasePackages = {"site.chushiyan.lawyer"})
@MapperScan("site.chushiyan.lawyer.mapper")
public class LawyerApplication {
    public static void main(String [] args){
        SpringApplication.run(LawyerApplication.class,args);
    }

    // pageHelper
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
