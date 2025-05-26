package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class g0 extends b {
    private static Map<Object, g0> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected x1 unknownFields;

    public g0() {
        this.memoizedHashCode = 0;
        this.unknownFields = x1.f18165f;
        this.memoizedSerializedSize = -1;
    }

    public static g0 e(Class cls) {
        g0 g0Var = defaultInstanceMap.get(cls);
        if (g0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                g0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (g0Var == null) {
            g0Var = ((g0) h2.b(cls)).f();
            if (g0Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, g0Var);
        }
        return g0Var;
    }

    public static Object g(Method method, Object obj, Object... objArr) {
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

    public static void i(Class cls, g0 g0Var) {
        defaultInstanceMap.put(cls, g0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.b
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            j1 j1Var = j1.f18082c;
            j1Var.getClass();
            this.memoizedSerializedSize = j1Var.a(getClass()).d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.b
    public final void c(q qVar) {
        j1 j1Var = j1.f18082c;
        j1Var.getClass();
        n1 a13 = j1Var.a(getClass());
        h1.b bVar = qVar.f18131c;
        if (bVar == null) {
            bVar = new h1.b(qVar);
        }
        a13.i(this, bVar);
    }

    public abstract Object d(f0 f0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f().getClass().isInstance(obj)) {
            return false;
        }
        j1 j1Var = j1.f18082c;
        j1Var.getClass();
        return j1Var.a(getClass()).g(this, (g0) obj);
    }

    public final g0 f() {
        return (g0) d(f0.GET_DEFAULT_INSTANCE);
    }

    public final boolean h() {
        byte byteValue = ((Byte) d(f0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        j1 j1Var = j1.f18082c;
        j1Var.getClass();
        boolean c13 = j1Var.a(getClass()).c(this);
        d(f0.SET_MEMOIZED_IS_INITIALIZED);
        return c13;
    }

    public final int hashCode() {
        int i13 = this.memoizedHashCode;
        if (i13 != 0) {
            return i13;
        }
        j1 j1Var = j1.f18082c;
        j1Var.getClass();
        int f13 = j1Var.a(getClass()).f(this);
        this.memoizedHashCode = f13;
        return f13;
    }

    public final String toString() {
        return b1.e(this, super.toString());
    }
}
