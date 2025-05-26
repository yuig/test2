package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bumptech.glide.c;
import com.pinterest.design.progress.SmallLoadingView;
import m60.r0;

/* loaded from: classes3.dex */
public class ProgressSpinnerListCell extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final SmallLoadingView f35167a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35168b;

    public ProgressSpinnerListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressSpinnerListCell(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Resources resources = context.getResources();
        setBackgroundColor(-1);
        SmallLoadingView smallLoadingView = new SmallLoadingView(getContext());
        this.f35167a = smallLoadingView;
        int dimensionPixelSize = resources.getDimensionPixelSize(r0.progress_indicator_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 1);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(r0.sendpin_empty_cell_padding_top);
        this.f35168b = dimensionPixelSize2;
        c.a1(layoutParams, 0, dimensionPixelSize2, 0, 0);
        smallLoadingView.setLayoutParams(layoutParams);
        addView(smallLoadingView);
    }
}
