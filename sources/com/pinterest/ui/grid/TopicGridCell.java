package com.pinterest.ui.grid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import av1.c;
import av1.d;
import c50.ma;
import com.pinterest.api.model.zs;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.following.view.lego.InterestFollowButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.imageview.ProportionalImageView;
import dl2.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.o;
import m60.r0;
import m60.t0;
import m60.x0;
import nk1.g;
import nk1.j;
import org.jetbrains.annotations.NotNull;
import qa2.k;
import ve.h;
import we1.a2;
import yk1.n;
import zp.y0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/grid/TopicGridCell;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHubLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TopicGridCell extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f52540a;

    /* renamed from: b, reason: collision with root package name */
    public final ProportionalImageView f52541b;

    /* renamed from: c, reason: collision with root package name */
    public final InterestFollowButton f52542c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f52543d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f52544e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageInterestFollowButton f52545f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicGridCell(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), d.news_hub_detail_item_list_cell_topic_lego, this);
        View findViewById = findViewById(t0.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52540a = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.bottomTitleName);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52543d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(t0.image);
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById3;
        float dimension = proportionalImageView.getResources().getDimension(av1.a.news_hub_corner_radius_lego);
        proportionalImageView.g2(dimension, dimension, dimension, dimension);
        proportionalImageView.setColorFilter(b.y0(proportionalImageView, eo1.a.color_background_dark_opacity_300));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f52541b = proportionalImageView;
        View findViewById4 = findViewById(c.follow_btn);
        InterestFollowButton interestFollowButton = (InterestFollowButton) findViewById4;
        interestFollowButton.c(x0.following_remove, x0.following_add);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52542c = interestFollowButton;
        View findViewById5 = findViewById(t0.layout_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById5;
        this.f52544e = frameLayout;
        interestFollowButton.setVisibility(8);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageInterestFollowButton imageInterestFollowButton = new ImageInterestFollowButton(context2);
        int dimensionPixelOffset = imageInterestFollowButton.getResources().getDimensionPixelOffset(eo1.c.space_300);
        int dimensionPixelOffset2 = imageInterestFollowButton.getResources().getDimensionPixelOffset(r0.margin_double_and_a_quarter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset2);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(dimensionPixelOffset);
        layoutParams.bottomMargin = dimensionPixelOffset;
        imageInterestFollowButton.setLayoutParams(layoutParams);
        imageInterestFollowButton.setBackgroundColor(0);
        this.f52545f = imageInterestFollowButton;
        frameLayout.addView(imageInterestFollowButton);
    }

    public final void a(zs interest, g followActionLoggingContext, Function1 onFollowButtonTapped) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        Intrinsics.checkNotNullParameter(followActionLoggingContext, "followActionLoggingContext");
        Intrinsics.checkNotNullParameter(onFollowButtonTapped, "onFollowButtonTapped");
        InterestFollowButton interestFollowButton = this.f52542c;
        interestFollowButton.getClass();
        Intrinsics.checkNotNullParameter(interest, "interest");
        Intrinsics.checkNotNullParameter(followActionLoggingContext, "followActionLoggingContext");
        j followActionHandler = new j(interest, followActionLoggingContext, rk1.a.f108479k, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
        Intrinsics.checkNotNullParameter(followActionHandler, "followActionHandler");
        if (interestFollowButton.isAttachedToWindow()) {
            interestFollowButton.b(followActionHandler);
        }
        interestFollowButton.f49064f = followActionHandler;
        interestFollowButton.setOnClickListener(new a2(interestFollowButton, 21));
        interestFollowButton.d(kh2.d.s(false, c0.d.d2(interest)));
        ImageInterestFollowButton imageInterestFollowButton = this.f52545f;
        if (imageInterestFollowButton != null) {
            Intrinsics.checkNotNullParameter(interest, "interest");
            Intrinsics.checkNotNullParameter(followActionLoggingContext, "followActionLoggingContext");
            Intrinsics.checkNotNullParameter(onFollowButtonTapped, "onFollowButtonTapped");
            j jVar = new j(interest, followActionLoggingContext, k.f103279i, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
            if (imageInterestFollowButton.isAttachedToWindow()) {
                imageInterestFollowButton.a(jVar);
            }
            imageInterestFollowButton.f52387g = jVar;
            imageInterestFollowButton.setOnClickListener(new y0(onFollowButtonTapped, interest, imageInterestFollowButton, 29));
            imageInterestFollowButton.b(kh2.d.s(false, c0.d.d2(interest)));
        }
    }

    public final void b() {
        InterestFollowButton interestFollowButton = this.f52542c;
        if (true != interestFollowButton.f49065g) {
            interestFollowButton.f49065g = true;
            interestFollowButton.f49060b.setLayoutParams(new FrameLayout.LayoutParams(interestFollowButton.f49065g ? -1 : -2, -2));
        }
    }

    public final void e(String dominantColor, String coverImageUrl) {
        Intrinsics.checkNotNullParameter(dominantColor, "dominantColor");
        Intrinsics.checkNotNullParameter(coverImageUrl, "coverImageUrl");
        int dimensionPixelSize = getResources().getDimensionPixelSize(av1.a.news_hub_corner_radius_lego);
        int i13 = o.f85933a;
        ShapeDrawable A = h.A(dimensionPixelSize, ma.b(Color.argb(255, RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER, RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER, RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER), dominantColor));
        ProportionalImageView proportionalImageView = this.f52541b;
        proportionalImageView.setBackgroundDrawable(A);
        if (Intrinsics.d(coverImageUrl, proportionalImageView.f52563o)) {
            return;
        }
        proportionalImageView.loadUrl(coverImageUrl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicGridCell(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), d.news_hub_detail_item_list_cell_topic_lego, this);
        View findViewById = findViewById(t0.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52540a = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.bottomTitleName);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52543d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(t0.image);
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById3;
        float dimension = proportionalImageView.getResources().getDimension(av1.a.news_hub_corner_radius_lego);
        proportionalImageView.g2(dimension, dimension, dimension, dimension);
        proportionalImageView.setColorFilter(b.y0(proportionalImageView, eo1.a.color_background_dark_opacity_300));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f52541b = proportionalImageView;
        View findViewById4 = findViewById(c.follow_btn);
        InterestFollowButton interestFollowButton = (InterestFollowButton) findViewById4;
        interestFollowButton.c(x0.following_remove, x0.following_add);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52542c = interestFollowButton;
        View findViewById5 = findViewById(t0.layout_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById5;
        this.f52544e = frameLayout;
        interestFollowButton.setVisibility(8);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageInterestFollowButton imageInterestFollowButton = new ImageInterestFollowButton(context2);
        int dimensionPixelOffset = imageInterestFollowButton.getResources().getDimensionPixelOffset(eo1.c.space_300);
        int dimensionPixelOffset2 = imageInterestFollowButton.getResources().getDimensionPixelOffset(r0.margin_double_and_a_quarter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset2);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(dimensionPixelOffset);
        layoutParams.bottomMargin = dimensionPixelOffset;
        imageInterestFollowButton.setLayoutParams(layoutParams);
        imageInterestFollowButton.setBackgroundColor(0);
        this.f52545f = imageInterestFollowButton;
        frameLayout.addView(imageInterestFollowButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicGridCell(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), d.news_hub_detail_item_list_cell_topic_lego, this);
        View findViewById = findViewById(t0.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52540a = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.bottomTitleName);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52543d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(t0.image);
        ProportionalImageView proportionalImageView = (ProportionalImageView) findViewById3;
        float dimension = proportionalImageView.getResources().getDimension(av1.a.news_hub_corner_radius_lego);
        proportionalImageView.g2(dimension, dimension, dimension, dimension);
        proportionalImageView.setColorFilter(b.y0(proportionalImageView, eo1.a.color_background_dark_opacity_300));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f52541b = proportionalImageView;
        View findViewById4 = findViewById(c.follow_btn);
        InterestFollowButton interestFollowButton = (InterestFollowButton) findViewById4;
        interestFollowButton.c(x0.following_remove, x0.following_add);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        this.f52542c = interestFollowButton;
        View findViewById5 = findViewById(t0.layout_wrapper);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) findViewById5;
        this.f52544e = frameLayout;
        interestFollowButton.setVisibility(8);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageInterestFollowButton imageInterestFollowButton = new ImageInterestFollowButton(context2);
        int dimensionPixelOffset = imageInterestFollowButton.getResources().getDimensionPixelOffset(eo1.c.space_300);
        int dimensionPixelOffset2 = imageInterestFollowButton.getResources().getDimensionPixelOffset(r0.margin_double_and_a_quarter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset2);
        layoutParams.gravity = 8388693;
        layoutParams.setMarginEnd(dimensionPixelOffset);
        layoutParams.bottomMargin = dimensionPixelOffset;
        imageInterestFollowButton.setLayoutParams(layoutParams);
        imageInterestFollowButton.setBackgroundColor(0);
        this.f52545f = imageInterestFollowButton;
        frameLayout.addView(imageInterestFollowButton);
    }
}
