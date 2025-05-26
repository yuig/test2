package dv;

import ck2.i;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.h;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.repository.pin.PinService;
import gi.m;
import h32.f1;
import h32.g0;
import h32.u0;
import hk2.k;
import hk2.y;
import hk2.z;
import jk2.d0;
import jk2.e0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g;
import lh0.g1;
import lh0.z3;
import m60.u;
import n60.o;
import ps.l;
import uj2.q;
import x02.a2;
import x02.i2;
import yk1.n;

/* loaded from: classes3.dex */
public final class f extends yk1.b implements bv.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f56287a;

    /* renamed from: b, reason: collision with root package name */
    public final l f56288b;

    /* renamed from: c, reason: collision with root package name */
    public final m f56289c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f56290d;

    /* renamed from: e, reason: collision with root package name */
    public final PinService f56291e;

    /* renamed from: f, reason: collision with root package name */
    public final es.a f56292f;

    /* renamed from: g, reason: collision with root package name */
    public final g f56293g;

    /* renamed from: h, reason: collision with root package name */
    public f30 f56294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String pinId, l pinAnalytics, m adsReasonsModel, i2 pinRepository, PinService pinService, es.a adFormats, g adsExperiments) {
        super(0);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(adsReasonsModel, "adsReasonsModel");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        this.f56287a = pinId;
        this.f56288b = pinAnalytics;
        this.f56289c = adsReasonsModel;
        this.f56290d = pinRepository;
        this.f56291e = pinService;
        this.f56292f = adFormats;
        this.f56293g = adsExperiments;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        n view = (bv.b) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        g gVar = this.f56293g;
        gVar.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) gVar.f83348a;
        boolean o13 = g1Var.o("android_waista_genai_async", "enabled", z3Var);
        ck2.c cVar = i.f27923c;
        int i13 = 0;
        String str = this.f56287a;
        i2 i2Var = this.f56290d;
        if (o13 || g1Var.l("android_waista_genai_async")) {
            y yVar = new y(new e0(i2Var.L(str)), new ck2.f(hk2.i.f69412a));
            zt.b bVar = new zt.b(27, new b(this, i13));
            a2 a2Var = i.f27924d;
            k e13 = new k(new k(new z(yVar, a2Var, bVar, a2Var, cVar), new h(9, c.f56282j), 0), new ep.a(16, new b(this, 2)), 1).e(wj2.c.a());
            hk2.b bVar2 = new hk2.b(new zt.b(28, new d(this)), new zt.b(29, new e(this)), cVar);
            e13.f(bVar2);
            addDisposable(bVar2);
            return;
        }
        q L = i2Var.L(str);
        hk2.b bVar3 = new hk2.b(new a(0, new b(this, 3)), new a(1, c.f56283k), cVar);
        try {
            L.d(new d0(bVar3, 0L));
            addDisposable(bVar3);
        } catch (NullPointerException e14) {
            throw e14;
        } catch (Throwable th3) {
            throw o.g(th3, "subscribeActual failed", th3);
        }
    }

    public final void p3() {
        f30 f30Var = this.f56294h;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String o13 = b40.o(f30Var);
        if (o13 != null) {
            u.f85943a.d(Navigation.z0((ScreenLocation) com.pinterest.screens.f.f50743e.getValue(), o13));
        }
    }

    public final void q3() {
        nx.d0 d0Var = this.f56288b.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.WAISTA_GEN_AI_LABEL, (r18 & 4) != 0 ? null : g0.PIN_AD_TARGETING_REASONS_DIALOG, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public final void r3(g0 componentType, u0 elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        this.f56288b.f122379a.F(componentType, elementType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (kh2.m2.v1(r7) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        r4 = r24.f56294h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r4 = r4.X5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0266, code lost:
    
        if (r10.booleanValue() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x005c, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("pin");
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0076, code lost:
    
        if (com.pinterest.api.model.b40.o0(r7) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0051, code lost:
    
        if (n60.o.y(r7, "getIsThirdPartyAd(...)") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021b, code lost:
    
        if (r10.booleanValue() == false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s3() {
        /*
            Method dump skipped, instructions count: 1495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv.f.s3():void");
    }
}
