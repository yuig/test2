package w4;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class k extends l {

    /* renamed from: f, reason: collision with root package name */
    public boolean f127934f;

    @Override // w4.l
    public final void c(View view, float f13) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).K0(a(f13));
            return;
        }
        if (this.f127934f) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f127934f = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f13)));
            } catch (IllegalAccessException e13) {
                Log.e("ViewSpline", "unable to setProgress", e13);
            } catch (InvocationTargetException e14) {
                Log.e("ViewSpline", "unable to setProgress", e14);
            }
        }
    }
}
