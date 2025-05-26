package s02;

import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;

/* loaded from: classes4.dex */
public final class i extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f110319c;

    /* renamed from: d, reason: collision with root package name */
    public final y f110320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l82.a scope, gx.e rvcMainSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(rvcMainSEP, "rvcMainSEP");
        this.f110319c = rvcMainSEP;
        a0 a0Var = new a0(scope);
        rw1.f stateTransformer = new rw1.f(6);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f110320d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f110320d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f110320d.e();
    }

    public final void h() {
        y.i(this.f110320d, h.f110318a, false, new ex1.n(this, 24), 2);
    }
}
