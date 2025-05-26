package com.modiface.mfemakeupkit.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.widgets.MFEBeforeAfterMakeupView;

/* loaded from: classes7.dex */
public class MFESideBySideMakeupView extends MFEBeforeAfterMakeupView {
    private MFEMakeupView mMakeupView1;
    private MFEMakeupView mMakeupView2;

    public MFESideBySideMakeupView(Context context) {
        super(context);
        init();
    }

    private void init() {
        MFEMakeupView mFEMakeupView = this.mBackgroundMakeupView;
        this.mMakeupView1 = mFEMakeupView;
        this.mMakeupView2 = this.mCroppedMakeupView;
        mFEMakeupView.setShowBefore(false);
        this.mMakeupView2.setShowBefore(false);
    }

    public boolean isSecondaryViewVisible() {
        return getBeforeMakeupView().getVisibility() == 0;
    }

    public void setSecondaryViewSide(MFEBeforeAfterMakeupView.BeforeViewSide beforeViewSide) {
        if (beforeViewSide == null) {
            throw new IllegalArgumentException("Cannot set a null before view side");
        }
        this.mBeforeViewSide = beforeViewSide;
        int i13 = f.f34771a[beforeViewSide.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.mCroppedMakeupView = this.mMakeupView2;
            this.mBackgroundMakeupView = this.mMakeupView1;
        } else if (i13 == 3 || i13 == 4) {
            this.mCroppedMakeupView = this.mMakeupView1;
            this.mBackgroundMakeupView = this.mMakeupView2;
        }
        if (this.mBackgroundViewContainer.getChildAt(0) != this.mBackgroundMakeupView) {
            ViewGroup.LayoutParams layoutParams = this.mBackgroundViewContainer.getChildAt(0).getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.mScrollViewContainer.getChildAt(0).getLayoutParams();
            this.mBackgroundViewContainer.removeAllViews();
            this.mScrollViewContainer.removeAllViews();
            this.mBackgroundViewContainer.addView(this.mBackgroundMakeupView, layoutParams);
            this.mScrollViewContainer.addView(this.mCroppedMakeupView, layoutParams2);
        }
        updateSplit();
    }

    public void setSecondaryViewVisible(boolean z13) {
        this.mShowBefore = z13;
        updateSplit();
    }

    public void setup(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine mFEMakeupEngine2) {
        if (mFEMakeupEngine == null || mFEMakeupEngine2 == null) {
            throw new IllegalArgumentException("Cannot setup with a null makeup engine");
        }
        mFEMakeupEngine.attachMakeupView(this.mMakeupView1);
        mFEMakeupEngine2.attachMakeupView(this.mMakeupView2);
    }

    public MFESideBySideMakeupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MFESideBySideMakeupView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        init();
    }
}
