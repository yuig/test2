package c02;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.y2;

/* loaded from: classes2.dex */
public final class g extends q7.s implements r {
    public g() {
        super(250L, 0L, i.f24441d);
    }

    @Override // c02.r
    public final void m(y2 y2Var, int i13, int i14, boolean z13) {
        View view = y2Var.f19717a;
        if (z13 || i13 != 0) {
            view.setTranslationX(0.0f);
        }
        if (z13 || i14 != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // c02.r
    public final AnimatorSet x(y2 y2Var, int i13, int i14, int i15, int i16) {
        View view = y2Var.f19717a;
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = i17 != 0 ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, 0.0f) : null;
        ObjectAnimator ofFloat2 = i18 != 0 ? ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f) : null;
        if (ofFloat != null && ofFloat2 != null) {
            animatorSet.playTogether(ofFloat, ofFloat2);
        } else if (ofFloat != null) {
            animatorSet.play(ofFloat);
        } else if (ofFloat2 != null) {
            animatorSet.play(ofFloat2);
        }
        return animatorSet;
    }
}
