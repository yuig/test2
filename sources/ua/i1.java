package ua;

import android.os.Build;
import android.view.View;

/* loaded from: classes3.dex */
public class i1 extends g1 {

    /* renamed from: v, reason: collision with root package name */
    public static boolean f121266v = true;

    @Override // ua.k0
    public void i(View view, int i13) {
        if (Build.VERSION.SDK_INT == 28) {
            super.i(view, i13);
        } else if (f121266v) {
            try {
                h1.a(view, i13);
            } catch (NoSuchMethodError unused) {
                f121266v = false;
            }
        }
    }
}
