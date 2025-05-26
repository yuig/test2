package p70;

import aa1.x;
import ao2.j0;
import ao2.v0;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t;
import h32.f1;
import h32.u0;
import hk0.m;
import i91.h0;
import java.util.ArrayList;
import java.util.List;
import k92.l;
import kh2.w;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l82.g;
import l82.h;
import la0.l1;
import n70.d0;
import n70.e0;
import n70.f0;
import np1.j;
import nx.d1;
import od1.b0;
import s02.v;
import sk0.s;
import sk0.u;
import tk0.y;
import u50.r;
import x02.c2;
import x02.g0;
import x02.i2;
import x02.x0;
import y01.f;
import y01.i;
import y52.a0;
import y52.z;
import z01.n;
import z01.o;
import z01.p;
import z91.q;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99071a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f99072b;

    /* renamed from: c, reason: collision with root package name */
    public Object f99073c;

    /* renamed from: d, reason: collision with root package name */
    public Object f99074d;

    public e(j handshakeManager, ll.j screenNavigator, rp1.d handshakeCookieManager) {
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(handshakeCookieManager, "handshakeCookieManager");
        this.f99072b = handshakeManager;
        this.f99073c = screenNavigator;
        this.f99074d = handshakeCookieManager;
    }

    public static NavigationImpl j(v7 v7Var, String str, List list) {
        NavigationImpl z03 = Navigation.z0((ScreenLocation) t.f51369j.getValue(), v7Var.getUid());
        boolean z13 = true;
        if (str == null || str.length() == 0) {
            z03.m0("com.pinterest.EXTRA_SOURCE", m.BOARD.toString());
        } else {
            z03.m0("com.pinterest.EXTRA_BOARD_SECTION_ID", str);
            z03.Y1("com.pinterest.EXTRA_SHOW_PARENT_BOARD", true);
            z03.m0("com.pinterest.EXTRA_SOURCE", m.BOARD_SECTION.toString());
        }
        z03.m0("com.pinterest.EXTRA_BOARD_ID", v7Var.getUid());
        if (!w.h0(v7Var) && !kh2.d.C0(v7Var, y22.c.MOVE_PINS)) {
            z13 = false;
        }
        z03.Y1("com.pinterest.EXTRA_LOAD_ALL_BOARDS", z13);
        z03.d("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST", new ArrayList(list));
        Boolean f13 = v7Var.f1();
        Intrinsics.checkNotNullExpressionValue(f13, "getIsAdsOnly(...)");
        z03.Y1("com.pinterest.EXTRA_BOARD_IS_ADONLY", f13.booleanValue());
        z03.m0("com.pinterest.EXTRA_BULK_MOVE_ORIGIN_BOARD_ID", v7Var.getUid());
        z03.m0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_SECTION_ID", str);
        Intrinsics.checkNotNullExpressionValue(z03, "apply(...)");
        return z03;
    }

    public static NavigationImpl k(String str, String str2, List list) {
        NavigationImpl w13 = Navigation.w1((ScreenLocation) t.f51365f.getValue());
        w13.m0("com.pinterest.EXTRA_BOARD_ID", str);
        w13.d("com.pinterest.EXTRA_SELECTED_PIN_IDS_LIST", new ArrayList(list));
        w13.m0("com.pinterest.EXTRA_BOARD_SECTION_ACTION_MODE", (str2 == null || str2.length() == 0) ? com.pinterest.feature.boardsection.a.BOARD_ORGANIZE_PINS.getValue() : com.pinterest.feature.boardsection.a.BOARD_SECTION_ORGANIZE_PINS.getValue());
        w13.m0("com.pinterest.EXTRA_BULK_MOVE_ORIGIN_BOARD_ID", str);
        w13.m0("com.pinterest.EXTRA_PIN_MOVE_ORIGIN_BOARD_SECTION_ID", str2);
        Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
        return w13;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        int i13 = this.f99071a;
        Object obj = this.f99072b;
        switch (i13) {
            case 0:
                d0 request = (d0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request instanceof f0)) {
                    if (request instanceof e0) {
                        kotlin.jvm.internal.j.z(scope, null, null, new d(request, this, eventIntake, null), 3);
                        return;
                    }
                    return;
                }
                f0 f0Var = (f0) request;
                f30 f30Var = f0Var.f89609a;
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                c2 c2Var = new c2(uid);
                c2Var.f131300e = f0Var.f89610b;
                c2Var.f131304i = false;
                c2Var.f131305j = f30Var.z4();
                c2Var.f131306k = ((d1) this.f99073c).b(f30Var);
                kotlin.jvm.internal.j.z(scope, null, null, new b(this, f30Var, c2Var, eventIntake, null), 3);
                return;
            case 1:
                u request2 = (u) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request2 instanceof s) {
                    ((sk0.j) obj).e(scope, (s) request2, eventIntake);
                    return;
                } else if (request2 instanceof sk0.m) {
                    ((i60.a) this.f99073c).j(scope, (sk0.m) request2, eventIntake);
                    return;
                } else {
                    if (request2 instanceof sk0.t) {
                        ((l) this.f99074d).e(scope, ((sk0.t) request2).f113082a, eventIntake);
                        return;
                    }
                    return;
                }
            case 2:
                l(scope, (y) hVar, eventIntake);
                return;
            case 3:
                m(scope, (tk0.f0) hVar, eventIntake);
                return;
            case 4:
                i request3 = (i) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (Intrinsics.d(request3, f.f136399a)) {
                    n nVar = new n(eventIntake);
                    this.f99073c = nVar;
                    ((m60.w) obj).h(nVar);
                    return;
                } else if (Intrinsics.d(request3, y01.g.f136402a)) {
                    o oVar = new o(eventIntake);
                    this.f99074d = oVar;
                    ((m60.w) obj).h(oVar);
                    return;
                } else if (!(request3 instanceof y01.h)) {
                    if (request3 instanceof y01.e) {
                        kotlin.jvm.internal.j.z(scope, null, null, new p((y01.e) request3, eventIntake, null), 3);
                        return;
                    }
                    return;
                } else {
                    m60.t tVar = (m60.t) this.f99073c;
                    if (tVar != null) {
                        ((m60.w) obj).j(tVar);
                    }
                    this.f99073c = null;
                    return;
                }
            case 5:
                z91.t request4 = (z91.t) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                kotlin.jvm.internal.j.z(scope, null, null, new q(request4, scope, this, eventIntake, null), 3);
                return;
            case 6:
                x request5 = (x) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                kotlin.jvm.internal.j.z(scope, null, null, new aa1.u(request5, scope, this, eventIntake, null), 3);
                return;
            case 7:
                b0 request6 = (b0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request6, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                xj2.c cVar = (xj2.c) this.f99073c;
                if (cVar != null) {
                    cVar.dispose();
                }
                uj2.q L = ((i2) this.f99074d).L(request6.f94116a);
                hk2.b bVar = new hk2.b(new ed1.g(26, new fa1.g(eventIntake, 17)), new ed1.g(27, new kc1.w(this, 19)), ck2.i.f27923c);
                try {
                    L.d(new jk2.d0(bVar, 0L));
                    this.f99073c = bVar;
                    return;
                } catch (NullPointerException e13) {
                    throw e13;
                } catch (Throwable th3) {
                    throw n60.o.g(th3, "subscribeActual failed", th3);
                }
            case 8:
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter((rw1.e) hVar, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                return;
            case 9:
                v request7 = (v) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request7, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request7 instanceof s02.u) {
                    ((zy.d0) this.f99074d).e(scope, ((s02.u) request7).f110356a, eventIntake);
                    return;
                }
                if (request7 instanceof s02.t) {
                    kotlin.jvm.internal.j.z(scope, null, null, new p02.w(this, request7, eventIntake, null), 3);
                    return;
                } else {
                    if (request7 instanceof s02.s) {
                        ko2.f fVar = v0.f20219a;
                        kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new p02.x(this, request7, null), 2);
                        return;
                    }
                    return;
                }
            default:
                a0 request8 = (a0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request8, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request8 instanceof y52.t) {
                    n(request8, f1.TAP, u0.PIN_SHARE_INSTAGRAM_STORY_BUTTON);
                    return;
                }
                if (request8 instanceof y52.s) {
                    n(request8, f1.TAP, u0.BACK_BUTTON);
                    return;
                }
                if (request8 instanceof y52.u) {
                    n(request8, f1.TAP, u0.COPY_LINK_BUTTON);
                    return;
                }
                if (request8 instanceof z) {
                    n(request8, f1.VIEW, null);
                    f1 f1Var = f1.RENDER;
                    n(request8, f1Var, u0.COPY_LINK_BUTTON);
                    n(request8, f1Var, u0.PIN_SHARE_INSTAGRAM_STORY_BUTTON);
                    return;
                }
                if (!(request8 instanceof y52.w)) {
                    if (request8 instanceof y52.v) {
                        n(request8, f1.TAP, u0.BOARD_PREVIEW_COPY_LINK_FIELD);
                        return;
                    } else if (request8 instanceof y52.x) {
                        n(request8, f1.DISMISS, null);
                        return;
                    } else {
                        if (request8 instanceof y52.y) {
                            n(request8, f1.RENDER, null);
                            return;
                        }
                        return;
                    }
                }
                n(request8, f1.SHARE_SHEET_IG_STORIES_EXPORT_SUCCESS, null);
                y52.w wVar = (y52.w) request8;
                u20.d dVar = (u20.d) this.f99073c;
                y52.d dVar2 = wVar.f137862c;
                p32.c cVar2 = dVar2.f137787b;
                SendableObject sendableObject = dVar2.f137786a;
                p32.i b13 = sendableObject.b();
                Intrinsics.checkNotNullExpressionValue(b13, "getInviteObject(...)");
                String d2 = sendableObject.d();
                Intrinsics.checkNotNullExpressionValue(d2, "getUid(...)");
                int i14 = e0.t.f56747e;
                String str = wVar.f137863d;
                if (str == null) {
                    str = "";
                }
                String str2 = sendableObject.f35137k;
                dVar.c(cVar2, b13, dVar2.f137788c, d2, i14, str, str2).r(tk2.e.f118017c).o(new h0(6), new x02.e0(29, new s12.a(this, 13)));
                return;
        }
    }

    public final void l(j0 scope, y request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        int i13 = 1;
        if (request instanceof tk0.u) {
            i2 i2Var = (i2) this.f99074d;
            tk0.u uVar = (tk0.u) request;
            List pinIds = uVar.f118000c;
            Intrinsics.checkNotNullParameter(i2Var, "<this>");
            Intrinsics.checkNotNullParameter(pinIds, "pinIds");
            String boardId = uVar.f117998a;
            Intrinsics.checkNotNullParameter(boardId, "boardId");
            fk2.x e13 = i2Var.P.a(CollectionsKt.Z(pinIds, ",", null, null, 0, null, null, 62)).l(tk2.e.f118017c).h(wj2.c.a()).e(new m22.e(i2Var, boardId, pinIds, 0));
            Intrinsics.checkNotNullExpressionValue(e13, "doOnComplete(...)");
            e13.i(new c(eventIntake, i13), new pj0.f(20, new a(eventIntake, 8)));
            return;
        }
        boolean z13 = request instanceof tk0.t;
        Object obj = this.f99072b;
        if (z13) {
            x0 x0Var = (x0) obj;
            tk0.t tVar = (tk0.t) request;
            String boardId2 = tVar.f117995a;
            x0Var.getClass();
            Intrinsics.checkNotNullParameter(boardId2, "boardId");
            g0 params = new g0(boardId2, tVar.f117996b, tVar.f117997c);
            Intrinsics.checkNotNullParameter(params, "params");
            x0Var.m(params, null).i(new c(eventIntake, 2), new pj0.f(21, new a(eventIntake, 9)));
            return;
        }
        if (request instanceof tk0.x) {
            tk0.x xVar = (tk0.x) request;
            ((m60.w) this.f99073c).d(j(xVar.f118006a, xVar.f118007b, xVar.f118008c));
            return;
        }
        if (request instanceof tk0.w) {
            tk0.w wVar = (tk0.w) request;
            NavigationImpl j13 = j(wVar.f118002a, wVar.f118003b, wVar.f118004c);
            j13.d("com.pinterest.EXTRA_SELECT_ALL_EXCLUDE_PINS", new ArrayList(wVar.f118005d));
            j13.Y1("com.pinterest.EXTRA_IS_SELECT_ALL_MODE_ACTIVE", true);
            ((m60.w) this.f99073c).d(j13);
            return;
        }
        if (request instanceof tk0.r) {
            tk0.r rVar = (tk0.r) request;
            ((m60.w) this.f99073c).d(k(rVar.f117988a, rVar.f117989b, rVar.f117990c));
        } else if (!(request instanceof tk0.s)) {
            if (request instanceof tk0.v) {
                ((x0) obj).L(((tk0.v) request).f118001a).F(new pj0.f(22, new a(eventIntake, 10)), new pj0.f(23, tk0.d.f117951j), ck2.i.f27923c, ck2.i.f27924d);
            }
        } else {
            tk0.s sVar = (tk0.s) request;
            NavigationImpl k13 = k(sVar.f117991a, sVar.f117992b, sVar.f117993c);
            k13.d("com.pinterest.EXTRA_SELECT_ALL_EXCLUDE_PINS", new ArrayList(sVar.f117994d));
            k13.Y1("com.pinterest.EXTRA_IS_SELECT_ALL_MODE_ACTIVE", true);
            ((m60.w) this.f99073c).d(k13);
        }
    }

    public final void m(j0 scope, tk0.f0 request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof y) {
            ((e) this.f99072b).l(scope, (y) request, eventIntake);
        } else if (request instanceof tk0.d0) {
            ((i60.a) this.f99073c).k(scope, (tk0.d0) request, eventIntake);
        } else if (request instanceof tk0.e0) {
            ((l) this.f99074d).e(scope, ((tk0.e0) request).f117960a, eventIntake);
        }
    }

    public final void n(a0 a0Var, f1 f1Var, u0 u0Var) {
        ((rd.j) this.f99072b).n(new zy.a(u0Var != null ? com.bumptech.glide.d.z0(a0Var.getContext(), new l1(u0Var, 10)) : a0Var.getContext(), f1Var, null, a0Var.getAuxData(), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
    }

    public e(e actionSEP, i60.a loggingSEP, l toastSEP) {
        Intrinsics.checkNotNullParameter(actionSEP, "actionSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f99072b = actionSEP;
        this.f99073c = loggingSEP;
        this.f99074d = toastSEP;
    }

    public e(sk0.j navigationSEP, i60.a loggingSEP, l toastSEP) {
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        this.f99072b = navigationSEP;
        this.f99073c = loggingSEP;
        this.f99074d = toastSEP;
    }

    public e(i2 pinRepository, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f99074d = pinRepository;
        this.f99072b = crashReporting;
    }

    public e(zy.d0 pinalyticsSEP, px.c analyticsRepository, b60.b activeUserManager, yx.b filterRepositoryFactory, gw1.h productTagAdapterFactory) {
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(filterRepositoryFactory, "filterRepositoryFactory");
        Intrinsics.checkNotNullParameter(productTagAdapterFactory, "productTagAdapterFactory");
        this.f99072b = pinalyticsSEP;
        this.f99073c = analyticsRepository;
        this.f99074d = productTagAdapterFactory;
    }

    public e(z82.b handshakeManager, ll.j screenNavigator, e92.d handshakeCookieManager) {
        Intrinsics.checkNotNullParameter(handshakeManager, "handshakeManager");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(handshakeCookieManager, "handshakeCookieManager");
        this.f99072b = handshakeManager;
        this.f99073c = screenNavigator;
        this.f99074d = handshakeCookieManager;
    }

    public e(com.pinterest.feature.pin.j pinAction, d1 trackingParamAttacher, i2 pinRepository) {
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f99072b = pinAction;
        this.f99073c = trackingParamAttacher;
        this.f99074d = pinRepository;
    }

    public e(m60.w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f99072b = eventManager;
    }

    public e(o02.a rvcService, m60.w eventManager, zy.d0 pinalyticsSEM) {
        Intrinsics.checkNotNullParameter(rvcService, "rvcService");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalyticsSEM, "pinalyticsSEM");
        this.f99072b = rvcService;
        this.f99073c = eventManager;
        this.f99074d = pinalyticsSEM;
    }

    public e(x0 boardRepository, i2 pinRepository, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f99072b = boardRepository;
        this.f99074d = pinRepository;
        this.f99073c = eventManager;
    }

    public e(rd.j pinalytics, u20.d sendShareServiceWrapper, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f99072b = pinalytics;
        this.f99073c = sendShareServiceWrapper;
        this.f99074d = crashReporting;
    }
}
