package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long incredientId);

    // IngredientCommand saveIngredientCommand(IngredientCommand command);

    // void deleteById(Long recipeId, Long idToDelete);


}
