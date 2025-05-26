package jh1;

import android.app.Application;
import ao2.j0;
import h32.a4;
import h32.d4;
import k92.l;
import kotlin.jvm.internal.Intrinsics;
import l82.a0;
import l82.i;
import l82.y;
import pb1.v;
import pb1.x;
import u50.r;
import we1.n1;
import zy.d0;

/* loaded from: classes5.dex */
public final class h extends l82.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public final kh1.c f76234c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f76235d;

    /* renamed from: e, reason: collision with root package name */
    public final l f76236e;

    /* renamed from: f, reason: collision with root package name */
    public final y f76237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kh1.c unauthPasscodeRequiredSEP, d0 pinalyticsSEP, l toastSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(unauthPasscodeRequiredSEP, "unauthPasscodeRequiredSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f76234c = unauthPasscodeRequiredSEP;
        this.f76235d = pinalyticsSEP;
        this.f76236e = toastSEP;
        a0 a0Var = new a0(scope);
        v stateTransformer = new v();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f76237f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f76237f.d();
    }

    @Override // l82.i
    public final r c() {
        return this.f76237f.e();
    }

    public final void h(com.pinterest.feature.settings.passcode.d mode, d4 viewType, a4 viewParameterType) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        y.i(this.f76237f, new x(mode, viewType, viewParameterType), false, new n1(this, 22), 2);
    }
}
