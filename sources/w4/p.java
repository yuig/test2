package w4;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class p extends q {

    /* renamed from: g, reason: collision with root package name */
    public boolean f127946g;

    @Override // w4.q
    public final boolean c(float f13, long j13, View view, t4.f fVar) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).K0(b(f13, j13, view, fVar));
        } else {
            if (this.f127946g) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f127946g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(b(f13, j13, view, fVar)));
                } catch (IllegalAccessException e13) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e13);
                } catch (InvocationTargetException e14) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e14);
                }
            }
        }
        return this.f116403d;
    }
}
