package j1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f74290a;

    /* renamed from: b, reason: collision with root package name */
    public final p2 f74291b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f74292c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f74293d;

    /* renamed from: e, reason: collision with root package name */
    public final t f74294e;

    /* renamed from: f, reason: collision with root package name */
    public final t f74295f;

    /* renamed from: g, reason: collision with root package name */
    public final t f74296g;

    /* renamed from: h, reason: collision with root package name */
    public long f74297h;

    /* renamed from: i, reason: collision with root package name */
    public t f74298i;

    public w1(n nVar, p2 p2Var, Object obj, Object obj2, t tVar) {
        this.f74290a = nVar.a(p2Var);
        this.f74291b = p2Var;
        this.f74292c = obj2;
        this.f74293d = obj;
        this.f74294e = (t) p2Var.f74197a.invoke(obj);
        Function1 function1 = p2Var.f74197a;
        this.f74295f = (t) function1.invoke(obj2);
        this.f74296g = tVar != null ? e.k(tVar) : ((t) function1.invoke(obj)).c();
        this.f74297h = -1L;
    }

    @Override // j1.j
    public final boolean a() {
        return this.f74290a.a();
    }

    @Override // j1.j
    public final t b(long j13) {
        if (!c(j13)) {
            return this.f74290a.g(j13, this.f74294e, this.f74295f, this.f74296g);
        }
        t tVar = this.f74298i;
        if (tVar != null) {
            return tVar;
        }
        t G = this.f74290a.G(this.f74294e, this.f74295f, this.f74296g);
        this.f74298i = G;
        return G;
    }

    @Override // j1.j
    public final long d() {
        if (this.f74297h < 0) {
            this.f74297h = this.f74290a.b(this.f74294e, this.f74295f, this.f74296g);
        }
        return this.f74297h;
    }

    @Override // j1.j
    public final p2 e() {
        return this.f74291b;
    }

    @Override // j1.j
    public final Object f(long j13) {
        if (c(j13)) {
            return this.f74292c;
        }
        t o13 = this.f74290a.o(j13, this.f74294e, this.f74295f, this.f74296g);
        int b13 = o13.b();
        for (int i13 = 0; i13 < b13; i13++) {
            if (!(!Float.isNaN(o13.a(i13)))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + o13 + ". Animation: " + this + ", playTimeNanos: " + j13);
            }
        }
        return this.f74291b.f74198b.invoke(o13);
    }

    @Override // j1.j
    public final Object g() {
        return this.f74292c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f74293d + " -> " + this.f74292c + ",initial velocity: " + this.f74296g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.f74290a;
    }
}
