package guru.springframework.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //No cascading with one-to-one.  If we delete a note, we don't want to delete the recipe.
    private Recipe recipe;

    @Lob //Binary Object Field
    private String recipeNotes;


}
