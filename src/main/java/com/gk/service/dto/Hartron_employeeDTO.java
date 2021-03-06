package com.gk.service.dto;


import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the Hartron_employee entity.
 */
public class Hartron_employeeDTO implements Serializable {

    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Hartron_employeeDTO hartron_employeeDTO = (Hartron_employeeDTO) o;
        if(hartron_employeeDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), hartron_employeeDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Hartron_employeeDTO{" +
            "id=" + getId() +
            "}";
    }
}
