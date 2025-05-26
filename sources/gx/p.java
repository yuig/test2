package gx;

import ao2.j0;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i0;
import l82.y;
import nt.w0;
import nx.d0;
import u50.r;
import zy.q0;

/* loaded from: classes3.dex */
public final class p extends l82.b implements wt1.d {

    /* renamed from: c, reason: collision with root package name */
    public final x f66275c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f66276d;

    /* renamed from: e, reason: collision with root package name */
    public final y f66277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j0 scope, d0 pinalytics, x adsStlShoppingModuleSEPFactory, q0 unscopedPinalyticsSEPFactory) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(adsStlShoppingModuleSEPFactory, "adsStlShoppingModuleSEPFactory");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        this.f66275c = adsStlShoppingModuleSEPFactory;
        this.f66276d = unscopedPinalyticsSEPFactory;
        a0 a0Var = new a0(scope);
        w0 stateTransformer = new w0(new dx.a(pinalytics));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f66277e = a0.b(a0Var, new k(new vh(), ""), new wt.c(this, 18), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f66277e.d();
    }

    @Override // wt1.d
    public final u50.o b(i0 i0Var, boolean z13) {
        k startState = (k) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (a) this.f66277e.j(startState, z13);
    }

    @Override // l82.i
    public final r c() {
        return this.f66277e.e();
    }
}
