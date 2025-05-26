package com.pinterest.feature.newshub.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import dl2.b;
import eo1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/newshub/view/NewsHubViewGroup;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHubLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class NewsHubViewGroup extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f46816a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubViewGroup(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46816a = b.y0(this, a.color_background_dark_opacity_100);
    }

    public static int a(View child) {
        if (child == null || child.getVisibility() == 8) {
            return 0;
        }
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return child.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int b(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.getMarginEnd() + child.getMeasuredWidth() + marginLayoutParams.getMarginStart();
    }

    public static int e(View view) {
        if (view == null || view.getVisibility() == 8) {
            return 0;
        }
        return b(view);
    }

    public static void g(View view, int i13, int i14) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginStart = i13 + (marginLayoutParams.isMarginRelative() ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin);
        int i15 = i14 + marginLayoutParams.topMargin;
        view.layout(marginStart, i15, view.getMeasuredWidth() + marginStart, view.getMeasuredHeight() + i15);
    }

    public static void i(View child, int i13, int i14) {
        Intrinsics.checkNotNullParameter(child, "child");
        child.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public final void j(View view, int i13, int i14, int i15, int i16) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        measureChildWithMargins(view, i13, i14, i15, i16);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p13) {
        Intrinsics.checkNotNullParameter(p13, "p");
        return new ViewGroup.MarginLayoutParams(p13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsHubViewGroup(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46816a = b.y0(this, a.color_background_dark_opacity_100);
    }
}
