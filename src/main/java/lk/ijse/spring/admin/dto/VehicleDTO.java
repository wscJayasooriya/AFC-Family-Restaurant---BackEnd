package lk.ijse.spring.admin.dto;

public class VehicleDTO {

    private int veh_ID;
    private String veh_Brand;
    private String veh_No;

    public VehicleDTO() {
    }

    public VehicleDTO(int veh_ID, String veh_Brand, String veh_No) {
        this.setVeh_ID(veh_ID);
        this.setVeh_Brand(veh_Brand);
        this.setVeh_No(veh_No);
    }


    public int getVeh_ID() {
        return veh_ID;
    }

    public void setVeh_ID(int veh_ID) {
        this.veh_ID = veh_ID;
    }

    public String getVeh_Brand() {
        return veh_Brand;
    }

    public void setVeh_Brand(String veh_Brand) {
        this.veh_Brand = veh_Brand;
    }

    public String getVeh_No() {
        return veh_No;
    }

    public void setVeh_No(String veh_No) {
        this.veh_No = veh_No;
    }

    @Override
    public String toString() {
        return "VehicleDTO{" +
                "veh_ID=" + veh_ID +
                ", veh_Brand='" + veh_Brand + '\'' +
                ", veh_No='" + veh_No + '\'' +
                '}';
    }
}
