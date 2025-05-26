package eo2;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c[] f59731a;

    /* renamed from: b, reason: collision with root package name */
    public int f59732b;

    /* renamed from: c, reason: collision with root package name */
    public int f59733c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f59734d;

    public final c c() {
        c cVar;
        q0 q0Var;
        synchronized (this) {
            try {
                c[] cVarArr = this.f59731a;
                if (cVarArr == null) {
                    cVarArr = e();
                    this.f59731a = cVarArr;
                } else if (this.f59732b >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.f59731a = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i13 = this.f59733c;
                do {
                    cVar = cVarArr[i13];
                    if (cVar == null) {
                        cVar = d();
                        cVarArr[i13] = cVar;
                    }
                    i13++;
                    if (i13 >= cVarArr.length) {
                        i13 = 0;
                    }
                } while (!cVar.a(this));
                this.f59733c = i13;
                this.f59732b++;
                q0Var = this.f59734d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (q0Var != null) {
            q0Var.w(1);
        }
        return cVar;
    }

    public abstract c d();

    public abstract c[] e();

    public final void f(c cVar) {
        q0 q0Var;
        int i13;
        bl2.c[] b13;
        synchronized (this) {
            try {
                int i14 = this.f59732b - 1;
                this.f59732b = i14;
                q0Var = this.f59734d;
                if (i14 == 0) {
                    this.f59733c = 0;
                }
                Intrinsics.g(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b13 = cVar.b(this);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (bl2.c cVar2 : b13) {
            if (cVar2 != null) {
                xk2.q qVar = xk2.s.f135225b;
                cVar2.resumeWith(Unit.f80348a);
            }
        }
        if (q0Var != null) {
            q0Var.w(-1);
        }
    }

    public final q0 g() {
        q0 q0Var;
        synchronized (this) {
            q0Var = this.f59734d;
            if (q0Var == null) {
                int i13 = this.f59732b;
                q0Var = new q0(1, Integer.MAX_VALUE, co2.a.DROP_OLDEST);
                q0Var.b(Integer.valueOf(i13));
                this.f59734d = q0Var;
            }
        }
        return q0Var;
    }
}
