package gcewing.sg.features.pdd;

public class AddressDataEntry {

    private final String name;
    private final boolean locked;
    private final boolean autoClose;

    public AddressDataEntry(String name, boolean locked, boolean autoClose) {
        this.name = name;
        this.locked = locked;
        this.autoClose = autoClose;
    }

    public String getName() {
        return name;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isAutoClose() {
        return autoClose;
    }
}
