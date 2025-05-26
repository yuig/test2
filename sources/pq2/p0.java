package pq2;

/* loaded from: classes4.dex */
public final class p0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final p f101072c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f101073d;

    public p0(p pVar, boolean z13) {
        this.f101072c = pVar;
        this.f101073d = z13;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        if (obj == null) {
            return;
        }
        x0Var.b((String) this.f101072c.a(obj), null, this.f101073d);
    }
}
