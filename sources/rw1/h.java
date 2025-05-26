package rw1;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i;
import l82.y;
import u50.r;
import yq1.u1;

/* loaded from: classes4.dex */
public final class h extends l82.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public final p70.e f110119c;

    /* renamed from: d, reason: collision with root package name */
    public final sw1.b f110120d;

    /* renamed from: e, reason: collision with root package name */
    public final y f110121e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j0 scope, p70.e featureSEP, sw1.b navigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        this.f110119c = featureSEP;
        this.f110120d = navigationSEP;
        a0 a0Var = new a0(scope);
        f stateTransformer = new f(0);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f110121e = a0.b(a0Var, new g(), new u1(this, 27), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f110121e.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f110121e.e();
    }
}
