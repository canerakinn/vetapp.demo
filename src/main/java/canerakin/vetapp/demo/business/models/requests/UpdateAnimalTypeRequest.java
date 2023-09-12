package canerakin.vetapp.demo.business.models.requests;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateAnimalTypeRequest {

    private int id;   //id update içerisinde olmalı "olmaz ise yeni bir tane ekler yani add gibi"
    private String typeName;
}
