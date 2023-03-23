package mn.openapi.subprojects.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import mn.openapi.subprojects.domain.Pet
import mn.openapi.subprojects.model.GetPetResponse

@Controller("/pet")
class PetController {


    @Get("/")
    @Operation(
            operationId = 'GetPet',
            summary = 'Get a pet',
            responses = [
                    @ApiResponse(responseCode = '200', description = 'OK', content = @Content(schema = @Schema(implementation = GetPetResponse))),
            ]
    )
    HttpResponse<GetPetResponse> getPet() {
        Pet pet = new Pet(id: 1L, name: "Rex", age: 10)

        return HttpResponse.ok(new GetPetResponse(pet: pet))
    }

}
