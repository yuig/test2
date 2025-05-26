package hh1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GrayWebImageView;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class j implements s {

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f69177a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltText f69178b;

    /* renamed from: c, reason: collision with root package name */
    public GrayWebImageView f69179c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltIcon f69180d;

    @Override // hh1.s
    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = View.inflate(context, p92.c.view_idea_pin_tooltip_product, null);
        View findViewById = inflate.findViewById(p92.b.product_price);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f69177a = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(p92.b.product_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f69178b = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(p92.b.product_image);
        GrayWebImageView grayWebImageView = (GrayWebImageView) findViewById3;
        grayWebImageView.setColorFilter(dl2.b.x0(context, eo1.a.color_background_dark_opacity_100));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f69179c = grayWebImageView;
        View findViewById4 = inflate.findViewById(p92.b.product_arrow);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f69180d = (GestaltIcon) findViewById4;
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        return inflate;
    }

    @Override // hh1.s
    public final void b(l lVar) {
        q data = (q) lVar;
        Intrinsics.checkNotNullParameter(data, "data");
        GestaltText gestaltText = this.f69178b;
        if (gestaltText == null) {
            Intrinsics.r("title");
            throw null;
        }
        gestaltText.i(new i(data, 0));
        SpannableStringBuilder spannableStringBuilder = data.f69211i;
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            GestaltText gestaltText2 = this.f69177a;
            if (gestaltText2 == null) {
                Intrinsics.r("price");
                throw null;
            }
            a0.k0(gestaltText2);
        } else {
            GestaltText gestaltText3 = this.f69177a;
            if (gestaltText3 == null) {
                Intrinsics.r("price");
                throw null;
            }
            gestaltText3.i(new i(data, 1));
        }
        GrayWebImageView grayWebImageView = this.f69179c;
        if (grayWebImageView == null) {
            Intrinsics.r("image");
            throw null;
        }
        grayWebImageView.loadUrl(data.f69212j);
        Integer num = data.f69213k;
        if (num != null) {
            int intValue = num.intValue();
            GrayWebImageView grayWebImageView2 = this.f69179c;
            if (grayWebImageView2 == null) {
                Intrinsics.r("image");
                throw null;
            }
            grayWebImageView2.setForeground(bs1.c.f0(grayWebImageView2, intValue, null, null, 6));
        }
        GestaltIcon gestaltIcon = this.f69180d;
        if (gestaltIcon != null) {
            gestaltIcon.g2(new i(data, 2));
        } else {
            Intrinsics.r("arrow");
            throw null;
        }
    }
}
