package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class n0 extends b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, n0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j2 unknownFields;

    public n0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j2.f33911f;
    }

    public static l0 access$000(w wVar) {
        wVar.getClass();
        return (l0) wVar;
    }

    public static void b(n0 n0Var) {
        if (n0Var == null || n0Var.isInitialized()) {
            return;
        }
        UninitializedMessageException newUninitializedMessageException = n0Var.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(newUninitializedMessageException.getMessage());
    }

    public static n0 c(n0 n0Var, InputStream inputStream, y yVar) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            p g13 = p.g(new mc.f(p.t(read, inputStream), inputStream));
            n0 parsePartialFrom = parsePartialFrom(n0Var, g13, yVar);
            g13.a(0);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e13) {
            if (e13.f33849a) {
                throw new InvalidProtocolBufferException(e13.getMessage(), e13);
            }
            throw e13;
        } catch (IOException e14) {
            throw new InvalidProtocolBufferException(e14.getMessage(), e14);
        }
    }

    public static n0 d(n0 n0Var, byte[] bArr, int i13, int i14, y yVar) {
        n0 newMutableInstance = n0Var.newMutableInstance();
        try {
            d2 b13 = z1.f34015c.b(newMutableInstance);
            b13.j(newMutableInstance, bArr, i13, i13 + i14, new l7.v(yVar));
            b13.b(newMutableInstance);
            return newMutableInstance;
        } catch (InvalidProtocolBufferException e13) {
            if (e13.f33849a) {
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

    public static p0 emptyBooleanList() {
        return e.e();
    }

    public static q0 emptyDoubleList() {
        return v.e();
    }

    public static s0 emptyFloatList() {
        return g0.e();
    }

    public static t0 emptyIntList() {
        return o0.e();
    }

    public static u0 emptyLongList() {
        return d1.e();
    }

    public static <E> v0 emptyProtobufList() {
        return a2.f33853d;
    }

    public static <T extends n0> T getDefaultInstance(Class<T> cls) {
        n0 n0Var = defaultInstanceMap.get(cls);
        if (n0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                n0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException("Class initialization cannot fail.", e13);
            }
        }
        if (n0Var == null) {
            n0Var = (T) ((n0) q2.c(cls)).getDefaultInstanceForType();
            if (n0Var == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, n0Var);
        }
        return (T) n0Var;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e13);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    public static t0 mutableCopy(t0 t0Var) {
        int size = t0Var.size();
        return ((o0) t0Var).g(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(o1 o1Var, String str, Object[] objArr) {
        return new b2(o1Var, str, objArr);
    }

    public static <ContainingType extends o1, Type> l0 newRepeatedGeneratedExtension(ContainingType containingtype, o1 o1Var, r0 r0Var, int i13, z2 z2Var, boolean z13, Class cls) {
        return new l0(containingtype, Collections.emptyList(), o1Var, new k0(i13, z2Var, true, z13));
    }

    public static <ContainingType extends o1, Type> l0 newSingularGeneratedExtension(ContainingType containingtype, Type type, o1 o1Var, r0 r0Var, int i13, z2 z2Var, Class cls) {
        return new l0(containingtype, type, o1Var, new k0(i13, z2Var, false, false));
    }

    public static <T extends n0> T parseDelimitedFrom(T t13, InputStream inputStream) {
        T t14 = (T) c(t13, inputStream, y.a());
        b(t14);
        return t14;
    }

    public static <T extends n0> T parseFrom(T t13, ByteBuffer byteBuffer, y yVar) {
        T t14 = (T) parseFrom(t13, p.h(byteBuffer, false), yVar);
        b(t14);
        return t14;
    }

    public static <T extends n0> T parsePartialFrom(T t13, p pVar, y yVar) {
        T t14 = (T) t13.newMutableInstance();
        try {
            d2 b13 = z1.f34015c.b(t14);
            b13.i(t14, r.a(pVar), yVar);
            b13.b(t14);
            return t14;
        } catch (InvalidProtocolBufferException e13) {
            if (e13.f33849a) {
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

    public static <T extends n0> void registerDefaultInstance(Class<T> cls, T t13) {
        t13.markImmutable();
        defaultInstanceMap.put(cls, t13);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(m0.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        z1 z1Var = z1.f34015c;
        z1Var.getClass();
        return z1Var.a(getClass()).f(this);
    }

    public final <MessageType extends n0, BuilderType extends i0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(m0.NEW_BUILDER);
    }

    public Object dynamicMethod(m0 m0Var, Object obj) {
        return dynamicMethod(m0Var, obj, null);
    }

    public abstract Object dynamicMethod(m0 m0Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        z1 z1Var = z1.f34015c;
        z1Var.getClass();
        return z1Var.a(getClass()).g(this, (n0) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final w1 getParserForType() {
        return (w1) dynamicMethod(m0.GET_PARSER);
    }

    @Override // com.google.protobuf.b
    public int getSerializedSize(d2 d2Var) {
        int d2;
        int d13;
        if (isMutable()) {
            if (d2Var == null) {
                z1 z1Var = z1.f34015c;
                z1Var.getClass();
                d13 = z1Var.a(getClass()).d(this);
            } else {
                d13 = d2Var.d(this);
            }
            if (d13 >= 0) {
                return d13;
            }
            throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", d13));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (d2Var == null) {
            z1 z1Var2 = z1.f34015c;
            z1Var2.getClass();
            d2 = z1Var2.a(getClass()).d(this);
        } else {
            d2 = d2Var.d(this);
        }
        setMemoizedSerializedSize(d2);
        return d2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        z1 z1Var = z1.f34015c;
        z1Var.getClass();
        z1Var.a(getClass()).b(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i13, l lVar) {
        if (this.unknownFields == j2.f33911f) {
            this.unknownFields = new j2();
        }
        j2 j2Var = this.unknownFields;
        j2Var.a();
        if (i13 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        j2Var.f((i13 << 3) | 2, lVar);
    }

    public final void mergeUnknownFields(j2 j2Var) {
        this.unknownFields = j2.e(this.unknownFields, j2Var);
    }

    public void mergeVarintField(int i13, int i14) {
        if (this.unknownFields == j2.f33911f) {
            this.unknownFields = new j2();
        }
        j2 j2Var = this.unknownFields;
        j2Var.a();
        if (i13 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        j2Var.f(i13 << 3, Long.valueOf(i14));
    }

    public n0 newMutableInstance() {
        return (n0) dynamicMethod(m0.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i13, p pVar) {
        if ((i13 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == j2.f33911f) {
            this.unknownFields = new j2();
        }
        return this.unknownFields.d(i13, pVar);
    }

    public void setMemoizedHashCode(int i13) {
        this.memoizedHashCode = i13;
    }

    public void setMemoizedSerializedSize(int i13) {
        if (i13 < 0) {
            throw new IllegalStateException(a.a.d("serialized size must be non-negative, was ", i13));
        }
        this.memoizedSerializedSize = (i13 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public String toString() {
        return q1.d(this, super.toString());
    }

    @Override // com.google.protobuf.o1
    public void writeTo(u uVar) {
        z1 z1Var = z1.f34015c;
        z1Var.getClass();
        d2 a13 = z1Var.a(getClass());
        rd.j jVar = uVar.f34002p;
        if (jVar == null) {
            jVar = new rd.j(uVar);
        }
        a13.h(this, jVar);
    }

    public static final <T extends n0> boolean isInitialized(T t13, boolean z13) {
        byte byteValue = ((Byte) t13.dynamicMethod(m0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        z1 z1Var = z1.f34015c;
        z1Var.getClass();
        boolean c13 = z1Var.a(t13.getClass()).c(t13);
        if (z13) {
            t13.dynamicMethod(m0.SET_MEMOIZED_IS_INITIALIZED, c13 ? t13 : null);
        }
        return c13;
    }

    public final <MessageType extends n0, BuilderType extends i0> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((n0) messagetype);
    }

    public Object dynamicMethod(m0 m0Var) {
        return dynamicMethod(m0Var, null, null);
    }

    @Override // com.google.protobuf.p1
    public final n0 getDefaultInstanceForType() {
        return (n0) dynamicMethod(m0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.o1
    public final i0 newBuilderForType() {
        return (i0) dynamicMethod(m0.NEW_BUILDER);
    }

    /* renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final i0 m109toBuilder() {
        return ((i0) dynamicMethod(m0.NEW_BUILDER)).mergeFrom(this);
    }

    public static u0 mutableCopy(u0 u0Var) {
        int size = u0Var.size();
        return ((d1) u0Var).g(size == 0 ? 10 : size * 2);
    }

    public static <T extends n0> T parseDelimitedFrom(T t13, InputStream inputStream, y yVar) {
        T t14 = (T) c(t13, inputStream, yVar);
        b(t14);
        return t14;
    }

    public static <T extends n0> T parseFrom(T t13, ByteBuffer byteBuffer) {
        return (T) parseFrom(t13, byteBuffer, y.a());
    }

    public static s0 mutableCopy(s0 s0Var) {
        int size = s0Var.size();
        return ((g0) s0Var).g(size == 0 ? 10 : size * 2);
    }

    public static <T extends n0> T parseFrom(T t13, l lVar) {
        T t14 = (T) parseFrom(t13, lVar, y.a());
        b(t14);
        return t14;
    }

    public static q0 mutableCopy(q0 q0Var) {
        int size = q0Var.size();
        return ((v) q0Var).g(size == 0 ? 10 : size * 2);
    }

    public static <T extends n0> T parseFrom(T t13, l lVar, y yVar) {
        p j13 = lVar.j();
        T t14 = (T) parsePartialFrom(t13, j13, yVar);
        j13.a(0);
        b(t14);
        return t14;
    }

    public static p0 mutableCopy(p0 p0Var) {
        int size = p0Var.size();
        return ((e) p0Var).g(size == 0 ? 10 : size * 2);
    }

    public static <E> v0 mutableCopy(v0 v0Var) {
        int size = v0Var.size();
        return v0Var.g(size == 0 ? 10 : size * 2);
    }

    public static <T extends n0> T parseFrom(T t13, byte[] bArr) {
        T t14 = (T) d(t13, bArr, 0, bArr.length, y.a());
        b(t14);
        return t14;
    }

    public static <T extends n0> T parseFrom(T t13, byte[] bArr, y yVar) {
        T t14 = (T) d(t13, bArr, 0, bArr.length, yVar);
        b(t14);
        return t14;
    }

    public static <T extends n0> T parseFrom(T t13, InputStream inputStream) {
        T t14 = (T) parsePartialFrom(t13, p.g(inputStream), y.a());
        b(t14);
        return t14;
    }

    public static <T extends n0> T parseFrom(T t13, InputStream inputStream, y yVar) {
        T t14 = (T) parsePartialFrom(t13, p.g(inputStream), yVar);
        b(t14);
        return t14;
    }

    public static <T extends n0> T parsePartialFrom(T t13, p pVar) {
        return (T) parsePartialFrom(t13, pVar, y.a());
    }

    @Override // com.google.protobuf.o1
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends n0> T parseFrom(T t13, p pVar) {
        return (T) parseFrom(t13, pVar, y.a());
    }

    public static <T extends n0> T parseFrom(T t13, p pVar, y yVar) {
        T t14 = (T) parsePartialFrom(t13, pVar, yVar);
        b(t14);
        return t14;
    }
}
