package pb1;

import android.app.Application;
import ao2.j0;
import com.pinterest.feature.settings.notifications.y0;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final gx.e f99455c;

    /* renamed from: d, reason: collision with root package name */
    public final nu.b f99456d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f99457e;

    /* renamed from: f, reason: collision with root package name */
    public final k92.l f99458f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f99459g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gx.e sourceSEP, nu.b verificationSEP, zy.d0 pinalyticsSEP, k92.l toastSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(sourceSEP, "sourceSEP");
        Intrinsics.checkNotNullParameter(verificationSEP, "verificationSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f99455c = sourceSEP;
        this.f99456d = verificationSEP;
        this.f99457e = pinalyticsSEP;
        this.f99458f = toastSEP;
        l82.a0 a0Var = new l82.a0(scope);
        v stateTransformer = new v();
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f99459g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f99459g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f99459g.e();
    }

    public final void h(com.pinterest.feature.settings.passcode.d mode, d4 viewType, a4 viewParameterType) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        l82.y.i(this.f99459g, new x(mode, viewType, viewParameterType), false, new y0(this, 6), 2);
    }
}
