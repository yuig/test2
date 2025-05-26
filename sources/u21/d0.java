package u21;

import android.app.Application;
import ao2.j0;
import h32.i0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import y01.p1;
import zy.l0;

/* loaded from: classes5.dex */
public final class d0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final j f120081c;

    /* renamed from: d, reason: collision with root package name */
    public final o f120082d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.d0 f120083e;

    /* renamed from: f, reason: collision with root package name */
    public final w60.d f120084f;

    /* renamed from: g, reason: collision with root package name */
    public final l82.y f120085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(j pinOrSpinRewardLoggingSEP, o pinOrSpinRewardSEP, zy.d0 pinalyticsSEP, w60.d screenNavigatorSEP, Application application, j0 scope) {
        super(scope);
        Intrinsics.checkNotNullParameter(pinOrSpinRewardLoggingSEP, "pinOrSpinRewardLoggingSEP");
        Intrinsics.checkNotNullParameter(pinOrSpinRewardSEP, "pinOrSpinRewardSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f120081c = pinOrSpinRewardLoggingSEP;
        this.f120082d = pinOrSpinRewardSEP;
        this.f120083e = pinalyticsSEP;
        this.f120084f = screenNavigatorSEP;
        l82.a0 a0Var = new l82.a0(scope);
        b0 stateTransformer = new b0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f120085g = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f120085g.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f120085g.e();
    }

    public final void h(String experienceId, String title, List imageUrls) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        l82.y.i(this.f120085g, new c0(experienceId, title, imageUrls, new l0((i0) null, 3)), false, new p1(this, 12), 2);
    }
}
