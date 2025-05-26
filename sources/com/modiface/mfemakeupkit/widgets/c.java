package com.modiface.mfemakeupkit.widgets;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes7.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEBeforeAfterMakeupView f34768a;

    public c(MFEBeforeAfterMakeupView mFEBeforeAfterMakeupView) {
        this.f34768a = mFEBeforeAfterMakeupView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        MFEBeforeAfterMakeupView mFEBeforeAfterMakeupView = this.f34768a;
        if (mFEBeforeAfterMakeupView.mShowBefore) {
            mFEBeforeAfterMakeupView.overlayViewOnTouch(view, motionEvent);
        }
        return this.f34768a.mShowBefore;
    }
}
