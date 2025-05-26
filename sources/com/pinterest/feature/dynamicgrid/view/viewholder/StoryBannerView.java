package com.pinterest.feature.dynamicgrid.view.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ky.g;
import ky.h;
import l60.a;
import l60.b;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/dynamicgrid/view/viewholder/StoryBannerView;", "Landroid/widget/RelativeLayout;", "Lyk1/n;", "Lky/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bannerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StoryBannerView extends RelativeLayout implements n, h {

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f45672a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45673b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f45674c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f45675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(b.view_holder_banner_story, this);
        View findViewById = findViewById(a.banner_cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45672a = (WebImageView) findViewById;
        View findViewById2 = findViewById(a.banner_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45673b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.banner_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45674c = (GestaltText) findViewById3;
        Context context2 = getContext();
        int i13 = vf0.a.rounded_rect_super_light_gray_8dp;
        Object obj = d5.a.f53679a;
        this.f45675d = context2.getDrawable(i13);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Resources.getSystem().getDisplayMetrics().widthPixels, 1073741824), i14);
    }

    @Override // ky.h
    public final g z() {
        return g.OTHER;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryBannerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(b.view_holder_banner_story, this);
        View findViewById = findViewById(a.banner_cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45672a = (WebImageView) findViewById;
        View findViewById2 = findViewById(a.banner_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45673b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.banner_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45674c = (GestaltText) findViewById3;
        Context context2 = getContext();
        int i13 = vf0.a.rounded_rect_super_light_gray_8dp;
        Object obj = d5.a.f53679a;
        this.f45675d = context2.getDrawable(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryBannerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(b.view_holder_banner_story, this);
        View findViewById = findViewById(a.banner_cover_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45672a = (WebImageView) findViewById;
        View findViewById2 = findViewById(a.banner_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45673b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.banner_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45674c = (GestaltText) findViewById3;
        Context context2 = getContext();
        int i14 = vf0.a.rounded_rect_super_light_gray_8dp;
        Object obj = d5.a.f53679a;
        this.f45675d = context2.getDrawable(i14);
    }
}
