package com.pinterest.feature.board.detail.actions.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d5.a;
import kk1.b;
import kk1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/board/detail/actions/view/PinShareUpsellBannerView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "feedbackLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinShareUpsellBannerView extends CardView {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f45180k = 0;

    /* renamed from: h, reason: collision with root package name */
    public final WebImageView f45181h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f45182i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltButton f45183j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinShareUpsellBannerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.pin_share_upsell_banner_view, this);
        int W = bs1.c.W(this, eo1.c.space_600);
        Intrinsics.checkNotNullParameter(this, "<this>");
        s(W, W, W, W);
        x();
        View findViewById = findViewById(b.banner_message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45182i = (GestaltText) findViewById;
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) findViewById(b.rounded_corners_layout);
        int dimensionPixelSize = roundedCornersLayout.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        roundedCornersLayout.g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        View findViewById2 = findViewById(b.banner_image);
        WebImageView webImageView = (WebImageView) findViewById2;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f45181h = webImageView;
        View findViewById3 = findViewById(b.banner_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45183j = (GestaltButton) findViewById3;
    }

    public final void x() {
        int i13 = eo1.b.color_themed_background_elevation_floating;
        Context context = getContext();
        Object obj = a.f53679a;
        k(context.getColor(i13));
        t(getResources().getDimensionPixelOffset(r0.lego_banner_corner_radius));
        l(getResources().getDimensionPixelOffset(r0.lego_banner_elevation));
        setClipChildren(false);
        setClipToPadding(false);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinShareUpsellBannerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.pin_share_upsell_banner_view, this);
        int W = bs1.c.W(this, eo1.c.space_600);
        Intrinsics.checkNotNullParameter(this, "<this>");
        s(W, W, W, W);
        x();
        View findViewById = findViewById(b.banner_message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45182i = (GestaltText) findViewById;
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) findViewById(b.rounded_corners_layout);
        int dimensionPixelSize = roundedCornersLayout.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        roundedCornersLayout.g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        View findViewById2 = findViewById(b.banner_image);
        WebImageView webImageView = (WebImageView) findViewById2;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f45181h = webImageView;
        View findViewById3 = findViewById(b.banner_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45183j = (GestaltButton) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinShareUpsellBannerView(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.pin_share_upsell_banner_view, this);
        int W = bs1.c.W(this, eo1.c.space_600);
        Intrinsics.checkNotNullParameter(this, "<this>");
        s(W, W, W, W);
        x();
        View findViewById = findViewById(b.banner_message);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45182i = (GestaltText) findViewById;
        RoundedCornersLayout roundedCornersLayout = (RoundedCornersLayout) findViewById(b.rounded_corners_layout);
        int dimensionPixelSize = roundedCornersLayout.getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_medium);
        roundedCornersLayout.g(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        View findViewById2 = findViewById(b.banner_image);
        WebImageView webImageView = (WebImageView) findViewById2;
        webImageView.g2(0.0f, 0.0f, 0.0f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f45181h = webImageView;
        View findViewById3 = findViewById(b.banner_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45183j = (GestaltButton) findViewById3;
    }
}
