package ax0;

import android.app.Application;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i0;
import l82.y;
import u50.o;
import u50.r;

/* loaded from: classes5.dex */
public final class i extends l82.b implements wt1.d {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f20637c;

    /* renamed from: d, reason: collision with root package name */
    public final y f20638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j0 scope, Application application, gx.e seeProductPinsSEP) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(seeProductPinsSEP, "seeProductPinsSEP");
        this.f20637c = seeProductPinsSEP;
        a0 a0Var = new a0(scope);
        a0Var.f82204b = d7.g.n(13, "stateTransformer");
        a0Var.c(this, application);
        this.f20638d = a0.b(a0Var, new f(new f30(), new vh(), null, 0.0f, 0, null, false, false, null, 1020), new au0.f(this, 28), 2);
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f20638d.d();
    }

    @Override // wt1.d
    public final o b(i0 i0Var, boolean z13) {
        f startState = (f) i0Var;
        Intrinsics.checkNotNullParameter(startState, "startState");
        return (a) this.f20638d.j(startState, z13);
    }

    @Override // l82.i
    public final r c() {
        return this.f20638d.e();
    }
}
