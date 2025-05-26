package com.pinterest.creatorHub.feature.hub.view.components;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/creatorHub/feature/hub/view/components/CreatorHubStatsRow;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CreatorHubStatsRow extends ConstraintLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f44814h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f44815a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f44816b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f44817c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f44818d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f44819e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f44820f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIconButton f44821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubStatsRow(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_200);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_400);
        View.inflate(getContext(), rd0.c.view_creator_hub_stats_row, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        View findViewById = findViewById(b.stats_row_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44815a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.stats_row_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44816b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.stats_row_delta);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44817c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.stats_row_value);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44818d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(b.stats_row_badge);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44819e = (GestaltText) findViewById5;
        View findViewById6 = findViewById(b.stats_row_badge_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44820f = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(b.stats_row_see_more);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44821g = (GestaltIconButton) findViewById7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubStatsRow(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_200);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_400);
        View.inflate(getContext(), rd0.c.view_creator_hub_stats_row, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        View findViewById = findViewById(b.stats_row_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44815a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.stats_row_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44816b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.stats_row_delta);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44817c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.stats_row_value);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44818d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(b.stats_row_badge);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44819e = (GestaltText) findViewById5;
        View findViewById6 = findViewById(b.stats_row_badge_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44820f = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(b.stats_row_see_more);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44821g = (GestaltIconButton) findViewById7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorHubStatsRow(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_200);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.space_400);
        View.inflate(getContext(), rd0.c.view_creator_hub_stats_row, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPaddingRelative(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        View findViewById = findViewById(b.stats_row_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44815a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.stats_row_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44816b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.stats_row_delta);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f44817c = (GestaltText) findViewById3;
        View findViewById4 = findViewById(b.stats_row_value);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f44818d = (GestaltText) findViewById4;
        View findViewById5 = findViewById(b.stats_row_badge);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f44819e = (GestaltText) findViewById5;
        View findViewById6 = findViewById(b.stats_row_badge_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f44820f = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(b.stats_row_see_more);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f44821g = (GestaltIconButton) findViewById7;
    }
}
