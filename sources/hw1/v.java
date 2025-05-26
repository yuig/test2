package hw1;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import yq1.u1;

/* loaded from: classes4.dex */
public final class v extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final z01.k f70493c;

    /* renamed from: d, reason: collision with root package name */
    public final ws.q f70494d;

    /* renamed from: e, reason: collision with root package name */
    public final y f70495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j0 scope, z01.k featureSEP, ws.q navigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        this.f70493c = featureSEP;
        this.f70494d = navigationSEP;
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(29, "stateTransformer");
        this.f70495e = a0.b(a0Var, new u(), new u1(this, 25), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f70495e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f70495e.e();
    }
}
