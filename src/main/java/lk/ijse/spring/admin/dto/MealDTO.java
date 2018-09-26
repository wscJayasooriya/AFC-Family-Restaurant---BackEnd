package lk.ijse.spring.admin.dto;

public class MealDTO {

    private int mealCode;
    private String mealName;
    private String desription;
    private Double smallPrice;
    private Double largePrice;
    private String category;
    private String imageURL;

    public MealDTO() {
    }

    public MealDTO(int mealCode, String mealName, String desription, Double smallPrice, Double largePrice, String category,String imageURL) {
        this.setMealCode(mealCode);
        this.setMealName(mealName);
        this.setDesription(desription);
        this.setSmallPrice(smallPrice);
        this.setLargePrice(largePrice);
        this.setCategory(category);
        this.setImageURL(imageURL);
    }

    public MealDTO(String mealName, String desription, Double smallPrice, Double largePrice, String category,String imageURL) {
        this.mealName = mealName;
        this.desription = desription;
        this.smallPrice = smallPrice;
        this.largePrice = largePrice;
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

    public Double getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(Double smallPrice) {
        this.smallPrice = smallPrice;
    }

    public Double getLargePrice() {
        return largePrice;
    }

    public void setLargePrice(Double largePrice) {
        this.largePrice = largePrice;
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
        return "MealDTO{" +
                "mealCode=" + mealCode +
                ", mealName='" + mealName + '\'' +
                ", desription='" + desription + '\'' +
                ", smallPrice=" + smallPrice +
                ", largePrice=" + largePrice +
                ", category='" + category + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
