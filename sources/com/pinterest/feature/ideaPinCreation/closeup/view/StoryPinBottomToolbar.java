package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/closeup/view/StoryPinBottomToolbar;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/pinterest/feature/ideaPinCreation/closeup/view/p2", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class StoryPinBottomToolbar extends HorizontalScrollView implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f46071a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46072b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46073c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46074d;

    /* renamed from: e, reason: collision with root package name */
    public yt0.c f46075e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f46076f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f46077g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f46078h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f46079i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f46080j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f46081k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f46082l;

    /* renamed from: m, reason: collision with root package name */
    public final zf0.f f46083m;

    /* renamed from: n, reason: collision with root package name */
    public final m60.w f46084n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPinBottomToolbar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = 1;
        if (!this.f46072b) {
            this.f46072b = true;
            ((t2) generatedComponent()).getClass();
        }
        int W = bs1.c.W(this, aq1.b.story_pin_bottom_tool_bar_padding_top);
        int W2 = bs1.c.W(this, eo1.c.space_200);
        this.f46073c = bs1.c.W(this, m60.r0.margin_none);
        this.f46074d = bs1.c.W(this, m60.r0.margin_quarter);
        xk2.v b13 = xk2.m.b(new s2(this, i13));
        this.f46076f = b13;
        this.f46077g = xk2.m.b(new s2(this, 0));
        this.f46078h = xk2.m.b(new s2(this, 2));
        this.f46079i = xk2.m.b(new s2(this, 6));
        this.f46080j = xk2.m.b(new s2(this, 4));
        this.f46081k = xk2.m.b(new s2(this, 3));
        this.f46082l = xk2.m.b(new s2(this, 5));
        xk2.v vVar = zf0.f.f141903e;
        this.f46083m = vb0.e.e();
        m60.w wVar = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f46084n = wVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        setPaddingRelative(W2, W, W2, W2);
        addView((LinearLayout) b13.getValue());
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f46071a == null) {
            this.f46071a = new ye2.o(this);
        }
        return this.f46071a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46071a == null) {
            this.f46071a = new ye2.o(this);
        }
        return this.f46071a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPinBottomToolbar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int i14 = 1;
        if (!this.f46072b) {
            this.f46072b = true;
            ((t2) generatedComponent()).getClass();
        }
        int W = bs1.c.W(this, aq1.b.story_pin_bottom_tool_bar_padding_top);
        int W2 = bs1.c.W(this, eo1.c.space_200);
        this.f46073c = bs1.c.W(this, m60.r0.margin_none);
        this.f46074d = bs1.c.W(this, m60.r0.margin_quarter);
        xk2.v b13 = xk2.m.b(new s2(this, i14));
        this.f46076f = b13;
        this.f46077g = xk2.m.b(new s2(this, 0));
        this.f46078h = xk2.m.b(new s2(this, 2));
        this.f46079i = xk2.m.b(new s2(this, 6));
        this.f46080j = xk2.m.b(new s2(this, 4));
        this.f46081k = xk2.m.b(new s2(this, 3));
        this.f46082l = xk2.m.b(new s2(this, 5));
        xk2.v vVar = zf0.f.f141903e;
        this.f46083m = vb0.e.e();
        m60.w wVar = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f46084n = wVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        setPaddingRelative(W2, W, W2, W2);
        addView((LinearLayout) b13.getValue());
    }
}
