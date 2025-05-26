package b2;

/* loaded from: classes2.dex */
public final class j implements q4.y {

    /* renamed from: a, reason: collision with root package name */
    public final u2.e f21168a;

    /* renamed from: b, reason: collision with root package name */
    public final l f21169b;

    /* renamed from: c, reason: collision with root package name */
    public long f21170c = 0;

    public j(u2.e eVar, l lVar) {
        this.f21168a = eVar;
        this.f21169b = lVar;
    }

    @Override // q4.y
    public final long a(n4.i iVar, long j13, n4.k kVar, long j14) {
        long a13 = this.f21169b.a();
        if (!com.bumptech.glide.c.y0(a13)) {
            a13 = this.f21170c;
        }
        this.f21170c = a13;
        return n4.h.c(n4.h.c(iVar.a(), d7.b.q0(a13)), this.f21168a.a(j14, 0L, kVar));
    }
}
