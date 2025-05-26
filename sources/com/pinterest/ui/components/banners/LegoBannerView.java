package com.pinterest.ui.components.banners;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.components.banners.LegoBannerView;
import com.pinterest.ui.imageview.WebImageView;
import ja2.c;
import ja2.d;
import ja2.e;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import l60.a;
import l60.b;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import vn1.g;
import yb0.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/components/banners/LegoBannerView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ja2/c", "bannerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class LegoBannerView extends CardView {
    public static final /* synthetic */ int A = 0;

    /* renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f52253h;

    /* renamed from: i, reason: collision with root package name */
    public final WebImageView f52254i;

    /* renamed from: j, reason: collision with root package name */
    public final WebImageView f52255j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewGroup f52256k;

    /* renamed from: l, reason: collision with root package name */
    public final WebImageView f52257l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltAvatar f52258m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltIconButton f52259n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltText f52260o;

    /* renamed from: p, reason: collision with root package name */
    public final GestaltText f52261p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltButtonGroup f52262q;

    /* renamed from: r, reason: collision with root package name */
    public Function0 f52263r;

    /* renamed from: s, reason: collision with root package name */
    public Function0 f52264s;

    /* renamed from: t, reason: collision with root package name */
    public final int f52265t;

    /* renamed from: u, reason: collision with root package name */
    public final int f52266u;

    /* renamed from: v, reason: collision with root package name */
    public final int f52267v;

    /* renamed from: w, reason: collision with root package name */
    public final int f52268w;

    /* renamed from: x, reason: collision with root package name */
    public final int f52269x;

    /* renamed from: y, reason: collision with root package name */
    public c f52270y;

    /* renamed from: z, reason: collision with root package name */
    public String f52271z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBannerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52263r = e.f75315j;
        this.f52264s = e.f75316k;
        this.f52265t = bs1.c.W(this, eo1.c.lego_spacing_vertical_small);
        this.f52266u = bs1.c.W(this, eo1.c.lego_spacing_vertical_medium);
        this.f52267v = bs1.c.W(this, eo1.c.lego_spacing_vertical_large);
        this.f52268w = bs1.c.W(this, eo1.c.lego_image_height_default);
        this.f52269x = bs1.c.W(this, eo1.c.lego_image_height_large);
        this.f52270y = c.RoundedCorners;
        View.inflate(getContext(), b.lego_banner_view, this);
        View findViewById = findViewById(a.banner_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52253h = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(a.banner_background_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(a.banner_cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f52254i = (WebImageView) findViewById3;
        float W = bs1.c.W(this, eo1.c.lego_image_corner_radius);
        View findViewById4 = findViewById(a.banner_center_icon_image);
        WebImageView webImageView = (WebImageView) findViewById4;
        webImageView.g2(W, W, W, W);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52255j = webImageView;
        View findViewById5 = findViewById(a.banner_content_image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f52256k = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(a.banner_content_image);
        WebImageView webImageView2 = (WebImageView) findViewById6;
        webImageView2.g2(W, W, W, W);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f52257l = webImageView2;
        View findViewById7 = findViewById(a.banner_content_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f52258m = (GestaltAvatar) findViewById7;
        View findViewById8 = findViewById(a.banner_close);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f52259n = (GestaltIconButton) findViewById8;
        View findViewById9 = findViewById(a.banner_title);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f52260o = (GestaltText) findViewById9;
        View findViewById10 = findViewById(a.banner_message);
        GestaltText gestaltText = (GestaltText) findViewById10;
        gestaltText.i(ja2.b.f75311j);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "apply(...)");
        this.f52261p = gestaltText;
        View findViewById11 = findViewById(a.banner_button_group);
        final GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById11;
        final int i13 = 0;
        gestaltButtonGroup.b(new gm1.a() { // from class: ja2.a
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                LegoBannerView.x(gestaltButtonGroup, this, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        this.f52262q = gestaltButtonGroup;
        k0();
        r0();
    }

    public static void x(GestaltButtonGroup gestaltButtonGroup, LegoBannerView this$0, gm1.c event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.f(gestaltButtonGroup);
        if (r.Z0(event, gestaltButtonGroup)) {
            this$0.f52263r.invoke();
        } else if (r.a1(event, gestaltButtonGroup)) {
            this$0.f52264s.invoke();
        }
    }

    public final void D() {
        bs1.c.X0(this.f52256k);
        vn1.b bVar = vn1.b.CENTER;
        this.f52260o.i(new m(bVar, 8));
        this.f52261p.i(new m(bVar, 9));
    }

    public final void L() {
        r.r(this.f52262q, fm1.c.GONE);
        o0();
    }

    public final boolean T() {
        return bs1.c.o1(this.f52254i) || bs1.c.o1(this.f52255j);
    }

    public final void X(String str) {
        int i13 = d.f75314a[this.f52270y.ordinal()];
        if (i13 == 1) {
            this.f52257l.loadUrl(str);
        } else {
            if (i13 != 2) {
                return;
            }
            this.f52258m.H2(new kw1.c(str, 15));
        }
    }

    public final void Y(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (Intrinsics.d(this.f52271z, imageUrl)) {
            return;
        }
        this.f52271z = imageUrl;
        X(imageUrl);
        if (!(!z.j(imageUrl))) {
            D();
            return;
        }
        bs1.c.U1(this.f52256k);
        vn1.b bVar = vn1.b.START;
        this.f52260o.i(new m(bVar, 8));
        this.f52261p.i(new m(bVar, 9));
    }

    public final void Z(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f52261p.i(new ip.d(21, text));
        r0();
    }

    public final void a0(g variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f52261p.i(new mp.m(variant, 13));
    }

    public final void d0(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        r.q(this.f52262q, bs1.c.h2(text));
        o0();
    }

    public final void g0(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        r.s(this.f52262q, bs1.c.h2(text));
        o0();
    }

    public final void k0() {
        int i13 = eo1.b.color_themed_background_elevation_floating;
        Context context = getContext();
        Object obj = d5.a.f53679a;
        k(context.getColor(i13));
        t(bs1.c.W(this, r0.lego_banner_corner_radius));
        l(bs1.c.W(this, r0.lego_banner_elevation));
        setClipChildren(false);
        setClipToPadding(false);
        requestLayout();
    }

    public final void o0() {
        GestaltButtonGroup gestaltButtonGroup = this.f52262q;
        fm1.c cVar = gestaltButtonGroup.d().f28013b.f139302c;
        fm1.c cVar2 = fm1.c.VISIBLE;
        int i13 = (cVar == cVar2 || gestaltButtonGroup.d().f28012a.f139302c == cVar2) ? this.f52268w : this.f52269x;
        WebImageView webImageView = this.f52257l;
        ViewGroup.LayoutParams layoutParams = webImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (layoutParams.height != i13) {
            layoutParams.height = i13;
        }
        webImageView.setLayoutParams(layoutParams);
    }

    public final void r0() {
        boolean T = T();
        int i13 = this.f52266u;
        int i14 = T ? i13 : this.f52267v;
        GestaltText gestaltText = this.f52260o;
        ViewGroup.LayoutParams layoutParams = gestaltText.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i14;
        gestaltText.setLayoutParams(marginLayoutParams);
        rn1.a l13 = gestaltText.l();
        fm1.c cVar = l13 != null ? l13.f108855m : null;
        fm1.c cVar2 = fm1.c.VISIBLE;
        boolean z13 = true;
        int i15 = cVar == cVar2 ? this.f52265t : T() ? i13 : 0;
        GestaltText gestaltText2 = this.f52261p;
        ViewGroup.LayoutParams layoutParams2 = gestaltText2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = i15;
        gestaltText2.setLayoutParams(marginLayoutParams2);
        p pVar = new p();
        ConstraintLayout constraintLayout = this.f52253h;
        pVar.j(constraintLayout);
        int i16 = gestaltText2.l().f108860r;
        rn1.a l14 = gestaltText.l();
        if ((l14 != null ? l14.f108855m : null) != cVar2 && !T()) {
            z13 = false;
        }
        pVar.m(i16, 3, z13 ? gestaltText.l().f108860r : a.banner_top_spacing_guideline, 4, i15);
        if (!z13) {
            i13 = 0;
        }
        pVar.E(i16, 3, i13);
        pVar.b(constraintLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoBannerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52263r = e.f75315j;
        this.f52264s = e.f75316k;
        this.f52265t = bs1.c.W(this, eo1.c.lego_spacing_vertical_small);
        this.f52266u = bs1.c.W(this, eo1.c.lego_spacing_vertical_medium);
        this.f52267v = bs1.c.W(this, eo1.c.lego_spacing_vertical_large);
        this.f52268w = bs1.c.W(this, eo1.c.lego_image_height_default);
        this.f52269x = bs1.c.W(this, eo1.c.lego_image_height_large);
        this.f52270y = c.RoundedCorners;
        View.inflate(getContext(), b.lego_banner_view, this);
        View findViewById = findViewById(a.banner_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52253h = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(a.banner_background_image);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(a.banner_cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f52254i = (WebImageView) findViewById3;
        float W = bs1.c.W(this, eo1.c.lego_image_corner_radius);
        View findViewById4 = findViewById(a.banner_center_icon_image);
        WebImageView webImageView = (WebImageView) findViewById4;
        webImageView.g2(W, W, W, W);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52255j = webImageView;
        View findViewById5 = findViewById(a.banner_content_image_container);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f52256k = (ViewGroup) findViewById5;
        View findViewById6 = findViewById(a.banner_content_image);
        WebImageView webImageView2 = (WebImageView) findViewById6;
        webImageView2.g2(W, W, W, W);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "apply(...)");
        this.f52257l = webImageView2;
        View findViewById7 = findViewById(a.banner_content_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f52258m = (GestaltAvatar) findViewById7;
        View findViewById8 = findViewById(a.banner_close);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f52259n = (GestaltIconButton) findViewById8;
        View findViewById9 = findViewById(a.banner_title);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f52260o = (GestaltText) findViewById9;
        View findViewById10 = findViewById(a.banner_message);
        GestaltText gestaltText = (GestaltText) findViewById10;
        gestaltText.i(ja2.b.f75311j);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "apply(...)");
        this.f52261p = gestaltText;
        View findViewById11 = findViewById(a.banner_button_group);
        final GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById11;
        final int i14 = 1;
        gestaltButtonGroup.b(new gm1.a() { // from class: ja2.a
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i142 = i14;
                LegoBannerView.x(gestaltButtonGroup, this, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById11, "apply(...)");
        this.f52262q = gestaltButtonGroup;
        k0();
        r0();
    }
}
