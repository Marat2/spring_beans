package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("catAnimal")
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
