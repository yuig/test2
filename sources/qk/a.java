package qk;

import com.google.common.io.BaseEncoding$DecodingException;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f104027a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f104028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f104029c;

    /* renamed from: d, reason: collision with root package name */
    public final int f104030d;

    /* renamed from: e, reason: collision with root package name */
    public final int f104031e;

    /* renamed from: f, reason: collision with root package name */
    public final int f104032f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f104033g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f104034h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f104035i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r10.length
            if (r4 >= r5) goto L4d
            char r5 = r10[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            if (r7 == 0) goto L39
            r7 = r1[r5]
            if (r7 != r2) goto L1c
            goto L1d
        L1c:
            r6 = r3
        L1d:
            if (r6 == 0) goto L25
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L25:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "Duplicate character: %s"
            java.lang.String r10 = bs1.c.q1(r0, r10)
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "Non-ASCII character: %s"
            java.lang.String r10 = bs1.c.q1(r0, r10)
            r9.<init>(r10)
            throw r9
        L4d:
            r8.<init>(r9, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.a.<init>(java.lang.String, char[]):void");
    }

    public final int a(char c13) {
        if (c13 > 127) {
            throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c13));
        }
        byte b13 = this.f104033g[c13];
        if (b13 != -1) {
            return b13;
        }
        if (c13 <= ' ' || c13 == 127) {
            throw new BaseEncoding$DecodingException("Unrecognized character: 0x" + Integer.toHexString(c13));
        }
        throw new BaseEncoding$DecodingException("Unrecognized character: " + c13);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f104035i == aVar.f104035i && Arrays.equals(this.f104028b, aVar.f104028b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f104028b) + (this.f104035i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f104027a;
    }

    public a(String str, char[] cArr, byte[] bArr, boolean z13) {
        str.getClass();
        this.f104027a = str;
        cArr.getClass();
        this.f104028b = cArr;
        try {
            int W = kg.a.W(cArr.length, RoundingMode.UNNECESSARY);
            this.f104030d = W;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(W);
            int i13 = 1 << (3 - numberOfTrailingZeros);
            this.f104031e = i13;
            this.f104032f = W >> numberOfTrailingZeros;
            this.f104029c = cArr.length - 1;
            this.f104033g = bArr;
            boolean[] zArr = new boolean[i13];
            for (int i14 = 0; i14 < this.f104032f; i14++) {
                zArr[kg.a.q(i14 * 8, this.f104030d, RoundingMode.CEILING)] = true;
            }
            this.f104034h = zArr;
            this.f104035i = z13;
        } catch (ArithmeticException e13) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e13);
        }
    }
}
