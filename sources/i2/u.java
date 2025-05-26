package i2;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f71305a = new t1("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f71306b = new t1("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f71307c = new t1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f71308d = new t1("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final t1 f71309e = new t1("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final t f71310f = new t(0);

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f71311g = new t0();

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f71312h = 0;

    public static final void a(Object obj, Object obj2, Function1 function1, o oVar) {
        s sVar = (s) oVar;
        boolean h10 = sVar.h(obj) | sVar.h(obj2);
        Object J2 = sVar.J();
        if (h10 || J2 == n.f71185a) {
            J2 = new r0(function1);
            sVar.g0(J2);
        }
    }

    public static final void b(Object obj, Function1 function1, o oVar) {
        s sVar = (s) oVar;
        boolean h10 = sVar.h(obj);
        Object J2 = sVar.J();
        if (h10 || J2 == n.f71185a) {
            J2 = new r0(function1);
            sVar.g0(J2);
        }
    }

    public static final void c(Object[] objArr, Function1 function1, o oVar) {
        boolean z13 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z13 |= ((s) oVar).h(obj);
        }
        s sVar = (s) oVar;
        Object J2 = sVar.J();
        if (z13 || J2 == n.f71185a) {
            sVar.g0(new r0(function1));
        }
    }

    public static final void d(Object obj, Object obj2, Function2 function2, o oVar) {
        s sVar = (s) oVar;
        CoroutineContext h10 = sVar.f71266b.h();
        boolean h13 = sVar.h(obj) | sVar.h(obj2);
        Object J2 = sVar.J();
        if (h13 || J2 == n.f71185a) {
            J2 = new f1(h10, function2);
            sVar.g0(J2);
        }
    }

    public static final void e(Object obj, Function2 function2, o oVar) {
        s sVar = (s) oVar;
        CoroutineContext h10 = sVar.f71266b.h();
        boolean h13 = sVar.h(obj);
        Object J2 = sVar.J();
        if (h13 || J2 == n.f71185a) {
            J2 = new f1(h10, function2);
            sVar.g0(J2);
        }
    }

    public static final void f(Function0 function0, o oVar) {
        j2.a aVar = ((s) oVar).L.f74425b;
        aVar.getClass();
        j2.a0 a0Var = j2.a0.f74423c;
        j2.l0 l0Var = aVar.f74422a;
        l0Var.G1(a0Var);
        bf.b.o0(l0Var, 0, function0);
        int i13 = l0Var.f74467g;
        int i14 = a0Var.f74453a;
        int z13 = j2.l0.z1(l0Var, i14);
        int i15 = a0Var.f74454b;
        if (i13 == z13 && l0Var.f74468h == j2.l0.z1(l0Var, i15)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            if (((1 << i17) & l0Var.f74467g) != 0) {
                if (i16 > 0) {
                    sb3.append(", ");
                }
                sb3.append(a0Var.b(i17));
                i16++;
            }
        }
        String sb4 = sb3.toString();
        StringBuilder n13 = ep.b.n(sb4, "StringBuilder().apply(builderAction).toString()");
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            if (((1 << i19) & l0Var.f74468h) != 0) {
                if (i16 > 0) {
                    n13.append(", ");
                }
                n13.append(a0Var.c(i19));
                i18++;
            }
        }
        String sb5 = n13.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb6 = new StringBuilder("Error while pushing ");
        sb6.append(a0Var);
        sb6.append(". Not all arguments were provided. Missing ");
        a.a.A(sb6, i16, " int arguments (", sb4, ") and ");
        ep.b.B(sb6, i18, " object arguments (", sb5, ").");
        throw null;
    }

    public static final void g(int i13, int i14, ArrayList arrayList) {
        int m13 = m(i13, arrayList);
        if (m13 < 0) {
            m13 = -(m13 + 1);
        }
        while (m13 < arrayList.size() && ((a1) arrayList.get(m13)).f71071b < i14) {
            arrayList.remove(m13);
        }
    }

    public static final void h(v2 v2Var, ArrayList arrayList, int i13) {
        int[] iArr = v2Var.f71319b;
        if (lb.l0.m(iArr, i13)) {
            arrayList.add(v2Var.i(i13));
            return;
        }
        int i14 = lb.l0.i(iArr, i13) + i13;
        for (int i15 = i13 + 1; i15 < i14; i15 += iArr[(i15 * 5) + 3]) {
            h(v2Var, arrayList, i15);
        }
    }

    public static final void i(String str) {
        throw new ComposeRuntimeError(a.a.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void j(String str) {
        throw new ComposeRuntimeError(a.a.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final ho2.c k(kotlin.coroutines.j jVar, o oVar) {
        ao2.g0 key = ao2.g0.f20154b;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext h10 = ((s) oVar).f71266b.h();
        return dl2.b.b(h10.plus(new ao2.p1((ao2.o1) h10.get(key))).plus(jVar));
    }

    public static final void l(y2 y2Var, y yVar) {
        int i13;
        int i14;
        int i15;
        int i16 = y2Var.f71395t;
        int i17 = y2Var.f71396u;
        while (i16 < i17) {
            Object y13 = y2Var.y(i16);
            if (y13 instanceof m) {
                yVar.e(y2Var.o() - y2Var.H(y2Var.f71377b, y2Var.p(i16)), -1, (m) y13, -1);
            }
            int H = y2Var.H(y2Var.f71377b, y2Var.p(i16));
            int i18 = i16 + 1;
            int f13 = y2Var.f(y2Var.f71377b, y2Var.p(i18));
            int i19 = H;
            while (i19 < f13) {
                int i23 = i19 - H;
                Object obj = y2Var.f71378c[y2Var.g(i19)];
                boolean z13 = obj instanceof r2;
                am.d dVar = n.f71185a;
                if (z13) {
                    r2 r2Var = (r2) obj;
                    q2 q2Var = r2Var.f71259a;
                    if (q2Var instanceof p) {
                        i13 = i17;
                    } else {
                        int g13 = y2Var.g(y2Var.I(i16, i23));
                        Object[] objArr = y2Var.f71378c;
                        i13 = i17;
                        Object obj2 = objArr[g13];
                        objArr[g13] = dVar;
                        if (obj != obj2) {
                            i("Slot table is out of sync");
                            throw null;
                        }
                        int o13 = y2Var.o() - i23;
                        d dVar2 = r2Var.f71260b;
                        if (dVar2 == null || !dVar2.a()) {
                            i14 = -1;
                            i15 = -1;
                        } else {
                            i14 = y2Var.c(dVar2);
                            i15 = y2Var.o() - y2Var.f(y2Var.f71377b, y2Var.p(y2Var.q(i14) + i14));
                        }
                        yVar.e(o13, i14, q2Var, i15);
                    }
                } else {
                    i13 = i17;
                    if (obj instanceof f2) {
                        int g14 = y2Var.g(y2Var.I(i16, i23));
                        Object[] objArr2 = y2Var.f71378c;
                        Object obj3 = objArr2[g14];
                        objArr2[g14] = dVar;
                        if (obj != obj3) {
                            i("Slot table is out of sync");
                            throw null;
                        }
                        ((f2) obj).d();
                    } else {
                        continue;
                    }
                }
                i19++;
                i17 = i13;
            }
            i16 = i18;
        }
    }

    public static final int m(int i13, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            int i16 = Intrinsics.i(((a1) arrayList.get(i15)).f71071b, i13);
            if (i16 < 0) {
                i14 = i15 + 1;
            } else {
                if (i16 <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static final void n(y2 y2Var, y yVar) {
        int i13;
        int[] iArr = y2Var.f71377b;
        int i14 = y2Var.f71395t;
        int f13 = y2Var.f(iArr, y2Var.p(y2Var.q(i14) + i14));
        for (int f14 = y2Var.f(y2Var.f71377b, y2Var.p(y2Var.f71395t)); f14 < f13; f14++) {
            Object obj = y2Var.f71378c[y2Var.g(f14)];
            int i15 = -1;
            if (obj instanceof m) {
                int o13 = y2Var.o() - f14;
                m mVar = (m) obj;
                g1.g0 g0Var = yVar.f71365e;
                if (g0Var == null) {
                    int i16 = g1.n0.f63290a;
                    g0Var = new g1.g0();
                    yVar.f71365e = g0Var;
                }
                g0Var.f63286b[g0Var.g(mVar)] = mVar;
                yVar.e(o13, -1, mVar, -1);
            }
            if (obj instanceof r2) {
                int o14 = y2Var.o() - f14;
                r2 r2Var = (r2) obj;
                d dVar = r2Var.f71260b;
                if (dVar == null || !dVar.a()) {
                    i13 = -1;
                } else {
                    i15 = y2Var.c(dVar);
                    i13 = y2Var.o() - y2Var.f(y2Var.f71377b, y2Var.p(y2Var.q(i15) + i15));
                }
                yVar.e(o14, i15, r2Var.f71259a, i13);
            }
            if (obj instanceof f2) {
                ((f2) obj).d();
            }
        }
        y2Var.C();
    }

    public static final void o(boolean z13) {
        if (z13) {
            return;
        }
        i("Check failed");
        throw null;
    }

    public static final int p(int i13) {
        int i14 = 306783378 & i13;
        int i15 = 613566756 & i13;
        return (i13 & (-920350135)) | (i15 >> 1) | i14 | ((i14 << 1) & i15);
    }
}
