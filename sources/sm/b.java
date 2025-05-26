package sm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b extends so.a {

    /* renamed from: b, reason: collision with root package name */
    public final Method f113225b = Class.class.getMethod("isRecord", new Class[0]);

    /* renamed from: c, reason: collision with root package name */
    public final Method f113226c = Class.class.getMethod("getRecordComponents", new Class[0]);

    /* renamed from: d, reason: collision with root package name */
    public final Method f113227d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f113228e;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f113227d = cls.getMethod("getName", new Class[0]);
        this.f113228e = cls.getMethod("getType", new Class[0]);
    }

    @Override // so.a
    public final Method d(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e13) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e13);
        }
    }

    @Override // so.a
    public final Constructor e(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f113226c.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i13 = 0; i13 < objArr.length; i13++) {
                clsArr[i13] = (Class) this.f113228e.invoke(objArr[i13], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e13) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e13);
        }
    }

    @Override // so.a
    public final String[] f(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f113226c.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i13 = 0; i13 < objArr.length; i13++) {
                strArr[i13] = (String) this.f113227d.invoke(objArr[i13], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e13) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e13);
        }
    }

    @Override // so.a
    public final boolean g(Class cls) {
        try {
            return ((Boolean) this.f113225b.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e13) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e13);
        }
    }
}
