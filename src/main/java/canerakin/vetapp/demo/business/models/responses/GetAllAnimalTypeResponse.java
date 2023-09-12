package canerakin.vetapp.demo.business.models.responses;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetAllAnimalTypeResponse {

    private int typeId;

    private String typeName;
}
