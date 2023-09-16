package canerakin.vetapp.demo.business.models.responses;


import jakarta.persistence.Column;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class GetAllAnimalTypeResponse {

    private int Id;

    private String Name;
}
