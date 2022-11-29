package fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class FruitQuery {

    private final List<SingleBowl> singleBowlList;


    public FruitQuery(List<SingleBowl> singleBowlList) {
        this.singleBowlList = singleBowlList;
    }

    MultiLayerBowl multiLayerBowl = new MultiLayerBowl();
    public void findFruitsByColor() {
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getColor() == "Red") {
                multiLayerBowl.firstLayer(singleBowl.getFruit());
            } else if (singleBowl.getColor() == "Green") {
                multiLayerBowl.secondLayer(singleBowl.getFruit());
            } else {
                multiLayerBowl.thirdLayer(singleBowl.getFruit());
            }
        }
    }

    public void findFruitsByType() {
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getType() == "Sweet") {
                multiLayerBowl.firstLayer(singleBowl.getFruit());
            } else if (singleBowl.getType() == "Sour") {
                multiLayerBowl.secondLayer(singleBowl.getFruit());
            } else {
                multiLayerBowl.thirdLayer(singleBowl.getFruit());
            }
        }
    }

    public void findFruitsBySize() {
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getSize() == "Large") {
                multiLayerBowl.firstLayer(singleBowl.getFruit());
            } else if (singleBowl.getSize() == "Medium") {
                multiLayerBowl.secondLayer(singleBowl.getFruit());
            } else {
                multiLayerBowl.thirdLayer(singleBowl.getFruit());
            }
        }
    }


}
