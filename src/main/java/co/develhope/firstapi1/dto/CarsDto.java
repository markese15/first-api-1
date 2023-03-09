package co.develhope.firstapi1.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CarsDto {
@NotBlank(message = "mandatory")
    String modelName;
    @NotBlank(message = "mandatory")
    String id;
    double price;

    public CarsDto(String modelName, String id, double price) {
        this.modelName = modelName;
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarsDto{" +
                "modelName='" + modelName + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
