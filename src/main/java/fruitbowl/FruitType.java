package fruitbowl;

import java.util.List;

public class FruitType {

    private final List<SingleBowl> singleBowlList;

    public FruitType(List<SingleBowl> singleBowlList) {
        this.singleBowlList = singleBowlList;
    }

    MultiLayerBowl multiLayerBowl = new MultiLayerBowl();

    public void typeInFirstLayer(){
        multiLayerBowl.printFirstLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getType() == "Sweet") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }

    public void typeInSecondLayer(){
        multiLayerBowl.printSecondLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getType() == "Normal") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }

    public void typeInThirdLayer(){
        multiLayerBowl.printThirdLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getType() == "Sour") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }
}