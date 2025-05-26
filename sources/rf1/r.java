package rf1;

import df.j1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.u1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final yk1.v f107890a;

    /* renamed from: b, reason: collision with root package name */
    public final u1 f107891b;

    public r(yk1.v resources, u1 experiments) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f107890a = resources;
        this.f107891b = experiments;
    }

    public final String a(String str) {
        u1 u1Var = this.f107891b;
        u1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) u1Var.f83486a;
        if (!g1Var.o("mweb_web_android_ios_clbc_eu_ad_string", "enabled", z3Var) && !g1Var.l("mweb_web_android_ios_clbc_eu_ad_string")) {
            return str;
        }
        return j1.U(((yk1.a) this.f107890a).f139224a.getString(wy1.f.sponsored_pins_eu_prefix), new Object[]{str});
    }
}
