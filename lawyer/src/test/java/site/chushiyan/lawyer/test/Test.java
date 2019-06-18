package site.chushiyan.lawyer.test;


import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import site.chushiyan.lawyer.controller.LawyerController;

@SpringBootTest(classes = LawyerController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class Test {
    @Autowired
    private LawyerController LawyerController;
    public void test1(){
    }
}