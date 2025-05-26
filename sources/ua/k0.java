package ua;

import android.R;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class k0 implements j0 {

    /* renamed from: a */
    public static final int[] f121278a = {R.attr.targetClass, R.attr.targetId, R.attr.excludeId, R.attr.excludeClass, R.attr.targetName, R.attr.excludeName};

    /* renamed from: b */
    public static final int[] f121279b = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};

    /* renamed from: c */
    public static final int[] f121280c = {R.attr.resizeClip};

    /* renamed from: d */
    public static final int[] f121281d = {R.attr.transitionVisibilityMode};

    /* renamed from: e */
    public static final int[] f121282e = {R.attr.fadingMode};

    /* renamed from: f */
    public static final int[] f121283f = {R.attr.reparent, R.attr.reparentWithOverlay};

    /* renamed from: g */
    public static final int[] f121284g = {R.attr.slideEdge};

    /* renamed from: h */
    public static final int[] f121285h = {R.attr.transitionOrdering};

    /* renamed from: i */
    public static final int[] f121286i = {R.attr.minimumHorizontalAngle, R.attr.minimumVerticalAngle, R.attr.maximumAngle};

    /* renamed from: j */
    public static final int[] f121287j = {R.attr.patternPathData};

    /* renamed from: k */
    public static boolean f121288k = true;

    /* renamed from: l */
    public static boolean f121289l = true;

    /* renamed from: m */
    public static Method f121290m = null;

    /* renamed from: n */
    public static boolean f121291n = false;

    /* renamed from: o */
    public static boolean f121292o = true;

    /* renamed from: p */
    public static Field f121293p;

    /* renamed from: q */
    public static boolean f121294q;

    public static void c(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            z.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f121288k) {
            try {
                z.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f121288k = false;
            }
        }
    }

    public static void j(ViewGroup viewGroup, boolean z13) {
        if (Build.VERSION.SDK_INT >= 29) {
            a1.b(viewGroup, z13);
        } else if (f121289l) {
            try {
                a1.b(viewGroup, z13);
            } catch (NoSuchMethodError unused) {
                f121289l = false;
            }
        }
    }

    @Override // ua.j0
    public float a(View view, ViewGroup viewGroup) {
        return view.getTranslationX();
    }

    public abstract void d(y0 y0Var);

    public abstract long e(ViewGroup viewGroup, Transition transition, y0 y0Var, y0 y0Var2);

    public float f(View view) {
        if (f121292o) {
            try {
                return c1.a(view);
            } catch (NoSuchMethodError unused) {
                f121292o = false;
            }
        }
        return view.getAlpha();
    }

    public abstract Rect g();

    public void h(View view, float f13) {
        if (f121292o) {
            try {
                c1.b(view, f13);
                return;
            } catch (NoSuchMethodError unused) {
                f121292o = false;
            }
        }
        view.setAlpha(f13);
    }

    public void i(View view, int i13) {
        if (!f121294q) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f121293p = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f121294q = true;
        }
        Field field = f121293p;
        if (field != null) {
            try {
                f121293p.setInt(view, i13 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
