import java.util.ArrayList;

class ObStack<T> extends ArrayList<T> {

  private static final long serialVersionUID = 1L;

  final T pop() {
    final int last = this.size() - 1;
    return this.remove(last);
  }

  final void push(final T O) {
    add(O);
  }

  final T peek() {
    return get(this.size() - 1);
  }

  @Override
  public String toString() {
      String s = "{";
      boolean first = true;
      for (T o: this) {
          if (!first)
             s += ",";
          first = false;
          s += o.toString();
      }
      return s + "}";
  }
}
