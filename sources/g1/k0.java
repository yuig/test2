package g1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a */
    public static final long[] f63281a = {-9187201950435737345L, -1};

    static {
        new c0(0);
    }

    public static final void a(long[] metadata, int i13) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i14 = (i13 + 7) >> 3;
        for (int i15 = 0; i15 < i14; i15++) {
            long j13 = metadata[i15] & (-9187201950435737472L);
            metadata[i15] = (-72340172838076674L) & ((~j13) + (j13 >>> 7));
        }
        Intrinsics.checkNotNullParameter(metadata, "<this>");
        int length = metadata.length;
        int i16 = length - 1;
        int i17 = length - 2;
        metadata[i17] = (metadata[i17] & 72057594037927935L) | (-72057594037927936L);
        metadata[i16] = metadata[0];
    }

    public static final int b(long[] metadata, int i13, int i14) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        while (i13 < i14) {
            if (((metadata[i13 >> 3] >> ((i13 & 7) << 3)) & 255) == 128) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static final int c(int i13) {
        if (i13 == 7) {
            return 6;
        }
        return i13 - (i13 / 8);
    }

    public static final c0 d() {
        return new c0();
    }

    public static final int e(int i13) {
        if (i13 == 0) {
            return 6;
        }
        return (i13 * 2) + 1;
    }

    public static final int f(int i13) {
        if (i13 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i13);
        }
        return 0;
    }

    public static final int g(int i13) {
        if (i13 == 7) {
            return 8;
        }
        return a.a.b(i13, 1, 7, i13);
    }
}
