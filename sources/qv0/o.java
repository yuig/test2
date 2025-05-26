package qv0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;
import kotlin.jvm.internal.Intrinsics;
import q5.v0;

/* loaded from: classes5.dex */
public final class o extends FrameLayout implements yk1.n, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f105195a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f105196b;

    /* renamed from: c, reason: collision with root package name */
    public final GridView f105197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f105196b) {
            this.f105196b = true;
            ((p) generatedComponent()).getClass();
        }
        int W = bs1.c.W(this, eo1.c.space_200);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        GridView gridView = new GridView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        com.bumptech.glide.c.a1(layoutParams, W, 0, W, 0);
        gridView.setLayoutParams(layoutParams);
        gridView.setNumColumns(3);
        gridView.setHorizontalSpacing(W);
        gridView.setVerticalSpacing(W);
        addView(gridView);
        v0.o(gridView, new androidx.core.widget.g(3));
        this.f105197c = gridView;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f105195a == null) {
            this.f105195a = new ye2.o(this);
        }
        return this.f105195a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f105195a == null) {
            this.f105195a = new ye2.o(this);
        }
        return this.f105195a.generatedComponent();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (getLayoutParams().height == -2) {
            i14 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
    }
}
