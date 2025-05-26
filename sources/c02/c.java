package c02;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.y2;

/* loaded from: classes4.dex */
public final class c extends q7.s implements r {
    public c(long j13) {
        this(j13, 0);
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
        long j13 = this.f102678a / 2;
        float f13 = hf0.b.f69003c;
        float translationY = view.getTranslationY() + f13;
        float translationY2 = (f13 - i14) + view.getTranslationY();
        Property property = View.TRANSLATION_Y;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat((Property<?, Float>) property, translationY);
        Property property2 = View.ALPHA;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, ofFloat, PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 0.0f));
        ofPropertyValuesHolder.setDuration(j13);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property, translationY2));
        ofPropertyValuesHolder2.setDuration(0L);
        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) property2, 1.0f));
        ofPropertyValuesHolder3.setDuration(j13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofPropertyValuesHolder, ofPropertyValuesHolder2, ofPropertyValuesHolder3);
        return animatorSet;
    }

    public c(long j13, int i13) {
        super(j13, 0L, new AccelerateDecelerateInterpolator());
    }
}
