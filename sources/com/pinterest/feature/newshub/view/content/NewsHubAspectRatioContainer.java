package com.pinterest.feature.newshub.view.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.feature.newshub.view.NewsHubViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zu1.f;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/newshub/view/content/NewsHubAspectRatioContainer;", "Lcom/pinterest/feature/newshub/view/NewsHubViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class NewsHubAspectRatioContainer extends NewsHubViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final float f46817b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewsHubAspectRatioContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        if (getChildCount() == 0) {
            return;
        }
        NewsHubViewGroup.g(getChildAt(0), 0, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        if (getChildCount() == 0) {
            setMeasuredDimension(size, 0);
        }
        int i15 = (int) ((1 / this.f46817b) * size);
        View childAt = getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        NewsHubViewGroup.i(childAt, size, i15);
        setMeasuredDimension(size, i15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubAspectRatioContainer(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, f.NewsHubAspectRatioContainer, i13, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f46817b = obtainStyledAttributes.getFloat(f.NewsHubAspectRatioContainer_aspect_ratio, 2.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
