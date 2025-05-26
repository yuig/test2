package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g1.o0 f18321a = new g1.o0();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) {
        g1.o0 o0Var = f18321a;
        g1.o0 o0Var2 = (g1.o0) o0Var.get(classLoader);
        if (o0Var2 == null) {
            o0Var2 = new g1.o0();
            o0Var.put(classLoader, o0Var2);
        }
        Class cls = (Class) o0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        o0Var2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e13) {
            throw new Fragment.InstantiationException(a.a.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e13);
        } catch (ClassNotFoundException e14) {
            throw new Fragment.InstantiationException(a.a.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e14);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
