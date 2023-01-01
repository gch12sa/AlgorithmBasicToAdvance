package solid_principles.dependency_inversion;

public class MacBook {
    private final WiredKeyboard wiredKeyboard;
    private  final WiredMouse wiredMouse;

    public MacBook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}
