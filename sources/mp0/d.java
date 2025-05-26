package mp0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.bu0;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import gs0.k;
import h32.f1;
import h32.g0;
import hs1.q;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.j;
import lh0.z3;
import m60.s0;
import nx.d0;
import nx.d1;
import om1.l;
import ps.n;
import ps.p;
import uq.w;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class d extends w {

    /* renamed from: d, reason: collision with root package name */
    public final d0 f87899d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f87900e;

    /* renamed from: f, reason: collision with root package name */
    public l51.a f87901f;

    /* renamed from: g, reason: collision with root package name */
    public a11.d f87902g;

    /* renamed from: h, reason: collision with root package name */
    public q f87903h;

    /* renamed from: i, reason: collision with root package name */
    public ni1.d f87904i;

    /* renamed from: j, reason: collision with root package name */
    public k f87905j;

    /* renamed from: k, reason: collision with root package name */
    public d1 f87906k;

    /* renamed from: l, reason: collision with root package name */
    public es.a f87907l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f87908m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltText f87909n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f87910o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltText f87911p;

    /* renamed from: q, reason: collision with root package name */
    public final RatingBar f87912q;

    /* renamed from: r, reason: collision with root package name */
    public final AppCompatImageView f87913r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltButton f87914s;

    /* renamed from: t, reason: collision with root package name */
    public f30 f87915t;

    /* renamed from: u, reason: collision with root package name */
    public int f87916u;

    /* renamed from: v, reason: collision with root package name */
    public final v f87917v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, d0 pinalytics, Function0 logImpressions) {
        super(context, 8);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(logImpressions, "logImpressions");
        this.f87899d = pinalytics;
        this.f87900e = logImpressions;
        this.f87917v = m.b(new jh0.d(this, 28));
        View inflate = LayoutInflater.from(context).inflate(ps.q.ads_qcm_drawer_metadata_view, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -1));
        final int i13 = 0;
        setPadding(0, getResources().getDimensionPixelOffset(n.ads_qcm_drawer_view_pager_offset), 0, 0);
        View findViewById = inflate.findViewById(p.creator_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f87909n = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(p.title_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f87910o = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(p.price_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f87911p = (GestaltText) findViewById3;
        this.f87912q = (RatingBar) inflate.findViewById(p.rating_bar_shopping_content_view);
        View findViewById4 = inflate.findViewById(p.badge_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f87913r = (AppCompatImageView) findViewById4;
        View findViewById5 = inflate.findViewById(p.clickthrough_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById5;
        this.f87914s = gestaltButton;
        View findViewById6 = inflate.findViewById(p.opaque_one_tap_overflow_button);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        View findViewById7 = inflate.findViewById(p.rating_count_shipping_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f87908m = (GestaltText) findViewById7;
        gestaltButton.e(new gm1.a(this) { // from class: mp0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f87893b;

            {
                this.f87893b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                f30 f30Var;
                int i14 = i13;
                d this$0 = this.f87893b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xl1.a) {
                            f30 f30Var2 = this$0.f87915t;
                            if (f30Var2 != null) {
                                String id3 = f30Var2.getId();
                                f1 f1Var = f1.QCM_CTA_CLICK;
                                l51.a aVar = this$0.f87901f;
                                if (aVar == null) {
                                    Intrinsics.r("adsQcmAnalytics");
                                    throw null;
                                }
                                d0.B(this$0.f87899d, f1Var, g0.ADS_QCM_DRAWER, id3, aVar.a(this$0.f87916u, f30Var2), 16);
                            }
                            this$0.L();
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!(it instanceof l) || (f30Var = this$0.f87915t) == null) {
                            return;
                        }
                        k kVar = this$0.f87905j;
                        if (kVar != null) {
                            k.a(kVar, f30Var, jo1.a.RELATED_PINS, false, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
                            return;
                        } else {
                            Intrinsics.r("pinOverflowMenuModalProvider");
                            throw null;
                        }
                }
            }
        });
        final int i14 = 1;
        ((GestaltIconButton) findViewById6).u(new gm1.a(this) { // from class: mp0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f87893b;

            {
                this.f87893b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                f30 f30Var;
                int i142 = i14;
                d this$0 = this.f87893b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xl1.a) {
                            f30 f30Var2 = this$0.f87915t;
                            if (f30Var2 != null) {
                                String id3 = f30Var2.getId();
                                f1 f1Var = f1.QCM_CTA_CLICK;
                                l51.a aVar = this$0.f87901f;
                                if (aVar == null) {
                                    Intrinsics.r("adsQcmAnalytics");
                                    throw null;
                                }
                                d0.B(this$0.f87899d, f1Var, g0.ADS_QCM_DRAWER, id3, aVar.a(this$0.f87916u, f30Var2), 16);
                            }
                            this$0.L();
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (!(it instanceof l) || (f30Var = this$0.f87915t) == null) {
                            return;
                        }
                        k kVar = this$0.f87905j;
                        if (kVar != null) {
                            k.a(kVar, f30Var, jo1.a.RELATED_PINS, false, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
                            return;
                        } else {
                            Intrinsics.r("pinOverflowMenuModalProvider");
                            throw null;
                        }
                }
            }
        });
    }

    public final void L() {
        boolean a13;
        f30 f30Var;
        String D;
        f30 f30Var2 = this.f87915t;
        if (f30Var2 != null) {
            this.f87900e.invoke();
            ni1.d dVar = this.f87904i;
            if (dVar == null) {
                Intrinsics.r("deepLinkHelper");
                throw null;
            }
            String id3 = f30Var2.getId();
            es.a aVar = this.f87907l;
            if (aVar == null) {
                Intrinsics.r("adFormats");
                throw null;
            }
            a13 = dVar.a(f30Var2, id3, null, null, null, (r19 & 32) != 0 ? false : false, (r19 & 64) != 0 ? false : false, aVar);
            if (a13 || (D = com.bumptech.glide.c.D(f30Var2)) == null) {
                f30Var = f30Var2;
            } else {
                a11.e eVar = (a11.e) this.f87917v.getValue();
                l51.a aVar2 = this.f87901f;
                if (aVar2 == null) {
                    Intrinsics.r("adsQcmAnalytics");
                    throw null;
                }
                f30Var = f30Var2;
                a11.e.c(eVar, D, f30Var, false, 0, 0, null, false, false, this.f87899d.p(), aVar2.a(this.f87916u, f30Var2), null, false, false, null, false, false, false, 130268);
            }
            String id4 = f30Var.getId();
            Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
            l51.a aVar3 = this.f87901f;
            if (aVar3 == null) {
                Intrinsics.r("adsQcmAnalytics");
                throw null;
            }
            int i13 = this.f87916u;
            f30 pin = f30Var;
            Intrinsics.checkNotNullParameter(pin, "pin");
            HashMap hashMap = new HashMap();
            hashMap.put("closeup_navigation_type", SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK);
            vr.b bVar = (vr.b) aVar3.f81586c;
            bVar.c(pin, hashMap);
            aVar3.f81585b.c(pin, hashMap);
            hashMap.put("click_type", "clickthrough");
            hashMap.put("clickthrough_source", "u'grid");
            hashMap.put(SbaPinRep.AUX_DATA_IS_MDL_AD, "true");
            hashMap.put("mdl_did_succeed", String.valueOf(a13));
            hashMap.put("is_third_party_ad", String.valueOf(pin.i5().booleanValue()));
            j jVar = aVar3.f81588e;
            jVar.getClass();
            z3 z3Var = a4.f83297a;
            g1 g1Var = (g1) jVar.f83394a;
            if (g1Var.o("android_ads_analytics_improvements", "enabled", z3Var) || g1Var.l("android_ads_analytics_improvements")) {
                bVar.a(pin, hashMap);
            }
            aVar3.c(i13, pin, hashMap);
            d1 d1Var = this.f87906k;
            if (d1Var == null) {
                Intrinsics.r("trackingParamAttacher");
                throw null;
            }
            String id5 = pin.getId();
            Intrinsics.checkNotNullExpressionValue(id5, "getUid(...)");
            this.f87899d.m(id4, hashMap, d1Var.c(id5), g0.ADS_QCM_DRAWER, null);
        }
    }

    public final void T(bu0 bu0Var) {
        Drawable drawable;
        if (Intrinsics.d(bu0Var.j(), kj1.b.PRIME.getBadgeId())) {
            Context context = getContext();
            int i13 = s0.badge_prime;
            Object obj = d5.a.f53679a;
            drawable = context.getDrawable(i13);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            this.f87913r.setImageDrawable(drawable);
        }
    }
}
