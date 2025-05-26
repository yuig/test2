package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class x1 extends ListPopupWindow implements t1 {
    public static final Method D;
    public t1 C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.t1
    public final void E(n.o oVar, n.q qVar) {
        t1 t1Var = this.C;
        if (t1Var != null) {
            t1Var.E(oVar, qVar);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final j1 m(Context context, boolean z13) {
        w1 w1Var = new w1(context, z13);
        w1Var.f16705o = this;
        return w1Var;
    }

    @Override // androidx.appcompat.widget.t1
    public final void v(n.o oVar, MenuItem menuItem) {
        t1 t1Var = this.C;
        if (t1Var != null) {
            t1Var.v(oVar, menuItem);
        }
    }
}
