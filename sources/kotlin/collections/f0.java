package kotlin.collections;

import a.cb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public class f0 extends e0 {
    public static ArrayList d(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new t(elements, true));
    }

    public static int e(int i13, int i14, List list, Function1 comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        n(list.size(), i13, i14);
        int i15 = i14 - 1;
        while (i13 <= i15) {
            int i16 = (i13 + i15) >>> 1;
            int intValue = ((Number) comparison.invoke(list.get(i16))).intValue();
            if (intValue < 0) {
                i13 = i16 + 1;
            } else {
                if (intValue <= 0) {
                    return i16;
                }
                i15 = i16 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static int f(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int i13 = 0;
        n(arrayList.size(), 0, size);
        int i14 = size - 1;
        while (i13 <= i14) {
            int i15 = (i13 + i14) >>> 1;
            int b13 = al2.a.b((Comparable) arrayList.get(i15), comparable);
            if (b13 < 0) {
                i13 = i15 + 1;
            } else {
                if (b13 <= 0) {
                    return i15;
                }
                i14 = i15 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static q0 g() {
        return q0.f80391a;
    }

    public static IntRange h(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int i(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List j(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? z.d(elements) : q0.f80391a;
    }

    public static List k(Object obj) {
        return obj != null ? e0.b(obj) : q0.f80391a;
    }

    public static ArrayList l(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new t(elements, true));
    }

    public static final List m(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : e0.b(list.get(0)) : q0.f80391a;
    }

    public static final void n(int i13, int i14, int i15) {
        if (i14 > i15) {
            throw new IllegalArgumentException(cb.j("fromIndex (", i14, ") is greater than toIndex (", i15, ")."));
        }
        if (i14 < 0) {
            throw new IndexOutOfBoundsException(a.a.e("fromIndex (", i14, ") is less than zero."));
        }
        if (i15 > i13) {
            throw new IndexOutOfBoundsException(cb.j("toIndex (", i15, ") is greater than size (", i13, ")."));
        }
    }

    public static void o() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void p() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
