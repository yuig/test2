package q5;

import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class s0 {
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    public static g2 b(@NonNull View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new g2(windowInsetsController);
        }
        return null;
    }

    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
