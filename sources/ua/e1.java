package ua;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class e1 extends k0 {

    /* renamed from: r, reason: collision with root package name */
    public static boolean f121249r = true;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f121250s = true;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f121251t = true;

    public void k(View view, Matrix matrix) {
        if (f121249r) {
            try {
                d1.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f121249r = false;
            }
        }
    }

    public void l(View view, Matrix matrix) {
        if (f121250s) {
            try {
                d1.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f121250s = false;
            }
        }
    }

    public void m(View view, Matrix matrix) {
        if (f121251t) {
            try {
                d1.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f121251t = false;
            }
        }
    }
}
