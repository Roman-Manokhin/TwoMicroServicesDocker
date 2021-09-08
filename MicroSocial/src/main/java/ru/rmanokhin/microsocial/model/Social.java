package ru.rmanokhin.microsocial.model;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private Long count;
    @NonNull
    private Long gameItemId;

    public void increment(){
        count++;
    }

}
