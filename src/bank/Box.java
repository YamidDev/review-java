package bank;

public class Box<T> {
    T element;
    Box(T element) {
        this.element = element;
    }

    T getObject () {
        return element;
    }

    <V> boolean isContentPartOfClass(V otherObject) {
        return element.getClass() == otherObject.getClass();
    }
}
