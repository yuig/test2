package com.pinterest.creatorHub.feature.hub.view.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import d5.a;
import eo1.b;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uq.w;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/creatorHub/feature/hub/view/components/CreatorHubRecentPinRow;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreatorHubRecentPinRow extends w implements n {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f44804m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f44805d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f44806e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f44807f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f44808g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltText f44809h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltText f44810i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f44811j;

    /* renamed from: k, reason: collision with root package name */
    public final View f44812k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f44813l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubRecentPinRow(Context context) {
        super(context, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_400);
        View.inflate(getContext(), rd0.c.view_creator_hub_recent_pin_row, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        Context context2 = getContext();
        int i13 = b.color_themed_background_elevation_floating;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i13));
        setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
        View findViewById = findViewById(rd0.b.creator_hub_recent_pin_image);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float dimension = webImageView.getResources().getDimension(c.lego_corner_radius_small);
        webImageView.g2(dimension, dimension, dimension, dimension);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f44805d = webImageView;
        View findViewById2 = findViewById(rd0.b.creator_hub_recent_pin_stat_one_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44806e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(rd0.b.creator_hub_recent_pin_stat_one_value);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44807f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(rd0.b.creator_hub_recent_pin_stat_two_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44808g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(rd0.b.creator_hub_recent_pin_stat_two_value);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44809h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(rd0.b.creator_hub_recent_pin_publish_date_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44810i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(rd0.b.creator_hub_recent_pin_publish_date_value);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44811j = (GestaltText) findViewById7;
        View findViewById8 = findViewById(rd0.b.creator_hub_recent_pin_action);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        View findViewById9 = findViewById(rd0.b.creator_hub_recent_pins_row_tap_target);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f44812k = findViewById9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubRecentPinRow(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_400);
        View.inflate(getContext(), rd0.c.view_creator_hub_recent_pin_row, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        Context context2 = getContext();
        int i13 = b.color_themed_background_elevation_floating;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i13));
        setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
        View findViewById = findViewById(rd0.b.creator_hub_recent_pin_image);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float dimension = webImageView.getResources().getDimension(c.lego_corner_radius_small);
        webImageView.g2(dimension, dimension, dimension, dimension);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f44805d = webImageView;
        View findViewById2 = findViewById(rd0.b.creator_hub_recent_pin_stat_one_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44806e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(rd0.b.creator_hub_recent_pin_stat_one_value);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44807f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(rd0.b.creator_hub_recent_pin_stat_two_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44808g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(rd0.b.creator_hub_recent_pin_stat_two_value);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44809h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(rd0.b.creator_hub_recent_pin_publish_date_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44810i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(rd0.b.creator_hub_recent_pin_publish_date_value);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44811j = (GestaltText) findViewById7;
        View findViewById8 = findViewById(rd0.b.creator_hub_recent_pin_action);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        View findViewById9 = findViewById(rd0.b.creator_hub_recent_pins_row_tap_target);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f44812k = findViewById9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubRecentPinRow(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_400);
        View.inflate(getContext(), rd0.c.view_creator_hub_recent_pin_row, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        Context context2 = getContext();
        int i14 = b.color_themed_background_elevation_floating;
        Object obj = a.f53679a;
        setBackgroundColor(context2.getColor(i14));
        setPaddingRelative(0, dimensionPixelSize, 0, dimensionPixelSize);
        View findViewById = findViewById(rd0.b.creator_hub_recent_pin_image);
        WebImageView webImageView = (WebImageView) findViewById;
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        float dimension = webImageView.getResources().getDimension(c.lego_corner_radius_small);
        webImageView.g2(dimension, dimension, dimension, dimension);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f44805d = webImageView;
        View findViewById2 = findViewById(rd0.b.creator_hub_recent_pin_stat_one_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44806e = (GestaltText) findViewById2;
        View findViewById3 = findViewById(rd0.b.creator_hub_recent_pin_stat_one_value);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44807f = (GestaltText) findViewById3;
        View findViewById4 = findViewById(rd0.b.creator_hub_recent_pin_stat_two_title);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44808g = (GestaltText) findViewById4;
        View findViewById5 = findViewById(rd0.b.creator_hub_recent_pin_stat_two_value);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44809h = (GestaltText) findViewById5;
        View findViewById6 = findViewById(rd0.b.creator_hub_recent_pin_publish_date_title);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44810i = (GestaltText) findViewById6;
        View findViewById7 = findViewById(rd0.b.creator_hub_recent_pin_publish_date_value);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44811j = (GestaltText) findViewById7;
        View findViewById8 = findViewById(rd0.b.creator_hub_recent_pin_action);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        View findViewById9 = findViewById(rd0.b.creator_hub_recent_pins_row_tap_target);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f44812k = findViewById9;
    }
}
