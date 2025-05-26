package e3;

import java.lang.reflect.Method;
import t3.c0;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public static final /* synthetic */ e f57027a = new e();

    /* renamed from: b */
    public static e f57028b;

    public static final boolean a() {
        Class cls = c0.f115866y0;
        try {
            if (c0.f115866y0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                c0.f115866y0 = cls2;
                c0.f115867z0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = c0.f115867z0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public void b() {
    }

    public void c() {
    }
}
