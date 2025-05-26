package tv;

import android.util.LruCache;
import ao2.j0;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.fi0;
import java.util.List;
import kg.t;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import l82.g;
import l82.h;
import sv.p;
import sv.q;
import u50.r;
import x02.i2;

/* loaded from: classes3.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f119499a;

    public e(i2 pinRepository) {
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        this.f119499a = pinRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(2:25|26))|11|12|(2:14|15)(2:17|18)))|29|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r5 = xk2.s.f135225b;
        r6 = ue.c.m(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(tv.e r4, java.lang.String r5, bl2.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof tv.d
            if (r0 == 0) goto L16
            r0 = r6
            tv.d r0 = (tv.d) r0
            int r1 = r0.f119498t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f119498t = r1
            goto L1b
        L16:
            tv.d r0 = new tv.d
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f119496r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f119498t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ue.c.H(r6)     // Catch: java.lang.Throwable -> L2a
            goto L44
        L2a:
            r4 = move-exception
            goto L49
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ue.c.H(r6)
            xk2.q r6 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L2a
            x02.i2 r4 = r4.f119499a     // Catch: java.lang.Throwable -> L2a
            r0.f119498t = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = ve.h.y(r4, r5, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L44
            goto L59
        L44:
            com.pinterest.api.model.f30 r6 = (com.pinterest.api.model.f30) r6     // Catch: java.lang.Throwable -> L2a
            xk2.q r4 = xk2.s.f135225b     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L49:
            xk2.q r5 = xk2.s.f135225b
            xk2.r r6 = ue.c.m(r4)
        L4f:
            java.lang.Throwable r4 = xk2.s.a(r6)
            if (r4 != 0) goto L57
            r1 = r6
            goto L59
        L57:
            r4 = 0
            r1 = r4
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.e.j(tv.e, java.lang.String, bl2.c):java.lang.Object");
    }

    @Override // l82.g
    public final void e(j0 scope, h hVar, r eventIntake) {
        Object obj;
        sv.r request = (sv.r) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (!(request instanceof p)) {
            if (request instanceof q) {
                j.z(scope, null, null, new c(request, this, eventIntake, null), 3);
                return;
            }
            return;
        }
        String L = t.L(((p) request).f115310a);
        if (L == null) {
            LruCache lruCache = ew.f37357a;
            obj = null;
        } else {
            obj = ew.f37367k.get(L);
        }
        fi0 fi0Var = obj instanceof fi0 ? (fi0) obj : null;
        if (fi0Var != null) {
            List M = fi0Var.M();
            if (M == null) {
                M = q0.f80391a;
            }
            j.z(scope, null, null, new b(M, eventIntake, this, null), 3);
        }
    }
}
