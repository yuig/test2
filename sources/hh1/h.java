package hh1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Space;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import we1.n1;

/* loaded from: classes5.dex */
public final class h implements s {

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f69169a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f69170b;

    /* renamed from: c, reason: collision with root package name */
    public GrayWebImageView f69171c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltButton f69172d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltIconButton f69173e;

    /* renamed from: f, reason: collision with root package name */
    public Space f69174f;

    @Override // hh1.s
    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, p92.c.view_idea_pin_tooltip_product_extended, null);
        View findViewById = inflate.findViewById(p92.b.product_price);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f69169a = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(p92.b.product_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f69170b = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(p92.b.product_image);
        GrayWebImageView grayWebImageView = (GrayWebImageView) findViewById3;
        grayWebImageView.setColorFilter(dl2.b.x0(context, eo1.a.color_background_dark_opacity_100));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f69171c = grayWebImageView;
        View findViewById4 = inflate.findViewById(p92.b.product_visit_site_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f69172d = (GestaltButton) findViewById4;
        View findViewById5 = inflate.findViewById(p92.b.product_tag_overflow_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f69173e = (GestaltIconButton) findViewById5;
        View findViewById6 = inflate.findViewById(p92.b.product_price_menu_space);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f69174f = (Space) findViewById6;
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        return inflate;
    }

    @Override // hh1.s
    public final void b(l lVar) {
        final p data = (p) lVar;
        Intrinsics.checkNotNullParameter(data, "data");
        GestaltText gestaltText = this.f69170b;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        String str = data.f69203f;
        if (str == null) {
            str = "";
        }
        a0.p(gestaltText, str);
        SpannableStringBuilder spannableStringBuilder = data.f69204g;
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            GestaltText gestaltText2 = this.f69169a;
            if (gestaltText2 == null) {
                Intrinsics.r("price");
                throw null;
            }
            a0.k0(gestaltText2);
            Space space = this.f69174f;
            if (space == null) {
                Intrinsics.r("spaceBetweenPriceAndMenu");
                throw null;
            }
            bs1.c.U1(space);
        } else {
            GestaltText gestaltText3 = this.f69169a;
            if (gestaltText3 == null) {
                Intrinsics.r("price");
                throw null;
            }
            gestaltText3.i(new n1(data, 19));
            Space space2 = this.f69174f;
            if (space2 == null) {
                Intrinsics.r("spaceBetweenPriceAndMenu");
                throw null;
            }
            bs1.c.X0(space2);
        }
        GrayWebImageView grayWebImageView = this.f69171c;
        if (grayWebImageView == null) {
            Intrinsics.r("image");
            throw null;
        }
        grayWebImageView.loadUrl(data.f69205h);
        GestaltButton gestaltButton = this.f69172d;
        if (gestaltButton == null) {
            Intrinsics.r("visitSiteButton");
            throw null;
        }
        final int i13 = 0;
        gestaltButton.e(new gm1.a() { // from class: hh1.g
            @Override // gm1.a
            public final void h3(gm1.c it) {
                Function0 function0;
                int i14 = i13;
                p data2 = data;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(data2, "$data");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Function0 function02 = data2.f69206i;
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(data2, "$data");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (function0 = data2.f69207j) != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltIconButton gestaltIconButton = this.f69173e;
        if (gestaltIconButton == null) {
            Intrinsics.r("overflowMenuButton");
            throw null;
        }
        final int i14 = 1;
        gestaltIconButton.u(new gm1.a() { // from class: hh1.g
            @Override // gm1.a
            public final void h3(gm1.c it) {
                Function0 function0;
                int i142 = i14;
                p data2 = data;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(data2, "$data");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Function0 function02 = data2.f69206i;
                        if (function02 != null) {
                            function02.invoke();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(data2, "$data");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (function0 = data2.f69207j) != null) {
                            function0.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }
}
