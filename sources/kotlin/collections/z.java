package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class z extends x {
    public static List d(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(asList, "asList(...)");
        return asList;
    }

    public static y e(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new y(iArr);
    }

    public static void f(int i13, int i14, int i15, byte[] bArr, byte[] destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i14, destination, i13, i15 - i14);
    }

    public static void g(int i13, int i14, int i15, int[] iArr, int[] destination) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i14, destination, i13, i15 - i14);
    }

    public static void h(int i13, int i14, int i15, Object[] objArr, Object[] destination) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i14, destination, i13, i15 - i14);
    }

    public static void i(char[] cArr, char[] destination, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i14, destination, i13, i15 - i14);
    }

    public static /* synthetic */ void j(byte[] bArr, byte[] bArr2, int i13, int i14, int i15) {
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = bArr.length;
        }
        f(0, i13, i14, bArr, bArr2);
    }

    public static /* synthetic */ void k(int[] iArr, int[] iArr2, int i13, int i14, int i15) {
        if ((i15 & 2) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = iArr.length;
        }
        g(i13, 0, i14, iArr, iArr2);
    }

    public static /* synthetic */ void l(Object[] objArr, Object[] objArr2, int i13, int i14, int i15) {
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = objArr.length;
        }
        h(0, i13, i14, objArr, objArr2);
    }

    public static byte[] m(byte[] bArr, int i13, int i14) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        w.b(i14, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13, i14);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] n(int i13, int i14, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        w.b(i14, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i13, i14);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void o(int i13, int i14, fi.b bVar, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i13, i14, bVar);
    }

    public static void p(int[] iArr, int i13) {
        int length = iArr.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i13);
    }

    public static void q(long[] jArr) {
        int length = jArr.length;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static byte[] s(byte[] bArr, byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.f(copyOf);
        return copyOf;
    }

    public static Object[] t(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    public static void u(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }
}
