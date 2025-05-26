package w41;

import android.app.Application;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import o82.m3;
import o82.t1;
import x02.i2;

/* loaded from: classes5.dex */
public final class s1 extends l82.b implements l82.i {

    /* renamed from: c, reason: collision with root package name */
    public final k22.m f128077c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.d0 f128078d;

    /* renamed from: e, reason: collision with root package name */
    public final f31.a0 f128079e;

    /* renamed from: f, reason: collision with root package name */
    public final k51.u f128080f;

    /* renamed from: g, reason: collision with root package name */
    public final v41.h f128081g;

    /* renamed from: h, reason: collision with root package name */
    public final v41.g f128082h;

    /* renamed from: i, reason: collision with root package name */
    public final v41.e f128083i;

    /* renamed from: j, reason: collision with root package name */
    public final l82.y f128084j;

    /* renamed from: k, reason: collision with root package name */
    public final g01.a f128085k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(k22.m userService, i2 pinRepository, nx.d1 trackingParamAttacher, v41.a imagePrefetcherSEP, zy.d0 pinalyticsSEP, f31.a0 searchBarSEP, k51.u viewOptionsSEP, v41.h optionsSEP, v41.g navigationSEP, v41.e loggingSEP, zf0.f educationHelper, Application application, ao2.j0 scope, final es.a adFormats, final es.h adsCommonDisplay) {
        super(scope);
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(imagePrefetcherSEP, "imagePrefetcherSEP");
        Intrinsics.checkNotNullParameter(pinalyticsSEP, "pinalyticsSEP");
        Intrinsics.checkNotNullParameter(searchBarSEP, "searchBarSEP");
        Intrinsics.checkNotNullParameter(viewOptionsSEP, "viewOptionsSEP");
        Intrinsics.checkNotNullParameter(optionsSEP, "optionsSEP");
        Intrinsics.checkNotNullParameter(navigationSEP, "navigationSEP");
        Intrinsics.checkNotNullParameter(loggingSEP, "loggingSEP");
        Intrinsics.checkNotNullParameter(educationHelper, "educationHelper");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f128077c = userService;
        this.f128078d = pinalyticsSEP;
        this.f128079e = searchBarSEP;
        this.f128080f = viewOptionsSEP;
        this.f128081g = optionsSEP;
        this.f128082h = navigationSEP;
        this.f128083i = loggingSEP;
        kv0.p pVar = new kv0.p(4);
        v41.l lVar = new v41.l(userService);
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        o82.s0 s0Var = new o82.s0(lVar);
        v41.d dVar = new v41.d(pinRepository);
        educationHelper.getClass();
        final boolean h10 = zf0.f.h();
        Set set = q0.f128069a;
        final j6.b autoplayQualifier = new j6.b(hf0.b.f69002b, hf0.b.f69003c, hf0.b.f69004d);
        final lh0.n1 experiments = lh0.n1.f83436b.c();
        Intrinsics.checkNotNullParameter(autoplayQualifier, "autoplayQualifier");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        int i13 = 16;
        kv0.p.b(pVar, new m3() { // from class: w41.p0
            @Override // o82.m3
            public final int a(int i14, l82.i0 i0Var) {
                int a13;
                i item = (i) i0Var;
                j6.b autoplayQualifier2 = autoplayQualifier;
                Intrinsics.checkNotNullParameter(autoplayQualifier2, "$autoplayQualifier");
                lh0.n1 experiments2 = experiments;
                Intrinsics.checkNotNullParameter(experiments2, "$experiments");
                es.a adFormats2 = adFormats;
                Intrinsics.checkNotNullParameter(adFormats2, "$adFormats");
                es.h adsCommonDisplay2 = adsCommonDisplay;
                Intrinsics.checkNotNullParameter(adsCommonDisplay2, "$adsCommonDisplay");
                Intrinsics.checkNotNullParameter(item, "item");
                a13 = nr0.q.f91882a.a(item.f128016a, i14, q0.d(y32.f.PROFILE, h10, false).f103256a.e(), autoplayQualifier2, experiments2, null, null, adFormats2, adsCommonDisplay2);
                return q0.f128069a.contains(Integer.valueOf(a13)) ? a13 : pk.a0.j0(item.f128016a);
            }
        }, new bt0.u(15), s0Var, false, t1.b(), dVar, new gx.e(trackingParamAttacher, new gv0.b(this, i13)), imagePrefetcherSEP, null, null, 776);
        kv0.p.b(pVar, new q1(0), new bt0.u(i13), new o82.h(x0.f128097d), false, new com.pinterest.boardAutoCollages.l0(17), null, null, null, null, null, 1000);
        g01.a d2 = pVar.d();
        this.f128085k = d2;
        lt.j jVar = new lt.j(2);
        l82.a0 a0Var = new l82.a0(scope);
        o1 stateTransformer = new o1(new f31.l0(), new x31.o(jVar), new k51.e(), (o82.i0) d2.f63224a, jVar);
        Intrinsics.checkNotNullParameter(stateTransformer, "stateTransformer");
        a0Var.f82204b = stateTransformer;
        a0Var.c(this, application);
        this.f128084j = a0Var.a();
    }

    @Override // l82.i
    public final do2.i a() {
        return this.f128084j.d();
    }

    @Override // l82.i
    public final u50.r c() {
        return this.f128084j.e();
    }

    public final void h(String userId, boolean z13, h32.i0 loggingContext, String str, List filters, k51.n viewOptionsAppearance, String str2, boolean z14) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(viewOptionsAppearance, "viewOptionsAppearance");
        zy.l0 l0Var = new zy.l0(loggingContext, str);
        int i13 = 2;
        k51.v b13 = k51.v.b(z0.f128100a, viewOptionsAppearance, null, l0Var, 2);
        f31.m0 b14 = f31.m0.b(z0.f128101b, z13, b13, l0Var, 2);
        x31.p pVar = w31.d.f127917a;
        Intrinsics.checkNotNullParameter(filters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = filters.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(((x31.a) it.next()).a(), bm1.n.UNSELECTED);
        }
        l82.y.i(this.f128084j, new p1(userId, z13, str2, new o82.j0(kotlin.collections.f0.j(new o82.i2(new v41.i(kotlin.collections.q0.f80391a, z13, userId, str2), i13), new o82.i2(new r0(0, 0), i13))), b14, x31.p.b(pVar, filters, null, linkedHashMap, l0Var, new x31.s(h32.u0.PIN_FILTER, 6), RecyclerViewTypes.VIEW_TYPE_SHUFFLE_CAROUSEL), b13, l0Var, z14), false, new j41.i(this, 4), 2);
    }
}
