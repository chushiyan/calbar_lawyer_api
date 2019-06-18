package site.chushiyan.lawyer.pojo;

import java.io.Serializable;
import java.util.List;

public class PageBean implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private Integer total;
    private List<Lawyer> list;


    public PageBean() {
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Lawyer> getList() {
        return list;
    }

    public void setList(List<Lawyer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", list=" + list +
                '}';
    }
}
