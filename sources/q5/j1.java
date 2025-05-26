package q5;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.measurement.q4;
import java.util.List;

/* loaded from: classes3.dex */
public final class j1 extends n1 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f102468e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final q6.a f102469f = new q6.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f102470g = new DecelerateInterpolator();

    public static void e(View view) {
        androidx.constraintlayout.widget.x j13 = j(view);
        if (j13 != null) {
            ((View) j13.f17874e).setTranslationY(0.0f);
            if (j13.f17870a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                e(viewGroup.getChildAt(i13));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z13) {
        androidx.constraintlayout.widget.x j13 = j(view);
        if (j13 != null) {
            j13.f17873d = windowInsets;
            if (!z13) {
                View view2 = (View) j13.f17874e;
                int[] iArr = j13.f17875f;
                view2.getLocationOnScreen(iArr);
                z13 = true;
                j13.f17871b = iArr[1];
                if (j13.f17870a != 0) {
                    z13 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                f(viewGroup.getChildAt(i13), windowInsets, z13);
            }
        }
    }

    public static void g(View view, a2 a2Var, List list) {
        androidx.constraintlayout.widget.x j13 = j(view);
        if (j13 != null) {
            j13.a(a2Var, list);
            if (j13.f17870a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                g(viewGroup.getChildAt(i13), a2Var, list);
            }
        }
    }

    public static void h(View view, q4 q4Var) {
        androidx.constraintlayout.widget.x j13 = j(view);
        if (j13 != null) {
            j13.b(q4Var);
            if (j13.f17870a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                h(viewGroup.getChildAt(i13), q4Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(b5.c.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static androidx.constraintlayout.widget.x j(View view) {
        Object tag = view.getTag(b5.c.tag_window_insets_animation_callback);
        if (tag instanceof i1) {
            return ((i1) tag).f102461a;
        }
        return null;
    }
}
