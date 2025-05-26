package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.y1;

/* loaded from: classes3.dex */
public final class c extends q5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f33369d;

    public c(ClockFaceView clockFaceView) {
        this.f33369d = clockFaceView;
    }

    @Override // q5.b
    public final void d(View view, r5.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f102402a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f106231a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(fj.g.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f33369d.f33334h.get(intValue - 1));
        }
        eVar.u(y1.j(0, 1, intValue, 1, false, view.isSelected()));
        eVar.s(true);
        eVar.b(r5.d.f106213g);
    }

    @Override // q5.b
    public final boolean g(View view, int i13, Bundle bundle) {
        if (i13 != 16) {
            return super.g(view, i13, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f33369d;
        view.getHitRect(clockFaceView.f33331e);
        float centerX = clockFaceView.f33331e.centerX();
        float centerY = clockFaceView.f33331e.centerY();
        clockFaceView.f33330d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f33330d.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
