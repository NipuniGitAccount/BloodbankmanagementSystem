package lk.ijse.bloodbank.dto;

public class BloodDto {
    private Integer id;
    private String type;

    public BloodDto(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public BloodDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BloodDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
