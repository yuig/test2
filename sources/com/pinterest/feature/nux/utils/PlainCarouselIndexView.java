package com.pinterest.feature.nux.utils;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kh2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.o0;
import m60.s0;
import mv1.a;
import mv1.b;
import org.jetbrains.annotations.NotNull;
import xa.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/nux/utils/PlainCarouselIndexView;", "Landroid/widget/LinearLayout;", "Lxa/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nuxLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PlainCarouselIndexView extends LinearLayout implements i {

    /* renamed from: a, reason: collision with root package name */
    public int f46846a;

    /* renamed from: b, reason: collision with root package name */
    public int f46847b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46848c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46849d;

    /* renamed from: e, reason: collision with root package name */
    public final int f46850e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46851f;

    /* renamed from: g, reason: collision with root package name */
    public final int f46852g;

    /* renamed from: h, reason: collision with root package name */
    public final int f46853h;

    /* renamed from: i, reason: collision with root package name */
    public final int f46854i;

    /* renamed from: j, reason: collision with root package name */
    public final int f46855j;

    /* renamed from: k, reason: collision with root package name */
    public final Animator f46856k;

    /* renamed from: l, reason: collision with root package name */
    public final Animator f46857l;

    /* renamed from: m, reason: collision with root package name */
    public int f46858m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlainCarouselIndexView(Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // xa.i
    public final void A5(int i13) {
        a(i13);
        this.f46858m = i13;
    }

    public final void a(int i13) {
        if (i13 < 0 || i13 >= this.f46847b) {
            return;
        }
        Animator animator = this.f46857l;
        if (animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        Animator animator2 = this.f46856k;
        if (animator2.isRunning()) {
            animator2.end();
            animator2.cancel();
        }
        int i14 = this.f46847b;
        int i15 = this.f46858m;
        View childAt = (i15 < 0 || i15 >= i14) ? null : getChildAt(i15);
        if (childAt != null) {
            if (this.f46858m < i13) {
                childAt.setBackgroundResource(this.f46853h);
            } else {
                childAt.setBackgroundResource(this.f46852g);
            }
            childAt.getLayoutParams().height = this.f46848c;
            childAt.getLayoutParams().width = this.f46849d;
            animator2.setTarget(childAt);
            animator2.start();
        }
        View childAt2 = getChildAt(i13);
        if (childAt2 != null) {
            childAt2.getLayoutParams().height = this.f46850e;
            childAt2.getLayoutParams().width = this.f46851f;
            childAt2.setBackgroundResource(this.f46854i);
            animator.setTarget(childAt2);
            animator.start();
        }
        this.f46858m = i13;
    }

    public final void b(int i13, int i14) {
        int i15;
        this.f46846a = i14;
        this.f46858m = i14;
        this.f46847b = i13;
        removeAllViews();
        int i16 = this.f46847b;
        int i17 = 0;
        while (i17 < i16) {
            View view = new View(getContext());
            view.setId(i17);
            view.setTag(Integer.valueOf(i17));
            LinearLayout.LayoutParams layoutParams = this.f46846a == i17 ? new LinearLayout.LayoutParams(this.f46851f, this.f46850e) : new LinearLayout.LayoutParams(this.f46849d, this.f46848c);
            int orientation = getOrientation();
            int i18 = this.f46855j;
            if (orientation == 1) {
                layoutParams.topMargin = i18;
                layoutParams.gravity = 1;
            } else {
                layoutParams.leftMargin = i18;
                layoutParams.gravity = 16;
            }
            view.setLayoutParams(layoutParams);
            int i19 = this.f46846a;
            if (i19 == i17) {
                view.setBackgroundResource(this.f46854i);
            } else if (i17 >= i19 || (i15 = this.f46853h) == -1) {
                view.setBackgroundResource(this.f46852g);
            } else {
                view.setBackgroundResource(i15);
            }
            addView(view);
            i17++;
        }
    }

    public final void c() {
        a(this.f46858m + 1);
    }

    public final void d(int i13) {
        a(i13);
    }

    public final void e() {
        a(this.f46858m - 1);
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
    }

    @Override // xa.i
    public final void i5(int i13) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlainCarouselIndexView(Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        int p13 = d.p(6);
        this.f46848c = p13;
        int p14 = d.p(6);
        this.f46849d = p14;
        this.f46850e = d.p(8);
        this.f46851f = d.p(8);
        int i14 = s0.circle_gray;
        this.f46852g = i14;
        this.f46853h = -1;
        int i15 = a.circle_border;
        this.f46854i = i15;
        int p15 = d.p(8);
        this.f46855j = p15;
        this.f46858m = -1;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(17);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, b.PlainCarouselIndexView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f46848c = obtainStyledAttributes.getDimensionPixelSize(b.PlainCarouselIndexView_dot_height, p13);
        this.f46849d = obtainStyledAttributes.getDimensionPixelSize(b.PlainCarouselIndexView_dot_width, p14);
        this.f46855j = obtainStyledAttributes.getDimensionPixelSize(b.PlainCarouselIndexView_dot_margin, p15);
        int resourceId = obtainStyledAttributes.getResourceId(b.PlainCarouselIndexView_unselected, i14);
        this.f46852g = resourceId;
        this.f46853h = obtainStyledAttributes.getResourceId(b.PlainCarouselIndexView_selected, resourceId);
        this.f46854i = obtainStyledAttributes.getResourceId(b.PlainCarouselIndexView_indicator, i15);
        int resourceId2 = obtainStyledAttributes.getResourceId(b.PlainCarouselIndexView_in_animator, o0.fade_in);
        int resourceId3 = obtainStyledAttributes.getResourceId(b.PlainCarouselIndexView_out_animator, o0.fade_in);
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
        loadAnimator.setDuration(1000L);
        Intrinsics.checkNotNullExpressionValue(loadAnimator, "apply(...)");
        this.f46857l = loadAnimator;
        Animator loadAnimator2 = AnimatorInflater.loadAnimator(context, resourceId3);
        loadAnimator2.setDuration(1000L);
        Intrinsics.checkNotNullExpressionValue(loadAnimator2, "apply(...)");
        this.f46856k = loadAnimator2;
        obtainStyledAttributes.recycle();
    }
}
