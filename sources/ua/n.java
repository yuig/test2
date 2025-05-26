package ua;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public final class n extends o1 {
    @Override // ua.k0
    public final long e(ViewGroup viewGroup, Transition transition, y0 y0Var, y0 y0Var2) {
        int i13;
        int round;
        int i14;
        Integer num;
        if (y0Var == null && y0Var2 == null) {
            return 0L;
        }
        if (y0Var2 == null || !(y0Var == null || (num = (Integer) y0Var.f121377a.get("android:visibilityPropagation:visibility")) == null || num.intValue() != 0)) {
            i13 = -1;
        } else {
            y0Var = y0Var2;
            i13 = 1;
        }
        int k13 = o1.k(y0Var, 0);
        int k14 = o1.k(y0Var, 1);
        k0 k0Var = transition.B;
        Rect g13 = k0Var == null ? null : k0Var.g();
        if (g13 != null) {
            i14 = g13.centerX();
            round = g13.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
            i14 = round2;
        }
        float f13 = i14 - k13;
        float f14 = round - k14;
        float sqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float sqrt2 = sqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j13 = transition.f19835c;
        if (j13 < 0) {
            j13 = 300;
        }
        return Math.round(((j13 * i13) / 3.0f) * sqrt2);
    }
}
