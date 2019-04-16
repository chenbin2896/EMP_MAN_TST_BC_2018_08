package top.axbt.keshe.domain;

import java.util.Date;

public class TbGraduateinfo {
    private Integer id;

    private String name;

    private String age;

    private String sex;

    private Date birth;

    private String nation;

    private String politicStatus;

    private String major;

    private String depart;

    private String educationBack;

    private String educationLength;

    private String traiiningMode;

    private String origin;

    private Date graduationTime;

    private String jobIntension;

    private String languages;

    private String languaageLevel;

    private String computerLevel;

    private String post;

    private String phone;

    private String email;

    private String address;

    private String experience;

    private String message;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getPoliticStatus() {
        return politicStatus;
    }

    public void setPoliticStatus(String politicStatus) {
        this.politicStatus = politicStatus == null ? null : politicStatus.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart == null ? null : depart.trim();
    }

    public String getEducationBack() {
        return educationBack;
    }

    public void setEducationBack(String educationBack) {
        this.educationBack = educationBack == null ? null : educationBack.trim();
    }

    public String getEducationLength() {
        return educationLength;
    }

    public void setEducationLength(String educationLength) {
        this.educationLength = educationLength == null ? null : educationLength.trim();
    }

    public String getTraiiningMode() {
        return traiiningMode;
    }

    public void setTraiiningMode(String traiiningMode) {
        this.traiiningMode = traiiningMode == null ? null : traiiningMode.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getJobIntension() {
        return jobIntension;
    }

    public void setJobIntension(String jobIntension) {
        this.jobIntension = jobIntension == null ? null : jobIntension.trim();
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages == null ? null : languages.trim();
    }

    public String getLanguaageLevel() {
        return languaageLevel;
    }

    public void setLanguaageLevel(String languaageLevel) {
        this.languaageLevel = languaageLevel == null ? null : languaageLevel.trim();
    }

    public String getComputerLevel() {
        return computerLevel;
    }

    public void setComputerLevel(String computerLevel) {
        this.computerLevel = computerLevel == null ? null : computerLevel.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
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
        TbGraduateinfo other = (TbGraduateinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getPoliticStatus() == null ? other.getPoliticStatus() == null : this.getPoliticStatus().equals(other.getPoliticStatus()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getDepart() == null ? other.getDepart() == null : this.getDepart().equals(other.getDepart()))
            && (this.getEducationBack() == null ? other.getEducationBack() == null : this.getEducationBack().equals(other.getEducationBack()))
            && (this.getEducationLength() == null ? other.getEducationLength() == null : this.getEducationLength().equals(other.getEducationLength()))
            && (this.getTraiiningMode() == null ? other.getTraiiningMode() == null : this.getTraiiningMode().equals(other.getTraiiningMode()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getGraduationTime() == null ? other.getGraduationTime() == null : this.getGraduationTime().equals(other.getGraduationTime()))
            && (this.getJobIntension() == null ? other.getJobIntension() == null : this.getJobIntension().equals(other.getJobIntension()))
            && (this.getLanguages() == null ? other.getLanguages() == null : this.getLanguages().equals(other.getLanguages()))
            && (this.getLanguaageLevel() == null ? other.getLanguaageLevel() == null : this.getLanguaageLevel().equals(other.getLanguaageLevel()))
            && (this.getComputerLevel() == null ? other.getComputerLevel() == null : this.getComputerLevel().equals(other.getComputerLevel()))
            && (this.getPost() == null ? other.getPost() == null : this.getPost().equals(other.getPost()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getExperience() == null ? other.getExperience() == null : this.getExperience().equals(other.getExperience()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getPoliticStatus() == null) ? 0 : getPoliticStatus().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getDepart() == null) ? 0 : getDepart().hashCode());
        result = prime * result + ((getEducationBack() == null) ? 0 : getEducationBack().hashCode());
        result = prime * result + ((getEducationLength() == null) ? 0 : getEducationLength().hashCode());
        result = prime * result + ((getTraiiningMode() == null) ? 0 : getTraiiningMode().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getGraduationTime() == null) ? 0 : getGraduationTime().hashCode());
        result = prime * result + ((getJobIntension() == null) ? 0 : getJobIntension().hashCode());
        result = prime * result + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        result = prime * result + ((getLanguaageLevel() == null) ? 0 : getLanguaageLevel().hashCode());
        result = prime * result + ((getComputerLevel() == null) ? 0 : getComputerLevel().hashCode());
        result = prime * result + ((getPost() == null) ? 0 : getPost().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getExperience() == null) ? 0 : getExperience().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return result;
    }
}