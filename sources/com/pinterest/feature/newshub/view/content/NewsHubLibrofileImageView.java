package com.pinterest.feature.newshub.view.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import av1.e;
import av1.f;
import bs1.c;
import com.pinterest.feature.newshub.view.NewsHubViewGroup;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vx0.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/newshub/view/content/NewsHubLibrofileImageView;", "Lcom/pinterest/feature/newshub/view/NewsHubViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vo/i", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NewsHubLibrofileImageView extends NewsHubViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final GestaltAvatar f46834b;

    /* renamed from: c, reason: collision with root package name */
    public final NewsHubColumnImageView f46835c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubLibrofileImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        NewsHubColumnImageView newsHubColumnImageView = this.f46835c;
        int measuredHeight = newsHubColumnImageView.getMeasuredHeight();
        GestaltAvatar gestaltAvatar = this.f46834b;
        int G0 = (c.G0(gestaltAvatar) / 2) + measuredHeight;
        int measuredWidth = newsHubColumnImageView.getMeasuredWidth() + paddingStart;
        NewsHubViewGroup.g(gestaltAvatar, (((measuredWidth - paddingStart) - gestaltAvatar.getMeasuredWidth()) / 2) + paddingStart, G0 - gestaltAvatar.getMeasuredHeight());
        newsHubColumnImageView.layout(paddingStart, paddingTop, measuredWidth, measuredHeight + paddingTop);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int size = View.MeasureSpec.getSize(i13);
        int size2 = View.MeasureSpec.getSize(i14);
        GestaltAvatar child = this.f46834b;
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, getPaddingEnd() + getPaddingStart() + marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart(), marginLayoutParams.width);
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
        Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        child.measure(childMeasureSpec, ViewGroup.getChildMeasureSpec(i14, getPaddingBottom() + getPaddingTop() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin, marginLayoutParams2.height));
        NewsHubViewGroup.i(this.f46835c, size, size2 - (c.G0(child) / 2));
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubLibrofileImageView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int i14;
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.NewsHubLibrofileImageView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int i15 = obtainStyledAttributes.getInt(f.NewsHubLibrofileImageView_librofile_style, 1);
            obtainStyledAttributes.recycle();
            if (i15 == 0) {
                i14 = e.news_hub_column_image_view_3;
                GestaltAvatar H2 = new GestaltAvatar(6, context, (AttributeSet) null).H2(b.f126821m);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.width = -2;
                layoutParams.height = -2;
                H2.setLayoutParams(layoutParams);
                this.f46834b = H2;
            } else {
                i14 = e.news_hub_column_image_view_3;
                this.f46834b = new GestaltAvatar(6, context, (AttributeSet) null).H2(b.f126822n);
            }
            NewsHubColumnImageView newsHubColumnImageView = new NewsHubColumnImageView(context, (AttributeSet) null, 0, i14);
            this.f46835c = newsHubColumnImageView;
            addView(newsHubColumnImageView);
            addView(this.f46834b);
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
