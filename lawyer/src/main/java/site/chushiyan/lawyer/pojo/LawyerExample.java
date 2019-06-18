package site.chushiyan.lawyer.pojo;

import java.util.ArrayList;
import java.util.List;

public class LawyerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawyerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusIsNull() {
            addCriterion("license_status is null");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusIsNotNull() {
            addCriterion("license_status is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusEqualTo(String value) {
            addCriterion("license_status =", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusNotEqualTo(String value) {
            addCriterion("license_status <>", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusGreaterThan(String value) {
            addCriterion("license_status >", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("license_status >=", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusLessThan(String value) {
            addCriterion("license_status <", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusLessThanOrEqualTo(String value) {
            addCriterion("license_status <=", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusLike(String value) {
            addCriterion("license_status like", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusNotLike(String value) {
            addCriterion("license_status not like", value, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusIn(List<String> values) {
            addCriterion("license_status in", values, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusNotIn(List<String> values) {
            addCriterion("license_status not in", values, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusBetween(String value1, String value2) {
            addCriterion("license_status between", value1, value2, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andLicenseStatusNotBetween(String value1, String value2) {
            addCriterion("license_status not between", value1, value2, "licenseStatus");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIsNull() {
            addCriterion("admission_date is null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIsNotNull() {
            addCriterion("admission_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateEqualTo(String value) {
            addCriterion("admission_date =", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotEqualTo(String value) {
            addCriterion("admission_date <>", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateGreaterThan(String value) {
            addCriterion("admission_date >", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateGreaterThanOrEqualTo(String value) {
            addCriterion("admission_date >=", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateLessThan(String value) {
            addCriterion("admission_date <", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateLessThanOrEqualTo(String value) {
            addCriterion("admission_date <=", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateLike(String value) {
            addCriterion("admission_date like", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotLike(String value) {
            addCriterion("admission_date not like", value, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateIn(List<String> values) {
            addCriterion("admission_date in", values, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotIn(List<String> values) {
            addCriterion("admission_date not in", values, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateBetween(String value1, String value2) {
            addCriterion("admission_date between", value1, value2, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAdmissionDateNotBetween(String value1, String value2) {
            addCriterion("admission_date not between", value1, value2, "admissionDate");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIsNull() {
            addCriterion("fax_number is null");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIsNotNull() {
            addCriterion("fax_number is not null");
            return (Criteria) this;
        }

        public Criteria andFaxNumberEqualTo(String value) {
            addCriterion("fax_number =", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotEqualTo(String value) {
            addCriterion("fax_number <>", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberGreaterThan(String value) {
            addCriterion("fax_number >", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fax_number >=", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLessThan(String value) {
            addCriterion("fax_number <", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLessThanOrEqualTo(String value) {
            addCriterion("fax_number <=", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberLike(String value) {
            addCriterion("fax_number like", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotLike(String value) {
            addCriterion("fax_number not like", value, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberIn(List<String> values) {
            addCriterion("fax_number in", values, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotIn(List<String> values) {
            addCriterion("fax_number not in", values, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberBetween(String value1, String value2) {
            addCriterion("fax_number between", value1, value2, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andFaxNumberNotBetween(String value1, String value2) {
            addCriterion("fax_number not between", value1, value2, "faxNumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLawSchoolIsNull() {
            addCriterion("law_school is null");
            return (Criteria) this;
        }

        public Criteria andLawSchoolIsNotNull() {
            addCriterion("law_school is not null");
            return (Criteria) this;
        }

        public Criteria andLawSchoolEqualTo(String value) {
            addCriterion("law_school =", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolNotEqualTo(String value) {
            addCriterion("law_school <>", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolGreaterThan(String value) {
            addCriterion("law_school >", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("law_school >=", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolLessThan(String value) {
            addCriterion("law_school <", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolLessThanOrEqualTo(String value) {
            addCriterion("law_school <=", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolLike(String value) {
            addCriterion("law_school like", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolNotLike(String value) {
            addCriterion("law_school not like", value, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolIn(List<String> values) {
            addCriterion("law_school in", values, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolNotIn(List<String> values) {
            addCriterion("law_school not in", values, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolBetween(String value1, String value2) {
            addCriterion("law_school between", value1, value2, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andLawSchoolNotBetween(String value1, String value2) {
            addCriterion("law_school not between", value1, value2, "lawSchool");
            return (Criteria) this;
        }

        public Criteria andClaSectionsIsNull() {
            addCriterion("cla_sections is null");
            return (Criteria) this;
        }

        public Criteria andClaSectionsIsNotNull() {
            addCriterion("cla_sections is not null");
            return (Criteria) this;
        }

        public Criteria andClaSectionsEqualTo(String value) {
            addCriterion("cla_sections =", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsNotEqualTo(String value) {
            addCriterion("cla_sections <>", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsGreaterThan(String value) {
            addCriterion("cla_sections >", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsGreaterThanOrEqualTo(String value) {
            addCriterion("cla_sections >=", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsLessThan(String value) {
            addCriterion("cla_sections <", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsLessThanOrEqualTo(String value) {
            addCriterion("cla_sections <=", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsLike(String value) {
            addCriterion("cla_sections like", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsNotLike(String value) {
            addCriterion("cla_sections not like", value, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsIn(List<String> values) {
            addCriterion("cla_sections in", values, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsNotIn(List<String> values) {
            addCriterion("cla_sections not in", values, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsBetween(String value1, String value2) {
            addCriterion("cla_sections between", value1, value2, "claSections");
            return (Criteria) this;
        }

        public Criteria andClaSectionsNotBetween(String value1, String value2) {
            addCriterion("cla_sections not between", value1, value2, "claSections");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyIsNull() {
            addCriterion("certified_legal_specialty is null");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyIsNotNull() {
            addCriterion("certified_legal_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyEqualTo(String value) {
            addCriterion("certified_legal_specialty =", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyNotEqualTo(String value) {
            addCriterion("certified_legal_specialty <>", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyGreaterThan(String value) {
            addCriterion("certified_legal_specialty >", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("certified_legal_specialty >=", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyLessThan(String value) {
            addCriterion("certified_legal_specialty <", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("certified_legal_specialty <=", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyLike(String value) {
            addCriterion("certified_legal_specialty like", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyNotLike(String value) {
            addCriterion("certified_legal_specialty not like", value, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyIn(List<String> values) {
            addCriterion("certified_legal_specialty in", values, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyNotIn(List<String> values) {
            addCriterion("certified_legal_specialty not in", values, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyBetween(String value1, String value2) {
            addCriterion("certified_legal_specialty between", value1, value2, "certifiedLegalSpecialty");
            return (Criteria) this;
        }

        public Criteria andCertifiedLegalSpecialtyNotBetween(String value1, String value2) {
            addCriterion("certified_legal_specialty not between", value1, value2, "certifiedLegalSpecialty");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}