package s02;

import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;

/* loaded from: classes4.dex */
public final class x extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final p70.e f110362c;

    /* renamed from: d, reason: collision with root package name */
    public final y f110363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l82.a scope, p70.e submitAppealSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(submitAppealSEP, "submitAppealSEP");
        this.f110362c = submitAppealSEP;
        a0 a0Var = new a0(scope);
        rw1.f stateTransformer = new rw1.f(7);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f110363d = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f110363d.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f110363d.e();
    }

    public final void h() {
        y.i(this.f110363d, new w(), false, new ex1.n(this, 26), 2);
    }
}
