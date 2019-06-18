package site.chushiyan.lawyer.service;

import site.chushiyan.lawyer.pojo.Lawyer;
import site.chushiyan.lawyer.pojo.PageBean;

public interface LawyerService {


    public Lawyer queryById(String id);


    public PageBean search(String name,
                           String city,
                           String address,
                           String phoneNumber,
                           String faxNumber,
                           String lawSchool,
                           Integer currentPage,
                           Integer pageSize);
}
