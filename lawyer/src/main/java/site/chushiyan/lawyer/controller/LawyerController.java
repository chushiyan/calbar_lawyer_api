package site.chushiyan.lawyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.chushiyan.lawyer.pojo.Lawyer;
import site.chushiyan.lawyer.pojo.PageBean;
import site.chushiyan.lawyer.service.LawyerService;

import java.util.List;

@RestController
public class LawyerController {

    @Autowired
    private LawyerService lawyerService;

    /**
     *  (1)
     *  query based on the id
     * @param id
     * @return
     */
    @RequestMapping("/lawyer/{id}")
    public Lawyer queryById(@PathVariable String id) {
        return lawyerService.queryById(id);
    }

    /**
     *  (2)
     *  Query based on the conditions and return results
     * @param name
     * @param city
     * @param address
     * @param phoneNumber
     * @param faxNumber
     * @param lawSchool
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping("/lawyer/search")
    // eg : /lawyer/search?name=&city=&address=&phoneNumber=&faxNumber=&lawSchool=currentPage=1&pageSize=10
    public PageBean search(String name,
                           String city,
                           String address,
                           String phoneNumber,
                           String faxNumber,
                           String lawSchool,
                           Integer currentPage,
                           Integer pageSize
                           ) {
        return lawyerService.search(name, city,address, phoneNumber,faxNumber, lawSchool,currentPage,pageSize);

    }
}