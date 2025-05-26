package qm;

import a.cb;
import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class a0 extends x {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f104120e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f104121b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f104122c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f104123d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f104120e = hashMap;
    }

    public a0(Class cls, z zVar, boolean z13) {
        super(zVar);
        this.f104123d = new HashMap();
        so.a aVar = sm.c.f113229a;
        Constructor e13 = aVar.e(cls);
        this.f104121b = e13;
        if (z13) {
            b0.b(null, e13);
        } else {
            sm.c.h(e13);
        }
        String[] f13 = aVar.f(cls);
        for (int i13 = 0; i13 < f13.length; i13++) {
            this.f104123d.put(f13[i13], Integer.valueOf(i13));
        }
        Class<?>[] parameterTypes = this.f104121b.getParameterTypes();
        this.f104122c = new Object[parameterTypes.length];
        for (int i14 = 0; i14 < parameterTypes.length; i14++) {
            this.f104122c[i14] = f104120e.get(parameterTypes[i14]);
        }
    }

    @Override // qm.x
    public final Object f() {
        return (Object[]) this.f104122c.clone();
    }

    @Override // qm.x
    public final Object g(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f104121b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e13) {
            sm.c.c(e13);
            throw null;
        } catch (IllegalArgumentException e14) {
            e = e14;
            throw new RuntimeException("Failed to invoke constructor '" + sm.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e15) {
            e = e15;
            throw new RuntimeException("Failed to invoke constructor '" + sm.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e16) {
            throw new RuntimeException("Failed to invoke constructor '" + sm.c.b(constructor) + "' with args " + Arrays.toString(objArr), e16.getCause());
        }
    }

    @Override // qm.x
    public final void h(Object obj, um.a aVar, w wVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f104123d;
        String str = wVar.f104225c;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + sm.c.b(this.f104121b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object c13 = wVar.f104229g.c(aVar);
        if (c13 != null || !wVar.f104230h) {
            objArr[intValue] = c13;
        } else {
            StringBuilder o13 = cb.o("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            o13.append(aVar.k());
            throw new JsonParseException(o13.toString());
        }
    }
}
