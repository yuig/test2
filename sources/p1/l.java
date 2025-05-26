package p1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final g f98543a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f98544b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f98545c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f98546d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f98547e = new f(0);

    /* renamed from: f, reason: collision with root package name */
    public static final f f98548f;

    static {
        int i13 = 1;
        f98543a = new g(i13);
        int i14 = 0;
        f98544b = new g(i14);
        f98545c = new e(i13);
        f98546d = new e(i14);
        new f(3);
        f98548f = new f(2);
        new f(1);
    }

    public static void a(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float f13 = (i13 - i15) / 2;
        if (!z13) {
            int length = iArr.length;
            int i17 = 0;
            while (i14 < length) {
                int i18 = iArr[i14];
                iArr2[i17] = Math.round(f13);
                f13 += i18;
                i14++;
                i17++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i19 = iArr[length2];
            iArr2[length2] = Math.round(f13);
            f13 += i19;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z13) {
        int i13 = 0;
        if (!z13) {
            int length = iArr.length;
            int i14 = 0;
            int i15 = 0;
            while (i13 < length) {
                int i16 = iArr[i13];
                iArr2[i14] = i15;
                i15 += i16;
                i13++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i13;
            i13 += i17;
        }
    }

    public static void c(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        int i17 = i13 - i15;
        if (!z13) {
            int length = iArr.length;
            int i18 = 0;
            while (i14 < length) {
                int i19 = iArr[i14];
                iArr2[i18] = i17;
                i17 += i19;
                i14++;
                i18++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i23 = iArr[length2];
            iArr2[length2] = i17;
            i17 += i23;
        }
    }

    public static void d(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float length = (iArr.length == 0) ^ true ? (i13 - i15) / iArr.length : 0.0f;
        float f13 = length / 2;
        if (z13) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i17 = iArr[length2];
                iArr2[length2] = Math.round(f13);
                f13 += i17 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i18 = 0;
        while (i14 < length3) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f13);
            f13 += i19 + length;
            i14++;
            i18++;
        }
    }

    public static void e(int i13, int[] iArr, int[] iArr2, boolean z13) {
        if (iArr.length == 0) {
            return;
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        float max = (i13 - i15) / Math.max(iArr.length - 1, 1);
        float f13 = (z13 && iArr.length == 1) ? max : 0.0f;
        if (z13) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i17 = iArr[length];
                iArr2[length] = Math.round(f13);
                f13 += i17 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i18 = 0;
        while (i14 < length2) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f13);
            f13 += i19 + max;
            i14++;
            i18++;
        }
    }

    public static void f(int i13, int[] iArr, int[] iArr2, boolean z13) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float length = (i13 - i15) / (iArr.length + 1);
        if (z13) {
            float f13 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i17 = iArr[length2];
                iArr2[length2] = Math.round(f13);
                f13 += i17 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f14 = length;
        int i18 = 0;
        while (i14 < length3) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f14);
            f14 += i19 + length;
            i14++;
            i18++;
        }
    }

    public static i g(float f13) {
        return new i(f13, true, k.f98537i);
    }

    public static i h(float f13, u2.g gVar) {
        return new i(f13, true, new i1.j(gVar, 2));
    }
}
