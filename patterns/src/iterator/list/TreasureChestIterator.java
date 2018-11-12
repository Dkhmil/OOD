package iterator.list;

import iterator.Iterator;

import java.util.List;

public class TreasureChestIterator implements Iterator<Item> {

    private TreasureChest chest;
    private int index;

    public TreasureChestIterator(TreasureChest chest, ItemType type) {
        this.chest = chest;
        this.index = -1;
        this.type = type;
    }

    private ItemType type;

    @Override
    public boolean hasNext() {
        return findNextIndex() != -1;
    }

    @Override
    public Item next() {
        index = findNextIndex();
        if (index != -1) {
            return chest.getItems().get(index);
        }
        return null;
    }

    private int findNextIndex() {
        List<Item> items = chest.getItems();
        boolean found = false;
        int tempIndex = index;
        while (!found) {
            tempIndex++;
            if (tempIndex >= items.size()) {
                return -1;
            }
            if (type.equals(ItemType.ANY) || items.get(tempIndex).getItemType().equals(type)) {
                break;
            }
        }
        return index;
    }
}
