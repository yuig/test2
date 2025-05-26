package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final by1.i f20690c;

    /* renamed from: d, reason: collision with root package name */
    public final sw1.b f20691d;

    /* renamed from: e, reason: collision with root package name */
    public final l82.y f20692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ao2.j0 scope, by1.i featureSEP, sw1.b navigationSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        this.f20690c = featureSEP;
        this.f20691d = navigationSEP;
        l82.a0 a0Var = new l82.a0(scope);
        rw1.f stateTransformer = new rw1.f(4);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        this.f20692e = l82.a0.b(a0Var, new y(), new ex1.n(this, 14), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f20692e.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f20692e.e();
    }
}
