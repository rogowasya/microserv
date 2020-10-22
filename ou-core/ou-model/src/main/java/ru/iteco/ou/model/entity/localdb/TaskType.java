package ru.iteco.ou.model.entity.localdb;

import lombok.Getter;
import lombok.Setter;
import ru.iteco.ou.model.entity.EmptyEntity;

import javax.persistence.Entity;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 06.03.19.
 */

@Setter
@Getter
@Entity
public class TaskType extends EmptyEntity {
    private String typeName;
}
