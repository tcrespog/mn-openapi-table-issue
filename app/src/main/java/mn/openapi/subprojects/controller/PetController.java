package mn.openapi.subprojects.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import mn.openapi.subprojects.domain.Pet;
import mn.openapi.subprojects.model.GetPetResponse;

@Controller("/pet")
public class PetController {

    @Get("/")
    @Operation(
            operationId = "GetPet",
            summary = "Get a pet",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = GetPetResponse.class)))
            }
    )
    public HttpResponse<GetPetResponse> getPet() {
        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("Rex");
        pet.setAge(10);

        GetPetResponse response = new GetPetResponse();
        response.setPet(pet);

        return HttpResponse.ok(response);
    }

}
