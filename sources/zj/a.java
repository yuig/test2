package zj;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import f5.c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f142043a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f142044b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f142045c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f142046d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f142047e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f142048f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f142044b;
        return new ColorStateList(new int[][]{f142046d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f142045c), b(colorStateList, iArr), b(colorStateList, f142043a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return c.j(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f142047e, 0)) != 0) {
            Log.w(f142048f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z13 = false;
        boolean z14 = false;
        for (int i13 : iArr) {
            if (i13 == 16842910) {
                z13 = true;
            } else if (i13 == 16842908 || i13 == 16842919 || i13 == 16843623) {
                z14 = true;
            }
        }
        return z13 && z14;
    }
}
