package e0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f56708d = StandardCharsets.US_ASCII;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f56709e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f56710f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a, reason: collision with root package name */
    public final int f56711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56712b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f56713c;

    public i(byte[] bArr, int i13, int i14) {
        this.f56711a = i13;
        this.f56712b = i14;
        this.f56713c = bArr;
    }

    public static i a(long j13, ByteOrder byteOrder) {
        return b(new long[]{j13}, byteOrder);
    }

    public static i b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f56710f[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j13 : jArr) {
            wrap.putInt((int) j13);
        }
        return new i(wrap.array(), 4, jArr.length);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(f56709e[this.f56711a]);
        sb3.append(", data length:");
        return a.a.n(sb3, this.f56713c.length, ")");
    }
}
