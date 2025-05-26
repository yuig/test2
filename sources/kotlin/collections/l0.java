package kotlin.collections;

import java.util.List;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public class l0 extends k0 {
    public static final int D(int i13, List list) {
        if (new IntRange(0, f0.i(list), 1).f(i13)) {
            return f0.i(list) - i13;
        }
        StringBuilder s13 = a.a.s("Element index ", i13, " must be in range [");
        s13.append(new IntRange(0, f0.i(list), 1));
        s13.append("].");
        throw new IndexOutOfBoundsException(s13.toString());
    }

    public static final int E(int i13, List list) {
        if (new IntRange(0, list.size(), 1).f(i13)) {
            return list.size() - i13;
        }
        StringBuilder s13 = a.a.s("Position index ", i13, " must be in range [");
        s13.append(new IntRange(0, list.size(), 1));
        s13.append("].");
        throw new IndexOutOfBoundsException(s13.toString());
    }
}
