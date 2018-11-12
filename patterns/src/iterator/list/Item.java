package iterator.list;

public class Item {
    public ItemType getItemType() {
        return itemType;
    }

    public final void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    private ItemType itemType;

    public Item(ItemType itemType, String name) {
        this.setItemType(itemType);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    private String name;

}
