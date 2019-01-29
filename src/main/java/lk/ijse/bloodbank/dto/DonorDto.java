package lk.ijse.bloodbank.dto;

public class DonorDto {
    private Integer id;
    private String donorName;
    private String bloodGroup;
    private  String sex;
    private  String age;
    private  String address;
    private String date;
    private  String contact;
    private  String email;

    public DonorDto(Integer id, String donorName, String bloodGroup, String sex, String age, String address, String date, String contact, String email) {
        this.id = id;
        this.donorName = donorName;
        this.bloodGroup = bloodGroup;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.date = date;
        this.contact = contact;
        this.email = email;
    }

    public DonorDto() {
    }

    public DonorDto(Integer id, String donorName, String address, String contact, String age, String email, String bloodGroup, String sex) {
        this.id=id;
        this.donorName=donorName;
        this.address=address;
        this.contact=contact;
        this.age=age;
        this.email=email;
        this.bloodGroup=bloodGroup;
        this.sex=sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DonorDto{" +
                "id=" + id +
                ", donorName='" + donorName + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
