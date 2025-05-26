package com.bugsnag.android;

/* loaded from: classes3.dex */
public final class x0 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f29685a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f29686b;

    public x0(Throwable th3, hd.h hVar, p2 p2Var, u1 u1Var) {
        this(th3, hVar, p2Var, new x1(0), new k1(), u1Var);
    }

    public final void a(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            b("addMetadata");
        } else {
            this.f29685a.f29718c.a(str, str2, obj);
        }
    }

    public final void b(String str) {
        this.f29686b.h(a.a.k("Invalid null value supplied to config.", str, ", ignoring"));
    }

    @Override // com.bugsnag.android.n1
    public final void toStream(o1 o1Var) {
        this.f29685a.toStream(o1Var);
    }

    public x0(Throwable th3, hd.h hVar, p2 p2Var, x1 x1Var, k1 k1Var, u1 u1Var) {
        this(new z0(th3, hVar, p2Var, x1Var, k1Var), u1Var);
    }

    public x0(z0 z0Var, u1 u1Var) {
        this.f29685a = z0Var;
        this.f29686b = u1Var;
    }
}
