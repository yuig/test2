package hs;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final lh0.d f70028a;

    public d(lh0.d adFormatsLibraryExperiments) {
        Intrinsics.checkNotNullParameter(adFormatsLibraryExperiments, "adFormatsLibraryExperiments");
        this.f70028a = adFormatsLibraryExperiments;
    }

    public final boolean a() {
        z3 z3Var = z3.ACTIVATE_EXPERIMENT;
        lh0.d dVar = this.f70028a;
        return dVar.b("enabled_spacing_media_with_comments", z3Var) || dVar.b("enabled_spacing_media_no_comments", z3Var) || dVar.b("enabled_media_no_comments", z3Var) || dVar.b("enabled_media_with_comments", z3Var);
    }

    public final boolean b() {
        lh0.d dVar = this.f70028a;
        dVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) dVar.f83323a;
        if (!g1Var.o("android_ads_module_viewability", "enabled", z3Var) && !g1Var.l("android_ads_module_viewability")) {
            z3 z3Var2 = z3.ACTIVATE_EXPERIMENT;
            if (!dVar.b("enabled_spacing_with_comments", z3Var2) && !dVar.b("enabled_spacing_no_comments", z3Var2) && !dVar.b("enabled_spacing_media_no_comments", z3Var2) && !dVar.b("enabled_spacing_media_with_comments", z3Var2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        lh0.d dVar = this.f70028a;
        dVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) dVar.f83323a;
        if (!g1Var.o("android_ads_module_viewability", "enabled", z3Var) && !g1Var.l("android_ads_module_viewability")) {
            z3 z3Var2 = z3.ACTIVATE_EXPERIMENT;
            if (!dVar.b("enabled_spacing_no_comments", z3Var2) && !dVar.b("enabled_spacing_media_no_comments", z3Var2) && !dVar.b("enabled_media_no_comments", z3Var2)) {
                return false;
            }
        }
        return true;
    }
}
