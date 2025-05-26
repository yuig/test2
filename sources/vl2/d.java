package vl2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import ul2.u1;

/* loaded from: classes4.dex */
public final class d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Class f126160a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f126161b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.k f126162c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.k f126163d;

    /* renamed from: e, reason: collision with root package name */
    public final List f126164e;

    public d(Class cls, Map map, xk2.v vVar, xk2.v vVar2, List list) {
        this.f126160a = cls;
        this.f126161b = map;
        this.f126162c = vVar;
        this.f126163d = vVar2;
        this.f126164e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean d2;
        Class annotationClass = this.f126160a;
        Intrinsics.checkNotNullParameter(annotationClass, "$annotationClass");
        Map values = this.f126161b;
        Intrinsics.checkNotNullParameter(values, "$values");
        xk2.k toString$delegate = this.f126162c;
        Intrinsics.checkNotNullParameter(toString$delegate, "$toString$delegate");
        xk2.k hashCode$delegate = this.f126163d;
        Intrinsics.checkNotNullParameter(hashCode$delegate, "$hashCode$delegate");
        List methods = this.f126164e;
        Intrinsics.checkNotNullParameter(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) hashCode$delegate.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) toString$delegate.getValue();
            }
        }
        boolean z13 = false;
        if (!Intrinsics.d(name, "equals") || objArr == null || objArr.length != 1) {
            if (values.containsKey(name)) {
                return values.get(name);
            }
            StringBuilder sb3 = new StringBuilder("Method is not supported: ");
            sb3.append(method);
            sb3.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb3.append(kotlin.collections.c0.b0(objArr));
            sb3.append(')');
            throw new u1(sb3.toString());
        }
        Object R = kotlin.collections.c0.R(objArr);
        Annotation annotation = R instanceof Annotation ? (Annotation) R : null;
        if (Intrinsics.d(annotation != null ? l0.t0(l0.m0(annotation)) : null, annotationClass)) {
            List<Method> list = methods;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Method method2 : list) {
                    Object obj2 = values.get(method2.getName());
                    Object invoke = method2.invoke(R, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        d2 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    } else if (obj2 instanceof char[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        d2 = Arrays.equals((char[]) obj2, (char[]) invoke);
                    } else if (obj2 instanceof byte[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        d2 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    } else if (obj2 instanceof short[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        d2 = Arrays.equals((short[]) obj2, (short[]) invoke);
                    } else if (obj2 instanceof int[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        d2 = Arrays.equals((int[]) obj2, (int[]) invoke);
                    } else if (obj2 instanceof float[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        d2 = Arrays.equals((float[]) obj2, (float[]) invoke);
                    } else if (obj2 instanceof long[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        d2 = Arrays.equals((long[]) obj2, (long[]) invoke);
                    } else if (obj2 instanceof double[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        d2 = Arrays.equals((double[]) obj2, (double[]) invoke);
                    } else if (obj2 instanceof Object[]) {
                        Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        d2 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    } else {
                        d2 = Intrinsics.d(obj2, invoke);
                    }
                    if (!d2) {
                        break;
                    }
                }
            }
            z13 = true;
        }
        return Boolean.valueOf(z13);
    }
}
