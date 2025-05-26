package pd;

/* loaded from: classes3.dex */
public final class f0 implements g0, ie.b {

    /* renamed from: e, reason: collision with root package name */
    public static final x92.b f99657e = ie.d.a(20, new com.bugsnag.android.a0());

    /* renamed from: a, reason: collision with root package name */
    public final ie.e f99658a = new ie.e();

    /* renamed from: b, reason: collision with root package name */
    public g0 f99659b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f99660c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f99661d;

    public static f0 e(g0 g0Var) {
        f0 f0Var = (f0) f99657e.b();
        f0Var.f99661d = false;
        f0Var.f99660c = true;
        f0Var.f99659b = g0Var;
        return f0Var;
    }

    @Override // pd.g0
    public final int a() {
        return this.f99659b.a();
    }

    @Override // ie.b
    public final ie.e b() {
        return this.f99658a;
    }

    @Override // pd.g0
    public final synchronized void c() {
        this.f99658a.a();
        this.f99661d = true;
        if (!this.f99660c) {
            this.f99659b.c();
            this.f99659b = null;
            f99657e.a(this);
        }
    }

    @Override // pd.g0
    public final Class d() {
        return this.f99659b.d();
    }

    public final synchronized void f() {
        this.f99658a.a();
        if (!this.f99660c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f99660c = false;
        if (this.f99661d) {
            c();
        }
    }

    @Override // pd.g0
    public final Object get() {
        return this.f99659b.get();
    }
}
