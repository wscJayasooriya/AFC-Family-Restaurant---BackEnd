package lk.ijse.spring.admin.entity;

import javax.persistence.*;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mealCode;
    private String mealName;
    private String desription;
    private Double price;
    private String category;
    private String imageURL;

    public Meal() {
    }

    public Meal(int mealCode,String mealName, String desription, Double price, String category,String imageURL) {
        this.setMealCode(mealCode);
        this.setMealName(mealName);
        this.setDesription(desription);
        this.setPrice(price);
        this.setCategory(category);
        this.setImageURL(imageURL);
    }

    public Meal(String mealName, String desription, Double price, Double largePrice, String category) {
        this.mealName = mealName;
        this.desription = desription;
        this.price = price;
        this.category = category;
        this.setImageURL(imageURL);
    }

    public int getMealCode() {
        return mealCode;
    }

    public void setMealCode(int mealCode) {
        this.mealCode = mealCode;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealCode=" + mealCode +
                ", mealName='" + mealName + '\'' +
                ", desription='" + desription + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
