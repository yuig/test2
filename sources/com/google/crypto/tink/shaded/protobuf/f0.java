package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oi.u6;

/* loaded from: classes.dex */
public abstract class f0 extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, f0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected w1 unknownFields;

    public f0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = w1.f33704f;
    }

    public static void g(f0 f0Var) {
        if (!p(f0Var, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static f0 l(Class cls) {
        f0 f0Var = defaultInstanceMap.get(cls);
        if (f0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (f0Var == null) {
            f0Var = ((f0) d2.b(cls)).getDefaultInstanceForType();
            if (f0Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, f0Var);
        }
        return f0Var;
    }

    public static Object o(Method method, Object obj, Object... objArr) {
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

    public static final boolean p(f0 f0Var, boolean z13) {
        byte byteValue = ((Byte) f0Var.k(e0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c13 = m1.a().c(f0Var).c(f0Var);
        if (z13) {
            f0Var.k(e0.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c13;
    }

    public static f0 u(f0 f0Var, k kVar, u uVar) {
        j jVar = (j) kVar;
        l f13 = n.f(jVar.f33635d, jVar.j(), jVar.size(), true);
        f0 w13 = w(f0Var, f13, uVar);
        f13.a(0);
        g(w13);
        return w13;
    }

    public static f0 v(f0 f0Var, byte[] bArr, u uVar) {
        int length = bArr.length;
        f0 t13 = f0Var.t();
        try {
            q1 c13 = m1.a().c(t13);
            c13.i(t13, bArr, 0, length, new l7.v(uVar));
            c13.b(t13);
            g(t13);
            return t13;
        } catch (InvalidProtocolBufferException e13) {
            if (e13.f33591a) {
                throw new InvalidProtocolBufferException(e13.getMessage(), e13);
            }
            throw e13;
        } catch (UninitializedMessageException e14) {
            throw new InvalidProtocolBufferException(e14.getMessage());
        } catch (IOException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw new InvalidProtocolBufferException(e15.getMessage(), e15);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static f0 w(f0 f0Var, n nVar, u uVar) {
        f0 t13 = f0Var.t();
        try {
            q1 c13 = m1.a().c(t13);
            c13.h(t13, o.a(nVar), uVar);
            c13.b(t13);
            return t13;
        } catch (InvalidProtocolBufferException e13) {
            if (e13.f33591a) {
                throw new InvalidProtocolBufferException(e13.getMessage(), e13);
            }
            throw e13;
        } catch (UninitializedMessageException e14) {
            throw new InvalidProtocolBufferException(e14.getMessage());
        } catch (IOException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw new InvalidProtocolBufferException(e15.getMessage(), e15);
        } catch (RuntimeException e16) {
            if (e16.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e16.getCause());
            }
            throw e16;
        }
    }

    public static void x(Class cls, f0 f0Var) {
        f0Var.r();
        defaultInstanceMap.put(cls, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b
    public final int a(q1 q1Var) {
        if (q()) {
            int d2 = q1Var == null ? m1.a().c(this).d(this) : q1Var.d(this);
            if (d2 >= 0) {
                return d2;
            }
            throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", d2));
        }
        int i13 = this.memoizedSerializedSize;
        if ((i13 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i13 & Integer.MAX_VALUE;
        }
        int d13 = q1Var == null ? m1.a().c(this).d(this) : q1Var.d(this);
        y(d13);
        return d13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return m1.a().c(this).g(this, (f0) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b
    public final void f(r rVar) {
        m1.a().c(this).j(this, u6.g(rVar));
    }

    public final void h() {
        this.memoizedHashCode = 0;
    }

    public final int hashCode() {
        if (q()) {
            return m1.a().c(this).f(this);
        }
        if (this.memoizedHashCode == 0) {
            this.memoizedHashCode = m1.a().c(this).f(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        y(Integer.MAX_VALUE);
    }

    public final c0 j() {
        return (c0) k(e0.NEW_BUILDER);
    }

    public abstract Object k(e0 e0Var);

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    /* renamed from: m */
    public final f0 getDefaultInstanceForType() {
        return (f0) k(e0.GET_DEFAULT_INSTANCE);
    }

    public final j1 n() {
        return (j1) k(e0.GET_PARSER);
    }

    public final boolean q() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void r() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b
    /* renamed from: s */
    public final c0 c() {
        return (c0) k(e0.NEW_BUILDER);
    }

    public final f0 t() {
        return (f0) k(e0.NEW_MUTABLE_INSTANCE);
    }

    public final String toString() {
        return e1.d(this, super.toString());
    }

    public final void y(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", i13));
        }
        this.memoizedSerializedSize = (i13 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final c0 z() {
        c0 c0Var = (c0) k(e0.NEW_BUILDER);
        c0Var.h(this);
        return c0Var;
    }
}
