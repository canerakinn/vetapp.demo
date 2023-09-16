package canerakin.vetapp.demo.business.models.responses;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetByIdAnimalTypeResponse {

    private int Id;

    private String Name;
}
