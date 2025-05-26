package g60;

import android.app.Application;
import ao2.j0;
import com.pinterest.api.model.q30;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i0;
import l82.y;
import u50.o;
import u50.r;

/* loaded from: classes5.dex */
public final class j extends l82.b implements wt1.d {

    /* renamed from: c, reason: collision with root package name */
    public final nu.a f63716c;

    /* renamed from: d, reason: collision with root package name */
    public final i60.a f63717d;

    /* renamed from: e, reason: collision with root package name */
    public final y f63718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j0 scope, String str, Application application, nu.a navigationSEP, i60.a analyticsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(analyticsSEP, "analyticsSEP");
        this.f63716c = navigationSEP;
        this.f63717d = analyticsSEP;
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(4, "stateTransformer");
        a0Var.c(this, application);
        this.f63718e = a0.b(a0Var, new g(new q30(), null, str, 2), new mz.c(this, 5), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f63718e.d();
    }

    @Override // wt1.d
    public final o b(i0 i0Var, boolean z13) {
        g startState = (g) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (a) this.f63718e.j(startState, z13);
    }

    @Override // l82.i
    public final r c() {
        return this.f63718e.e();
    }
}
