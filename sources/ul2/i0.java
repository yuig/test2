package ul2;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class i0 implements kotlin.jvm.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f122531a = new Regex("<v#(\\d+)>");

    public static Method o(Class cls, String str, Class[] clsArr, Class cls2, boolean z13) {
        Class z14;
        Method o13;
        if (z13) {
            clsArr[0] = cls;
        }
        Method r13 = r(cls, str, clsArr, cls2);
        if (r13 != null) {
            return r13;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (o13 = o(superclass, str, clsArr, cls2, z13)) != null) {
            return o13;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            Intrinsics.f(cls3);
            Method o14 = o(cls3, str, clsArr, cls2, z13);
            if (o14 != null) {
                return o14;
            }
            if (z13 && (z14 = lb.l0.z1(gm2.d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method r14 = r(z14, str, clsArr, cls2);
                if (r14 != null) {
                    return r14;
                }
            }
        }
        return null;
    }

    public static Constructor q(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method r(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.d(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.d(method.getName(), str) && Intrinsics.d(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void d(String str, ArrayList arrayList, boolean z13) {
        ArrayList n13 = n(str);
        arrayList.addAll(n13);
        int size = (n13.size() + 31) / 32;
        for (int i13 = 0; i13 < size; i13++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        if (!z13) {
            arrayList.add(Object.class);
            return;
        }
        arrayList.remove(DefaultConstructorMarker.class);
        Intrinsics.checkNotNullExpressionValue(DefaultConstructorMarker.class, "DEFAULT_CONSTRUCTOR_MARKER");
        arrayList.add(DefaultConstructorMarker.class);
    }

    public final Method g(String name, String desc) {
        Method o13;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.d(name, "<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) n(desc).toArray(new Class[0]);
        Class p13 = p(StringsKt.K(desc, ')', 0, false, 6) + 1, desc.length(), desc);
        Method o14 = o(l(), name, clsArr, p13, false);
        if (o14 != null) {
            return o14;
        }
        if (!l().isInterface() || (o13 = o(Object.class, name, clsArr, p13, false)) == null) {
            return null;
        }
        return o13;
    }

    public abstract Collection h();

    public abstract Collection i(ym2.g gVar);

    public abstract am2.r0 j(int i13);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection k(in2.n r8, ul2.f0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            ul2.h0 r0 = new ul2.h0
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = ue.c.s(r8, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L21:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r8.next()
            am2.m r3 = (am2.m) r3
            boolean r4 = r3 instanceof am2.d
            if (r4 == 0) goto L4f
            r4 = r3
            am2.d r4 = (am2.d) r4
            am2.q r5 = r4.getVisibility()
            am2.r r6 = am2.s.f15580h
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r6)
            if (r5 != 0) goto L4f
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L4f
            kotlin.Unit r4 = kotlin.Unit.f80348a
            java.lang.Object r3 = r3.l0(r0, r4)
            ul2.t r3 = (ul2.t) r3
            goto L50
        L4f:
            r3 = r1
        L50:
            if (r3 == 0) goto L21
            r2.add(r3)
            goto L21
        L56:
            java.util.List r8 = kotlin.collections.CollectionsKt.F0(r2)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ul2.i0.k(in2.n, ul2.f0):java.util.Collection");
    }

    public Class l() {
        Class c13 = c();
        List list = gm2.d.f65761a;
        Intrinsics.checkNotNullParameter(c13, "<this>");
        Class cls = (Class) gm2.d.f65763c.get(c13);
        return cls == null ? c() : cls;
    }

    public abstract Collection m(ym2.g gVar);

    public final ArrayList n(String str) {
        int K;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        while (str.charAt(i13) != ')') {
            int i14 = i13;
            while (str.charAt(i14) == '[') {
                i14++;
            }
            char charAt = str.charAt(i14);
            if (StringsKt.F("VZCBSIFJD", charAt)) {
                K = i14 + 1;
            } else {
                if (charAt != 'L') {
                    throw new u1("Unknown type prefix in the method signature: ".concat(str));
                }
                K = StringsKt.K(str, ';', i13, false, 4) + 1;
            }
            arrayList.add(p(i13, K, str));
            i13 = K;
        }
        return arrayList;
    }

    public final Class p(int i13, int i14, String str) {
        char charAt = str.charAt(i13);
        if (charAt == 'L') {
            ClassLoader d2 = gm2.d.d(c());
            String substring = str.substring(i13 + 1, i14 - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Class<?> loadClass = d2.loadClass(kotlin.text.z.m(substring, '/', '.'));
            Intrinsics.checkNotNullExpressionValue(loadClass, "loadClass(...)");
            return loadClass;
        }
        if (charAt == '[') {
            Class p13 = p(i13 + 1, i14, str);
            ym2.c cVar = c2.f122505a;
            Intrinsics.checkNotNullParameter(p13, "<this>");
            return Array.newInstance((Class<?>) p13, 0).getClass();
        }
        if (charAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new u1("Unknown type prefix in the method signature: ".concat(str));
    }
}
