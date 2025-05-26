package k1;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes2.dex */
public final class l0 extends u2.p implements s3.r {

    /* renamed from: n, reason: collision with root package name */
    public final o1.k f77919n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f77920o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f77921p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f77922q;

    public l0(o1.k kVar) {
        this.f77919n = kVar;
    }

    @Override // u2.p
    public final void D0() {
        kotlin.jvm.internal.j.z(z0(), null, null, new k0(this, null), 3);
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        s3.m0 m0Var = (s3.m0) eVar;
        m0Var.a();
        boolean z13 = this.f77920o;
        d3.c cVar = m0Var.f110840a;
        if (z13) {
            d3.h.a0(m0Var, b3.w.b(b3.w.f21378b, 0.3f), cVar.g(), 0.0f, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
        } else if (this.f77921p || this.f77922q) {
            d3.h.a0(m0Var, b3.w.b(b3.w.f21378b, 0.1f), cVar.g(), 0.0f, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN);
        }
    }
}
