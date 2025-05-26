package l0;

import a.cb;
import android.util.Size;
import androidx.camera.core.impl.z0;
import com.google.common.util.concurrent.c0;
import v.p2;

/* loaded from: classes2.dex */
public final class r extends z0 {

    /* renamed from: o, reason: collision with root package name */
    public final r4.l f81263o;

    /* renamed from: p, reason: collision with root package name */
    public r4.i f81264p;

    /* renamed from: q, reason: collision with root package name */
    public z0 f81265q;

    /* renamed from: r, reason: collision with root package name */
    public t f81266r;

    public r(int i13, Size size) {
        super(i13, size);
        this.f81263o = com.bumptech.glide.d.L(new a.z0(this, 13));
    }

    @Override // androidx.camera.core.impl.z0
    public final void a() {
        super.a();
        f0.h.m0(new o(this, 3));
    }

    @Override // androidx.camera.core.impl.z0
    public final c0 f() {
        return this.f81263o;
    }

    public final boolean g(z0 z0Var, o oVar) {
        boolean z13;
        f0.h.s();
        z0Var.getClass();
        z0 z0Var2 = this.f81265q;
        if (z0Var2 == z0Var) {
            return false;
        }
        com.bumptech.glide.d.v("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z0Var2 == null);
        Size size = this.f17012h;
        Size size2 = z0Var.f17012h;
        com.bumptech.glide.d.g("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i13 = z0Var.f17013i;
        int i14 = this.f17013i;
        com.bumptech.glide.d.g(cb.j("The provider's format(", i14, ") must match the parent(", i13, ")"), i14 == i13);
        synchronized (this.f17005a) {
            z13 = this.f17007c;
        }
        com.bumptech.glide.d.v("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z13);
        this.f81265q = z0Var;
        g0.m.g(z0Var.c(), this.f81264p);
        z0Var.d();
        g0.m.f(this.f17009e).d(new p2(z0Var, 2), l3.c.s());
        g0.m.f(z0Var.f17011g).d(oVar, l3.c.H0());
        return true;
    }
}
