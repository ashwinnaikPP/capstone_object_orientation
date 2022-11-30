package fruitbowl;

import java.util.List;

public class FruitSize {
    private List<SingleBowl> singleBowlList;

    public FruitSize(List<SingleBowl> singleBowlList) {
        this.singleBowlList = singleBowlList;
    }

    MultiLayerBowl multiLayerBowl = new MultiLayerBowl();

    public void sizeInFirstLayer(){
        multiLayerBowl.printFirstLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getSize() == "Large") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }

    public void sizeInSecondLayer(){
        multiLayerBowl.printSecondLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getSize() == "Medium") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }

    public void sizeInThirdLayer(){
        multiLayerBowl.printThirdLayer();
        for (SingleBowl singleBowl : singleBowlList) {
            if (singleBowl.getSize() == "Small") {
                multiLayerBowl.multiLayer(singleBowl.getFruit());
            }
        }
    }
}
