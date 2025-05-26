package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.HashMap;
import ua.x0;
import ua.y0;

/* loaded from: classes3.dex */
public class ChangeScroll extends Transition {
    public static final String[] H = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void U(y0 y0Var) {
        HashMap hashMap = y0Var.f121377a;
        View view = y0Var.f121378b;
        hashMap.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        hashMap.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return H;
    }

    @Override // androidx.transition.Transition
    public final void j(y0 y0Var) {
        U(y0Var);
    }

    @Override // androidx.transition.Transition
    public final void m(y0 y0Var) {
        U(y0Var);
    }

    @Override // androidx.transition.Transition
    public final Animator q(ViewGroup viewGroup, y0 y0Var, y0 y0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (y0Var == null || y0Var2 == null) {
            return null;
        }
        HashMap hashMap = y0Var.f121377a;
        int intValue = ((Integer) hashMap.get("android:changeScroll:x")).intValue();
        HashMap hashMap2 = y0Var2.f121377a;
        int intValue2 = ((Integer) hashMap2.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) hashMap.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) hashMap2.get("android:changeScroll:y")).intValue();
        View view = y0Var2.f121378b;
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        boolean z13 = x0.f121369a;
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator, objectAnimator2);
        return animatorSet;
    }
}
