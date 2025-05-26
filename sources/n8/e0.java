package n8;

import android.view.Surface;
import d7.n0;
import m7.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb.c f89787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f89788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f89789c;

    public /* synthetic */ e0(tb.c cVar, Surface surface, long j13) {
        this.f89787a = cVar;
        this.f89788b = surface;
        this.f89789c = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var = (i0) this.f89787a.f116960b;
        int i13 = n0.f53866a;
        l0 l0Var = ((m7.i0) i0Var).f86205a;
        n7.c0 c0Var = (n7.c0) l0Var.f86285t;
        final n7.b w13 = c0Var.w();
        final Object obj = this.f89788b;
        final long j13 = this.f89789c;
        c0Var.x(w13, 26, new d7.r(obj, j13) { // from class: n7.p

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f89559b;

            @Override // d7.r
            /* renamed from: invoke */
            public final void mo0invoke(Object obj2) {
                ((c) obj2).v(b.this, this.f89559b);
            }
        });
        if (l0Var.T == obj) {
            l0Var.f86277n.m(26, new c3.e(6));
        }
    }
}
