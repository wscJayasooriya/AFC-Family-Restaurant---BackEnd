package lk.ijse.spring.admin.dto;

public class OrderDetails_PKDTO {

    private int mealCode;
    private int o_ID;

    public OrderDetails_PKDTO() {
    }

    public OrderDetails_PKDTO(int mealCode, int o_ID) {
        this.mealCode = mealCode;
        this.o_ID = o_ID;
    }
}
