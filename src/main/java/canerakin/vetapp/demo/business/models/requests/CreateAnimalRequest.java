package canerakin.vetapp.demo.business.models.requests;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateAnimalRequest {


    @NotNull
    @NotBlank
    private int passportId;

    private String animalBreed;

    @Size(max = 30)
    private String animalName;

    @NotNull
    @NotBlank
    private int animalAge;

    @NotNull
    @NotBlank
    private int animalSerialNo;


    private String animalDescription;

    @NotNull
    @NotBlank
    private int animalTypeId;


}
