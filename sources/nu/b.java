package nu;

import ao2.j0;
import ao2.v0;
import ck2.i;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import ko2.e;
import ko2.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import mq.z;
import mu.k;
import mu.v;
import nx.d1;
import nx.o0;
import p02.n;
import pb1.p;
import pu.s;
import pu.t;
import pu.u;
import pu.w;
import qb1.d;
import u50.r;
import ws.q;
import x02.i2;
import xs0.x;
import zy.d0;
import zy.o;
import zy.y;

/* loaded from: classes3.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92306a = 6;

    /* renamed from: b, reason: collision with root package name */
    public final Object f92307b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f92308c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f92309d;

    /* renamed from: e, reason: collision with root package name */
    public Object f92310e;

    public b(a adsBaseEventManagerSEP, q adsBaseExperimentsSEP, b pinLoaderSEP, d0 pinalyticsSEM) {
        Intrinsics.checkNotNullParameter(adsBaseEventManagerSEP, "adsBaseEventManagerSEP");
        Intrinsics.checkNotNullParameter(adsBaseExperimentsSEP, "adsBaseExperimentsSEP");
        Intrinsics.checkNotNullParameter(pinLoaderSEP, "pinLoaderSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEM, "pinalyticsSEM");
        this.f92307b = adsBaseEventManagerSEP;
        this.f92308c = adsBaseExperimentsSEP;
        this.f92309d = pinLoaderSEP;
        this.f92310e = pinalyticsSEM;
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        switch (this.f92306a) {
            case 0:
                k(scope, (v) hVar, eventIntake);
                break;
            case 1:
                j(scope, (mu.q) hVar, eventIntake);
                break;
            case 2:
                w request = (w) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request instanceof u)) {
                    if (!(request instanceof pu.v)) {
                        boolean z13 = request instanceof s;
                        Object obj = this.f92308c;
                        if (!z13) {
                            if (Intrinsics.d(request, t.f101370a)) {
                                ((m60.w) obj).j((m60.t) this.f92310e);
                                this.f92310e = null;
                                break;
                            }
                        } else {
                            su.a aVar = new su.a(((s) request).f101369a, this, eventIntake);
                            this.f92310e = aVar;
                            ((m60.w) obj).h(aVar);
                            break;
                        }
                    } else {
                        ((tu.d0) this.f92309d).l(scope, ((pu.v) request).f101372a, new z(eventIntake, 11));
                        break;
                    }
                } else {
                    ((b) this.f92307b).k(scope, ((u) request).f101371a, new z(eventIntake, 10));
                    break;
                }
                break;
            case 3:
                y request2 = (y) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                j0 j0Var = (j0) this.f92310e;
                f fVar = v0.f20219a;
                j.z(j0Var, ho2.q.f69782a, null, new o(request2, this, null), 2);
                break;
            case 4:
                x request3 = (x) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request3 instanceof xs0.w)) {
                    if (request3 instanceof xs0.y) {
                        e30 R6 = ((xs0.y) request3).f135845a.R6();
                        R6.n0(Boolean.FALSE);
                        f30 a13 = R6.a();
                        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                        j.z(scope, null, null, new gt0.g(this, a13, eventIntake, request3, null), 3);
                        break;
                    }
                } else {
                    e30 R62 = ((xs0.w) request3).f135843a.R6();
                    R62.n0(Boolean.TRUE);
                    f30 a14 = R62.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    j.z(scope, null, null, new gt0.f(this, a14, eventIntake, request3, null), 3);
                    break;
                }
                break;
            case 5:
                y01.a request4 = (y01.a) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request4, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request4 instanceof y01.a) {
                    f fVar2 = v0.f20219a;
                    j.z(scope, e.f80326c, null, new z01.a(this, request4, eventIntake, scope, null), 2);
                    break;
                }
                break;
            case 6:
                pb1.s request5 = (pb1.s) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request5, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (request5 instanceof p) {
                    f fVar3 = v0.f20219a;
                    j.z(scope, ho2.q.f69782a, null, new d(this, request5, null), 2);
                    break;
                }
                break;
            default:
                p02.t request6 = (p02.t) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request6, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request6 instanceof p02.s)) {
                    if (!(request6 instanceof p02.r)) {
                        if (request6 instanceof p02.p) {
                            j.z(scope, null, null, new p02.o(this, request6, eventIntake, null), 3);
                            break;
                        }
                    } else {
                        f fVar4 = v0.f20219a;
                        j.z(scope, ho2.q.f69782a, null, new n(this, request6, null), 2);
                        break;
                    }
                } else {
                    ((d0) this.f92310e).e(scope, ((p02.s) request6).f98460a, eventIntake);
                    break;
                }
                break;
        }
    }

    public final void j(j0 scope, mu.q request, r eventIntake) {
        uj2.q L;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (!(request instanceof mu.p)) {
            boolean z13 = request instanceof mu.o;
            Object obj = this.f92309d;
            if (z13) {
                f30 f30Var = ((mu.o) request).f88219a;
                eventIntake.a(new k(((j80.b) obj).a(f30Var), f30Var));
                return;
            } else {
                if (request instanceof mu.s) {
                    mu.s sVar = (mu.s) request;
                    ((j80.b) obj).b(sVar.f88241b, sVar.f88240a);
                    return;
                }
                return;
            }
        }
        mu.p pVar = (mu.p) request;
        String str = pVar.f88222a;
        xj2.c cVar = (xj2.c) this.f92310e;
        if (cVar != null) {
            cVar.dispose();
        }
        int i13 = c.f92311a[pVar.f88223b.ordinal()];
        Object obj2 = this.f92307b;
        if (i13 == 1) {
            L = ((i2) obj2).L(str);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            L = ((i2) obj2).P(str);
        }
        hk2.b bVar = new hk2.b(new zt.b(21, new hs.a(14, this, eventIntake)), new zt.b(22, new wt.c(this, 10)), i.f27923c);
        try {
            L.d(new jk2.d0(bVar, 0L));
            this.f92310e = bVar;
        } catch (NullPointerException e13) {
            throw e13;
        } catch (Throwable th3) {
            throw n60.o.g(th3, "subscribeActual failed", th3);
        }
    }

    public final void k(j0 scope, v request, r eventIntake) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof mu.n) {
            ((a) this.f92307b).j(scope, (mu.n) request, eventIntake);
        } else if (request instanceof mu.q) {
            ((b) this.f92309d).j(scope, (mu.q) request, eventIntake);
        } else if (request instanceof mu.u) {
            ((d0) this.f92310e).e(scope, ((mu.u) request).f88244a, eventIntake);
        }
    }

    public b(i2 pinRepository, tb0.h crashReporting, j80.b carouselUtil) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        this.f92307b = pinRepository;
        this.f92308c = crashReporting;
        this.f92309d = carouselUtil;
    }

    public b(i2 pinRepository, js0.a hidePinRequest, x10.b pinApiService, d1 trackingParamAttacher) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(hidePinRequest, "hidePinRequest");
        Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f92307b = pinRepository;
        this.f92308c = hidePinRequest;
        this.f92309d = pinApiService;
        this.f92310e = trackingParamAttacher;
    }

    public b(b adsBaseSEP, m60.w eventManager, tu.d0 webBrowserSEP) {
        Intrinsics.checkNotNullParameter(adsBaseSEP, "adsBaseSEP");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(webBrowserSEP, "webBrowserSEP");
        this.f92307b = adsBaseSEP;
        this.f92308c = eventManager;
        this.f92309d = webBrowserSEP;
    }

    public b(rd.j stateBasedPinalytics, o0 pinalyticsManager, d1 trackingParamAttacher, j0 appScope) {
        Intrinsics.checkNotNullParameter(stateBasedPinalytics, "stateBasedPinalytics");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(appScope, "appScope");
        this.f92307b = stateBasedPinalytics;
        this.f92308c = pinalyticsManager;
        this.f92309d = trackingParamAttacher;
        this.f92310e = appScope;
    }

    public b(i2 pinRepository, m60.w eventManager, a11.y urlInfoHelper, ws1.a linkValidation) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(urlInfoHelper, "urlInfoHelper");
        Intrinsics.checkNotNullParameter(linkValidation, "linkValidation");
        this.f92307b = pinRepository;
        this.f92308c = eventManager;
        this.f92309d = urlInfoHelper;
        this.f92310e = linkValidation;
    }

    public b(m60.w eventManager, b60.b activeUserManager, b20.c toastSEP, ll.j screenNavigatorSEP) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(toastSEP, "toastSEP");
        Intrinsics.checkNotNullParameter(screenNavigatorSEP, "screenNavigatorSEP");
        this.f92307b = eventManager;
        this.f92308c = activeUserManager;
        this.f92309d = toastSEP;
        this.f92310e = screenNavigatorSEP;
    }

    public b(o02.a rvcService, ll.j screenNavigator, d0 pinalyticsSEM, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(rvcService, "rvcService");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(pinalyticsSEM, "pinalyticsSEM");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f92307b = rvcService;
        this.f92308c = screenNavigator;
        this.f92310e = pinalyticsSEM;
        this.f92309d = eventManager;
    }
}
