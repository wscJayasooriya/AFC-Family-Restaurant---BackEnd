package lk.ijse.spring.admin.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetails_PK implements Serializable {
    private int mealCode;
    private int o_ID;

    public OrderDetails_PK() {
    }

    public OrderDetails_PK(int mealCode, int o_ID) {
        this.mealCode = mealCode;
        this.o_ID = o_ID;
    }
}
