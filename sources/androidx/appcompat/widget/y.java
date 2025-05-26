package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f16734b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static y f16735c;

    /* renamed from: a, reason: collision with root package name */
    public e2 f16736a;

    public static synchronized y a() {
        y yVar;
        synchronized (y.class) {
            try {
                if (f16735c == null) {
                    d();
                }
                yVar = f16735c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return yVar;
    }

    public static synchronized PorterDuffColorFilter c(int i13, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (y.class) {
            h10 = e2.h(i13, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (y.class) {
            if (f16735c == null) {
                y yVar = new y();
                f16735c = yVar;
                yVar.f16736a = e2.d();
                e2 e2Var = f16735c.f16736a;
                x xVar = new x(0);
                synchronized (e2Var) {
                    e2Var.f16558e = xVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, z2 z2Var, int[] iArr) {
        PorterDuff.Mode mode = e2.f16551f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z13 = z2Var.f16749b;
        if (!z13 && !z2Var.f16748a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z13 ? (ColorStateList) z2Var.f16750c : null;
        PorterDuff.Mode mode2 = z2Var.f16748a ? (PorterDuff.Mode) z2Var.f16751d : e2.f16551f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = e2.h(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i13) {
        return this.f16736a.g(context, i13);
    }
}
