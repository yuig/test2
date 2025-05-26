package com.pinterest.feature.storypin.closeup.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import d5.a;
import eo1.b;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\f\r\u000eB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/pinterest/feature/storypin/closeup/view/PageIndicatorView;", "Landroid/view/View;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "sf1/q0", "sf1/r0", "ideaPinDisplayLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PageIndicatorView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f48571a;

    /* renamed from: b, reason: collision with root package name */
    public float f48572b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageIndicatorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        int i13 = b.color_white_mochimalist_0_opacity_40;
        Context context2 = getContext();
        Object obj = a.f53679a;
        paint.setColor(context2.getColor(i13));
        new Paint(1).setColor(getContext().getColor(b.color_white_0));
        this.f48571a = getResources().getDimensionPixelSize(pq1.b.page_indicator_spacing);
        this.f48572b = getResources().getDimensionPixelSize(pq1.b.page_indicator_height) / 2.0f;
        new LinkedHashMap();
    }

    public final void a(int i13, int i14) {
        int max = (i13 - (Math.max(0, -1) * this.f48571a)) / Math.max(1, 0);
        this.f48572b = i14 / 2.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getPaddingStart();
        getPaddingTop();
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        if (this.f48572b <= 0.0f) {
            a(View.MeasureSpec.getSize(i13), View.MeasureSpec.getSize(i14));
        }
        setMeasuredDimension(this.f48571a * (-1), View.getDefaultSize(getSuggestedMinimumHeight(), i14));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        a(i13, i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageIndicatorView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        int i14 = b.color_white_mochimalist_0_opacity_40;
        Context context2 = getContext();
        Object obj = a.f53679a;
        paint.setColor(context2.getColor(i14));
        new Paint(1).setColor(getContext().getColor(b.color_white_0));
        this.f48571a = getResources().getDimensionPixelSize(pq1.b.page_indicator_spacing);
        this.f48572b = getResources().getDimensionPixelSize(pq1.b.page_indicator_height) / 2.0f;
        new LinkedHashMap();
    }
}
