package tu;

import ao2.v0;
import com.pinterest.api.model.e8;
import com.pinterest.api.model.f30;
import do2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.c1;
import x02.i2;
import x02.x0;

/* loaded from: classes3.dex */
public final class d0 implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119279a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f119280b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f119281c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f119282d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f119283e;

    /* renamed from: f, reason: collision with root package name */
    public Object f119284f;

    /* renamed from: g, reason: collision with root package name */
    public Object f119285g;

    public d0(a11.d clickthroughHelperFactory, m60.w eventManager, zy.d0 pinalyticsSEP, xr.a attributionReporting, es.a adFormats) {
        Intrinsics.checkNotNullParameter(clickthroughHelperFactory, "clickthroughHelperFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f119280b = clickthroughHelperFactory;
        this.f119281c = eventManager;
        this.f119282d = pinalyticsSEP;
        this.f119283e = attributionReporting;
        this.f119284f = adFormats;
    }

    public static final Object j(d0 d0Var, String str, Function2 function2, Function1 function1, bl2.c cVar) {
        Object collect = new j0(ve.h.x((i2) d0Var.f119281c, str), new f2.z(function1, null, 1)).collect(new y1.b(function2, 9), cVar);
        return collect == cl2.a.COROUTINE_SUSPENDED ? collect : Unit.f80348a;
    }

    public static final void k(d0 d0Var, u50.r rVar, e8 e8Var, f30 f30Var) {
        d0Var.getClass();
        rVar.a(new ml0.c(e8Var, f30Var));
    }

    @Override // l82.g
    public final void e(ao2.j0 scope, l82.h hVar, u50.r eventIntake) {
        int i13 = this.f119279a;
        Object obj = this.f119282d;
        switch (i13) {
            case 0:
                l(scope, (b0) hVar, eventIntake);
                break;
            case 1:
                ml0.b0 request = (ml0.b0) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request instanceof ml0.a0)) {
                    if (!(request instanceof ml0.y)) {
                        if (request instanceof ml0.z) {
                            ko2.f fVar = v0.f20219a;
                            kotlin.jvm.internal.j.z(scope, ho2.q.f69782a, null, new nl0.m(this, null), 2);
                            break;
                        }
                    } else {
                        kotlin.jvm.internal.j.z(scope, null, null, new nl0.l(this, request, scope, null), 3);
                        break;
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new nl0.j(this, request, eventIntake, null), 3);
                    break;
                }
                break;
            case 2:
                bi1.y request2 = (bi1.y) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request2, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request2 instanceof bi1.w)) {
                    if (!(request2 instanceof bi1.v)) {
                        if (!(request2 instanceof bi1.u)) {
                            if (!(request2 instanceof bi1.t)) {
                                if (request2 instanceof bi1.x) {
                                    bi1.x xVar = (bi1.x) request2;
                                    xVar.getClass();
                                    ((lb0.r) obj).i("PREF_ENABLE_CLOSED_CAPTIONS", xVar.f22886a);
                                    break;
                                }
                            } else {
                                kotlin.jvm.internal.j.z(scope, null, null, new ci1.b(this, request2, null), 3);
                                break;
                            }
                        } else {
                            m60.w wVar = m60.u.f85943a;
                            String pinUid = ((bi1.u) request2).f22880a;
                            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                            wVar.d(new jc0.v(new zt1.d(pinUid, null), false, 0L, 30));
                            break;
                        }
                    } else {
                        m60.u.f85943a.d(new lq.a(((bi1.v) request2).f22881a));
                        break;
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new ci1.a(this, request2, null), 3);
                    break;
                }
                break;
            default:
                bx1.q request3 = (bx1.q) hVar;
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(request3, "request");
                Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
                if (!(request3 instanceof bx1.p)) {
                    if (!(request3 instanceof bx1.l)) {
                        if (request3 instanceof bx1.m) {
                            ((zy.d0) obj).e(scope, ((bx1.m) request3).f24110a, eventIntake);
                            break;
                        }
                    } else {
                        ((xw1.a) this.f119284f).f136124b.d();
                        eventIntake.a(bx1.f.f24104a);
                        break;
                    }
                } else {
                    kotlin.jvm.internal.j.z(scope, null, null, new cx1.b(this, eventIntake, null), 3);
                    break;
                }
                break;
        }
    }

    public final void l(ao2.j0 scope, b0 request, u50.r eventIntake) {
        xj2.c l13;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof y) {
            f30 f30Var = ((y) request).f119312a;
            String D = com.bumptech.glide.c.D(f30Var);
            if (D == null) {
                D = "";
            }
            xj2.c cVar = (xj2.c) this.f119285g;
            if (cVar != null) {
                cVar.dispose();
            }
            l13 = ((a11.d) this.f119280b).a(c1.a()).l(D, f30Var, false, null, null, null, null, true, false, null, null, true, false, null, false, false, false);
            this.f119285g = l13;
            return;
        }
        if (request instanceof x) {
            ((m60.w) this.f119281c).d(new a11.c());
            return;
        }
        if (request instanceof a0) {
            ((zy.d0) this.f119282d).e(scope, ((a0) request).f119266a, eventIntake);
            return;
        }
        if (request instanceof z) {
            z zVar = (z) request;
            if (((es.c) ((es.a) this.f119284f)).l0(zVar.f119313a)) {
                ((xr.a) this.f119283e).a(zVar.f119313a, true);
            }
        }
    }

    public d0(zy.d0 pinalyticsSEP, px.c analyticsRepository, b60.b activeUserManager, xw1.b filterViewAdapterForOverviewFactory, yw1.e toplineMetricsAdapterFactory) {
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(filterViewAdapterForOverviewFactory, "filterViewAdapterForOverviewFactory");
        Intrinsics.checkNotNullParameter(toplineMetricsAdapterFactory, "toplineMetricsAdapterFactory");
        this.f119282d = pinalyticsSEP;
        this.f119280b = analyticsRepository;
        this.f119281c = activeUserManager;
        this.f119283e = toplineMetricsAdapterFactory;
        this.f119284f = ((so.v0) filterViewAdapterForOverviewFactory).a();
        this.f119285g = xk2.m.b(new yv1.i(this, 1));
    }

    public d0(i2 pinRepository, lb0.r prefsManagerUser, nx.b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f119281c = pinRepository;
        this.f119282d = prefsManagerUser;
        this.f119283e = pinAuxHelper;
        this.f119285g = xk2.m.b(new ee1.d(this, 21));
    }

    public d0(x0 boardRepository, i2 pinRepository, e12.d boardService, ll.j navigator, kn0.b bulkActionStatusLongPollingManager, b20.c toastForSEP) {
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(boardService, "boardService");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(bulkActionStatusLongPollingManager, "bulkActionStatusLongPollingManager");
        Intrinsics.checkNotNullParameter(toastForSEP, "toastForSEP");
        this.f119280b = boardRepository;
        this.f119281c = pinRepository;
        this.f119282d = boardService;
        this.f119283e = navigator;
        this.f119284f = bulkActionStatusLongPollingManager;
        this.f119285g = toastForSEP;
    }
}
