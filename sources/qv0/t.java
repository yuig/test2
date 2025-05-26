package qv0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends FrameLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.l f105204a;

    /* renamed from: b, reason: collision with root package name */
    public final GridView f105205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, com.bumptech.glide.l imageRequestBuilder) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
        this.f105204a = imageRequestBuilder;
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
        this.f105205b = gridView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (getLayoutParams().height == -2) {
            i14 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
    }
}
