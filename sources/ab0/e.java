package ab0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.s0;
import j1.p0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j0;
import lh0.z3;
import m60.w;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1695a;

    /* renamed from: b, reason: collision with root package name */
    public final w f1696b;

    public e(j0 experiments, w eventManager) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f1695a = experiments;
        this.f1696b = eventManager;
    }

    public static void b(e eVar, String navigationId, String str, Integer num, d32.c cVar, ml1.b transition, int i13) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i13 & 8) != 0) {
            cVar = d32.c.UNKNOWN;
        }
        d32.c entryPointSource = cVar;
        if ((i13 & 32) != 0) {
            transition = ml1.b.UNSPECIFIED_TRANSITION;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(navigationId, "pinId");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(navigationId, "navigationId");
        Intrinsics.checkNotNullParameter(transition, "transition");
        eVar.a(navigationId, transition, new p0(navigationId, str2, num, entryPointSource, 15));
    }

    public final void a(String str, ml1.b bVar, p0 p0Var) {
        j0 j0Var = this.f1695a;
        j0Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) j0Var.f83395a;
        NavigationImpl L = Navigation.L((g1Var.o("android_collage_refinement", "enabled", z3Var) || g1Var.l("android_collage_refinement")) ? (ScreenLocation) s0.f51315d.getValue() : (ScreenLocation) s0.f51314c.getValue(), str, bVar.getValue());
        p0Var.invoke(L);
        this.f1696b.d(L);
    }
}
