package com.google.android.gms.internal.recaptcha;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b0 extends l {
    private static Map<Object, b0> zzd = new ConcurrentHashMap();
    protected c1 zzb;
    private int zzc;

    public b0() {
        this.zza = 0;
        this.zzb = c1.f31741d;
        this.zzc = -1;
    }

    public static b0 a(Class cls) {
        b0 b0Var = zzd.get(cls);
        if (b0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b0Var = zzd.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (b0Var == null) {
            b0Var = (b0) ((b0) j1.b(cls)).b(6);
            if (b0Var == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, b0Var);
        }
        return b0Var;
    }

    public static Object c(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void d(Class cls, b0 b0Var) {
        zzd.put(cls, b0Var);
    }

    public abstract Object b(int i13);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return z0.a().b(this).a(this, (b0) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.zza;
        if (i13 != 0) {
            return i13;
        }
        int zza = z0.a().b(this).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return a0.b(this, super.toString());
    }
}
