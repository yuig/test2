package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f33368a;

    public b(ClockFaceView clockFaceView) {
        this.f33368a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f33368a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f33330d.f33348d) - clockFaceView.f33338l;
        if (height != clockFaceView.f33359b) {
            clockFaceView.f33359b = height;
            clockFaceView.L();
            int i13 = clockFaceView.f33359b;
            ClockHandView clockHandView = clockFaceView.f33330d;
            clockHandView.f33356l = i13;
            clockHandView.invalidate();
        }
        return true;
    }
}
