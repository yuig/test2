package d3;

import b3.o0;
import b3.u;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f53655a;

    public d(b bVar) {
        this.f53655a = bVar;
    }

    public final void a(o0 o0Var, int i13) {
        this.f53655a.a().d(o0Var, i13);
    }

    public final void b(float f13, float f14, float f15, float f16) {
        b bVar = this.f53655a;
        u a13 = bVar.a();
        long c13 = bs1.c.c(a3.f.d(bVar.e()) - (f15 + f13), a3.f.b(bVar.e()) - (f16 + f14));
        if (a3.f.d(c13) < 0.0f || a3.f.b(c13) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        bVar.j(c13);
        a13.f(f13, f14);
    }

    public final void c(long j13, float f13, float f14) {
        u a13 = this.f53655a.a();
        a13.f(a3.c.d(j13), a3.c.e(j13));
        a13.b(f13, f14);
        a13.f(-a3.c.d(j13), -a3.c.e(j13));
    }

    public final void d(float f13, float f14) {
        this.f53655a.a().f(f13, f14);
    }
}
