package ua2;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.r2;
import lh0.z3;

/* loaded from: classes4.dex */
public final class n extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final h1 f121565j;

    /* renamed from: k, reason: collision with root package name */
    public final a1 f121566k;

    /* renamed from: l, reason: collision with root package name */
    public final ni1.d f121567l;

    /* renamed from: m, reason: collision with root package name */
    public final lh0.j f121568m;

    /* renamed from: n, reason: collision with root package name */
    public final r2 f121569n;

    /* renamed from: o, reason: collision with root package name */
    public final fs.c f121570o;

    /* renamed from: p, reason: collision with root package name */
    public final es.a f121571p;

    /* renamed from: q, reason: collision with root package name */
    public final wa2.g f121572q;

    /* renamed from: r, reason: collision with root package name */
    public final es.h f121573r;

    /* renamed from: s, reason: collision with root package name */
    public final vr.a f121574s;

    /* renamed from: t, reason: collision with root package name */
    public final qa2.t f121575t;

    /* renamed from: u, reason: collision with root package name */
    public final vn1.c f121576u;

    /* renamed from: v, reason: collision with root package name */
    public final rm1.c f121577v;

    /* renamed from: w, reason: collision with root package name */
    public vn1.c f121578w;

    /* renamed from: x, reason: collision with root package name */
    public rm1.c f121579x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f121580y;

    /* renamed from: z, reason: collision with root package name */
    public final int f121581z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(LegoPinGridCellImpl legoGridCell, LegoPinGridCellImpl utilsProvider, LegoPinGridCellImpl navigationManager, j80.b carouselUtil, ni1.d deepLinkHelper, lh0.j adsExperiments, r2 experiments, qc2.a viewabilityCalculator, fs.c saleDealAdDisplayUtils, es.a adFormats, hs1.q imageCache, es.h adsCommonDisplay, vr.a adsCommonAnalytics, qa2.t setCollectionPositionProvider) {
        super(legoGridCell);
        wa2.g callToActionDrawable = new wa2.g(legoGridCell, imageCache, experiments);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(utilsProvider, "utilsProvider");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(carouselUtil, "carouselUtil");
        Intrinsics.checkNotNullParameter(deepLinkHelper, "deepLinkHelper");
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(viewabilityCalculator, "viewabilityCalculator");
        Intrinsics.checkNotNullParameter(saleDealAdDisplayUtils, "saleDealAdDisplayUtils");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(callToActionDrawable, "callToActionDrawable");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Intrinsics.checkNotNullParameter(setCollectionPositionProvider, "setCollectionPositionProvider");
        this.f121565j = utilsProvider;
        this.f121566k = navigationManager;
        this.f121567l = deepLinkHelper;
        this.f121568m = adsExperiments;
        this.f121569n = experiments;
        this.f121570o = saleDealAdDisplayUtils;
        this.f121571p = adFormats;
        this.f121572q = callToActionDrawable;
        this.f121573r = adsCommonDisplay;
        this.f121574s = adsCommonAnalytics;
        this.f121575t = setCollectionPositionProvider;
        this.f121576u = vn1.h.f126277c;
        this.f121577v = GestaltIcon.f49405g;
        bs1.c.B(legoGridCell, wy1.a.color_light_gray_chin_cta);
        new AnimatorSet();
        this.f121581z = eo1.b.color_background_default;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // ua2.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ua2.n.B():boolean");
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return this.f121572q.getBounds().contains(i13, i14);
    }

    @Override // ua2.h0
    public final Integer D() {
        return 0;
    }

    public final void E(f30 pin, boolean z13, boolean z14) {
        es.h hVar;
        int i13;
        String h10;
        int i14;
        rm1.q qVar;
        int i15;
        String S;
        boolean z15;
        Intrinsics.checkNotNullParameter(pin, "pin");
        int i16 = m60.x0.direct_to_offsite_learn_more;
        rm1.q qVar2 = rm1.q.ARROW_UP_RIGHT;
        fs.c cVar = this.f121570o;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar = cVar.f62827a;
        int i17 = 3;
        boolean l13 = cVar.l(pin, z13, z14, dVar.a(), new fs.b(dVar, 3));
        String str = null;
        es.h hVar2 = this.f121573r;
        if (l13) {
            hVar = hVar2;
            i13 = 1;
            qVar = qVar2;
            i15 = 0;
            i14 = 0;
            S = cVar.a(pin);
        } else {
            Intrinsics.checkNotNullParameter(pin, "pin");
            hVar = hVar2;
            i13 = 1;
            if (cVar.p(pin, z13, z14, dVar.a(), new fs.b(dVar, 8))) {
                h10 = cVar.b(pin);
            } else {
                es.c cVar2 = (es.c) this.f121571p;
                if (cVar2.F(pin) && z13) {
                    i16 = m60.x0.direct_to_offsite_shop_now;
                } else if (cVar2.K(pin)) {
                    h10 = pin.G3();
                    qVar2 = rm1.q.ARROW_FORWARD;
                } else if (cVar2.P(pin)) {
                    i16 = m60.x0.quiz_take_quiz;
                    qVar2 = rm1.q.ARROW_FORWARD;
                } else if (cVar2.S(pin)) {
                    h10 = pin.G3();
                    qVar2 = rm1.q.ARROW_FORWARD;
                } else {
                    es.v vVar = (es.v) hVar;
                    lh0.d dVar2 = vVar.f60008a;
                    dVar2.getClass();
                    z3 z3Var = a4.f83297a;
                    lh0.g1 g1Var = (lh0.g1) dVar2.f83323a;
                    if (vVar.C(pin, g1Var.o("ads_amazon_native_video_new_chin", "enabled", z3Var) || g1Var.l("ads_amazon_native_video_new_chin"), new es.s(dVar2))) {
                        i14 = 2;
                        qVar = qVar2;
                        i15 = 0;
                        S = b40.S(pin);
                        str = bs1.c.p0(pin);
                    } else {
                        String h13 = cVar2.h(pin);
                        if (h13 != null && h13.length() != 0) {
                            h10 = cVar2.h(pin);
                            int i18 = m.f121562a[vVar.q(pin).ordinal()];
                            if (i18 != 1) {
                                qVar2 = i18 != 2 ? rm1.q.ARROW_FORWARD : rm1.q.ARROW_FORWARD;
                            }
                        }
                    }
                }
                i15 = i16;
                qVar = qVar2;
                str = null;
                i14 = 0;
                S = null;
            }
            qVar = qVar2;
            i15 = 0;
            i14 = 0;
            S = h10;
            str = null;
        }
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean a13 = dVar.a();
        fs.b bVar = new fs.b(dVar, i13);
        rm1.q customIcon = qVar;
        int i19 = i15;
        String url = str;
        if (cVar.h(pin, z13, z14, a13, bVar)) {
            this.f121579x = rm1.c.INFO;
            this.f121578w = vn1.c.INFO;
        } else {
            this.f121579x = GestaltIcon.f49405g;
            this.f121578w = vn1.h.f126277c;
        }
        vn1.c cVar3 = this.f121578w;
        rm1.c cVar4 = this.f121579x;
        wa2.g gVar = this.f121572q;
        Context context = gVar.f128706n;
        if (i19 != 0) {
            S = context.getString(i19);
            Intrinsics.f(S);
        } else if (S == null) {
            S = context.getString(m60.x0.direct_to_offsite_learn_more);
            Intrinsics.checkNotNullExpressionValue(S, "getString(...)");
        }
        gVar.f128717y = S;
        if (cVar3 != null) {
            gVar.f128711s = cVar3;
        }
        if (cVar4 != null) {
            gVar.f128712t = cVar4;
        }
        Intrinsics.checkNotNullParameter(customIcon, "customIcon");
        gVar.f128718z = customIcon;
        Paint.Style style = Paint.Style.STROKE;
        Intrinsics.checkNotNullParameter(style, "style");
        gVar.f128843f.setStyle(style);
        gVar.B = this.f121581z;
        if (url != null) {
            Intrinsics.checkNotNullParameter(url, "url");
            gVar.F = wa2.c.f128682b;
            ((hs1.m) gVar.f128704l).k(url, new androidx.appcompat.widget.q(gVar, i17), null, null);
        }
        gVar.A = i14;
        Intrinsics.checkNotNullParameter(pin, "<this>");
        lh0.j experiments = this.f121568m;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        if (!z13 && !z14 && b40.p0(pin)) {
            experiments.getClass();
            z3 z3Var2 = a4.f83297a;
            lh0.g1 g1Var2 = (lh0.g1) experiments.f83394a;
            if (g1Var2.o("android_ad_handshake", "enabled", z3Var2) || g1Var2.l("android_ad_handshake")) {
                z15 = true;
                this.f121580y = z15;
                ((es.v) hVar).M(pin);
            }
        }
        z15 = false;
        this.f121580y = z15;
        ((es.v) hVar).M(pin);
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121572q;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121497h;
        wa2.g gVar = this.f121572q;
        gVar.g(i17);
        gVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        RectF rectF;
        wa2.g gVar = this.f121572q;
        gVar.f(i13);
        Resources resources = this.f121502f.getResources();
        gVar.f128713u = resources.getDimensionPixelSize(m60.r0.lego_grid_cell_cta_radius_dto);
        gVar.f128709q = resources.getDimensionPixelSize(m60.r0.lego_grid_cell_chin_cta_height);
        gVar.f128838a = this.f121494c;
        int max = Math.max(wa2.l.f128836j, gVar.f128841d);
        gVar.E = new RectF();
        int j13 = ((max - gVar.j()) - (gVar.f128714v * 2)) - gVar.f128715w;
        Integer valueOf = Integer.valueOf(gVar.k());
        if (!gVar.F.f128691a) {
            valueOf = null;
        }
        int intValue = j13 - (valueOf != null ? valueOf.intValue() : 0);
        String str = gVar.f128717y;
        int length = str.length();
        Context context = gVar.f128706n;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        tn1.c cVar = new tn1.c(context);
        bs1.c.u2(cVar, gVar.f128711s, null, 2);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        int i15 = gVar.A;
        TextDirectionHeuristic textDirectionHeuristic = gVar.f128838a ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.f(textDirectionHeuristic);
        StaticLayout y13 = com.bumptech.glide.d.y(str, length, cVar, intValue, alignment, truncateAt, intValue, i15, textDirectionHeuristic);
        gVar.C = y13;
        float height = y13 != null ? y13.getHeight() + (gVar.f128716x * 2) : 0.0f;
        gVar.D = new RectF(0.0f, 0.0f, max, gVar.F.f128691a ? Math.max(height, Math.max(gVar.f128709q, gVar.k())) : Math.max(height, gVar.f128709q));
        gVar.e((!gVar.l() || (rectF = gVar.D) == null) ? 0 : (int) rectF.height());
        return new z0(0, gVar.f128842e);
    }
}
