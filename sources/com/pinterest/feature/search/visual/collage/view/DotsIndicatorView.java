package com.pinterest.feature.search.visual.collage.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.transition.ChangeBounds;
import kh2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ua.t0;
import uc2.c;
import uc2.i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/search/visual/collage/view/DotsIndicatorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DotsIndicatorView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f47946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47948c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47949d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47950e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47951f;

    /* renamed from: g, reason: collision with root package name */
    public final int f47952g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicatorView(Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a(int i13) {
        removeAllViews();
        for (int i14 = 0; i14 < i13; i14++) {
            View view = new View(getContext());
            view.setId(i14);
            view.setTag(Integer.valueOf(i14));
            int i15 = this.f47952g;
            if (i14 == 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f47949d, this.f47948c);
                layoutParams.topMargin = i15;
                layoutParams.gravity = 1;
                view.setLayoutParams(layoutParams);
                view.setBackgroundResource(this.f47951f);
            } else {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.f47947b, this.f47946a);
                layoutParams2.topMargin = i15;
                layoutParams2.gravity = 1;
                view.setLayoutParams(layoutParams2);
                view.setBackgroundResource(this.f47950e);
            }
            addView(view);
        }
    }

    public final void b(int i13) {
        if (i13 < 0) {
            return;
        }
        View findViewWithTag = findViewWithTag(0);
        Intrinsics.checkNotNullExpressionValue(findViewWithTag, "findViewWithTag(...)");
        t0.a(this, new ChangeBounds());
        removeView(findViewWithTag);
        addView(findViewWithTag, i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicatorView(Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int p13 = d.p(8);
        this.f47946a = p13;
        int p14 = d.p(8);
        this.f47947b = p14;
        int p15 = d.p(8);
        this.f47948c = p15;
        int p16 = d.p(68);
        this.f47949d = p16;
        int i14 = c.dot_unselected;
        this.f47950e = i14;
        int i15 = c.dot_selected;
        this.f47951f = i15;
        int p17 = d.p(8);
        this.f47952g = p17;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setGravity(17);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, i.DotsIndicator, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f47946a = obtainStyledAttributes.getDimensionPixelSize(i.DotsIndicator_dot_height, p13);
        this.f47947b = obtainStyledAttributes.getDimensionPixelSize(i.DotsIndicator_dot_width, p14);
        this.f47948c = obtainStyledAttributes.getDimensionPixelSize(i.DotsIndicator_selected_dot_height, p15);
        this.f47949d = obtainStyledAttributes.getDimensionPixelSize(i.DotsIndicator_selected_dot_width, p16);
        this.f47952g = obtainStyledAttributes.getDimensionPixelSize(i.DotsIndicator_margins_between_dots, p17);
        this.f47950e = obtainStyledAttributes.getResourceId(i.DotsIndicator_dot_src, i14);
        this.f47951f = obtainStyledAttributes.getResourceId(i.DotsIndicator_dot_selected_src, i15);
        obtainStyledAttributes.recycle();
    }
}
