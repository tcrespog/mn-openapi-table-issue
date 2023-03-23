package mn.openapi.subprojects.domain

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.Size

import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@Table(name = 'petstore_pet')
class Pet {

    @Id
    Long id

    @Size(max = 100)
    String name

    @JsonIgnore
    Integer age
}
