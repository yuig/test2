package lb2;

import a.cb;
import a.k1;
import a.z0;
import android.app.Activity;
import com.pinterest.api.model.wy0;
import com.pinterest.identity.core.error.UnauthException;
import java.util.ArrayList;
import jk2.a1;
import kotlin.jvm.internal.Intrinsics;
import lh0.n1;
import nx.d0;
import nx.o0;
import so.ia;
import so.na;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final at1.d f82822a;

    /* renamed from: b, reason: collision with root package name */
    public final vy.m f82823b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f82824c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f82825d;

    /* renamed from: e, reason: collision with root package name */
    public final wk2.a f82826e;

    /* renamed from: f, reason: collision with root package name */
    public final wk2.a f82827f;

    /* renamed from: g, reason: collision with root package name */
    public final wk2.a f82828g;

    /* renamed from: h, reason: collision with root package name */
    public final m60.e f82829h;

    /* renamed from: i, reason: collision with root package name */
    public final n1 f82830i;

    /* renamed from: j, reason: collision with root package name */
    public final or1.i f82831j;

    /* renamed from: k, reason: collision with root package name */
    public final cr1.a f82832k;

    /* renamed from: l, reason: collision with root package name */
    public final wk2.a f82833l;

    /* renamed from: m, reason: collision with root package name */
    public final u20.d f82834m;

    /* renamed from: n, reason: collision with root package name */
    public final b60.b f82835n;

    /* renamed from: o, reason: collision with root package name */
    public final ia f82836o;

    /* renamed from: p, reason: collision with root package name */
    public final lb0.q f82837p;

    /* renamed from: q, reason: collision with root package name */
    public final f30.b f82838q;

    /* renamed from: r, reason: collision with root package name */
    public final com.pinterest.pushnotification.c f82839r;

    /* renamed from: s, reason: collision with root package name */
    public final wk2.a f82840s;

    /* renamed from: t, reason: collision with root package name */
    public final uk2.f f82841t;

    public x(at1.d application, vy.m analyticsApi, d0 pinalytics, o0 pinalyticsManager, na diskCacheProvider, bf2.d experiencesProvider, bf2.a experimentsManagerProvider, m60.e applicationInfoProvider, n1 experiments, or1.i authLoggingUtils, cr1.a accountService, bf2.d pinterestDatabase, u20.d sendShareServiceWrapper, b60.b activeUserManager, ia authMethodFactory, lb0.q prefsManagerPersisted, f30.b apiUtils, com.pinterest.pushnotification.c gcmRegistrar, na cookieManagerProvider) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        Intrinsics.checkNotNullParameter(diskCacheProvider, "diskCacheProvider");
        Intrinsics.checkNotNullParameter(experiencesProvider, "experiencesProvider");
        Intrinsics.checkNotNullParameter(experimentsManagerProvider, "experimentsManagerProvider");
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(authLoggingUtils, "authLoggingUtils");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(pinterestDatabase, "pinterestDatabase");
        Intrinsics.checkNotNullParameter(sendShareServiceWrapper, "sendShareServiceWrapper");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(authMethodFactory, "authMethodFactory");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
        Intrinsics.checkNotNullParameter(gcmRegistrar, "gcmRegistrar");
        Intrinsics.checkNotNullParameter(cookieManagerProvider, "cookieManagerProvider");
        this.f82822a = application;
        this.f82823b = analyticsApi;
        this.f82824c = pinalytics;
        this.f82825d = pinalyticsManager;
        this.f82826e = diskCacheProvider;
        this.f82827f = experiencesProvider;
        this.f82828g = experimentsManagerProvider;
        this.f82829h = applicationInfoProvider;
        this.f82830i = experiments;
        this.f82831j = authLoggingUtils;
        this.f82832k = accountService;
        this.f82833l = pinterestDatabase;
        this.f82834m = sendShareServiceWrapper;
        this.f82835n = activeUserManager;
        this.f82836o = authMethodFactory;
        this.f82837p = prefsManagerPersisted;
        this.f82838q = apiUtils;
        this.f82839r = gcmRegistrar;
        this.f82840s = cookieManagerProvider;
        this.f82841t = cb.r("create(...)");
    }

    public final kk2.g a(Activity activity, qr1.u params) {
        uj2.b bVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        boolean z13 = params.f105036c;
        bk.f fVar = ck2.i.f27926f;
        int i13 = 0;
        int i14 = 15;
        if (z13) {
            lr1.h type = lr1.h.FacebookLoginMethod;
            mr1.b activityProvider = bs1.c.m(activity);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
            wy0 f13 = ((b60.d) this.f82835n).f();
            if (f13 != null) {
                Boolean B2 = f13.B2();
                Intrinsics.checkNotNullExpressionValue(B2, "getConnectedToGplus(...)");
                boolean booleanValue = B2.booleanValue();
                lb0.q qVar = this.f82837p;
                qVar.k("PREF_GOOGLE_CONNECTED", booleanValue);
                Boolean e33 = f13.e3();
                Intrinsics.checkNotNullExpressionValue(e33, "getHasPassword(...)");
                qVar.k("PREF_HAS_PASSWORD", e33.booleanValue());
            }
            uk2.f fVar2 = this.f82841t;
            fVar2.getClass();
            a1 a1Var = new a1(fVar2);
            Intrinsics.checkNotNullExpressionValue(a1Var, "hide(...)");
            lr1.g a13 = this.f82836o.a(activityProvider, a1Var).a(type, null);
            b20.c cVar = a13.f84605e;
            if (cVar == null) {
                Intrinsics.r("unauthKillSwitch");
                throw null;
            }
            qr1.m mVar = a13.f84601a;
            fk2.l h10 = (cVar.o(mVar) ? a13.e().h(wj2.c.a()) : uj2.b.g(new UnauthException.AuthServiceNotAvailableError(mVar))).h(wj2.c.a());
            Intrinsics.checkNotNullExpressionValue(h10, "observeOn(...)");
            bVar = new fk2.c(1, h10.e(new s(this, i13)).f(new r(4, new ha2.j(this, i14))), fVar);
        } else {
            bVar = fk2.m.f62459a;
        }
        fk2.x f14 = new fk2.g(new xo.c(params, this, activity, 22), 1).f(new r(3, new u(this, params, 2)));
        Intrinsics.checkNotNullExpressionValue(f14, "doOnError(...)");
        fk2.c cVar2 = new fk2.c(1, bVar.b(f14).f(new ua2.v(29, new fk1.u(arrayList, i14))), fVar);
        kk2.g gVar = new kk2.g(new kk2.m(new kk2.c(new k1(this, 29), 0), new z0(new fn1.k(this, params, activity, 20), 14), 0), new r(5, new u(this, params, 3)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar, "doOnError(...)");
        kk2.g gVar2 = new kk2.g(new kk2.g(new kk2.g(new kk2.m(cVar2.c(gVar), new z0(new t(arrayList), 13), 2), new r(0, new u(this, params, 0)), 2), new r(1, new v(this, params, arrayList)), 3), new r(2, new u(this, params, 1)), 1);
        Intrinsics.checkNotNullExpressionValue(gVar2, "doOnError(...)");
        return gVar2;
    }
}
