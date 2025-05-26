package yb2;

import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.s2;
import lh0.z3;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f138583a = h1.f("search", "feed_home", "pin");

    /* renamed from: b, reason: collision with root package name */
    public static final Set f138584b = h1.f(jo1.a.SEARCH, jo1.a.HOMEFEED, jo1.a.RELATED_PINS, jo1.a.MORE_IDEAS);

    public static final boolean a(jo1.a fragmentType, s2 experiments) {
        Intrinsics.checkNotNullParameter(fragmentType, "fragmentType");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        if (!f138584b.contains(fragmentType)) {
            experiments.getClass();
            z3 z3Var = a4.f83298b;
            g1 g1Var = (g1) experiments.f83477a;
            if ((!g1Var.o("android_news_hub_detail_hide_pin", "enabled", z3Var) && !g1Var.l("android_news_hub_detail_hide_pin")) || jo1.a.NEWS_HUB != fragmentType) {
                return false;
            }
        }
        return true;
    }

    public static final boolean b(String str, boolean z13, boolean z14) {
        return z13 || (z14 && Intrinsics.d(str, "feed_home"));
    }
}
