package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public class c0 extends z {
    public static ArrayList A(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object B(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object C(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static IntRange D(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new IntRange(0, iArr.length - 1, 1);
    }

    public static IntRange E(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new IntRange(0, F(objArr), 1);
    }

    public static int F(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Boolean G(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        if (zArr.length - 1 >= 0) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    public static Float H(int i13, float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (i13 >= 0) {
            Intrinsics.checkNotNullParameter(fArr, "<this>");
            if (i13 <= fArr.length - 1) {
                return Float.valueOf(fArr[i13]);
            }
        }
        return null;
    }

    public static Integer I(int[] iArr, int i13) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i13 >= 0) {
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            if (i13 <= iArr.length - 1) {
                return Integer.valueOf(iArr[i13]);
            }
        }
        return null;
    }

    public static Object J(int i13, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i13 < 0 || i13 > F(objArr)) {
            return null;
        }
        return objArr[i13];
    }

    public static int K(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i13 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i13 < length) {
                if (objArr[i13] == null) {
                    return i13;
                }
                i13++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i13 < length2) {
            if (Intrinsics.d(obj, objArr[i13])) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static final void L(Object[] objArr, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i13, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i14 = 0;
        for (Object obj : objArr) {
            i14++;
            if (i14 > 1) {
                buffer.append(separator);
            }
            if (i13 >= 0 && i14 > i13) {
                break;
            }
            kotlin.text.r.a(buffer, obj, function1);
        }
        if (i13 >= 0 && i14 > i13) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }

    public static String M(Object[] objArr, String str, String str2, String str3, int i13, String str4, Function1 function1, int i14) {
        if ((i14 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i14 & 2) != 0 ? "" : str2;
        String postfix = (i14 & 4) != 0 ? "" : str3;
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            str4 = "...";
        }
        String truncated = str4;
        if ((i14 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb3 = new StringBuilder();
        L(objArr, sb3, separator, prefix, postfix, i15, truncated, function1);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static Object N(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr[objArr.length - 1];
    }

    public static Integer O(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i13 = iArr[0];
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ql2.k it = new IntRange(1, iArr.length - 1, 1).iterator();
        while (it.f104109c) {
            int i14 = iArr[it.b()];
            if (i13 < i14) {
                i13 = i14;
            }
        }
        return Integer.valueOf(i13);
    }

    public static Integer P(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i13 = iArr[0];
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ql2.k it = new IntRange(1, iArr.length - 1, 1).iterator();
        while (it.f104109c) {
            int i14 = iArr[it.b()];
            if (i13 > i14) {
                i13 = i14;
            }
        }
        return Integer.valueOf(i13);
    }

    public static char Q(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object R(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static byte[] S(byte[] bArr, IntRange indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return new byte[0];
        }
        return z.m(bArr, indices.f80453a, indices.f80454b + 1);
    }

    public static List T(Comparator comparator, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return z.d(objArr);
    }

    public static List U(int i13, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested element count ", i13, " is less than zero.").toString());
        }
        if (i13 == 0) {
            return q0.f80391a;
        }
        if (i13 >= objArr.length) {
            return b0(objArr);
        }
        if (i13 == 1) {
            return e0.b(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i13);
        int i14 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i14++;
            if (i14 == i13) {
                break;
            }
        }
        return arrayList;
    }

    public static final void V(HashSet destination, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
    }

    public static List W(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return e0.b(Byte.valueOf(bArr[0]));
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b13 : bArr) {
            arrayList.add(Byte.valueOf(b13));
        }
        return arrayList;
    }

    public static List X(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return e0.b(Double.valueOf(dArr[0]));
        }
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d2 : dArr) {
            arrayList.add(Double.valueOf(d2));
        }
        return arrayList;
    }

    public static List Y(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return e0.b(Float.valueOf(fArr[0]));
        }
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f13 : fArr) {
            arrayList.add(Float.valueOf(f13));
        }
        return arrayList;
    }

    public static List Z(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? d0(iArr) : e0.b(Integer.valueOf(iArr[0])) : q0.f80391a;
    }

    public static List a0(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return e0.b(Long.valueOf(jArr[0]));
        }
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j13 : jArr) {
            arrayList.add(Long.valueOf(j13));
        }
        return arrayList;
    }

    public static List b0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? e0(objArr) : e0.b(objArr[0]) : q0.f80391a;
    }

    public static List c0(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return q0.f80391a;
        }
        if (length == 1) {
            return e0.b(Short.valueOf(sArr[0]));
        }
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s13 : sArr) {
            arrayList.add(Short.valueOf(s13));
        }
        return arrayList;
    }

    public static ArrayList d0(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i13 : iArr) {
            arrayList.add(Integer.valueOf(i13));
        }
        return arrayList;
    }

    public static ArrayList e0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(new t(objArr, false));
    }

    public static Set f0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return s0.f80394a;
        }
        if (length == 1) {
            return g1.b(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y0.a(objArr.length));
        V(linkedHashSet, objArr);
        return linkedHashSet;
    }

    public static t0 g0(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new t0(new b0(objArr));
    }

    public static ArrayList h0(Object[] objArr, Object[] other) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i13 = 0; i13 < min; i13++) {
            arrayList.add(new Pair(objArr[i13], other[i13]));
        }
        return arrayList;
    }

    public static Sequence v(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length == 0 ? yn2.g.f139557a : new q5.w0(objArr, 1);
    }

    public static boolean w(int[] iArr, int i13) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i14 = 0;
        while (i14 < length) {
            if (i13 == iArr[i14]) {
                return i14 >= 0;
            }
            i14++;
        }
        return false;
    }

    public static boolean x(long[] jArr, long j13) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i13 = 0;
        while (i13 < length) {
            if (j13 == jArr[i13]) {
                return i13 >= 0;
            }
            i13++;
        }
        return false;
    }

    public static boolean y(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return K(objArr, obj) >= 0;
    }

    public static List z(int i13, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(a.a.e("Requested element count ", i13, " is less than zero.").toString());
        }
        int length = objArr.length - i13;
        if (length < 0) {
            length = 0;
        }
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(a.a.e("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            return q0.f80391a;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return b0(objArr);
        }
        if (length == 1) {
            return e0.b(objArr[length2 - 1]);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i14 = length2 - length; i14 < length2; i14++) {
            arrayList.add(objArr[i14]);
        }
        return arrayList;
    }
}
