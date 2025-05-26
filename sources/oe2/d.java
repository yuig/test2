package oe2;

import io.embrace.android.embracesdk.internal.serialization.AppFrameworkAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f94302a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f94303b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f94304c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f94305d;

    /* renamed from: e, reason: collision with root package name */
    public final int f94306e;

    /* renamed from: f, reason: collision with root package name */
    public final r[] f94307f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f94308g;

    public d(Type type, Set set, AppFrameworkAdapter appFrameworkAdapter, Method method, int i13, int i14, boolean z13) {
        this.f94302a = pe2.b.a(type);
        this.f94303b = set;
        this.f94304c = appFrameworkAdapter;
        this.f94305d = method;
        this.f94306e = i14;
        this.f94307f = new r[i13 - i14];
        this.f94308g = z13;
    }

    public void a(h0 h0Var, q qVar) {
        r[] rVarArr = this.f94307f;
        if (rVarArr.length > 0) {
            Method method = this.f94305d;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i13 = this.f94306e;
            for (int i14 = i13; i14 < length; i14++) {
                Type type = ((ParameterizedType) genericParameterTypes[i14]).getActualTypeArguments()[0];
                Set e13 = pe2.b.e(parameterAnnotations[i14]);
                rVarArr[i14 - i13] = (kg.a.r(this.f94302a, type) && this.f94303b.equals(e13)) ? h0Var.d(qVar, type, e13) : h0Var.c(type, e13, null);
            }
        }
    }

    public abstract Object b(v vVar);

    public final Object c(Object obj) {
        r[] rVarArr = this.f94307f;
        Object[] objArr = new Object[rVarArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(rVarArr, 0, objArr, 1, rVarArr.length);
        try {
            return this.f94305d.invoke(this.f94304c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public abstract void d(h0 h0Var, y yVar, Object obj);
}
