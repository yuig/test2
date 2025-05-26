package qa2;

import android.content.Context;
import com.pinterest.api.model.f30;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.r2;
import x02.i2;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103337j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(LegoPinGridCellImpl legoPinGridCellImpl, int i13) {
        super(0);
        this.f103336i = i13;
        this.f103337j = legoPinGridCellImpl;
    }

    public final ua2.n0 b() {
        int i13 = this.f103336i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103337j;
        switch (i13) {
            case 7:
                ua2.n0 n0Var = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                n0Var.I(tn1.c.f118617i);
                n0Var.H(vn1.c.SUBTLE);
                n0Var.G("");
                return n0Var;
            case 13:
                ua2.n0 n0Var2 = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                n0Var2.I(tn1.c.f118617i);
                return n0Var2;
            case 23:
                ua2.n0 n0Var3 = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                n0Var3.I(tn1.c.f118618j);
                return n0Var3;
            case 24:
                return new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
            case 25:
                ua2.n0 n0Var4 = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                if (legoPinGridCellImpl.K) {
                    n0Var4.I(tn1.c.f118617i);
                }
                return n0Var4;
            case 28:
                ua2.n0 n0Var5 = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                n0Var5.I(tn1.c.f118617i);
                return n0Var5;
            default:
                ua2.n0 n0Var6 = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                n0Var6.I(tn1.c.f118617i);
                return n0Var6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f103336i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103337j;
        switch (i13) {
            case 0:
                qc2.a aVar = legoPinGridCellImpl.f52453q1;
                if (aVar != null) {
                    return new ua2.s(legoPinGridCellImpl, aVar);
                }
                Intrinsics.r("viewabilityCalculator");
                throw null;
            case 1:
                qc2.a aVar2 = legoPinGridCellImpl.f52453q1;
                if (aVar2 != null) {
                    return new ua2.t0(legoPinGridCellImpl, aVar2);
                }
                Intrinsics.r("viewabilityCalculator");
                throw null;
            case 2:
                switch (i13) {
                    case 2:
                        return Boolean.valueOf(legoPinGridCellImpl.getExperiments().a0());
                    default:
                        return Boolean.valueOf(legoPinGridCellImpl.getExperiments().a0());
                }
            case 3:
                switch (i13) {
                    case 2:
                        return Boolean.valueOf(legoPinGridCellImpl.getExperiments().a0());
                    default:
                        return Boolean.valueOf(legoPinGridCellImpl.getExperiments().a0());
                }
            case 4:
                return new ua2.f(legoPinGridCellImpl, legoPinGridCellImpl.getImageCache(), legoPinGridCellImpl.getResources().getDimensionPixelSize(m60.r0.attribution_badge_container_padding), ua2.e.END);
            case 5:
                legoPinGridCellImpl.getClass();
                nx.d0 d0Var = legoPinGridCellImpl.W1;
                es.a adFormats = legoPinGridCellImpl.getAdFormats();
                i92.k kVar = legoPinGridCellImpl.f52441n1;
                if (kVar != null) {
                    return new ua2.i(legoPinGridCellImpl, d0Var, adFormats, kVar);
                }
                Intrinsics.r("toastUtils");
                throw null;
            case 6:
                ua2.j jVar = new ua2.j(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                jVar.I(tn1.c.f118617i);
                jVar.H(vn1.c.SUBTLE);
                String string = legoPinGridCellImpl.getResources().getString(wy1.f.added_by);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                jVar.G(string);
                return jVar;
            case 7:
                return b();
            case 8:
                j80.b bVar = legoPinGridCellImpl.f52469u1;
                if (bVar == null) {
                    Intrinsics.r("carouselUtil");
                    throw null;
                }
                ni1.d deepLinkHelper = legoPinGridCellImpl.getDeepLinkHelper();
                lh0.j C = legoPinGridCellImpl.C();
                r2 experiments = legoPinGridCellImpl.getExperiments();
                qc2.a aVar3 = legoPinGridCellImpl.f52453q1;
                if (aVar3 == null) {
                    Intrinsics.r("viewabilityCalculator");
                    throw null;
                }
                fs.c D = legoPinGridCellImpl.D();
                es.a adFormats2 = legoPinGridCellImpl.getAdFormats();
                vr.a adsCommonAnalytics = legoPinGridCellImpl.getAdsCommonAnalytics();
                es.h adsCommonDisplay = legoPinGridCellImpl.getAdsCommonDisplay();
                hs1.q imageCache = legoPinGridCellImpl.getImageCache();
                LegoPinGridCellImpl legoPinGridCellImpl2 = this.f103337j;
                return new ua2.n(legoPinGridCellImpl2, legoPinGridCellImpl2, legoPinGridCellImpl2, bVar, deepLinkHelper, C, experiments, aVar3, D, adFormats2, imageCache, adsCommonDisplay, adsCommonAnalytics, new t(legoPinGridCellImpl2));
            case 9:
                return new ua2.j0(legoPinGridCellImpl, legoPinGridCellImpl, legoPinGridCellImpl, legoPinGridCellImpl.getImageCache(), legoPinGridCellImpl.getAdFormats(), new u(legoPinGridCellImpl, 0), new y3.l(legoPinGridCellImpl, 2), new v(legoPinGridCellImpl, 0));
            case 10:
                ua2.k0 k0Var = legoPinGridCellImpl.f52468u0;
                if (k0Var != null) {
                    return new ua2.o(legoPinGridCellImpl, k0Var.f121531J);
                }
                Intrinsics.r("primaryMediaPiece");
                throw null;
            case 11:
                ua2.p0 p0Var = new ua2.p0(legoPinGridCellImpl, legoPinGridCellImpl.Y1, new w(legoPinGridCellImpl, 0));
                p0Var.I(tn1.c.f118617i);
                return p0Var;
            case 12:
                Context context = legoPinGridCellImpl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new ua2.r(legoPinGridCellImpl, context);
            case 13:
                return b();
            case 14:
                f30 pin = legoPinGridCellImpl.C0;
                if (pin != null) {
                    legoPinGridCellImpl.W1.u(h32.f1.DL_AD_CLOSEUP_OVERLAY_CLICKTHROUGH, pin.getUid(), legoPinGridCellImpl.t(legoPinGridCellImpl.getPinUid()), legoPinGridCellImpl.I0(), false);
                    legoPinGridCellImpl.getEventManager().d(new ls1.b(pin.getUid()));
                    Intrinsics.checkNotNullParameter(pin, "pin");
                    legoPinGridCellImpl.i2(pin, false);
                }
                return Unit.f80348a;
            case 15:
                boolean X = legoPinGridCellImpl.getExperiments().X();
                String string2 = legoPinGridCellImpl.getContext().getString(nw.c.dl_ad_closeup_overlay_text);
                hs.e d03 = X ? legoPinGridCellImpl.d0() : null;
                Long l13 = X ? 10000L : null;
                Intrinsics.f(string2);
                return new ua2.l(this.f103337j, string2, new r(legoPinGridCellImpl, 14), l13, d03);
            case 16:
                return new ua2.u(legoPinGridCellImpl);
            case 17:
                i2 i2Var = legoPinGridCellImpl.f52421i1;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                PinService pinService = legoPinGridCellImpl.f52437m1;
                if (pinService == null) {
                    Intrinsics.r("pinService");
                    throw null;
                }
                i92.k kVar2 = legoPinGridCellImpl.f52441n1;
                if (kVar2 != null) {
                    return new ua2.x(legoPinGridCellImpl, i2Var, pinService, kVar2, new yk1.a(legoPinGridCellImpl.getResources(), legoPinGridCellImpl.getContext().getTheme()), legoPinGridCellImpl.W1, legoPinGridCellImpl.X());
                }
                Intrinsics.r("toastUtils");
                throw null;
            case 18:
                return new ua2.y(legoPinGridCellImpl.getAdFormats(), legoPinGridCellImpl, new u(legoPinGridCellImpl, 1), new w(legoPinGridCellImpl, 1));
            case 19:
                return new ua2.b0(legoPinGridCellImpl, legoPinGridCellImpl.Z1, null, null, 0, rm1.c.DEFAULT, 0, 0, false, false, null, 4060);
            case 20:
                int i14 = legoPinGridCellImpl.Y1;
                rm1.c cVar = legoPinGridCellImpl.f52479x ? rm1.c.LIGHT : rm1.c.DEFAULT;
                nl1.d coreFragment = legoPinGridCellImpl.getCoreFragment();
                return new ua2.d0(legoPinGridCellImpl, i14, legoPinGridCellImpl, cVar, coreFragment instanceof ta2.a ? (ta2.a) coreFragment : null);
            case 21:
                ua2.q qVar = new ua2.q(legoPinGridCellImpl, legoPinGridCellImpl.Y1, rm1.q.ANGLED_PIN, rm1.c.SUBTLE, rm1.i.SM, g92.d.VR, new w(legoPinGridCellImpl, 2));
                vn1.c color = vn1.c.SUBTLE;
                Intrinsics.checkNotNullParameter(color, "gestaltTextColor");
                ua2.c0 c0Var = qVar.f121594k;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(color, "textColor");
                va2.l lVar = c0Var.f121451o;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(color, "color");
                lVar.f125401m.b(color);
                return qVar;
            case 22:
                int i15 = legoPinGridCellImpl.Y1;
                return new ua2.f0(legoPinGridCellImpl, i15, i15, legoPinGridCellImpl.L2, legoPinGridCellImpl.M2, legoPinGridCellImpl);
            case 23:
                return b();
            case 24:
                return b();
            case 25:
                return b();
            case 26:
                Context context2 = legoPinGridCellImpl.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new ua2.l0(legoPinGridCellImpl, context2, legoPinGridCellImpl.Y1, legoPinGridCellImpl.f52479x ? vn1.c.LIGHT : vn1.c.DEFAULT);
            case 27:
                Context context3 = legoPinGridCellImpl.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new ua2.m0(legoPinGridCellImpl, context3, legoPinGridCellImpl.Y1, legoPinGridCellImpl.f52479x ? vn1.c.LIGHT : vn1.c.DEFAULT);
            case 28:
                return b();
            default:
                return b();
        }
    }
}
