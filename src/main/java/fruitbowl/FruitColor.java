package fruitbowl;

import java.util.List;

public class FruitColor {
    private final List<SingleBowl> singleBowlList;

    public FruitColor(List<SingleBowl> singleBowlList) {
        this.singleBowlList = singleBowlList;
    }

    MultiLayerBowl multiLayerBowl = new MultiLayerBowl();

    public void colorInFirstLayer(){
        multiLayerBowl.printFirstLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getColor() == "Red") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }

    public void colorInSecondLayer(){
        multiLayerBowl.printSecondLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getColor() == "Green") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }

    public void colorInThirdLayer(){
        multiLayerBowl.printThirdLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getColor() != "Red" && singleBowl.getColor() != "Green") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }
}
