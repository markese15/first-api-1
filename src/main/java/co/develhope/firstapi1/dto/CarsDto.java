package co.develhope.firstapi1.dto;

import javax.validation.constraints.NotBlank;

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
}
