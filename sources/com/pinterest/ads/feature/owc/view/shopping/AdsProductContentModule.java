package com.pinterest.ads.feature.owc.view.shopping;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.wz;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import df.j1;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import kg.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g;
import lh0.g1;
import lh0.z3;
import m21.a;
import m60.w;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import ps.p;
import ps.q;
import ps.s;
import sh.f;
import u50.o0;
import vu.b;
import vu.c;
import vu.d;
import xo.k;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/shopping/AdsProductContentModule;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vu/b", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsProductContentModule extends ConstraintLayout implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f35388j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f35389a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f35390b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f35391c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f35392d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltIcon f35393e;

    /* renamed from: f, reason: collision with root package name */
    public final RatingBar f35394f;

    /* renamed from: g, reason: collision with root package name */
    public final Group f35395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f35396h;

    /* renamed from: i, reason: collision with root package name */
    public b f35397i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsProductContentModule(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(f30 pin, List images) {
        Object d13;
        o0 e13;
        String title;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(images, "images");
        boolean U0 = b40.U0(pin);
        GestaltText gestaltText = this.f35390b;
        if (U0) {
            String Y = b40.Y(pin);
            if (Y != null) {
                a0.p(gestaltText, Y);
            }
        } else {
            wy0 n13 = b40.n(pin);
            if (n13 != null) {
                a0.p(gestaltText, dl2.b.j1(n13));
                Boolean O3 = n13.O3();
                Intrinsics.checkNotNullExpressionValue(O3, "getIsVerifiedMerchant(...)");
                if (O3.booleanValue()) {
                    dl2.b.z(this.f35393e, c.f126642l);
                }
            }
        }
        boolean z13 = !images.isEmpty();
        GestaltText gestaltText2 = this.f35391c;
        int i13 = 0;
        if (z13 && (title = ((a) images.get(0)).getTitle()) != null) {
            a0.p(gestaltText2, title);
        }
        wz j13 = po1.c.j(pin);
        if (j13 != null && (e13 = po1.c.e(j13, eo1.b.color_gray_500, eo1.b.color_blue_500, null)) != null) {
            this.f35392d.i(new d(e13, i13));
        }
        Integer V = b40.V(pin);
        int intValue = V != null ? V.intValue() : 0;
        if (intValue > 0) {
            RatingBar ratingBar = this.f35394f;
            bs1.c.U1(ratingBar);
            if (ratingBar != null) {
                ratingBar.setRating(b40.W(pin));
            }
        }
        if (intValue > 0) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String d14 = dl2.b.d1(pin, resources, null, null, 14);
            if (d14 != null) {
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                d13 = j1.Y("%s %s %s", new Object[]{b40.V(pin), bs1.c.c2(s.dot, resources2), d14}, null, 6);
            } else {
                d13 = b40.V(pin);
            }
        } else {
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            d13 = dl2.b.d1(pin, resources3, null, null, 14);
        }
        if (d13 != null) {
            GestaltText gestaltText3 = this.f35389a;
            bs1.c.U1(gestaltText3);
            gestaltText3.setText(d13.toString());
        }
        int[] k13 = this.f35395g.k();
        if (k13 != null) {
            int length = k13.length;
            while (i13 < length) {
                findViewById(k13[i13]).setOnClickListener(this);
                i13++;
            }
        }
        gestaltText2.j(new k(this, 22));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wy0 z53;
        n.a(view);
        Intrinsics.checkNotNullParameter(view, "view");
        b bVar = this.f35397i;
        if (bVar != null) {
            int id3 = view.getId();
            int[] k13 = this.f35395g.k();
            if (k13 == null) {
                k13 = new int[0];
            }
            if (c0.w(k13, id3)) {
                vu.k kVar = (vu.k) bVar;
                if (b40.U0(kVar.Y0())) {
                    return;
                }
                f30 Y0 = kVar.Y0();
                Intrinsics.checkNotNullParameter(Y0, "<this>");
                hh t53 = Y0.t5();
                NavigationImpl navigationImpl = null;
                if ((t53 != null ? t53.d() : null) != null) {
                    hh t54 = Y0.t5();
                    if (t54 != null) {
                        z53 = t54.d();
                    }
                    z53 = null;
                } else {
                    pz0 u53 = Y0.u5();
                    if ((u53 != null ? u53.c() : null) != null) {
                        pz0 u54 = Y0.u5();
                        if (u54 != null) {
                            z53 = u54.c();
                        }
                        z53 = null;
                    } else if (Y0.y6() != null) {
                        z53 = Y0.y6();
                    } else {
                        if (Y0.z5() != null) {
                            z53 = Y0.z5();
                        }
                        z53 = null;
                    }
                }
                if (z53 == null && (z53 = kVar.Y0().C5()) == null) {
                    z53 = kVar.Y0().I5();
                }
                w wVar = kVar.f35323j0;
                if (z53 != null) {
                    g S0 = kVar.S0();
                    S0.getClass();
                    z3 z3Var = a4.f83298b;
                    g1 g1Var = (g1) S0.f83348a;
                    if (g1Var.o("android_ads_only_profile_shopping_scrolling_module", "enabled", z3Var) || g1Var.l("android_ads_only_profile_shopping_scrolling_module")) {
                        r41.k kVar2 = r41.k.f106176a;
                        NavigationImpl a13 = r41.k.a(z53);
                        if (a13 != null) {
                            d0 a14 = f.a();
                            Intrinsics.checkNotNullExpressionValue(a14, "get(...)");
                            f1 f1Var = f1.NAVIGATION;
                            u0 u0Var = u0.ADS_ONLY_PROFILE_EXTERNAL;
                            HashMap o13 = ep.b.o("aop_origin", "AdsShoppingScrollingModule");
                            Unit unit = Unit.f80348a;
                            a14.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : o13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                            navigationImpl = a13;
                        }
                        wVar.d(navigationImpl);
                        return;
                    }
                }
                String o14 = b40.o(kVar.Y0());
                if (o14 != null) {
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.f.f50743e.getValue(), o14);
                    z03.z(r41.b.AdsShoppingScrollingModule.ordinal(), "ADS_ONLY_PROFILE_ORIGIN");
                    wVar.d(z03);
                }
            }
        }
    }

    public /* synthetic */ AdsProductContentModule(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsProductContentModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, q.ads_shopping_left_aligned_content_view, this);
        View findViewById = inflate.findViewById(p.creator_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f35390b = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(p.title_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f35391c = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(p.price_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f35392d = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(p.group_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f35395g = (Group) findViewById4;
        View findViewById5 = inflate.findViewById(p.vmp_badge_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f35393e = (GestaltIcon) findViewById5;
        this.f35394f = (RatingBar) inflate.findViewById(p.rating_bar_shopping_content_view);
        View findViewById6 = inflate.findViewById(p.rating_count_shipping_shopping_content_view);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f35389a = (GestaltText) findViewById6;
        this.f35396h = true;
    }
}
