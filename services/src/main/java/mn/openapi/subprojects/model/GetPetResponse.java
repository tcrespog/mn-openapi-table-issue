package mn.openapi.subprojects.model;

import mn.openapi.subprojects.domain.Pet;

public class GetPetResponse {

    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
