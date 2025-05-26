package jq;

import a.l9;
import androidx.fragment.app.q1;
import b3.w;
import com.amazonaws.regions.Region;
import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.ui.components.users.LegoUserRep;
import i2.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k92.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mq.d0;
import o82.g0;
import o82.h0;
import s80.m2;
import u50.f0;
import u50.i0;
import zy.k0;
import zy.l0;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ boolean A(AtomicReferenceArray atomicReferenceArray, int i13, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i13, null, obj)) {
            if (atomicReferenceArray.get(i13) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(AtomicReferenceArray atomicReferenceArray, int i13, ko2.j jVar) {
        while (!atomicReferenceArray.compareAndSet(i13, jVar, null)) {
            if (atomicReferenceArray.get(i13) != jVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ko2.n nVar, ko2.j jVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(nVar, jVar, null)) {
            if (atomicReferenceFieldUpdater.get(nVar) != jVar) {
                return false;
            }
        }
        return true;
    }

    public static int a(l0 l0Var, int i13, int i14) {
        return (l0Var.hashCode() + i13) * i14;
    }

    public static Region b(String str, String str2, ArrayList arrayList) {
        Region region = new Region(str, str2);
        arrayList.add(region);
        return region;
    }

    public static Long c(TimeUnit timeUnit) {
        return Long.valueOf(timeUnit.toNanos(System.currentTimeMillis()));
    }

    public static Object d(s sVar, boolean z13, int i13) {
        sVar.r(z13);
        sVar.W(i13);
        return sVar.J();
    }

    public static String e(StringBuilder sb3, f30 f30Var, String str) {
        sb3.append(f30Var);
        sb3.append(str);
        return sb3.toString();
    }

    public static String f(StringBuilder sb3, HashMap hashMap, String str) {
        sb3.append(hashMap);
        sb3.append(str);
        return sb3.toString();
    }

    public static String g(StringBuilder sb3, o oVar, String str) {
        sb3.append(oVar);
        sb3.append(str);
        return sb3.toString();
    }

    public static String h(StringBuilder sb3, ll1.d dVar, String str) {
        sb3.append(dVar);
        sb3.append(str);
        return sb3.toString();
    }

    public static String i(StringBuilder sb3, g0 g0Var, String str) {
        sb3.append(g0Var);
        sb3.append(str);
        return sb3.toString();
    }

    public static String j(StringBuilder sb3, h0 h0Var, String str) {
        sb3.append(h0Var);
        sb3.append(str);
        return sb3.toString();
    }

    public static String k(StringBuilder sb3, i0 i0Var, String str) {
        sb3.append(i0Var);
        sb3.append(str);
        return sb3.toString();
    }

    public static String l(StringBuilder sb3, k0 k0Var, String str) {
        sb3.append(k0Var);
        sb3.append(str);
        return sb3.toString();
    }

    public static /* synthetic */ List m(vn1.b bVar) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{bVar}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    public static pd2.k n(float f13, qd2.l lVar, float f14, float f15) {
        return new pd2.k(f13, lVar).c(f14, f15);
    }

    public static m2 o(int i13, Function1 function1, s sVar) {
        m2 m2Var = new m2(i13, function1);
        sVar.g0(m2Var);
        return m2Var;
    }

    public static f0 p(rn1.a aVar, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(aVar, str);
        Intrinsics.checkNotNullParameter(str2, str3);
        return new f0(str4);
    }

    public static xk2.k q(int i13, q1 q1Var, xk2.n nVar) {
        return xk2.m.a(nVar, new d0(i13, q1Var));
    }

    public static xk2.k r(LegoUserRep legoUserRep, int i13, xk2.n nVar) {
        return xk2.m.a(nVar, new oa2.k(legoUserRep, i13));
    }

    public static void s(int i13, int i14, int i15, int i16, int i17) {
        l9.a(i13);
        l9.a(i14);
        l9.a(i15);
        l9.a(i16);
        l9.a(i17);
    }

    public static void t(long j13, StringBuilder sb3, String str) {
        sb3.append((Object) w.i(j13));
        sb3.append(str);
    }

    public static /* synthetic */ void u(com.google.android.gms.common.api.k kVar) {
        if (kVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void v(Integer num) {
        if (num != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void w(nl1.d dVar) {
        throw new ClassCastException();
    }

    public static boolean x(ScreenLocation screenLocation, String str) {
        return Intrinsics.d(str, screenLocation.getF48308a().getName());
    }

    public static /* synthetic */ boolean y(AtomicReference atomicReference, xp2.c cVar, Object obj) {
        while (!atomicReference.compareAndSet(cVar, obj)) {
            if (atomicReference.get() != cVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean z(AtomicReferenceArray atomicReferenceArray, int i13, fi.b bVar, fi.b bVar2) {
        while (!atomicReferenceArray.compareAndSet(i13, bVar, bVar2)) {
            if (atomicReferenceArray.get(i13) != bVar) {
                return false;
            }
        }
        return true;
    }
}
