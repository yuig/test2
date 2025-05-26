package jk2;

/* loaded from: classes2.dex */
public final class c0 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final long f76421b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76422c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f76423d;

    public c0(uj2.t tVar, long j13, Object obj, boolean z13) {
        super(tVar);
        this.f76421b = j13;
        this.f76422c = obj;
        this.f76423d = z13;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        this.f76382a.d(new b0(vVar, this.f76421b, this.f76422c, this.f76423d));
    }
}
