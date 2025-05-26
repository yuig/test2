package pk;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class u0 {
    public static int d(int i13, int i14) {
        if (i14 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i14 <= i13) {
            return i13;
        }
        int i15 = i13 + (i13 >> 1) + 1;
        if (i15 < i14) {
            i15 = Integer.highestOneBit(i14 - 1) << 1;
        }
        if (i15 < 0) {
            return Integer.MAX_VALUE;
        }
        return i15;
    }

    public abstract u0 a(Object obj);

    public void b(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void c(c1 c1Var) {
        b(c1Var);
    }
}
