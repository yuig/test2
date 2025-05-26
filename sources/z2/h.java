package z2;

import g1.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f140619a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f140620b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.g0 f140621c;

    /* renamed from: d, reason: collision with root package name */
    public final g1.g0 f140622d;

    /* renamed from: e, reason: collision with root package name */
    public final g1.g0 f140623e;

    /* renamed from: f, reason: collision with root package name */
    public final g1.g0 f140624f;

    public h(g gVar, t3.t tVar) {
        this.f140619a = tVar;
        this.f140620b = gVar;
        int i13 = n0.f63290a;
        this.f140621c = new g1.g0();
        this.f140622d = new g1.g0();
        this.f140623e = new g1.g0();
        this.f140624f = new g1.g0();
    }

    public final boolean a() {
        return this.f140621c.c() || this.f140623e.c() || this.f140622d.c();
    }

    public final void b(g1.g0 g0Var, Object obj) {
        if (g0Var.d(obj) && this.f140621c.f63288d + this.f140622d.f63288d + this.f140623e.f63288d == 1) {
            this.f140619a.invoke(new g(this, 0));
        }
    }
}
