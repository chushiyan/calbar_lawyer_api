package site.chushiyan.lawyer.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.chushiyan.lawyer.mapper.LawyerMapper;
import site.chushiyan.lawyer.pojo.Lawyer;
import site.chushiyan.lawyer.pojo.LawyerExample;
import site.chushiyan.lawyer.pojo.PageBean;

import java.util.List;

@Service
public class LawyerServiceImpl implements LawyerService {

    @Autowired
    private LawyerMapper lawyerMapper;

    @Override
    public Lawyer queryById(String id) {
        return lawyerMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean search(String name,
                           String city,
                           String address,
                           String phoneNumber,
                           String faxNumber,
                           String lawSchool,
                           Integer currentPage,
                           Integer pageSize) {

        PageHelper.startPage(currentPage,pageSize);

        LawyerExample example = new LawyerExample();

        example.createCriteria().andNameLike("%"+name+"%")
                .andCityLike("%"+city+"%")
                .andAddressLike("%"+address+"%")
                .andPhoneNumberLike("%"+phoneNumber+"%")
                .andFaxNumberLike("%"+faxNumber+"%")
                .andLawSchoolLike("%"+lawSchool+"%");

        example.setOrderByClause("name asc");

        PageBean pageBean = new PageBean();

        List<Lawyer> list = lawyerMapper.selectByExample(example);

        pageBean.setList(list);

        PageInfo<Lawyer> info = new PageInfo<Lawyer>(list);

        Integer total = (int)info.getTotal();

        pageBean.setTotal(total);

        return pageBean;
    }

}
