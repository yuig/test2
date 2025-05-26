package com.pinterest.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/ui/view/TopBottomGradientView;", "Landroid/widget/FrameLayout;", "visualSearchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TopBottomGradientView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f52724a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52725b;

    /* renamed from: c, reason: collision with root package name */
    public final View f52726c;

    /* renamed from: d, reason: collision with root package name */
    public final View f52727d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TopBottomGradientView(int r3, int r4, int r5, int r6, android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r2 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r8 = 0
        L5:
            r0 = r6 & 4
            r1 = 0
            if (r0 == 0) goto Lb
            r3 = r1
        Lb:
            r0 = r6 & 8
            if (r0 == 0) goto L10
            r4 = r1
        L10:
            r6 = r6 & 16
            if (r6 == 0) goto L15
            r5 = r1
        L15:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            r2.<init>(r7, r8, r3)
            r2.f52724a = r4
            r2.f52725b = r5
            if (r4 != 0) goto L2f
            android.content.res.Resources r3 = r2.getResources()
            int r4 = m60.r0.lens_15_top_gradient_height
            int r3 = r3.getDimensionPixelSize(r4)
            r2.f52724a = r3
        L2f:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            int r4 = r2.f52724a
            r6 = -1
            r3.<init>(r6, r4)
            r4 = 48
            r3.gravity = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r7)
            int r8 = m60.s0.gradient_black_45_to_transparent
            java.lang.Object r0 = d5.a.f53679a
            android.graphics.drawable.Drawable r8 = r7.getDrawable(r8)
            r4.setBackground(r8)
            r2.f52726c = r4
            r2.addView(r4, r3)
            if (r5 != 0) goto L5e
            android.content.res.Resources r3 = r2.getResources()
            int r4 = m60.r0.lens_15_bottom_gradient_height
            int r3 = r3.getDimensionPixelSize(r4)
            r2.f52725b = r3
        L5e:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            int r4 = r2.f52725b
            r3.<init>(r6, r4)
            r4 = 80
            r3.gravity = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r7)
            int r5 = m60.s0.gradient_transparent_to_black_45
            android.graphics.drawable.Drawable r5 = r7.getDrawable(r5)
            r4.setBackground(r5)
            r2.f52727d = r4
            r2.addView(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.view.TopBottomGradientView.<init>(int, int, int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public final void a() {
        this.f52727d.animate().alpha(1.0f).setDuration(500L).start();
    }

    public final void b() {
        this.f52726c.animate().alpha(1.0f).setDuration(200L).start();
    }

    public final void c() {
        this.f52727d.animate().alpha(0.0f).setDuration(200L).start();
    }

    public final void d() {
        this.f52726c.animate().alpha(0.0f).setDuration(200L).start();
    }

    public final void e() {
        this.f52727d.setAlpha(0.0f);
    }

    public final void f() {
        this.f52726c.setAlpha(0.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopBottomGradientView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 0, 0, 28, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopBottomGradientView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 0, 0, 24, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
