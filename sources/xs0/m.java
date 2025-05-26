package xs0;

import android.app.Application;
import ao2.j0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.q0;

/* loaded from: classes5.dex */
public final class m implements wt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final l82.y f135831a;

    public m(j0 scope, q0 pinalyticsSEPFactory, mb0.a repositorySEP, Application application) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalyticsSEPFactory, "pinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(repositorySEP, "repositorySEP");
        Intrinsics.checkNotNullParameter(application, "application");
        l82.a0 a0Var = new l82.a0(scope);
        a0Var.f82204b = d7.g.n(11, "stateTransformer");
        a0Var.c(this, application);
        Intrinsics.checkNotNullParameter("SbaHfBoardToggleSettingCellViewModel", "tagged");
        l82.y a13 = a0Var.a();
        zy.d0 a14 = pinalyticsSEPFactory.a();
        a13.a(a14, g.f135790k, g.f135791l, a14.a());
        a13.a(repositorySEP, g.f135792m, g.f135793n, repositorySEP.a());
        this.f135831a = a13;
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f135831a.d();
    }

    @Override // wt1.d
    public final u50.o b(i0 i0Var, boolean z13) {
        h startState = (h) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (a) this.f135831a.j(startState, z13);
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f135831a.e();
    }
}
