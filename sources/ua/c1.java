package ua;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class c1 {
    public static float a(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    public static void b(View view, float f13) {
        view.setTransitionAlpha(f13);
    }
}
