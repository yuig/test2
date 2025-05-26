package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class d0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f18055a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f18056b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18057c = false;

    public d0(g0 g0Var) {
        this.f18055a = g0Var;
        this.f18056b = (g0) g0Var.d(f0.NEW_MUTABLE_INSTANCE);
    }

    public static void j(g0 g0Var, g0 g0Var2) {
        j1 j1Var = j1.f18082c;
        j1Var.getClass();
        j1Var.a(g0Var.getClass()).a(g0Var, g0Var2);
    }

    public final g0 c() {
        g0 g13 = g();
        if (g13.h()) {
            return g13;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        g0 g0Var = this.f18055a;
        g0Var.getClass();
        d0 d0Var = (d0) g0Var.d(f0.NEW_BUILDER);
        d0Var.i(g());
        return d0Var;
    }

    public final g0 g() {
        if (this.f18057c) {
            return this.f18056b;
        }
        g0 g0Var = this.f18056b;
        g0Var.getClass();
        j1 j1Var = j1.f18082c;
        j1Var.getClass();
        j1Var.a(g0Var.getClass()).b(g0Var);
        this.f18057c = true;
        return this.f18056b;
    }

    public final void h() {
        if (this.f18057c) {
            g0 g0Var = (g0) this.f18056b.d(f0.NEW_MUTABLE_INSTANCE);
            j(g0Var, this.f18056b);
            this.f18056b = g0Var;
            this.f18057c = false;
        }
    }

    public final void i(g0 g0Var) {
        h();
        j(this.f18056b, g0Var);
    }
}
