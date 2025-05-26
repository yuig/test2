package jx1;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;

/* loaded from: classes4.dex */
public final class t extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final z01.k f77697c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f77698d;

    /* renamed from: e, reason: collision with root package name */
    public final y f77699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(j0 scope, z01.k featureSEP, w60.d navigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        this.f77697c = featureSEP;
        this.f77698d = navigationSEP;
        a0 a0Var = new a0(scope);
        int i13 = 2;
        rw1.f stateTransformer = new rw1.f(i13);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f77699e = a0.b(a0Var, new s(), new ex1.n(this, i13), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f77699e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f77699e.e();
    }
}
