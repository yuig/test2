package ui2;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final z.a f122316a = new z.a("opentelemetry-trace-span-key", 15, 0);

    public static final Object a(Class annotationClass, Map values, List methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        int i13 = 1;
        v b13 = xk2.m.b(new oh2.a(i13, values));
        Object newProxyInstance = Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new vl2.d(annotationClass, values, xk2.m.b(new xh2.a(i13, annotationClass, values)), b13, methods));
        Intrinsics.g(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    public static /* synthetic */ Object b(Class cls, Map map) {
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList(g0.q(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        return a(cls, map, arrayList);
    }

    public static String c(long j13, long j14) {
        if (j13 == 0 && j14 == 0) {
            return "00000000000000000000000000000000";
        }
        ThreadLocal threadLocal = ri2.k.f108417a;
        char[] cArr = (char[]) threadLocal.get();
        if (cArr == null || cArr.length < 32) {
            cArr = new char[32];
            threadLocal.set(cArr);
        }
        ri2.f.b(j13, cArr, 0);
        ri2.f.b(j14, cArr, 16);
        return new String(cArr, 0, 32);
    }
}
