package z32;

/* loaded from: classes4.dex */
public final class b3 {
    public static d3 a(int i13) {
        if (i13 == 0) {
            return d3.DEFAULT;
        }
        if (i13 == 1) {
            return d3.SEQUENTIAL;
        }
        if (i13 == 2) {
            return d3.FIRST_VISIBLE;
        }
        if (i13 != 3) {
            return null;
        }
        return d3.ALL_VISIBLE;
    }
}
