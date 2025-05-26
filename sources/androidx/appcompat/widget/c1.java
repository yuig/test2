package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16527a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16528b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f16529c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 29 || i13 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        b(drawable);
    }

    public static void b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f16527a);
        } else {
            drawable.setState(f16528b);
        }
        drawable.setState(state);
    }

    public static Rect c(Drawable drawable) {
        int i13;
        int i14;
        int i15;
        int i16;
        if (Build.VERSION.SDK_INT < 29) {
            return a1.a(lb.l0.C1(drawable));
        }
        Insets a13 = b1.a(drawable);
        i13 = a13.left;
        i14 = a13.top;
        i15 = a13.right;
        i16 = a13.bottom;
        return new Rect(i13, i14, i15, i16);
    }

    public static PorterDuff.Mode d(int i13, PorterDuff.Mode mode) {
        if (i13 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i13 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i13 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i13) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
