package tx1;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.y;
import u50.r;

/* loaded from: classes4.dex */
public final class n extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final qd1.b f119693c;

    /* renamed from: d, reason: collision with root package name */
    public final w60.d f119694d;

    /* renamed from: e, reason: collision with root package name */
    public final y f119695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j0 scope, qd1.b featureSEP, w60.d navigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        this.f119693c = featureSEP;
        this.f119694d = navigationSEP;
        a0 a0Var = new a0(scope);
        rw1.f stateTransformer = new rw1.f(3);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f119695e = a0.b(a0Var, new m(), new ex1.n(this, 11), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f119695e.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f119695e.e();
    }
}
