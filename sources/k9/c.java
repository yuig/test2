package k9;

import d7.n0;
import q8.e0;
import q8.t;
import q8.w;
import q8.x;

/* loaded from: classes3.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public x f78672a;

    /* renamed from: b, reason: collision with root package name */
    public sp2.i f78673b;

    /* renamed from: c, reason: collision with root package name */
    public long f78674c;

    /* renamed from: d, reason: collision with root package name */
    public long f78675d;

    @Override // k9.g
    public final e0 J() {
        bf.b.t(this.f78674c != -1);
        return new w(this.f78672a, this.f78674c, 0);
    }

    @Override // k9.g
    public final void R(long j13) {
        long[] jArr = (long[]) this.f78673b.f114928b;
        this.f78675d = jArr[n0.e(jArr, j13, true)];
    }

    @Override // k9.g
    public final long f(t tVar) {
        long j13 = this.f78675d;
        if (j13 < 0) {
            return -1L;
        }
        long j14 = -(j13 + 2);
        this.f78675d = -1L;
        return j14;
    }
}
