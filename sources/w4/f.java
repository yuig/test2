package w4;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public boolean f127927d;

    @Override // w4.g
    public final void d(View view, float f13) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).K0(a(f13));
            return;
        }
        if (this.f127927d) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f127927d = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f13)));
            } catch (IllegalAccessException e13) {
                Log.e("ViewOscillator", "unable to setProgress", e13);
            } catch (InvocationTargetException e14) {
                Log.e("ViewOscillator", "unable to setProgress", e14);
            }
        }
    }
}
