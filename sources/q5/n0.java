package q5;

import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class n0 {
    public static a2 a(@NonNull View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        a2 i13 = a2.i(null, rootWindowInsets);
        y1 y1Var = i13.f102400a;
        y1Var.q(i13);
        y1Var.d(view.getRootView());
        return i13;
    }

    public static void b(@NonNull View view, int i13, int i14) {
        view.setScrollIndicators(i13, i14);
    }
}
