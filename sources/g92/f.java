package g92;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.k1;
import lh0.z0;
import lh0.z3;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f64575a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f64576b;

    public f(c gestaltThemeGate, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(gestaltThemeGate, "gestaltThemeGate");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f64575a = gestaltThemeGate;
        this.f64576b = crashReporting;
    }

    public final d a() {
        d dVar;
        c cVar = (c) this.f64575a;
        cVar.getClass();
        z3 activate = z3.ACTIVATE_EXPERIMENT;
        k1 k1Var = cVar.f64574a;
        k1Var.getClass();
        Intrinsics.checkNotNullParameter("holdout", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        z0 z0Var = k1Var.f83402a;
        if (((g1) z0Var).k("android_vr_holdout", "holdout", activate)) {
            dVar = d.CLASSIC;
        } else {
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) z0Var;
            if (g1Var.o("android_gestalt_theme_vr", "enabled", z3Var) || g1Var.l("android_gestalt_theme_vr")) {
                dVar = d.VR;
            } else {
                g1 g1Var2 = (g1) z0Var;
                if (g1Var2.o("android_gestalt_theme_main_beta", "enabled", z3Var) || g1Var2.l("android_gestalt_theme_main_beta")) {
                    dVar = d.MAIN_0_0_1_BETA_7;
                } else {
                    g1 g1Var3 = (g1) z0Var;
                    if (g1Var3.o("android_gestalt_theme_calico_beta", "enabled", z3Var) || g1Var3.l("android_gestalt_theme_calico_beta")) {
                        dVar = d.CALICO_0_0_1_BETA_7;
                    } else {
                        g1 g1Var4 = (g1) z0Var;
                        dVar = (g1Var4.o("android_gestalt_theme_vr_tier_two", "enabled", z3Var) || g1Var4.l("android_gestalt_theme_vr_tier_two")) ? d.VR_0_1 : d.VR_0_1_EXCLUDE_SPINNER;
                    }
                }
            }
        }
        this.f64576b.h("Using theme = " + dVar);
        return dVar;
    }
}
