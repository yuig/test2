package c31;

import android.app.Application;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.repository.pin.PinService;
import h32.a4;
import h32.d4;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import lh0.n1;
import nr0.q;
import nx.d1;
import o82.i2;
import o82.j3;
import o82.m3;
import o82.s0;
import o82.s1;
import o82.t1;
import so.kb;
import so.ob;
import y01.p1;

/* loaded from: classes5.dex */
public final class t extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final PinService f25615c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.d0 f25616d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f25617e;

    /* renamed from: f, reason: collision with root package name */
    public final g31.e f25618f;

    /* renamed from: g, reason: collision with root package name */
    public final f31.a0 f25619g;

    /* renamed from: h, reason: collision with root package name */
    public final ob f25620h;

    /* renamed from: i, reason: collision with root package name */
    public final g31.c f25621i;

    /* renamed from: j, reason: collision with root package name */
    public final zy.d0 f25622j;

    /* renamed from: k, reason: collision with root package name */
    public final nu.b f25623k;

    /* renamed from: l, reason: collision with root package name */
    public final l82.y f25624l;

    /* renamed from: m, reason: collision with root package name */
    public final g01.a f25625m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(PinService pinService, dl1.t pinRepository, zf0.f educationHelper, d1 trackingParamAttacher, m60.d0 gridColumnCountProvider, b60.b activeUserManager, g31.e allPinsSharedPrefsSEP, f31.a0 searchBarSEP, ob perfLoggerSEPFactory, s1 sectionPerfLoggerSEPFactory, g31.c allPinsNavigationSEP, g31.a imagePrefetcherSEP, zy.d0 pinalyticsSEP, nu.b impressionSEP, Application application, ao2.j0 scope, final es.a adFormats, final es.h adsCommonDisplay) {
        super(scope);
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(gridColumnCountProvider, "gridColumnCountProvider");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(allPinsSharedPrefsSEP, "allPinsSharedPrefsSEP");
        Intrinsics.checkNotNullParameter(searchBarSEP, "searchBarSEP");
        Intrinsics.checkNotNullParameter(perfLoggerSEPFactory, "perfLoggerSEPFactory");
        Intrinsics.checkNotNullParameter(sectionPerfLoggerSEPFactory, "sectionPerfLoggerSEPFactory");
        Intrinsics.checkNotNullParameter(allPinsNavigationSEP, "allPinsNavigationSEP");
        Intrinsics.checkNotNullParameter(imagePrefetcherSEP, "imagePrefetcherSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(impressionSEP, "impressionSEP");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f25615c = pinService;
        this.f25616d = gridColumnCountProvider;
        this.f25617e = activeUserManager;
        this.f25618f = allPinsSharedPrefsSEP;
        this.f25619g = searchBarSEP;
        this.f25620h = perfLoggerSEPFactory;
        this.f25621i = allPinsNavigationSEP;
        this.f25622j = pinalyticsSEP;
        this.f25623k = impressionSEP;
        kv0.p pVar = new kv0.p(4);
        Set set = h31.g.f66813a;
        educationHelper.getClass();
        final boolean h10 = zf0.f.h();
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        kv0.p.b(pVar, new m3() { // from class: h31.d
            @Override // o82.m3
            public final int a(int i13, i0 i0Var) {
                int a13;
                f item = (f) i0Var;
                es.a adFormats2 = adFormats;
                Intrinsics.checkNotNullParameter(adFormats2, "$adFormats");
                es.h adsCommonDisplay2 = adsCommonDisplay;
                Intrinsics.checkNotNullParameter(adsCommonDisplay2, "$adsCommonDisplay");
                Intrinsics.checkNotNullParameter(item, "item");
                f30 f30Var = item.f66811a;
                Set set2 = g.f66813a;
                a13 = q.f91882a.a(f30Var, i13, bp1.h.e(y32.f.PROFILE, h10).f103256a.e(), new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d), n1.f83436b.c(), null, null, adFormats2, adsCommonDisplay2);
                if (g.f66813a.contains(Integer.valueOf(a13))) {
                    return a13;
                }
                return 1;
            }
        }, new bt0.u(13), new s0(new h31.c(pinService)), false, t1.b(), new h31.j(pinRepository), new gx.e(trackingParamAttacher, new gv0.b(this, 7)), imagePrefetcherSEP, null, ((kb) sectionPerfLoggerSEPFactory).a(s92.i.ALL_PINS), RecyclerViewTypes.VIEW_TYPE_ATG_VISUALIZATION_BANNER);
        kv0.p.b(pVar, new com.pinterest.boardAutoCollages.k0(29), new bt0.u(14), new j3(kotlin.collections.e0.b(s.f25614a)), false, new com.pinterest.boardAutoCollages.l0(12), null, null, null, null, null, 1000);
        g01.a d2 = pVar.d();
        this.f25625m = d2;
        l82.a0 a0Var = new l82.a0(scope);
        m0 stateTransformer = new m0(new f31.l0(), (o82.i0) d2.f63224a, new lt.j(2), new lt.j(1));
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f25624l = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f25624l.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f25624l.e();
    }

    public final void h(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        wy0 f13 = ((b60.d) this.f25617e).f();
        boolean d2 = Intrinsics.d(userId, f13 != null ? f13.getUid() : null);
        l82.y.i(this.f25624l, new n0(userId, d2, this.f25616d, new f31.m0(false, false, null, null, 15), new o82.j0(kotlin.collections.e0.b(new i2(new h31.a(userId, d2), 2))), new zy.l0(new h32.i0(d4.USER, d2 ? a4.USER_SELF : a4.USER_OTHERS, null, h32.g0.USER_PINS, null, null), 2)), false, new p1(this, 14), 2);
    }
}
