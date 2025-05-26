package kotlin.collections;

import a.cb;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class w {
    public static int a(Object[] objArr) {
        return Arrays.deepHashCode(objArr);
    }

    public static final void b(int i13, int i14) {
        if (i13 > i14) {
            throw new IndexOutOfBoundsException(cb.j("toIndex (", i13, ") is greater than size (", i14, ")."));
        }
    }
}
