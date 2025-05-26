package ua;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class g1 extends e1 {

    /* renamed from: u, reason: collision with root package name */
    public static boolean f121258u = true;

    public void n(View view, int i13, int i14, int i15, int i16) {
        if (f121258u) {
            try {
                f1.a(view, i13, i14, i15, i16);
            } catch (NoSuchMethodError unused) {
                f121258u = false;
            }
        }
    }
}
