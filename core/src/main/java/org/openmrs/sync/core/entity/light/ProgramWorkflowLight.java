package org.openmrs.sync.core.entity.light;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "program_workflow")
@AttributeOverride(name = "id", column = @Column(name = "program_workflow_id"))
public class ProgramWorkflowLight extends LightEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "program_id")
    private ProgramLight program;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "concept_id")
    private ConceptLight concept;
}