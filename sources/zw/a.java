package zw;

import android.util.LruCache;
import ao2.j0;
import ao2.o1;
import ao2.v0;
import bk1.a1;
import bk1.b1;
import bk1.c1;
import bk1.d1;
import bk1.f0;
import bk1.h2;
import bk1.i2;
import bk1.w0;
import bk1.x0;
import bk1.y0;
import bk1.z0;
import com.pinterest.ads.validation.AdsPinValidationLogger$PinValidationPayload;
import com.pinterest.api.model.f30;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z2;
import ek1.k0;
import ey.g3;
import gk1.e0;
import gk1.h0;
import gk1.i0;
import h32.d4;
import ho2.q;
import i01.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import lh0.g1;
import m60.w;
import nm.u;
import o22.m;
import oo1.j;
import ow.k;
import ow.p0;
import qa2.d0;
import rh1.q1;
import u50.r;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142890a = 4;

    /* renamed from: b, reason: collision with root package name */
    public Object f142891b;

    public a() {
        this(new h2());
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        switch (this.f142890a) {
            case 0:
                p(scope, (f) hVar, eventIntake);
                break;
            case 1:
                j(scope, (x0) hVar, eventIntake);
                break;
            case 2:
                k(scope, (z0) hVar, eventIntake);
                break;
            case 3:
                a1 request = (a1) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                g3 g3Var = (g3) this.f142891b;
                f30 f30Var = request.f23153a;
                g3Var.getClass();
                g3.a(f30Var);
                break;
            case 4:
                l(scope, (b1) hVar, eventIntake);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter((c1) hVar, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ((ip1.b) this.f142891b).a();
                break;
            case 6:
                d1 request2 = (d1) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                ((aa2.a) this.f142891b).a(request2.f23206a, request2.f23207b);
                break;
            case 7:
                m(scope, (k0) hVar, eventIntake);
                break;
            case 8:
                n(scope, (e0) hVar, eventIntake);
                break;
            default:
                o(scope, (m) hVar, eventIntake);
                break;
        }
    }

    public final void j(j0 scope, x0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof w0) {
            f30 f30Var = ((w0) request).f23368a;
            j jVar = j.f96854a;
            String R3 = f30Var.R3();
            if (R3 == null) {
                R3 = "";
            }
            String T3 = f30Var.T3();
            if (T3 == null) {
                T3 = "";
            }
            String S3 = f30Var.S3();
            j.v(R3, T3, S3 != null ? S3 : "", (oc.c) this.f142891b).l(tk2.e.f118017c).h(wj2.c.a()).i(new r0(14), new q1(7, bk1.q1.B));
        }
    }

    public final void k(j0 scope, z0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof y0) {
            y0 y0Var = (y0) request;
            NavigationImpl z03 = Navigation.z0(z2.a(), y0Var.f23376a);
            ph.a.h(z03, y0Var.f23377b, y0Var.f23378c, y0Var.f23379d);
            ((w) this.f142891b).d(z03);
            d4 d4Var = z03.f49944f;
            if (d4Var != null) {
                eventIntake.a(new f0(d4Var));
            }
        }
    }

    public final void l(j0 scope, b1 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        f30 f30Var = request.f23182a;
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(scope, q.f69782a, null, new i2(this, f30Var, null), 2);
        boolean z13 = ((d0) this.f142891b) instanceof h2;
        eventIntake.a(new bk1.e0(request.f23182a, request.f23184c, request.f23183b, z13));
    }

    public final void m(j0 scope, k0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof ek1.j0) {
            nv.b bVar = (nv.b) this.f142891b;
            ek1.j0 j0Var = (ek1.j0) request;
            f30 pin = j0Var.f59262a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(pin, "pin");
            nv.c pinValidationContext = j0Var.f59263b;
            Intrinsics.checkNotNullParameter(pinValidationContext, "pinValidationContext");
            if (pin.d5().booleanValue()) {
                List list = (List) bVar.f92342f.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((nv.e) obj).a(pin, pinValidationContext)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                g1.r rVar = bVar.f92343g;
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Object c13 = rVar.c(uid);
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.d(c13, bool)) {
                    return;
                }
                String uid2 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                rVar.d(uid2, bool);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nv.d b13 = ((nv.e) it.next()).b(pin, pinValidationContext);
                    if (b13 != null) {
                        arrayList2.add(b13);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                String uid3 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                String B4 = pin.B4();
                String F5 = pin.F5();
                u uVar = new u();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    nv.d dVar = (nv.d) it2.next();
                    uVar.r(dVar.f92347a, dVar.f92348b);
                }
                Unit unit = Unit.f80348a;
                wr.c.a(bVar.f92338b, new AdsPinValidationLogger$PinValidationPayload(uid3, B4, F5, uVar), Float.valueOf(((Number) bVar.f92344h.getValue()).floatValue()), pin.getUid(), 2);
            }
        }
    }

    public final void n(j0 scope, e0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof h0) {
            h0 h0Var = (h0) request;
            if (Intrinsics.d(((hs.c) ((hs.e) this.f142891b)).a(h0Var.f65231a), Boolean.TRUE)) {
                ((hs.c) ((hs.e) this.f142891b)).b(h0Var.f65232b, h0Var.f65231a);
                return;
            }
            return;
        }
        if (request instanceof gk1.f0) {
            hs.e eVar = (hs.e) this.f142891b;
            String str = ((gk1.f0) request).f65228a;
            hs.c cVar = (hs.c) eVar;
            if (str == null) {
                cVar.getClass();
                return;
            }
            o1 o1Var = (o1) cVar.f70026c.get(str);
            if (o1Var != null) {
                o1Var.cancel((CancellationException) null);
                return;
            }
            return;
        }
        if (!(request instanceof i0)) {
            if (request instanceof gk1.j0) {
                eventIntake.a(new gk1.q(Intrinsics.d(((hs.c) ((hs.e) this.f142891b)).a(((gk1.j0) request).f65237a), Boolean.TRUE), false));
                return;
            }
            return;
        }
        hs.e eVar2 = (hs.e) this.f142891b;
        String str2 = ((i0) request).f65234a;
        Boolean bool = Boolean.TRUE;
        LruCache lruCache = ((hs.c) eVar2).f70027d;
        if (str2 == null) {
            return;
        }
        lruCache.put(str2, bool);
    }

    public final void o(j0 scope, m request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        ((g1) ((lh0.z0) this.f142891b)).c(request.b());
    }

    public final void p(j0 scope, f request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof c) {
            ow.a aVar = (ow.a) this.f142891b;
            String pinId = ((c) request).j();
            p0 p0Var = (p0) aVar;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(pinId, "pinId");
            kotlin.jvm.internal.j.z(p0Var.f97865g, null, null, new ow.m(p0Var, pinId, null), 3);
            return;
        }
        if (request instanceof b) {
            ow.a aVar2 = (ow.a) this.f142891b;
            String pinId2 = ((b) request).j();
            p0 p0Var2 = (p0) aVar2;
            p0Var2.getClass();
            Intrinsics.checkNotNullParameter(pinId2, "pinId");
            kotlin.jvm.internal.j.z(p0Var2.f97865g, null, null, new k(p0Var2, pinId2, null), 3);
            return;
        }
        if (request instanceof d) {
            ow.a aVar3 = (ow.a) this.f142891b;
            String pinId3 = ((d) request).j();
            ww.a interactionType = ww.a.NAVIGATED_TO_CLOSEUP;
            p0 p0Var3 = (p0) aVar3;
            p0Var3.getClass();
            Intrinsics.checkNotNullParameter(pinId3, "pinId");
            Intrinsics.checkNotNullParameter(interactionType, "interactionType");
            kotlin.jvm.internal.j.z(p0Var3.f97865g, null, null, new ow.u(p0Var3, pinId3, interactionType, null), 3);
            return;
        }
        if (request instanceof e) {
            ow.a aVar4 = (ow.a) this.f142891b;
            String pinId4 = ((e) request).j();
            ww.a interactionType2 = ww.a.NAVIGATED_TO_EXTERNAL;
            p0 p0Var4 = (p0) aVar4;
            p0Var4.getClass();
            Intrinsics.checkNotNullParameter(pinId4, "pinId");
            Intrinsics.checkNotNullParameter(interactionType2, "interactionType");
            kotlin.jvm.internal.j.z(p0Var4.f97865g, null, null, new ow.u(p0Var4, pinId4, interactionType2, null), 3);
        }
    }

    public a(aa2.a scrollToTopEventManager) {
        Intrinsics.checkNotNullParameter(scrollToTopEventManager, "scrollToTopEventManager");
        this.f142891b = scrollToTopEventManager;
    }

    public a(g3 perfLogApplicationUtils) {
        Intrinsics.checkNotNullParameter(perfLogApplicationUtils, "perfLogApplicationUtils");
        this.f142891b = perfLogApplicationUtils;
    }

    public a(ip1.b prefetchManager) {
        Intrinsics.checkNotNullParameter(prefetchManager, "prefetchManager");
        this.f142891b = prefetchManager;
    }

    public a(nv.b adsPinValidationLogger) {
        Intrinsics.checkNotNullParameter(adsPinValidationLogger, "adsPinValidationLogger");
        this.f142891b = adsPinValidationLogger;
    }

    public a(lh0.z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f142891b = experimentsActivator;
    }

    public a(oc.c apolloClient) {
        Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
        this.f142891b = apolloClient;
    }

    public a(ow.a manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f142891b = manager;
    }

    public a(hs.e dlAdCloseupPinOverlayVisibility) {
        Intrinsics.checkNotNullParameter(dlAdCloseupPinOverlayVisibility, "dlAdCloseupPinOverlayVisibility");
        this.f142891b = dlAdCloseupPinOverlayVisibility;
    }

    public a(w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f142891b = eventManager;
    }

    public a(d0 pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        this.f142891b = pinActionHandler;
    }
}
