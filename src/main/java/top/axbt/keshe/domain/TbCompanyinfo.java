package top.axbt.keshe.domain;

public class TbCompanyinfo {
    private Integer id;

    private String name;

    private String address;

    private String nature;

    private String type;

    private String publisher;

    private String depart;

    private String phone;

    private String info;

    private String major;

    private String education;

    private String peopleNums;

    private String jobWay;

    private String jobInfo;

    private String publishIs;

    private String validity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getPeopleNums() {
        return peopleNums;
    }

    public void setPeopleNums(String peopleNums) {
        this.peopleNums = peopleNums == null ? null : peopleNums.trim();
    }

    public String getJobWay() {
        return jobWay;
    }

    public void setJobWay(String jobWay) {
        this.jobWay = jobWay == null ? null : jobWay.trim();
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo == null ? null : jobInfo.trim();
    }

    public String getPublishIs() {
        return publishIs;
    }

    public void setPublishIs(String publishIs) {
        this.publishIs = publishIs == null ? null : publishIs.trim();
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity == null ? null : validity.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbCompanyinfo other = (TbCompanyinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getNature() == null ? other.getNature() == null : this.getNature().equals(other.getNature()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getDepart() == null ? other.getDepart() == null : this.getDepart().equals(other.getDepart()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getPeopleNums() == null ? other.getPeopleNums() == null : this.getPeopleNums().equals(other.getPeopleNums()))
            && (this.getJobWay() == null ? other.getJobWay() == null : this.getJobWay().equals(other.getJobWay()))
            && (this.getJobInfo() == null ? other.getJobInfo() == null : this.getJobInfo().equals(other.getJobInfo()))
            && (this.getPublishIs() == null ? other.getPublishIs() == null : this.getPublishIs().equals(other.getPublishIs()))
            && (this.getValidity() == null ? other.getValidity() == null : this.getValidity().equals(other.getValidity()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getNature() == null) ? 0 : getNature().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        result = prime * result + ((getDepart() == null) ? 0 : getDepart().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getPeopleNums() == null) ? 0 : getPeopleNums().hashCode());
        result = prime * result + ((getJobWay() == null) ? 0 : getJobWay().hashCode());
        result = prime * result + ((getJobInfo() == null) ? 0 : getJobInfo().hashCode());
        result = prime * result + ((getPublishIs() == null) ? 0 : getPublishIs().hashCode());
        result = prime * result + ((getValidity() == null) ? 0 : getValidity().hashCode());
        return result;
    }
}