import java.util.Arrays;

/**
 * representation of a clause
 */
class Clause {
  Clause(final int len, final int[] hgs, final int base, final int neck, final int[] xs) {
    this.hgs = hgs; // head+goals pointing to cells in cs
    this.base = base; // heap where this starts
    this.len = len; // length of heap slice
    this.neck = neck; // first after the end of the head
    this.xs = xs; // indexables in head
  }

  final int len;
  final int[] hgs;
  final int base;
  final int neck;
  final int[] xs;
  
  @Override
  public String toString() {
      return "Clause {" + "len:" + len + ", hgs:" + Arrays.toString(hgs) + ", base:" + base + ", neck:" + neck + ", xs:" + Arrays.toString(xs) + "}";
  }
}
