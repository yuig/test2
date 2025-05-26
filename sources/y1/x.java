package y1;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import j1.q0;

/* loaded from: classes2.dex */
public final class x implements w {

    /* renamed from: a */
    public final View f136605a;

    /* renamed from: b */
    public final xk2.k f136606b = xk2.m.a(xk2.n.NONE, new q0(this, 14));

    public x(View view) {
        this.f136605a = view;
        if (Build.VERSION.SDK_INT >= 30) {
            new q5.c0(view).f102411d = view;
        }
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.f136606b.getValue();
    }
}
