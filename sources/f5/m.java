package f5;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class m extends l {
    @Override // f5.l
    public final Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f61098g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f61104m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // f5.l
    public final Method q(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
