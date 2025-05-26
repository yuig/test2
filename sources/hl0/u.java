package hl0;

import android.content.Context;
import android.text.Editable;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.hz;
import com.pinterest.feature.pin.closeup.datasource.RelatedModulesModelFilter;
import com.pinterest.feature.pin.closeup.presenter.PinCloseupPresenter;
import ey.k3;
import i01.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lh0.a0;
import lh0.f4;
import lh0.z3;
import m60.g0;
import m60.w;
import nx.d1;
import so.n6;
import w01.n0;
import w01.p0;
import x02.i2;
import zy.q0;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69499i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wk1.q f69500j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f69501k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f69502l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f69503m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f69504n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f69505o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f69506p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f69507q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(wk1.q qVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i13) {
        super(0);
        this.f69499i = i13;
        this.f69500j = qVar;
        this.f69501k = obj;
        this.f69502l = obj2;
        this.f69503m = obj3;
        this.f69504n = obj4;
        this.f69505o = obj5;
        this.f69506p = obj6;
        this.f69507q = obj7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        v0 v0Var;
        uk1.d presenterPinalytics;
        uj2.q networkStateStream;
        sq0.f fVar;
        wk1.c cVar;
        wk1.c cVar2;
        wk1.c cVar3;
        xo0.o oVar;
        b11.g gVar;
        nr0.m mVar;
        uk1.d presenterPinalytics2;
        wk1.c cVar4;
        wk1.c cVar5;
        wk1.c cVar6;
        w wVar;
        i01.e eVar;
        i01.e eVar2;
        f4 f4Var;
        a0 a0Var;
        uk1.e eVar3;
        q0 q0Var;
        g0 g0Var;
        i2 i2Var;
        boolean z13;
        boolean z14;
        boolean z15;
        lb0.r rVar;
        cz.e eVar4;
        tb0.h hVar;
        wk1.d dVar;
        i01.p pVar;
        lh0.o oVar2;
        r01.a aVar;
        lh0.o oVar3;
        k3 k3Var;
        int i13 = this.f69499i;
        Object obj = this.f69507q;
        Object obj2 = this.f69506p;
        Object obj3 = this.f69505o;
        Object obj4 = this.f69504n;
        Object obj5 = this.f69503m;
        Object obj6 = this.f69502l;
        Object obj7 = this.f69501k;
        wk1.q qVar = this.f69500j;
        switch (i13) {
            case 0:
                v vVar = (v) qVar;
                String str2 = vVar.f69509a;
                return new jj0.c(str2, (i2) obj3, (g0) obj2, new t(0, vVar, v.class, "isEligibleForMoreIdeasOnOthersBoard", "isEligibleForMoreIdeasOnOthersBoard()Z", 0), new oj0.h(vVar.getPresenterPinalytics(), (d1) obj7, (com.pinterest.feature.pin.r) obj6, (com.pinterest.feature.pin.j) obj5, vVar.f69518e0, (c2) obj4), vVar, vVar.P, a.a.k("boards/", str2, "/ideas/feed/"), (x12.a) obj, v.x3(vVar, null, 3), vVar.f69513c.f130131b.f103320a, vVar.F);
            case 1:
                PinCloseupPresenter pinCloseupPresenter = (PinCloseupPresenter) qVar;
                str = pinCloseupPresenter.pinUid;
                v0Var = pinCloseupPresenter.relatedPinsExtras;
                presenterPinalytics = pinCloseupPresenter.getPresenterPinalytics();
                networkStateStream = pinCloseupPresenter.getNetworkStateStream();
                fVar = pinCloseupPresenter.imagePrefetcher;
                cVar = pinCloseupPresenter.parameters;
                sq0.m mVar2 = cVar.f130139j;
                cVar2 = pinCloseupPresenter.parameters;
                yk1.v vVar2 = cVar2.f130137h;
                cVar3 = pinCloseupPresenter.parameters;
                wa2.i iVar = cVar3.f130131b.f103320a;
                oVar = pinCloseupPresenter.bubbleImpressionLogger;
                w01.g0 g0Var2 = (w01.g0) obj7;
                gx.o oVar4 = (gx.o) obj6;
                gVar = pinCloseupPresenter.monolithHeaderConfig;
                n0 n0Var = (n0) obj5;
                p0 p0Var = (p0) obj4;
                mVar = pinCloseupPresenter.dynamicGridViewBinderDelegateFactory;
                presenterPinalytics2 = pinCloseupPresenter.getPresenterPinalytics();
                cVar4 = pinCloseupPresenter.parameters;
                wa2.i iVar2 = cVar4.f130131b.f103320a;
                cVar5 = pinCloseupPresenter.parameters;
                qa2.n nVar = cVar5.f130131b;
                cVar6 = pinCloseupPresenter.parameters;
                nr0.l a13 = ((n6) mVar).a(presenterPinalytics2, iVar2, nVar, cVar6.f130137h);
                wVar = pinCloseupPresenter.eventManager;
                ol1.d dVar2 = new ol1.d(wVar);
                eVar = pinCloseupPresenter.closeupNavigationMetadata;
                String z16 = eVar.z();
                if (z16 == null) {
                    z16 = "";
                }
                eVar2 = pinCloseupPresenter.closeupNavigationMetadata;
                String f13 = eVar2.f();
                ze1.c cVar7 = new ze1.c(z16, f13 != null ? f13 : "");
                f4Var = pinCloseupPresenter.libraryExperiments;
                a0Var = pinCloseupPresenter.experiments;
                eVar3 = pinCloseupPresenter.presenterPinalyticsFactory;
                q0Var = pinCloseupPresenter.unscopedPinalyticsSEPFactory;
                g0Var = pinCloseupPresenter.pageSizeProvider;
                i2Var = pinCloseupPresenter.pinRepository;
                z13 = pinCloseupPresenter.useRelatedModulesWPOShopping;
                z14 = pinCloseupPresenter.useRelatedModulesWPOComments;
                z15 = pinCloseupPresenter.useRelatedModulesWPOBoardAttr;
                rVar = pinCloseupPresenter.prefsManagerUser;
                ni0.e eVar5 = (ni0.e) obj2;
                eVar4 = pinCloseupPresenter.anketManager;
                hVar = pinCloseupPresenter.crashReporting;
                dVar = pinCloseupPresenter.getViewForFeedback;
                mc.i iVar3 = (mc.i) obj;
                pVar = pinCloseupPresenter.navigationArrivalExtras;
                hz hzVar = pVar.f70686c;
                oVar2 = pinCloseupPresenter.baseExperimentsHelper;
                long intValue = ((Number) oVar2.k(z3.ACTIVATE_EXPERIMENT, "android_related_modules_pwt_regression_analysis", 0).get(0)).intValue();
                aVar = pinCloseupPresenter.contextNearDupSigsTracker;
                oVar3 = pinCloseupPresenter.baseExperimentsHelper;
                k3Var = pinCloseupPresenter.perfLogger;
                return new com.pinterest.feature.pin.closeup.datasource.l(str, v0Var, presenterPinalytics, networkStateStream, fVar, mVar2, vVar2, iVar, oVar, g0Var2, oVar4, gVar, n0Var, p0Var, a13, dVar2, cVar7, f4Var, a0Var, eVar3, q0Var, g0Var, new RelatedModulesModelFilter(pinCloseupPresenter), new w01.j(pinCloseupPresenter, 5), new w01.j(pinCloseupPresenter, 6), pinCloseupPresenter, (wk2.a) obj3, i2Var, z13, z14, z15, rVar, eVar5, eVar4, hVar, dVar, iVar3, hzVar, intValue, aVar, oVar3, k3Var);
            default:
                oh1.m mVar3 = (oh1.m) qVar;
                Editable editable = (Editable) obj6;
                mVar3.getClass();
                String.valueOf(editable);
                mVar3.a4((Context) obj7, editable, (String) obj5, (String) obj4, (rp0.d) obj3, (rp0.d) obj2, false);
                return Unit.f80348a;
        }
    }
}
