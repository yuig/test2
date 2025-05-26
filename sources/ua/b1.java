package ua;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.appcompat.widget.v2;

/* loaded from: classes3.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i1 f121223a;

    /* renamed from: b, reason: collision with root package name */
    public static final v2 f121224b;

    /* renamed from: c, reason: collision with root package name */
    public static final v2 f121225c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f121223a = new k1();
        } else {
            f121223a = new i1();
        }
        f121224b = new v2(9, Float.class, "translationAlpha");
        f121225c = new v2(10, Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f121223a.f(view);
    }

    public static void b() {
        f121223a.getClass();
    }

    public static void c(View view, int i13, int i14, int i15, int i16) {
        f121223a.n(view, i13, i14, i15, i16);
    }

    public static void d(View view, float f13) {
        f121223a.h(view, f13);
    }

    public static void e(View view, int i13) {
        f121223a.i(view, i13);
    }
}
