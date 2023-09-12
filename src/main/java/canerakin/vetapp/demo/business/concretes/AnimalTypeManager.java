package canerakin.vetapp.demo.business.concretes;

import canerakin.vetapp.demo.business.abstracts.AnimalTypeService;
import canerakin.vetapp.demo.business.core.utilities.mappers.ModelMapperService;
import canerakin.vetapp.demo.business.models.requests.CreateAnimalTypeRequest;
import canerakin.vetapp.demo.business.models.requests.UpdateAnimalTypeRequest;
import canerakin.vetapp.demo.business.models.responses.GetAllAnimalTypeResponse;
import canerakin.vetapp.demo.business.models.responses.GetByIdAnimalTypeResponse;
import canerakin.vetapp.demo.dataAccess.abstracts.AnimalTypeRepository;
import canerakin.vetapp.demo.entities.concretes.AnimalType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Configuration
@AllArgsConstructor

public class AnimalTypeManager implements AnimalTypeService {
    @Autowired
    public ModelMapperService modelMapperService;
    @Autowired
    private AnimalTypeRepository animalTypeRepository;



    @Autowired
    private AnimalTypeManager(ModelMapperService modelMapperService) {
        this.modelMapperService = modelMapperService;

    }

    @Autowired

    public AnimalTypeManager(AnimalTypeRepository animalTypeRepository) {
        this.animalTypeRepository = animalTypeRepository;
    }


    @Override
    public List<GetAllAnimalTypeResponse> getAll() {

        List<AnimalType> animalTypes = animalTypeRepository.findAll();
//        List<AnimalTypeResponse> animalTypeResponse = new ArrayList<>();
////
////        for (AnimalType animalType : animalTypes ){
////            AnimalTypeResponse animalTypeItem = new AnimalTypeResponse();
////            animalTypeItem.setTypeId(animalType.getTypeId());
////            animalTypeItem.setTypeName(animalType.getTypeName());
////            animalTypeResponse.add(animalTypeItem);
////        }

        List<GetAllAnimalTypeResponse> animalTypeResponse = animalTypes.stream()
                .map(animalType -> this.modelMapperService.forResponse().map(animalType, GetAllAnimalTypeResponse.class)).collect(Collectors.toList());
        return animalTypeResponse;

    }

    @Override
    public void add(CreateAnimalTypeRequest createAnimalTypeRequest) {
//        Buraya if ile aynı id var ise hata vermesini sağla!
//        AnimalType animalType = new AnimalType();
//        animalType.setTypeName(createAnimalTypeRequest.getTypeName());
//        this.animalTypeRepository.save(animalType);
//        return animalType;

        AnimalType animalType = this.modelMapperService.forRequest().map(createAnimalTypeRequest, AnimalType.class);
        this.animalTypeRepository.save(animalType);


    }

    @Override
    public void update(UpdateAnimalTypeRequest updateAnimalTypeRequest) {
        AnimalType animalType = this.modelMapperService.forRequest().map(updateAnimalTypeRequest, AnimalType.class);
        this.animalTypeRepository.save(animalType);
    }

    @Override
    public void delete(int id) {

        this.animalTypeRepository.deleteById(id);

    }

    @Override
    public GetByIdAnimalTypeResponse getById(int id) {

//        GetByIdAnimalTypeResponse response = new GetByIdAnimalTypeResponse();
//        var animalType = this.animalTypeRepository.findById(id);
        AnimalType animalType = this.animalTypeRepository.findById(id).orElseThrow();

        GetByIdAnimalTypeResponse response = modelMapperService.forResponse().map(animalType, GetByIdAnimalTypeResponse.class);
        return response;

//        AnimalTypeResponse response = new AnimalTypeResponse();
//
//       // //optional için kullanılabilecek; orElseThrow()
//        var animalType = this.animalTypeRepository.findById(id); Farklı bir yöntem biz orElseTheowu kullandık.
//        if (animalType.isEmpty()) {
//            response.setErrorMessage("Hayvan tipi sistemde bulunmamaktadır.");
//        } else {
//// //       response.setTypeId(animalType.get().getTypeId());
////   //     response.setTypeName(animalType.get().getTypeName());}
//            response = modelMapperService.forResponse().map(animalType, AnimalTypeResponse.class);
//
//
//
//        }
//        return response;

    };
}
