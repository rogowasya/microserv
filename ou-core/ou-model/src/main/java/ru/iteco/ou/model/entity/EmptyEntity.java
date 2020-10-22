package ru.iteco.ou.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 06.03.19.
 */


/*
 * Для корректного отображения геттеров и сеттеров
 * необходимо в IDE установить плагин "Lombok Plugin"
 */
@Getter
@Setter
@MappedSuperclass
public abstract class EmptyEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
