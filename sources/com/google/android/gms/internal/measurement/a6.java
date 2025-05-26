package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class a6 extends g5 {
    private static Map<Object, a6> zzc = new ConcurrentHashMap();
    protected q7 zzb;
    private int zzd;

    public a6() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = q7.f31604f;
    }

    public static a6 d(Class cls) {
        a6 a6Var = zzc.get(cls);
        if (a6Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                a6Var = zzc.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (a6Var == null) {
            a6Var = (a6) ((a6) x7.b(cls)).g(6);
            if (a6Var == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, a6Var);
        }
        return a6Var;
    }

    public static i6 e(i6 i6Var) {
        int size = i6Var.size();
        return i6Var.zza(size == 0 ? 10 : size << 1);
    }

    public static r6 f(j6 j6Var) {
        int size = j6Var.size();
        int i13 = size == 0 ? 10 : size << 1;
        r6 r6Var = (r6) j6Var;
        if (i13 >= r6Var.f31624c) {
            return new r6(Arrays.copyOf(r6Var.f31623b, i13), r6Var.f31624c, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object h(Object obj, Method method, Object... objArr) {
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

    public static void j(Class cls, a6 a6Var) {
        a6Var.p();
        zzc.put(cls, a6Var);
    }

    public static final boolean k(a6 a6Var, boolean z13) {
        byte byteValue = ((Byte) a6Var.g(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        j7 j7Var = j7.f31480c;
        j7Var.getClass();
        boolean c13 = j7Var.a(a6Var.getClass()).c(a6Var);
        if (z13) {
            a6Var.g(2);
        }
        return c13;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final int a(n7 n7Var) {
        int zza;
        int zza2;
        if (q()) {
            if (n7Var == null) {
                j7 j7Var = j7.f31480c;
                j7Var.getClass();
                zza2 = j7Var.a(getClass()).zza(this);
            } else {
                zza2 = n7Var.zza(this);
            }
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", zza2));
        }
        int i13 = this.zzd;
        if ((i13 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i13 & Integer.MAX_VALUE;
        }
        if (n7Var == null) {
            j7 j7Var2 = j7.f31480c;
            j7Var2.getClass();
            zza = j7Var2.a(getClass()).zza(this);
        } else {
            zza = n7Var.zza(this);
        }
        n(zza);
        return zza;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j7 j7Var = j7.f31480c;
        j7Var.getClass();
        return j7Var.a(getClass()).b(this, (a6) obj);
    }

    public abstract Object g(int i13);

    public final int hashCode() {
        if (q()) {
            j7 j7Var = j7.f31480c;
            j7Var.getClass();
            return j7Var.a(getClass()).zzb(this);
        }
        if (this.zza == 0) {
            j7 j7Var2 = j7.f31480c;
            j7Var2.getClass();
            this.zza = j7Var2.a(getClass()).zzb(this);
        }
        return this.zza;
    }

    public final void i(q5 q5Var) {
        j7 j7Var = j7.f31480c;
        j7Var.getClass();
        n7 a13 = j7Var.a(getClass());
        bb.p pVar = q5Var.f31598c;
        if (pVar == null) {
            pVar = new bb.p(q5Var);
        }
        a13.f(this, pVar);
    }

    public final z5 l() {
        return (z5) g(5);
    }

    public final z5 m() {
        z5 z5Var = (z5) g(5);
        z5Var.a(this);
        return z5Var;
    }

    public final void n(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", i13));
        }
        this.zzd = (i13 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    public final void o() {
        j7 j7Var = j7.f31480c;
        j7Var.getClass();
        j7Var.a(getClass()).d(this);
        p();
    }

    public final void p() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean q() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = d7.f31360a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(obj);
        d7.b(this, sb3, 0);
        return sb3.toString();
    }
}
