package tb;

import ja.d0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f116991a;

    /* renamed from: b, reason: collision with root package name */
    public final b f116992b;

    /* renamed from: c, reason: collision with root package name */
    public final n f116993c;

    /* renamed from: d, reason: collision with root package name */
    public final n f116994d;

    public o(d0 d0Var) {
        this.f116991a = d0Var;
        this.f116992b = new b(this, d0Var, 4);
        this.f116993c = new n(d0Var, 0);
        this.f116994d = new n(d0Var, 1);
    }

    public final void a(String str) {
        d0 d0Var = this.f116991a;
        d0Var.b();
        n nVar = this.f116993c;
        oa.i a13 = nVar.a();
        a13.c1(1, str);
        try {
            d0Var.c();
            try {
                a13.G();
                d0Var.r();
            } finally {
                d0Var.m();
            }
        } finally {
            nVar.j(a13);
        }
    }
}
