package q5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class m0 {
    public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(b5.c.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static a2 b(@NonNull View view, @NonNull a2 a2Var, @NonNull Rect rect) {
        WindowInsets h10 = a2Var.h();
        if (h10 != null) {
            return a2.i(view, view.computeSystemWindowInsets(h10, rect));
        }
        rect.setEmpty();
        return a2Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getTranslationZ();
    }

    public static float h(@NonNull View view) {
        return view.getZ();
    }

    public static boolean i(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void l(View view, float f13) {
        view.setElevation(f13);
    }

    public static void m(View view, boolean z13) {
        view.setNestedScrollingEnabled(z13);
    }

    public static void n(@NonNull View view, v vVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(b5.c.tag_on_apply_window_listener, vVar);
        }
        if (vVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(b5.c.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new l0(view, vVar));
        }
    }

    public static void o(View view, String str) {
        view.setTransitionName(str);
    }

    public static void p(View view, float f13) {
        view.setTranslationZ(f13);
    }

    public static void q(@NonNull View view, float f13) {
        view.setZ(f13);
    }

    public static void r(View view) {
        view.stopNestedScroll();
    }
}
