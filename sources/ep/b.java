package ep;

import ao2.m0;
import c50.t1;
import i2.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import m60.f0;
import m60.w;
import pc.o;
import pc.r;
import pc.t;
import pc.v;
import u50.i0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ void A(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void B(StringBuilder sb3, int i13, String str, String str2, String str3) {
        sb3.append(i13);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(str3);
        m0.p0(sb3.toString());
        throw null;
    }

    public static void C(mf0.f fVar, w wVar) {
        wVar.d(new of0.a(fVar));
    }

    public static StringBuilder D(String str, String str2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        return sb3;
    }

    public static float a(float f13, float f14, float f15, float f16) {
        return ((f13 - f14) * f15) + f16;
    }

    public static int b(int i13, int i14, int i15) {
        return (Integer.hashCode(i13) + i14) * i15;
    }

    public static int c(List list, int i13, int i14) {
        return (list.hashCode() + i13) * i14;
    }

    public static int d(i0 i0Var, int i13, int i14) {
        return (i0Var.hashCode() + i13) * i14;
    }

    public static int e(boolean z13, int i13, int i14) {
        return (Boolean.hashCode(z13) + i13) * i14;
    }

    public static Long f(long j13) {
        return Long.valueOf(System.currentTimeMillis() * j13);
    }

    public static Object g(Class cls) {
        return l0.k0(f0.X().getApplicationContext(), cls);
    }

    public static Object h(ArrayList arrayList, int i13) {
        return arrayList.get(arrayList.size() - i13);
    }

    public static Object i(List list, int i13) {
        return list.get(list.size() - i13);
    }

    public static Object j(Function1 function1, String str, Object obj, String str2, Object obj2) {
        Intrinsics.checkNotNullParameter(function1, str);
        Intrinsics.checkNotNullParameter(obj, str2);
        return function1.invoke(obj2);
    }

    public static String k(StringBuilder sb3, String str, char c13) {
        sb3.append(str);
        sb3.append(c13);
        return sb3.toString();
    }

    public static String l(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    public static String m(tc.f fVar, String str, v vVar, String str2, tc.f fVar2) {
        Intrinsics.checkNotNullParameter(fVar, str);
        Intrinsics.checkNotNullParameter(vVar, str2);
        return m0.e0(fVar2);
    }

    public static StringBuilder n(String str, String str2) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return new StringBuilder();
    }

    public static HashMap o(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static /* synthetic */ Iterator p() {
        try {
            return Arrays.asList(new bo2.a()).iterator();
        } catch (Throwable th3) {
            throw new ServiceConfigurationError(th3.getMessage(), th3);
        }
    }

    public static List q(String str, String str2, String str3, String str4) {
        List b13 = e0.b(str);
        Intrinsics.checkNotNullParameter(str2, str3);
        Intrinsics.checkNotNullParameter(b13, str4);
        return b13;
    }

    public static List r(String str, t tVar, boolean z13, String str2) {
        List b13 = e0.b(new pc.j(str, tVar, z13));
        Intrinsics.checkNotNullParameter(b13, str2);
        return b13;
    }

    public static r s(a10.e eVar, String str, String str2, String str3) {
        r b13 = o.b(eVar.y());
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(b13, str3);
        return b13;
    }

    public static t t(String str, String str2, String str3) {
        t tVar = new t(str);
        Intrinsics.checkNotNullParameter(str2, str3);
        return tVar;
    }

    public static pc.w u(bz.h hVar, String str, String str2, String str3) {
        pc.w i13 = hVar.i();
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(i13, str3);
        return i13;
    }

    public static pc.m0 v(a10.e eVar, String str, String str2, String str3) {
        pc.m0 z13 = eVar.z();
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(z13, str3);
        return z13;
    }

    public static pc.m0 w(t1 t1Var, String str, String str2, String str3) {
        pc.m0 a13 = t1Var.a();
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(a13, str3);
        return a13;
    }

    public static u50.f0 x(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, str2);
        return new u50.f0(str3);
    }

    public static void y(int i13, s sVar, int i14, s3.h hVar) {
        sVar.g0(Integer.valueOf(i13));
        sVar.d(Integer.valueOf(i14), hVar);
    }

    public static void z(d3.b bVar, long j13) {
        bVar.a().restore();
        bVar.j(j13);
    }
}
