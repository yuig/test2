package gx;

import android.app.Activity;
import ao2.j0;
import ao2.v0;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.p4;
import ey.c3;
import fk0.s;
import fk0.u;
import h32.d4;
import ho2.q;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import ma1.v;
import nx.d1;
import o82.d2;
import o82.l3;
import o82.y1;
import o82.z1;
import od1.z;
import u50.r;
import x02.e0;
import x02.x0;
import zy.d0;

/* loaded from: classes3.dex */
public final class e implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66245a = 3;

    /* renamed from: b, reason: collision with root package name */
    public final Object f66246b;

    /* renamed from: c, reason: collision with root package name */
    public Object f66247c;

    public e(ll.j screenNavigator, qd1.a closeupNavigator) {
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(closeupNavigator, "closeupNavigator");
        this.f66246b = screenNavigator;
        this.f66247c = closeupNavigator;
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, r eventIntake) {
        Activity activity;
        int i13 = this.f66245a;
        Object obj = this.f66246b;
        switch (i13) {
            case 0:
                j request = (j) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request instanceof i)) {
                    if (!(request instanceof h)) {
                        if (request instanceof g) {
                            ((ax.b) ((ax.a) this.f66247c)).f20592d = ((g) request).f66249a;
                            break;
                        }
                    } else {
                        ax.a aVar = (ax.a) this.f66247c;
                        h hVar2 = (h) request;
                        String uid = hVar2.f66250a;
                        ax.b bVar = (ax.b) aVar;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(uid, "uid");
                        List categoryList = hVar2.f66251b;
                        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
                        bVar.f20589a.put(uid, categoryList);
                        ax.b bVar2 = (ax.b) ((ax.a) this.f66247c);
                        bVar2.getClass();
                        String title = hVar2.f66252c;
                        Intrinsics.checkNotNullParameter(title, "title");
                        bVar2.f20590b = title;
                        ax.b bVar3 = (ax.b) ((ax.a) this.f66247c);
                        bVar3.getClass();
                        String subtitle = hVar2.f66253d;
                        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                        bVar3.f20591c = subtitle;
                        break;
                    }
                } else {
                    i iVar = (i) request;
                    ((w) obj).d(new hx.a(iVar.f66254a, iVar.f66255b));
                    break;
                }
                break;
            case 1:
                u request2 = (u) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof s) {
                    kotlin.jvm.internal.j.z(scope, null, null, new gk0.b(request2, this, eventIntake, null), 3);
                    break;
                }
                break;
            case 2:
                ax0.e request3 = (ax0.e) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request3 instanceof ax0.d)) {
                    if (request3 instanceof ax0.c) {
                        ((rd.j) this.f66247c).n(((ax0.c) request3).f20602a);
                        break;
                    }
                } else {
                    w wVar = (w) obj;
                    NavigationImpl w13 = Navigation.w1((ScreenLocation) p4.f51208a.getValue());
                    ax0.d dVar = (ax0.d) request3;
                    w13.y0(dVar.f20604b, "com.pinterest.EXTRA_COMPLETE_THE_LOOK_STORY");
                    w13.m0("com.pinterest.CLIENT_TRACKING_PARAMETER", dVar.f20606d);
                    d4 d4Var = dVar.f20603a.f67081a;
                    if (d4Var != null) {
                        w13.y0(d4Var, "com.pinterest.EXTRA_WAYS_TO_STYLE_PARENT_VIEW");
                    }
                    wVar.d(w13);
                    break;
                }
                break;
            case 3:
                v request4 = (v) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request4 instanceof ma1.r)) {
                    if (request4 instanceof ma1.u) {
                        ((d0) this.f66247c).e(scope, ((ma1.u) request4).f86813a, eventIntake);
                        break;
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new na1.a(this, (ma1.r) request4, eventIntake, null), 3);
                    break;
                }
                break;
            case 4:
                pb1.s request5 = (pb1.s) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request5 instanceof pb1.n) {
                    xj2.c cVar = (xj2.c) this.f66247c;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    pb1.n nVar = (pb1.n) request5;
                    String str = nVar.f99472a;
                    int i14 = qb1.b.f103413a[nVar.f99473b.ordinal()];
                    this.f66247c = (i14 != 1 ? i14 != 2 ? fk2.m.f62459a : ((x10.a) obj).c(str) : ((x10.a) obj).a(str)).l(tk2.e.f118017c).h(wj2.c.a()).i(new qb1.a(0, eventIntake, request5), new ab1.o(13, new fa1.g(eventIntake, 10)));
                    break;
                }
                break;
            case 5:
                z request6 = (z) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request6, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ko2.f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new qd1.c(request6, this, null), 2);
                break;
            case 6:
                s02.g request7 = (s02.g) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request7, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!Intrinsics.d(request7, s02.e.f110316a)) {
                    if (request7 instanceof s02.f) {
                        ko2.f fVar2 = v0.f20219a;
                        kotlin.jvm.internal.j.z(scope, q.f69782a, null, new p02.e(this, request7, null), 2);
                        break;
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new p02.d(this, eventIntake, null), 3);
                    break;
                }
                break;
            case 7:
                y52.r request8 = (y52.r) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request8, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                y52.d dVar2 = request8.f137839a;
                SendableObject sendableObject = dVar2.f137786a;
                String d2 = sendableObject.d();
                Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
                p32.i b13 = sendableObject.b();
                Intrinsics.checkNotNullExpressionValue(b13, "getInviteObject(...)");
                ((u20.d) obj).b(d2, dVar2.f137787b, b13, dVar2.f137788c).r(tk2.e.f118017c).l(wj2.c.a()).o(new e0(27, new gw1.i(22, this, eventIntake)), new e0(28, new s12.a(this, 12)));
                break;
            case 8:
                j(scope, (d2) hVar, eventIntake);
                break;
            case 9:
                j(scope, (d2) hVar, eventIntake);
                break;
            default:
                com.pinterest.widget.configuration.n request9 = (com.pinterest.widget.configuration.n) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request9, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request9 instanceof com.pinterest.widget.configuration.m)) {
                    if ((request9 instanceof com.pinterest.widget.configuration.l) && (activity = ((n82.b) obj).f89936a) != null) {
                        activity.finish();
                        break;
                    }
                } else {
                    eventIntake.a(new com.pinterest.widget.configuration.f());
                    kotlin.jvm.internal.j.z(scope, null, null, new com.pinterest.widget.configuration.c(this, (com.pinterest.widget.configuration.m) request9, null), 3);
                    break;
                }
                break;
        }
    }

    public final void j(j0 scope, d2 request, r eventIntake) {
        switch (this.f66245a) {
            case 8:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                boolean z13 = request instanceof y1;
                Object obj = this.f66246b;
                if (!z13) {
                    if (request instanceof z1) {
                        c3 c3Var = (c3) this.f66247c;
                        s92.i pwtAction = (s92.i) obj;
                        Intrinsics.checkNotNullParameter(pwtAction, "pwtAction");
                        c3Var.a(new my.d(pwtAction, 0));
                        break;
                    }
                } else {
                    ((c3) this.f66247c).a(new my.c((s92.i) obj));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ko2.f fVar = v0.f20219a;
                kotlin.jvm.internal.j.z(scope, q.f69782a, null, new l3(request, this, null), 2);
                break;
        }
    }

    public e(w eventManager, ax.a adsStlCache) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(adsStlCache, "adsStlCache");
        this.f66246b = eventManager;
        this.f66247c = adsStlCache;
    }

    public e(w eventManager, rd.j pinalytics) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f66246b = eventManager;
        this.f66247c = pinalytics;
    }

    public e(d1 trackingParamAttacher, Function2 extractTrackingParam) {
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(extractTrackingParam, "extractTrackingParam");
        this.f66246b = trackingParamAttacher;
        this.f66247c = extractTrackingParam;
    }

    public e(u20.d sendShareServiceWrapper, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f66246b = sendShareServiceWrapper;
        this.f66247c = crashReporting;
    }

    public e(n82.b currentActivityProvider, xc2.w widgetViewModel) {
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        this.f66246b = currentActivityProvider;
        this.f66247c = widgetViewModel;
    }

    public e(o02.a rvcService, ll.j screenNavigator) {
        Intrinsics.checkNotNullParameter(rvcService, "rvcService");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        this.f66246b = rvcService;
        this.f66247c = screenNavigator;
    }

    public e(s92.i pwtAction, c3 perfEventsRouter) {
        Intrinsics.checkNotNullParameter(pwtAction, "pwtAction");
        Intrinsics.checkNotNullParameter(perfEventsRouter, "perfEventsRouter");
        this.f66246b = pwtAction;
        this.f66247c = perfEventsRouter;
    }

    public e(x10.a passcodeApiService) {
        Intrinsics.checkNotNullParameter(passcodeApiService, "passcodeApiService");
        this.f66246b = passcodeApiService;
    }

    public e(cr1.a accountApiService, d0 pinalyticsSEP) {
        Intrinsics.checkNotNullParameter(accountApiService, "accountApiService");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        this.f66246b = accountApiService;
        this.f66247c = pinalyticsSEP;
    }

    public e(x0 boardRepository, b20.c toastForSEP) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(toastForSEP, "toastForSEP");
        this.f66246b = boardRepository;
        this.f66247c = toastForSEP;
    }
}
