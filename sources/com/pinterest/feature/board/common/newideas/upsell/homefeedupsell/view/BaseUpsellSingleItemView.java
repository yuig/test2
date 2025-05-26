package com.pinterest.feature.board.common.newideas.upsell.homefeedupsell.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import jc0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ky.g;
import ky.h;
import org.jetbrains.annotations.NotNull;
import rj0.a;
import rj0.b;
import vn1.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/board/common/newideas/upsell/homefeedupsell/view/BaseUpsellSingleItemView;", "Landroid/widget/FrameLayout;", "Lrj0/a;", "Lky/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "upsellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BaseUpsellSingleItemView extends FrameLayout implements a, h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45119f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45120a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45121b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f45122c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f45123d;

    /* renamed from: e, reason: collision with root package name */
    public b f45124e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseUpsellSingleItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // rj0.a
    public final void A(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f45124e = listener;
        setOnClickListener(new lj0.a(this, 2));
    }

    @Override // rj0.a
    public final void M3(int i13) {
        Context context = getContext();
        int i14 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        int color = context.getColor(i14);
        WebImageView webImageView = this.f45123d;
        webImageView.setColorFilter(color);
        webImageView.setImageResource(i13);
    }

    @Override // rj0.a
    public final void T1(c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f45120a.i(new sp.a(4, color));
        this.f45121b.i(new sp.a(5, color));
    }

    @Override // ar0.b
    public final boolean b() {
        b bVar = this.f45124e;
        if (bVar == null) {
            return true;
        }
        bVar.b();
        return true;
    }

    @Override // rj0.a
    public final void c(String str) {
        this.f45121b.i(new l(str, 24));
    }

    @Override // rj0.a
    public final void h(String str) {
        this.f45122c.d(new l(str, 23)).e(new yb0.b(this, 17));
    }

    @Override // rj0.a
    public final void m0(String str) {
        WebImageView webImageView = this.f45123d;
        if (str == null || str.length() == 0) {
            webImageView.w2(null);
        } else {
            webImageView.w2(Uri.parse(str));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec((int) ((1 / 0.75f) * View.MeasureSpec.getSize(i13)), 1073741824));
    }

    @Override // rj0.a
    public final void p(String str) {
        this.f45120a.i(new l(str, 25));
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }

    public /* synthetic */ BaseUpsellSingleItemView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUpsellSingleItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        LayoutInflater.from(context).inflate(tb2.b.upsell_single_item_view, (ViewGroup) this, true);
        View findViewById = findViewById(tb2.a.upsell_title_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45120a = (GestaltText) findViewById;
        View findViewById2 = findViewById(tb2.a.upsell_subtitle_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45121b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(tb2.a.upsell_action_button_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45122c = (GestaltButton) findViewById3;
        View findViewById4 = findViewById(tb2.a.upsell_background_image_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        WebImageView webImageView = (WebImageView) findViewById4;
        this.f45123d = webImageView;
        webImageView.setColorFilter(dl2.b.y0(webImageView, eo1.a.color_background_dark_opacity_200));
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float dimensionPixelOffset = webImageView.getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_small);
        webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
    }
}
