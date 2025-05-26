package w01;

import android.app.Activity;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import java.util.List;
import kh2.b1;
import kh2.b3;
import kh2.d1;
import kh2.q2;
import kh2.s2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lh0.f4;
import so.n6;
import x02.i2;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127108i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f127109j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f127110k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127111l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f127112m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f127113n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f127114o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f127115p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i13) {
        super(0);
        this.f127108i = i13;
        this.f127110k = obj;
        this.f127111l = obj2;
        this.f127112m = obj3;
        this.f127113n = obj4;
        this.f127114o = obj5;
        this.f127115p = obj6;
        this.f127109j = obj7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        uk1.d presenterPinalytics;
        uj2.q networkStateStream;
        wk1.c cVar;
        wk1.c cVar2;
        i01.e eVar;
        String butNotHolidayFindSource;
        i01.e eVar2;
        f4 f4Var;
        uk1.e eVar3;
        zy.q0 q0Var;
        i2 i2Var;
        b11.g gVar;
        xo0.o oVar;
        boolean z13;
        boolean z14;
        boolean z15;
        nr0.m mVar;
        uk1.d presenterPinalytics2;
        wk1.c cVar3;
        wk1.c cVar4;
        wk1.c cVar5;
        lb0.r rVar;
        cz.e eVar4;
        wk1.d dVar;
        lh0.a0 a0Var;
        int i13 = this.f127108i;
        Object obj = this.f127109j;
        Object obj2 = this.f127115p;
        Object obj3 = this.f127114o;
        Object obj4 = this.f127112m;
        Object obj5 = this.f127111l;
        Object obj6 = this.f127113n;
        Object obj7 = this.f127110k;
        switch (i13) {
            case 0:
                PinCloseupPresenter pinCloseupPresenter = (PinCloseupPresenter) obj7;
                str = pinCloseupPresenter.pinUid;
                presenterPinalytics = pinCloseupPresenter.getPresenterPinalytics();
                networkStateStream = pinCloseupPresenter.getNetworkStateStream();
                cVar = pinCloseupPresenter.parameters;
                yk1.v vVar = cVar.f130137h;
                cVar2 = pinCloseupPresenter.parameters;
                wa2.i iVar = cVar2.f130131b.f103320a;
                eVar = pinCloseupPresenter.closeupNavigationMetadata;
                String z16 = eVar.z();
                if (z16 == null) {
                    z16 = "";
                }
                butNotHolidayFindSource = pinCloseupPresenter.butNotHolidayFindSource(z16);
                eVar2 = pinCloseupPresenter.closeupNavigationMetadata;
                String f13 = eVar2.f();
                ze1.c cVar6 = new ze1.c(butNotHolidayFindSource, f13 == null ? "" : f13);
                f4Var = pinCloseupPresenter.libraryExperiments;
                eVar3 = pinCloseupPresenter.presenterPinalyticsFactory;
                q0Var = pinCloseupPresenter.unscopedPinalyticsSEPFactory;
                i2Var = pinCloseupPresenter.pinRepository;
                gVar = pinCloseupPresenter.monolithHeaderConfig;
                oVar = pinCloseupPresenter.bubbleImpressionLogger;
                z13 = pinCloseupPresenter.useRelatedModulesWPOShopping;
                z14 = pinCloseupPresenter.useRelatedModulesWPOComments;
                z15 = pinCloseupPresenter.useRelatedModulesWPOBoardAttr;
                mVar = pinCloseupPresenter.dynamicGridViewBinderDelegateFactory;
                presenterPinalytics2 = pinCloseupPresenter.getPresenterPinalytics();
                cVar3 = pinCloseupPresenter.parameters;
                wa2.i iVar2 = cVar3.f130131b.f103320a;
                cVar4 = pinCloseupPresenter.parameters;
                qa2.n nVar = cVar4.f130131b;
                cVar5 = pinCloseupPresenter.parameters;
                nr0.l a13 = ((n6) mVar).a(presenterPinalytics2, iVar2, nVar, cVar5.f130137h);
                rVar = pinCloseupPresenter.prefsManagerUser;
                eVar4 = pinCloseupPresenter.anketManager;
                dVar = pinCloseupPresenter.getViewForFeedback;
                a0Var = pinCloseupPresenter.experiments;
                return new com.pinterest.feature.pin.closeup.datasource.k(str, presenterPinalytics, networkStateStream, vVar, iVar, cVar6, f4Var, a0Var, eVar3, q0Var, new j(pinCloseupPresenter, 4), (wk2.a) obj5, i2Var, (g0) obj4, (gx.o) obj6, gVar, (n0) obj3, (p0) obj2, oVar, z13, z14, z15, a13, rVar, (ni0.e) obj, eVar4, dVar);
            case 1:
                k81.l lVar = (k81.l) obj7;
                String str2 = lVar.f78611c;
                uk1.d presenterPinalytics3 = lVar.getPresenterPinalytics();
                wk1.c cVar7 = lVar.f78607a;
                uj2.q qVar = cVar7.f130136g;
                uk1.d presenterPinalytics4 = lVar.getPresenterPinalytics();
                qa2.n nVar2 = cVar7.f130131b;
                n6 n6Var = (n6) ((nr0.m) obj5);
                return new j81.c(str2, presenterPinalytics3, qVar, n6Var.a(presenterPinalytics4, nVar2.f103320a, nVar2, cVar7.f130137h), (sq0.f) obj4, lVar.f78652w0, (ni0.e) obj, (f4) obj6, (String) obj3, (String) obj2, a.a.k("aom/closeup/pins/", lVar.f78611c, "/modules"));
            case 2:
                pe1.h hVar = (pe1.h) obj7;
                id1.h hVar2 = (id1.h) obj5;
                nx.b0 b0Var = (nx.b0) obj;
                return new pe1.g(hVar.w3(), hVar2.f72169h, hVar.f99951p, hVar.f99952q, hVar.f99953r, hVar.f99954s, hVar2.f72162a.f130140k, hVar.f99955t, hVar.getPresenterPinalytics(), hVar.f99956u, hVar.f99957v, (String) obj4, (f4) obj6, (nx.f0) obj3, (lb0.r) obj2, b0Var);
            case 3:
                ((ny1.w) obj7).a((Activity) obj5, (List) obj4, (String) obj6, (Function0) obj3, (Function0) obj2, (Function0) obj);
                return Unit.f80348a;
            default:
                kh2.r0 r0Var = (kh2.r0) ((kh2.o0) obj7);
                bi2.h d2 = r0Var.d();
                b3 b3Var = (b3) obj6;
                try {
                    c0.d.M2("payloadFactory");
                    kh2.c0 c0Var = b3Var.f79444d;
                    rl2.u[] uVarArr = b3.f79440h;
                    ci2.d dVar2 = (ci2.d) c0Var.a(b3Var, uVarArr[3]);
                    c0.d.N();
                    og2.a aVar = ((d1) ((b1) obj5)).f79455a;
                    sg2.a b13 = ((kh2.m) ((kh2.k) obj4)).b();
                    ai2.b e13 = r0Var.e();
                    di2.a aVar2 = (di2.a) b3Var.f79445e.a(b3Var, uVarArr[4]);
                    kh2.l0 l0Var = (kh2.l0) ((kh2.h0) obj3);
                    di2.b b14 = l0Var.b();
                    zg2.a aVar3 = (zg2.a) l0Var.f79592g.a(l0Var, kh2.l0.f79585m[5]);
                    kh2.f0 f0Var = (kh2.f0) ((kh2.d0) obj2);
                    f0Var.getClass();
                    return new di2.j(d2, dVar2, aVar, b13, e13, aVar2, b14, aVar3, (tf2.b) f0Var.f79482a.a(f0Var, kh2.f0.f79481c[0]), ((s2) ((q2) obj)).a(), (di2.l) b3Var.f79446f.a(b3Var, uVarArr[5]));
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k81.l lVar, nr0.m mVar, sq0.f fVar, ni0.e eVar, f4 f4Var, String str, String str2) {
        super(0);
        this.f127108i = 1;
        this.f127110k = lVar;
        this.f127111l = mVar;
        this.f127112m = fVar;
        this.f127109j = eVar;
        this.f127113n = f4Var;
        this.f127114o = str;
        this.f127115p = str2;
    }
}
