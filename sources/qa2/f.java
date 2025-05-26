package qa2;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.firebase.messaging.k f103257d = new com.google.firebase.messaging.k();

    /* renamed from: a, reason: collision with root package name */
    public final y32.f f103258a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f103259b;

    /* renamed from: c, reason: collision with root package name */
    public final String f103260c;

    public /* synthetic */ f(nx.d0 d0Var, y32.f fVar, nr0.b bVar, int i13) {
        this(d0Var, (i13 & 2) != 0 ? null : fVar, (i13 & 4) != 0 ? f103257d : bVar, "unknown");
    }

    public final n a(yk1.v viewResources) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        com.google.android.gms.common.api.internal.q pillColorHelper = new com.google.android.gms.common.api.internal.q(((yk1.a) viewResources).f139224a.getIntArray(m60.p0.pds_colors), false);
        wa2.i r13 = bs1.c.r();
        r13.f128768e0 = this.f103259b;
        y32.f fVar = this.f103258a;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            r13.f128790p0 = fVar;
        }
        String str = this.f103260c;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        r13.f128792q0 = str;
        vb0.i iVar = lh0.n1.f83436b;
        lh0.n1 c13 = iVar.c();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) c13.f83439a;
        r13.Y = g1Var.o("android_default_product_tag_in_title", "enabled", z3Var) || g1Var.l("android_default_product_tag_in_title");
        ((lh0.g1) iVar.c().f83439a).c("shopping_indicator_holdout");
        b(r13);
        b20.c builder = new b20.c(r13, 0);
        Intrinsics.checkNotNullParameter(pillColorHelper, "pillColorHelper");
        Intrinsics.checkNotNullParameter(builder, "builder");
        return new n(builder);
    }

    public void b(wa2.i pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
    }

    public f(nx.d0 pinalytics, y32.f fVar, d0 pinActionHandler, String trafficSource) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        this.f103258a = fVar;
        this.f103259b = pinActionHandler;
        this.f103260c = trafficSource;
    }
}
