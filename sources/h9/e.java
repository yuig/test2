package h9;

import q8.t;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f68228d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f68229a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f68230b;

    /* renamed from: c, reason: collision with root package name */
    public int f68231c;

    public static long a(byte[] bArr, int i13, boolean z13) {
        long j13 = bArr[0] & 255;
        if (z13) {
            j13 &= ~f68228d[i13 - 1];
        }
        for (int i14 = 1; i14 < i13; i14++) {
            j13 = (j13 << 8) | (bArr[i14] & 255);
        }
        return j13;
    }

    public static int b(int i13) {
        for (int i14 = 0; i14 < 8; i14++) {
            if ((f68228d[i14] & i13) != 0) {
                return i14 + 1;
            }
        }
        return -1;
    }

    public final long c(t tVar, boolean z13, boolean z14, int i13) {
        int i14 = this.f68230b;
        byte[] bArr = this.f68229a;
        if (i14 == 0) {
            if (!tVar.i(bArr, 0, 1, z13)) {
                return -1L;
            }
            int b13 = b(bArr[0] & 255);
            this.f68231c = b13;
            if (b13 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f68230b = 1;
        }
        int i15 = this.f68231c;
        if (i15 > i13) {
            this.f68230b = 0;
            return -2L;
        }
        if (i15 != 1) {
            tVar.readFully(bArr, 1, i15 - 1);
        }
        this.f68230b = 0;
        return a(bArr, this.f68231c, z14);
    }
}
