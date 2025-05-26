package yy0;

import android.app.Application;
import ao2.j0;
import h32.i0;
import java.util.AbstractMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j2;
import lh0.z0;
import lh0.z3;
import zy.l0;

/* loaded from: classes5.dex */
public final class e0 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final zy0.d f140445c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f140446d;

    /* renamed from: e, reason: collision with root package name */
    public final j2 f140447e;

    /* renamed from: f, reason: collision with root package name */
    public final l82.y f140448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Application application, j0 scope, zy0.d featureSEP, zy.d0 pinalyticsSEP, j2 experiments) {
        super(scope);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureSEP, "featureSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f140445c = featureSEP;
        this.f140446d = pinalyticsSEP;
        this.f140447e = experiments;
        l82.a0 a0Var = new l82.a0(scope);
        c0 stateTransformer = new c0(new lt.j(2));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f140448f = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f140448f.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f140448f.e();
    }

    public final void h(i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        j2 j2Var = this.f140447e;
        AbstractMap j13 = ((g1) j2Var.f83397a).j();
        l0 l0Var = new l0(pinalyticsContext, 2);
        z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        Intrinsics.checkNotNullParameter("enabled_show_select_overlay", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        z0 z0Var = j2Var.f83397a;
        boolean k13 = ((g1) z0Var).k("ap_nux_show_select_overlay_android", "enabled_show_select_overlay", activate);
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) z0Var;
        g1 g1Var2 = (g1) z0Var;
        l82.y.i(this.f140448f, new d0(j13, l0Var, false, k13, g1Var.o("ap_android_short_use_case_names", "enabled", z3Var) || g1Var.l("ap_android_short_use_case_names"), g1Var2.o("activation_foundation_cover_pin_outage_fix_android", "enabled", z3Var) || g1Var2.l("activation_foundation_cover_pin_outage_fix_android"), 1), false, new dx0.d(this, 14), 2);
    }
}
