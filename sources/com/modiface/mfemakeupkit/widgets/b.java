package com.modiface.mfemakeupkit.widgets;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes7.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEBeforeAfterMakeupView f34767a;

    public b(MFEBeforeAfterMakeupView mFEBeforeAfterMakeupView) {
        this.f34767a = mFEBeforeAfterMakeupView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        int i24 = i15 - i13;
        int i25 = i16 - i14;
        if (i24 <= 0 || i25 <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f34767a.mCroppedMakeupView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i24, i25);
        }
        layoutParams.width = i24;
        layoutParams.height = i25;
        this.f34767a.mCroppedMakeupView.setLayoutParams(layoutParams);
        this.f34767a.mScrollViewContainer.requestLayout();
        this.f34767a.mScrollView.requestLayout();
        this.f34767a.updateSplit();
    }
}
