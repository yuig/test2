package pd;

/* loaded from: classes.dex */
public final class a0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f99625a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99626b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f99627c;

    /* renamed from: d, reason: collision with root package name */
    public final z f99628d;

    /* renamed from: e, reason: collision with root package name */
    public final nd.h f99629e;

    /* renamed from: f, reason: collision with root package name */
    public int f99630f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99631g;

    public a0(g0 g0Var, boolean z13, boolean z14, nd.h hVar, z zVar) {
        d7.b.p(g0Var, "Argument must not be null");
        this.f99627c = g0Var;
        this.f99625a = z13;
        this.f99626b = z14;
        this.f99629e = hVar;
        d7.b.p(zVar, "Argument must not be null");
        this.f99628d = zVar;
    }

    @Override // pd.g0
    public final int a() {
        return this.f99627c.a();
    }

    public final synchronized void b() {
        if (this.f99631g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f99630f++;
    }

    @Override // pd.g0
    public final synchronized void c() {
        if (this.f99630f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f99631g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f99631g = true;
        if (this.f99626b) {
            this.f99627c.c();
        }
    }

    @Override // pd.g0
    public final Class d() {
        return this.f99627c.d();
    }

    public final g0 e() {
        return this.f99627c;
    }

    public final void f() {
        boolean z13;
        synchronized (this) {
            int i13 = this.f99630f;
            if (i13 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z13 = true;
            int i14 = i13 - 1;
            this.f99630f = i14;
            if (i14 != 0) {
                z13 = false;
            }
        }
        if (z13) {
            ((t) this.f99628d).e(this.f99629e, this);
        }
    }

    @Override // pd.g0
    public final Object get() {
        return this.f99627c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f99625a + ", listener=" + this.f99628d + ", key=" + this.f99629e + ", acquired=" + this.f99630f + ", isRecycled=" + this.f99631g + ", resource=" + this.f99627c + '}';
    }
}
