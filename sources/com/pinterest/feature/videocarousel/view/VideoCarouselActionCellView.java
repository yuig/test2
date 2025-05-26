package com.pinterest.feature.videocarousel.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hi1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import m60.r0;
import m60.t0;
import m60.v0;
import org.jetbrains.annotations.NotNull;
import we1.a2;
import xo.s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/videocarousel/view/VideoCarouselActionCellView;", "Landroid/widget/LinearLayout;", "Lhi1/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "videoFeatureLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class VideoCarouselActionCellView extends s implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f49046g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f49047d;

    /* renamed from: e, reason: collision with root package name */
    public ii1.a f49048e;

    /* renamed from: f, reason: collision with root package name */
    public l f49049f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoCarouselActionCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f49048e = null;
        super.onDetachedFromWindow();
    }

    public /* synthetic */ VideoCarouselActionCellView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCarouselActionCellView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 17);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, v0.view_video_carousel_action_item, this);
        setOrientation(1);
        setGravity(17);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(getResources().getDimensionPixelSize(r0.video_carousel_square_dimen), getResources().getDimensionPixelSize(r0.video_carousel_square_dimen));
        layoutParams.setMarginEnd(getResources().getDimensionPixelSize(r0.margin_double));
        setLayoutParams(layoutParams);
        setOnClickListener(new a2(this, 19));
        View findViewById = findViewById(t0.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49047d = (TextView) findViewById;
    }
}
