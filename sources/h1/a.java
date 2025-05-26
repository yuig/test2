package h1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f66445a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f66446b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f66447c = new Object[0];

    public static final int a(int i13, int i14, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i15 = i13 - 1;
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) >>> 1;
            int i18 = array[i17];
            if (i18 < i14) {
                i16 = i17 + 1;
            } else {
                if (i18 <= i14) {
                    return i17;
                }
                i15 = i17 - 1;
            }
        }
        return ~i16;
    }

    public static final int b(int i13, long j13, long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i14 = i13 - 1;
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) >>> 1;
            long j14 = array[i16];
            if (j14 < j13) {
                i15 = i16 + 1;
            } else {
                if (j14 <= j13) {
                    return i16;
                }
                i14 = i16 - 1;
            }
        }
        return ~i15;
    }
}
