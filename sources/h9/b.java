package h9;

import java.util.ArrayDeque;
import q8.t;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f68155a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f68156b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f68157c = new e();

    /* renamed from: d, reason: collision with root package name */
    public t5.e f68158d;

    /* renamed from: e, reason: collision with root package name */
    public int f68159e;

    /* renamed from: f, reason: collision with root package name */
    public int f68160f;

    /* renamed from: g, reason: collision with root package name */
    public long f68161g;

    public static String c(t tVar, int i13) {
        if (i13 == 0) {
            return "";
        }
        byte[] bArr = new byte[i13];
        tVar.readFully(bArr, 0, i13);
        while (i13 > 0 && bArr[i13 - 1] == 0) {
            i13--;
        }
        return new String(bArr, 0, i13);
    }

    public final double a(t tVar, int i13) {
        return i13 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(b(tVar, i13));
    }

    public final long b(t tVar, int i13) {
        tVar.readFully(this.f68155a, 0, i13);
        long j13 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            j13 = (j13 << 8) | (r0[i14] & 255);
        }
        return j13;
    }
}
