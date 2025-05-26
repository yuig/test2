package d7;

import android.content.res.Resources;
import android.widget.RelativeLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.navigation.NavigationImpl;
import ea1.t0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import je.c3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.Attributes;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static /* synthetic */ boolean A(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ho2.b bVar, Object obj, ho2.b bVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bVar, obj, bVar2)) {
            if (atomicReferenceFieldUpdater.get(bVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int a(fm1.c cVar, int i13, int i14) {
        return (cVar.hashCode() + i13) * i14;
    }

    public static int b(Function0 function0, int i13, int i14) {
        return (function0.hashCode() + i13) * i14;
    }

    public static int c(Function1 function1, int i13, int i14) {
        return (function1.hashCode() + i13) * i14;
    }

    public static int d(Attributes attributes, int i13) {
        return c3.fromString(attributes.getLocalName(i13)).ordinal();
    }

    public static int e(u50.n nVar, int i13, int i14) {
        return (nVar.hashCode() + i13) * i14;
    }

    public static long f(long j13, long j14, long j15, long j16) {
        return (j13 * j14) + j15 + j16;
    }

    public static IllegalStateException g(tc.f fVar, String str, pc.v vVar, String str2, String str3) {
        Intrinsics.checkNotNullParameter(fVar, str);
        Intrinsics.checkNotNullParameter(vVar, str2);
        return new IllegalStateException(str3);
    }

    public static String h(StringBuilder sb3, float f13, char c13) {
        sb3.append(f13);
        sb3.append(c13);
        return sb3.toString();
    }

    public static String i(StringBuilder sb3, float f13, String str) {
        sb3.append(f13);
        sb3.append(str);
        return sb3.toString();
    }

    public static String j(StringBuilder sb3, wy0 wy0Var, String str) {
        sb3.append(wy0Var);
        sb3.append(str);
        return sb3.toString();
    }

    public static String k(StringBuilder sb3, List list, char c13) {
        sb3.append(list);
        sb3.append(c13);
        return sb3.toString();
    }

    public static /* synthetic */ Iterator l() {
        try {
            return Arrays.asList(new bo2.b()).iterator();
        } catch (Throwable th3) {
            throw new ServiceConfigurationError(th3.getMessage(), th3);
        }
    }

    public static List m(String str, String str2, String str3, Map map, boolean z13) {
        Intrinsics.checkNotNullParameter(str, str2);
        return kotlin.collections.e0.b(new pc.j(str3, map, z13));
    }

    public static lt.j n(int i13, String str) {
        lt.j jVar = new lt.j(i13);
        Intrinsics.checkNotNullParameter(jVar, str);
        return jVar;
    }

    public static o1.l o(i2.s sVar) {
        o1.l lVar = new o1.l();
        sVar.g0(lVar);
        return lVar;
    }

    public static o6.d p(o6.d dVar, o6.d dVar2, o6.d dVar3) {
        return dVar.s().a(dVar2).a(dVar3);
    }

    public static u50.f0 q(Resources resources, int i13, String str) {
        String string = resources.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, str);
        return bs1.c.h2(string);
    }

    public static xk2.k r(int i13, t0 t0Var, xk2.n nVar) {
        return xk2.m.a(nVar, new z91.l(i13, t0Var));
    }

    public static void s(NavigationImpl navigationImpl, m60.w wVar) {
        wVar.d(new za.c(navigationImpl));
    }

    public static void t(gs0.o oVar, int i13, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        relativeLayout.setOnClickListener(new gs0.m(oVar, i13));
        oVar.addView(relativeLayout2);
    }

    public static /* synthetic */ void u(Runnable runnable) {
        throw new ClassCastException();
    }

    public static void v(HashMap hashMap, String str, Integer num, int i13, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i13));
    }

    public static /* synthetic */ void w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ho2.o oVar) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, null, oVar) && atomicReferenceFieldUpdater.get(obj) == null) {
        }
    }

    public static /* synthetic */ void x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ho2.o oVar, ho2.o oVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, oVar, oVar2) && atomicReferenceFieldUpdater.get(obj) == oVar) {
        }
    }

    public static void y(l82.c0 c0Var, int i13, l82.e eVar) {
        eVar.c(new ns.g0(c0Var, i13));
    }

    public static /* synthetic */ boolean z(AtomicReference atomicReference, h4.m0 m0Var) {
        while (!atomicReference.compareAndSet(m0Var, null)) {
            if (atomicReference.get() != m0Var) {
                return false;
            }
        }
        return true;
    }
}
