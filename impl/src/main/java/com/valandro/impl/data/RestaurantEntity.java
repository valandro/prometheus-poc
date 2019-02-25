package com.valandro.impl.data;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Builder
@Document(collection = "restaurants")
public class RestaurantEntity {
    @Id
    public ObjectId _id;
    public String address;
    @Field("address_line_2")
    public String city;
    @Field("name")
    public String restaurantName;
    @Field("outcode")
    public String outCode;
    @Field("postcode")
    public String postCode;
    public Float rating;
    @Field("type_of_food")
    public String typeFood;
}
