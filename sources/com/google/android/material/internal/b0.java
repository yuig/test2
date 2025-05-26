package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.HashMap;
import ua.y0;

/* loaded from: classes3.dex */
public final class b0 extends Transition {
    @Override // androidx.transition.Transition
    public final void j(y0 y0Var) {
        View view = y0Var.f121378b;
        if (view instanceof TextView) {
            y0Var.f121377a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public final void m(y0 y0Var) {
        View view = y0Var.f121378b;
        if (view instanceof TextView) {
            y0Var.f121377a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator q(ViewGroup viewGroup, y0 y0Var, y0 y0Var2) {
        if (y0Var != null && y0Var2 != null && (y0Var.f121378b instanceof TextView)) {
            View view = y0Var2.f121378b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                HashMap hashMap = y0Var.f121377a;
                HashMap hashMap2 = y0Var2.f121377a;
                float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
                float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
                if (floatValue == floatValue2) {
                    return null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
                ofFloat.addUpdateListener(new sa.b(2, this, textView));
                return ofFloat;
            }
        }
        return null;
    }
}
