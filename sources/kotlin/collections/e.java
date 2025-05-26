package kotlin.collections;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class e {
    public e(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i13, int i14, int i15) {
        if (i13 < 0 || i14 > i15) {
            StringBuilder t13 = a.a.t("startIndex: ", i13, ", endIndex: ", i14, ", size: ");
            t13.append(i15);
            throw new IndexOutOfBoundsException(t13.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(a.a.f("startIndex: ", i13, " > endIndex: ", i14));
        }
    }

    public static void b(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException(a.a.f("index: ", i13, ", size: ", i14));
        }
    }

    public static void c(int i13, int i14) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(a.a.f("index: ", i13, ", size: ", i14));
        }
    }

    public static void d(int i13, int i14, int i15) {
        if (i13 < 0 || i14 > i15) {
            StringBuilder t13 = a.a.t("fromIndex: ", i13, ", toIndex: ", i14, ", size: ");
            t13.append(i15);
            throw new IndexOutOfBoundsException(t13.toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(a.a.f("fromIndex: ", i13, " > toIndex: ", i14));
        }
    }

    public static int e(int i13, int i14) {
        int i15 = i13 + (i13 >> 1);
        if (i15 - i14 < 0) {
            i15 = i14;
        }
        return i15 - 2147483639 > 0 ? i14 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i15;
    }
}
