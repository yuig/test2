package j9;

import d7.n0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final p f75089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75090b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f75091c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f75092d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75093e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f75094f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f75095g;

    /* renamed from: h, reason: collision with root package name */
    public final long f75096h;

    public s(p pVar, long[] jArr, int[] iArr, int i13, long[] jArr2, int[] iArr2, long j13) {
        bf.b.i(iArr.length == jArr2.length);
        bf.b.i(jArr.length == jArr2.length);
        bf.b.i(iArr2.length == jArr2.length);
        this.f75089a = pVar;
        this.f75091c = jArr;
        this.f75092d = iArr;
        this.f75093e = i13;
        this.f75094f = jArr2;
        this.f75095g = iArr2;
        this.f75096h = j13;
        this.f75090b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j13) {
        long[] jArr = this.f75094f;
        for (int a13 = n0.a(jArr, j13, true); a13 < jArr.length; a13++) {
            if ((this.f75095g[a13] & 1) != 0) {
                return a13;
            }
        }
        return -1;
    }
}
