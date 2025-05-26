package wo2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final g f130670a = new g();

    public static final boolean a(int i13, int i14, int i15, byte[] a13, byte[] b13) {
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        for (int i16 = 0; i16 < i15; i16++) {
            if (a13[i16 + i13] != b13[i16 + i14]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j13, long j14, long j15) {
        if ((j14 | j15) < 0 || j14 > j13 || j13 - j14 < j15) {
            StringBuilder u13 = a.a.u("size=", j13, " offset=");
            u13.append(j14);
            u13.append(" byteCount=");
            u13.append(j15);
            throw new ArrayIndexOutOfBoundsException(u13.toString());
        }
    }

    public static final int c(int i13) {
        return ((i13 & 255) << 24) | (((-16777216) & i13) >>> 24) | ((16711680 & i13) >>> 8) | ((65280 & i13) << 8);
    }

    public static final String d(byte b13) {
        char[] cArr = xo2.b.f135635a;
        char[] cArr2 = {cArr[(b13 >> 4) & 15], cArr[b13 & 15]};
        Intrinsics.checkNotNullParameter(cArr2, "<this>");
        return new String(cArr2);
    }

    public static final String e(int i13) {
        int i14 = 0;
        if (i13 == 0) {
            return "0";
        }
        char[] cArr = xo2.b.f135635a;
        char[] cArr2 = {cArr[(i13 >> 28) & 15], cArr[(i13 >> 24) & 15], cArr[(i13 >> 20) & 15], cArr[(i13 >> 16) & 15], cArr[(i13 >> 12) & 15], cArr[(i13 >> 8) & 15], cArr[(i13 >> 4) & 15], cArr[i13 & 15]};
        while (i14 < 8 && cArr2[i14] == '0') {
            i14++;
        }
        Intrinsics.checkNotNullParameter(cArr2, "<this>");
        kotlin.collections.h.f80373a.getClass();
        kotlin.collections.e.a(i14, 8, 8);
        return new String(cArr2, i14, 8 - i14);
    }
}
