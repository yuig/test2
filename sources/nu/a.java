package nu;

import ao2.j0;
import com.pinterest.feature.settings.notifications.e0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.k;
import dt0.p;
import g60.d;
import i92.i;
import java.util.ArrayList;
import java.util.List;
import jc0.v;
import jn0.f;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import m60.w;
import m60.x0;
import mu.n;
import n70.y;
import o52.e;
import r52.t;
import r52.u;
import rm1.q;
import u50.r;
import y52.c0;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92304a;

    /* renamed from: b, reason: collision with root package name */
    public final w f92305b;

    public a(w eventManager, int i13) {
        this.f92304a = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
            default:
                Intrinsics.checkNotNullParameter(eventManager, "eventManager");
                this.f92305b = eventManager;
                break;
        }
    }

    @Override // l82.g
    public final void e(j0 scope, h request, r eventIntake) {
        int i13 = this.f92304a;
        w wVar = this.f92305b;
        switch (i13) {
            case 0:
                j(scope, (n) request, eventIntake);
                break;
            case 1:
                d request2 = (d) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof d) {
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) k.f51020a.getValue());
                    w13.m0("com.pinterest.EXTRA_CLUSTER_ID", request2.f63699b);
                    w13.m0("com.pinterest.EXTRA_BOARD_NAME", request2.f63700c);
                    w13.m0("com.pinterest.EXTRA_AUTO_ORGANIZE_VIEW_TYPE", "USER");
                    w13.z(request2.f63701d, "moved_pin_count");
                    List list = request2.f63702e;
                    if (list != null) {
                        w13.f49942d.putIntegerArrayList("cluster_pin_types", new ArrayList<>(list));
                    }
                    w13.m0("EXTRAS_AUTO_ORG_NAVIGATION_SOURCE", request2.f63703f);
                    w13.m0("com.pinterest.EXTRA_SOURCE", ou1.b.AUTO_ORGANIZE.getValue());
                    wVar.d(w13);
                    break;
                }
                break;
            case 2:
                com.pinterest.boardAutoCollages.w request3 = (com.pinterest.boardAutoCollages.w) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                j.z(scope, null, null, new w60.b(request3, this, eventIntake, null), 3);
                break;
            case 3:
                y request4 = (y) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request4 instanceof y) {
                    wVar.f(new r70.h(request4.f89701a, false));
                    break;
                }
                break;
            case 4:
                p request5 = (p) request;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request5 instanceof p) {
                    wVar.d(new v(new lp.k(request5.f56251a), false, 0L, 30));
                    break;
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter((y01.b) request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                wVar.d(new dg0.c(dg0.b.DISMISS_UI));
                break;
            case 6:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter((e0) request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                wVar.d(new i(new k11.n(1)));
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request instanceof c0)) {
                    if (!(request instanceof t)) {
                        if (request instanceof u) {
                            u uVar = (u) request;
                            wVar.d(new i(new f(q.ALERT, e.pin_selection_limit_reached, f0.j(Integer.valueOf(uVar.f106300a), Integer.valueOf(uVar.f106300a)))));
                            break;
                        }
                    } else {
                        t tVar = (t) request;
                        wVar.d(new i(new f(q.ALERT, e.pin_selection_pins_below_threshold, f0.j(Integer.valueOf(tVar.f106298a), Integer.valueOf(tVar.f106299b), 5))));
                        break;
                    }
                } else {
                    wVar.d(new i(new f(q.LINK, x0.copied, 4)));
                    break;
                }
                break;
        }
    }

    public final void j(j0 scope, n request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        boolean z13 = request instanceof mu.t;
        w wVar = this.f92305b;
        if (z13) {
            wVar.d(new r70.h(((mu.t) request).f88242a, true));
        } else if (request instanceof mu.r) {
            wVar.d(new l21.a(((mu.r) request).f88236a));
        }
    }
}
