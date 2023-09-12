package canerakin.vetapp.demo.business.models.responses;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class GetAllAnimalResponse {


    private int Id;


    private int passportId;

    private String animalBreed;


    private String animalName;


    private int animalAge;


    private int animalSerialNo;


    private String animalDescription;
}
