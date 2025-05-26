package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ao2.m0;
import ua.b1;
import ua.e0;
import ua.k0;
import ua.o;
import ua.y0;

/* loaded from: classes.dex */
public class Fade extends Visibility {
    public Fade(int i13) {
        Y(i13);
    }

    public static float a0(y0 y0Var, float f13) {
        Float f14;
        return (y0Var == null || (f14 = (Float) y0Var.f121377a.get("android:fade:transitionAlpha")) == null) ? f13 : f14.floatValue();
    }

    @Override // androidx.transition.Visibility
    public final Animator W(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        b1.b();
        return Z(view, a0(y0Var, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public final Animator X(ViewGroup viewGroup, View view, y0 y0Var, y0 y0Var2) {
        b1.b();
        ObjectAnimator Z = Z(view, a0(y0Var, 1.0f), 0.0f);
        if (Z == null) {
            b1.d(view, a0(y0Var2, 1.0f));
        }
        return Z;
    }

    public final ObjectAnimator Z(View view, float f13, float f14) {
        if (f13 == f14) {
            return null;
        }
        b1.d(view, f13);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, b1.f121224b, f14);
        o oVar = new o(view);
        ofFloat.addListener(oVar);
        y().a(oVar);
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void m(y0 y0Var) {
        Visibility.U(y0Var);
        int i13 = e0.transition_pause_alpha;
        View view = y0Var.f121378b;
        Float f13 = (Float) view.getTag(i13);
        if (f13 == null) {
            f13 = view.getVisibility() == 0 ? Float.valueOf(b1.a(view)) : Float.valueOf(0.0f);
        }
        y0Var.f121377a.put("android:fade:transitionAlpha", f13);
    }

    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121282e);
        Y(m0.D(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.H));
        obtainStyledAttributes.recycle();
    }
}
