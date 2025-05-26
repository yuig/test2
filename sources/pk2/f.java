package pk2;

import android.animation.ValueAnimator;
import android.util.Property;
import androidx.camera.core.impl.r2;
import androidx.camera.core.impl.s2;
import androidx.camera.core.impl.t2;
import androidx.recyclerview.widget.b2;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import jk2.j1;
import jk2.x;
import kk2.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pc.r0;
import qa2.r;
import so.oa;
import so.qb;
import so.rb;
import so.u8;
import wm1.h0;
import xk2.n;
import xk2.v;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class f {
    public static int a(r0 r0Var, int i13, int i14) {
        return (r0Var.hashCode() + i13) * i14;
    }

    public static r2 b(ArrayList arrayList, r2 r2Var) {
        arrayList.add(r2Var);
        return new r2();
    }

    public static bf2.d c(oa oaVar, u8 u8Var, rb rbVar, int i13) {
        return bf2.e.a(new qb(oaVar, u8Var, rbVar, i13));
    }

    public static Object d(Property property, ValueAnimator valueAnimator, String str) {
        Object animatedValue = valueAnimator.getAnimatedValue(property.getName());
        Intrinsics.g(animatedValue, str);
        return animatedValue;
    }

    public static Object e(do2.j jVar, int i13, do2.i iVar, bl2.c cVar) {
        return iVar.collect(new wb.b(jVar, i13), cVar);
    }

    public static String f(int i13, String str, String str2) {
        StringBuilder sb3 = new StringBuilder(i13);
        sb3.append(str);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, str2);
        return sb4;
    }

    public static String g(StringBuilder sb3, al1.i iVar, String str) {
        sb3.append(iVar);
        sb3.append(str);
        return sb3.toString();
    }

    public static String h(StringBuilder sb3, Throwable th3, String str) {
        sb3.append(th3);
        sb3.append(str);
        return sb3.toString();
    }

    public static String i(StringBuilder sb3, Function0 function0, String str) {
        sb3.append(function0);
        sb3.append(str);
        return sb3.toString();
    }

    public static x j(j1 j1Var, qt.b bVar, int i13, String str) {
        x xVar = new x(j1Var, bVar, i13);
        Intrinsics.checkNotNullExpressionValue(xVar, str);
        return xVar;
    }

    public static t k(t tVar, String str) {
        t l13 = tVar.l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, str);
        return l13;
    }

    public static xk2.k l(LegoPinGridCellImpl legoPinGridCellImpl, int i13, n nVar) {
        return xk2.m.a(nVar, new r(legoPinGridCellImpl, i13));
    }

    public static v m(GestaltListAction gestaltListAction, int i13) {
        return xk2.m.b(new h0(gestaltListAction, i13));
    }

    public static void n(t2 t2Var, s2 s2Var, long j13, r2 r2Var) {
        r2Var.a(new androidx.camera.core.impl.l(t2Var, s2Var, j13));
    }

    public static /* synthetic */ void o(b2 b2Var) {
        if (b2Var != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void p(AtomicReference atomicReference, RuntimeException runtimeException) {
        while (!atomicReference.compareAndSet(null, runtimeException) && atomicReference.get() == null) {
        }
    }

    public static /* synthetic */ void q(tf.c cVar) {
        if (cVar != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ boolean r(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean s(AtomicReference atomicReference, Throwable th3, Throwable th4) {
        while (!atomicReference.compareAndSet(th3, th4)) {
            if (atomicReference.get() != th3) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean t(AtomicReference atomicReference, g gVar) {
        while (!atomicReference.compareAndSet(null, gVar)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static Object u(do2.j jVar, int i13, do2.i iVar, bl2.c cVar) {
        return iVar.collect(new c31.m(jVar, i13), cVar);
    }

    public static xk2.k v(LegoPinGridCellImpl legoPinGridCellImpl, int i13, n nVar) {
        return xk2.m.a(nVar, new qa2.x(legoPinGridCellImpl, i13));
    }
}
