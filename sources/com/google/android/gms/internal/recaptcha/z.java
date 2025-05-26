package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public abstract class z extends m {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f31811a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f31812b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31813c = false;

    public z(b0 b0Var) {
        this.f31811a = b0Var;
        this.f31812b = (b0) b0Var.b(4);
    }

    public final void b(b0 b0Var) {
        if (this.f31813c) {
            b0 b0Var2 = (b0) this.f31812b.b(4);
            z0.f31814c.b(b0Var2).b(b0Var2, this.f31812b);
            this.f31812b = b0Var2;
            this.f31813c = false;
        }
        b0 b0Var3 = this.f31812b;
        z0.f31814c.b(b0Var3).b(b0Var3, b0Var);
    }

    public final Object clone() {
        b0 b0Var;
        z zVar = (z) this.f31811a.b(5);
        if (this.f31813c) {
            b0Var = this.f31812b;
        } else {
            b0 b0Var2 = this.f31812b;
            z0.f31814c.b(b0Var2).c(b0Var2);
            this.f31813c = true;
            b0Var = this.f31812b;
        }
        zVar.b(b0Var);
        return zVar;
    }
}
