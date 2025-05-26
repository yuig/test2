package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16727a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16728b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f16729c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f16730d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16731e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f16732f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f16733g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i.j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(i.j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i13) {
        ColorStateList d2 = d(context, i13);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f16728b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f16727a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f13 = typedValue.getFloat();
        return f5.c.j(c(context, i13), Math.round(Color.alpha(r4) * f13));
    }

    public static int c(Context context, int i13) {
        int[] iArr = f16733g;
        iArr[0] = i13;
        x92.b M = x92.b.M(context, null, iArr);
        try {
            return ((TypedArray) M.f134366c).getColor(0, 0);
        } finally {
            M.O();
        }
    }

    public static ColorStateList d(Context context, int i13) {
        int[] iArr = f16733g;
        iArr[0] = i13;
        x92.b M = x92.b.M(context, null, iArr);
        try {
            return M.u(0);
        } finally {
            M.O();
        }
    }
}
