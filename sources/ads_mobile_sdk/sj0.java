package ads_mobile_sdk;

import a.ta;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class sj0 extends g {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    private static Map<Class<?>, sj0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;

    /* renamed from: b */
    public yv2 f11118b = yv2.f14423f;

    public static sj0 a(sj0 sj0Var) {
        if (sj0Var == null || a(sj0Var, true)) {
            return sj0Var;
        }
        throw new e21(new wv2().getMessage());
    }

    public static zv0 g() {
        return zv0.f14946e;
    }

    public static d81 h() {
        return d81.f4199e;
    }

    public static l22 i() {
        return l22.f7627e;
    }

    public abstract Object a(int i13, sj0 sj0Var);

    public final Object c() {
        return a(3, (sj0) null);
    }

    public final void d() {
        this.f5341a = 0;
    }

    public final void e() {
        a(MEMOIZED_SERIALIZED_SIZE_MASK);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k22 k22Var = k22.f7066c;
        k22Var.getClass();
        return k22Var.a(getClass()).b(this, (sj0) obj);
    }

    public final qj0 f() {
        return (qj0) a(5, (sj0) null);
    }

    public final int hashCode() {
        if (m()) {
            k22 k22Var = k22.f7066c;
            k22Var.getClass();
            return k22Var.a(getClass()).d(this);
        }
        if (this.f5341a == 0) {
            k22 k22Var2 = k22.f7066c;
            k22Var2.getClass();
            this.f5341a = k22Var2.a(getClass()).d(this);
        }
        return this.f5341a;
    }

    public final sj0 j() {
        return (sj0) a(6, (sj0) null);
    }

    public final ta k() {
        return (ta) a(7, (sj0) null);
    }

    public final int l() {
        return a((a.tb) null);
    }

    public final boolean m() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void n() {
        k22 k22Var = k22.f7066c;
        k22Var.getClass();
        k22Var.a(getClass()).c(this);
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final void o() {
        this.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
    }

    public final sj0 p() {
        return (sj0) a(4, (sj0) null);
    }

    public final qj0 q() {
        qj0 qj0Var = (qj0) a(5, (sj0) null);
        if (!qj0Var.f10109a.equals(this)) {
            qj0Var.b();
            qj0.a(qj0Var.f10110b, this);
        }
        return qj0Var;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = xa1.f13552a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(obj);
        xa1.a(this, sb3, 0);
        return sb3.toString();
    }

    @Override // ads_mobile_sdk.g
    public final int a(a.tb tbVar) {
        int b13;
        int b14;
        if (m()) {
            if (tbVar == null) {
                k22 k22Var = k22.f7066c;
                k22Var.getClass();
                b14 = k22Var.a(getClass()).b(this);
            } else {
                b14 = tbVar.b(this);
            }
            if (b14 >= 0) {
                return b14;
            }
            throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", b14));
        }
        int i13 = this.memoizedSerializedSize & MEMOIZED_SERIALIZED_SIZE_MASK;
        if (i13 != MEMOIZED_SERIALIZED_SIZE_MASK) {
            return i13;
        }
        if (tbVar == null) {
            k22 k22Var2 = k22.f7066c;
            k22Var2.getClass();
            b13 = k22Var2.a(getClass()).b(this);
        } else {
            b13 = tbVar.b(this);
        }
        a(b13);
        return b13;
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean a(sj0 sj0Var, boolean z13) {
        byte byteValue = ((Byte) sj0Var.a(1, (sj0) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        k22 k22Var = k22.f7066c;
        k22Var.getClass();
        boolean a13 = k22Var.a(sj0Var.getClass()).a(sj0Var);
        if (z13) {
            sj0Var.a(2, a13 ? sj0Var : null);
        }
        return a13;
    }

    public static sj0 a(sj0 sj0Var, il ilVar, jc0 jc0Var) {
        io d2 = ilVar.d();
        sj0 a13 = a(sj0Var, d2, jc0Var);
        d2.a(0);
        return a(a13);
    }

    public static sj0 a(sj0 sj0Var, io ioVar, jc0 jc0Var) {
        sj0 sj0Var2 = (sj0) sj0Var.a(4, (sj0) null);
        try {
            k22 k22Var = k22.f7066c;
            k22Var.getClass();
            a.tb a13 = k22Var.a(sj0Var2.getClass());
            jo joVar = ioVar.f6509c;
            if (joVar == null) {
                joVar = new jo(ioVar);
            }
            a13.a(sj0Var2, joVar, jc0Var);
            a13.c(sj0Var2);
            return sj0Var2;
        } catch (e21 e13) {
            if (e13.f4581a) {
                throw new e21(e13);
            }
            throw e13;
        } catch (wv2 e14) {
            throw new e21(e14.getMessage());
        } catch (IOException e15) {
            if (e15.getCause() instanceof e21) {
                throw ((e21) e15.getCause());
            }
            throw new e21(e15);
        } catch (RuntimeException e16) {
            if (e16.getCause() instanceof e21) {
                throw ((e21) e16.getCause());
            }
            throw e16;
        }
    }

    public static sj0 a(sj0 sj0Var, byte[] bArr, int i13, jc0 jc0Var) {
        if (i13 == 0) {
            return sj0Var;
        }
        sj0 sj0Var2 = (sj0) sj0Var.a(4, (sj0) null);
        try {
            k22 k22Var = k22.f7066c;
            k22Var.getClass();
            a.tb a13 = k22Var.a(sj0Var2.getClass());
            a13.a(sj0Var2, bArr, 0, i13, new pg(jc0Var));
            a13.c(sj0Var2);
            return sj0Var2;
        } catch (e21 e13) {
            if (e13.f4581a) {
                throw new e21(e13);
            }
            throw e13;
        } catch (wv2 e14) {
            throw new e21(e14.getMessage());
        } catch (IOException e15) {
            if (e15.getCause() instanceof e21) {
                throw ((e21) e15.getCause());
            }
            throw new e21(e15);
        } catch (IndexOutOfBoundsException unused) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static void a(Class cls, sj0 sj0Var) {
        sj0Var.memoizedSerializedSize &= MEMOIZED_SERIALIZED_SIZE_MASK;
        defaultInstanceMap.put(cls, sj0Var);
    }

    public final void a(int i13) {
        if (i13 >= 0) {
            this.memoizedSerializedSize = (i13 & MEMOIZED_SERIALIZED_SIZE_MASK) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", i13));
    }

    public final void a(oo ooVar) {
        k22 k22Var = k22.f7066c;
        k22Var.getClass();
        a.tb a13 = k22Var.a(getClass());
        po poVar = ooVar.f9381a;
        if (poVar == null) {
            poVar = new po(ooVar);
        }
        a13.a((Object) this, poVar);
    }

    public static sj0 a(Class cls) {
        sj0 sj0Var = defaultInstanceMap.get(cls);
        if (sj0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sj0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (sj0Var == null) {
            sj0Var = ((sj0) mw2.a(cls)).j();
            if (sj0Var != null) {
                defaultInstanceMap.put(cls, sj0Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return sj0Var;
    }
}
