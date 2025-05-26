package q7;

import java.util.List;

/* loaded from: classes3.dex */
public final class o extends n {

    /* renamed from: j, reason: collision with root package name */
    public final List f102670j;

    public o(j jVar, long j13, long j14, long j15, long j16, List list, long j17, List list2, long j18, long j19) {
        super(jVar, j13, j14, j15, j16, list, j17, j18, j19);
        this.f102670j = list2;
    }

    @Override // q7.n
    public final long g(long j13) {
        return this.f102670j.size();
    }

    @Override // q7.n
    public final j l(long j13, m mVar) {
        return (j) this.f102670j.get((int) (j13 - this.f102664d));
    }

    @Override // q7.n
    public final boolean n() {
        return true;
    }
}
