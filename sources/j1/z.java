package j1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z implements j {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f74331a;

    /* renamed from: b, reason: collision with root package name */
    public final p2 f74332b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f74333c;

    /* renamed from: d, reason: collision with root package name */
    public final t f74334d;

    /* renamed from: e, reason: collision with root package name */
    public final t f74335e;

    /* renamed from: f, reason: collision with root package name */
    public final t f74336f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f74337g;

    /* renamed from: h, reason: collision with root package name */
    public final long f74338h;

    public z(a0 a0Var, p2 p2Var, Object obj, t tVar) {
        x2 x2Var = new x2(a0Var.f73970a);
        this.f74331a = x2Var;
        this.f74332b = p2Var;
        this.f74333c = obj;
        t tVar2 = (t) p2Var.f74197a.invoke(obj);
        this.f74334d = tVar2;
        this.f74335e = e.k(tVar);
        this.f74337g = p2Var.f74198b.invoke(x2Var.a(tVar2, tVar));
        if (x2Var.f74314c == null) {
            x2Var.f74314c = tVar2.c();
        }
        t tVar3 = x2Var.f74314c;
        if (tVar3 == null) {
            Intrinsics.r("velocityVector");
            throw null;
        }
        int b13 = tVar3.b();
        long j13 = 0;
        for (int i13 = 0; i13 < b13; i13++) {
            tVar2.getClass();
            float a13 = tVar.a(i13);
            i1.r1 r1Var = ((i1.x1) x2Var.f74312a).f70936a;
            r1Var.getClass();
            float[] fArr = i1.b.f70719a;
            j13 = Math.max(j13, ((long) (Math.exp(i1.b.a(a13, r1Var.f70888a * r1Var.f70889b) / (i1.s1.f70898a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f74338h = j13;
        t k13 = e.k(this.f74331a.b(j13, this.f74334d, tVar));
        this.f74336f = k13;
        int b14 = k13.b();
        for (int i14 = 0; i14 < b14; i14++) {
            t tVar4 = this.f74336f;
            float a14 = tVar4.a(i14);
            this.f74331a.getClass();
            this.f74331a.getClass();
            tVar4.e(i14, ql2.s.f(a14, -0.0f, 0.0f));
        }
    }

    @Override // j1.j
    public final boolean a() {
        return false;
    }

    @Override // j1.j
    public final t b(long j13) {
        if (c(j13)) {
            return this.f74336f;
        }
        return this.f74331a.b(j13, this.f74334d, this.f74335e);
    }

    @Override // j1.j
    public final long d() {
        return this.f74338h;
    }

    @Override // j1.j
    public final p2 e() {
        return this.f74332b;
    }

    @Override // j1.j
    public final Object f(long j13) {
        if (c(j13)) {
            return this.f74337g;
        }
        Function1 function1 = this.f74332b.f74198b;
        x2 x2Var = this.f74331a;
        t tVar = x2Var.f74313b;
        t tVar2 = this.f74334d;
        if (tVar == null) {
            x2Var.f74313b = tVar2.c();
        }
        t tVar3 = x2Var.f74313b;
        if (tVar3 == null) {
            Intrinsics.r("valueVector");
            throw null;
        }
        int b13 = tVar3.b();
        for (int i13 = 0; i13 < b13; i13++) {
            t tVar4 = x2Var.f74313b;
            if (tVar4 == null) {
                Intrinsics.r("valueVector");
                throw null;
            }
            tVar4.e(i13, ((i1.x1) x2Var.f74312a).f70936a.a(this.f74335e.a(i13)).a(j13 / 1000000) + tVar2.a(i13));
        }
        t tVar5 = x2Var.f74313b;
        if (tVar5 != null) {
            return function1.invoke(tVar5);
        }
        Intrinsics.r("valueVector");
        throw null;
    }

    @Override // j1.j
    public final Object g() {
        return this.f74337g;
    }
}
