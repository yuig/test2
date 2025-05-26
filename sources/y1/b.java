package y1;

import android.os.Build;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.menu.KotSpringLinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rr.n0;

/* loaded from: classes2.dex */
public final class b implements do2.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f136536b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f136535a = i13;
        this.f136536b = obj;
    }

    public final Object a(f30 f30Var, bl2.c cVar) {
        int i13 = this.f136535a;
        Object obj = this.f136536b;
        switch (i13) {
            case 2:
                vs.z zVar = (vs.z) obj;
                gs1.a aVar = zVar.f126538f;
                String k13 = zVar.f126539g.k(f30Var);
                gs1.d dVar = (gs1.d) aVar;
                dVar.getClass();
                int i14 = 14;
                new fk2.g(new uv0.a(i14, dVar, k13), 0).i(new xo.b(i14), new n0(18, vs.q.f126507n));
                return Unit.f80348a;
            case 9:
                Object invoke = ((Function2) obj).invoke(f30Var, cVar);
                return invoke == cl2.a.COROUTINE_SUSPENDED ? invoke : Unit.f80348a;
            case 14:
                bi1.p pVar = (bi1.p) obj;
                k11.p pVar2 = pVar.f22872e0;
                if (pVar2 != null) {
                    k11.p.a(pVar2, f30Var, true, false, false, null, false, null, pVar.s7(), null, null, new p91.v(23, pVar, f30Var), 3580);
                    return Unit.f80348a;
                }
                Intrinsics.r("repinUtils");
                throw null;
            default:
                tu.d0 d0Var = (tu.d0) obj;
                a11.d dVar2 = (a11.d) d0Var.f119280b;
                if (dVar2 == null) {
                    Intrinsics.r("clickThroughHelperFactory");
                    throw null;
                }
                nx.d0 d0Var2 = (nx.d0) ((xk2.k) d0Var.f119285g).getValue();
                Intrinsics.checkNotNullExpressionValue(d0Var2, "access$getPinalytics(...)");
                a11.e.d(dVar2.a(d0Var2), f30Var, 0, 0, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                return Unit.f80348a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:18|19))(3:20|21|22))(4:31|32|33|(1:35))|23|(1:25)(4:26|13|14|15)))|37|6|7|(0)(0)|23|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002e, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r9v0, types: [df2.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(df2.a r9, bl2.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof cf2.d
            if (r0 == 0) goto L13
            r0 = r10
            cf2.d r0 = (cf2.d) r0
            int r1 = r0.f27663v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27663v = r1
            goto L18
        L13:
            cf2.d r0 = new cf2.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27661t
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f27663v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f27659r
            ao2.v r9 = (ao2.v) r9
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L2e
            goto L76
        L2e:
            r10 = move-exception
            goto L88
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            ao2.v r9 = r0.f27660s
            java.lang.Object r2 = r0.f27659r
            df2.a r2 = (df2.a) r2
            ue.c.H(r10)     // Catch: java.lang.Throwable -> L2e
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L5c
        L46:
            ue.c.H(r10)
            ao2.v r10 = r9.f54895a
            java.lang.Object r2 = r8.f136536b     // Catch: java.lang.Throwable -> L84
            cf2.f r2 = (cf2.f) r2     // Catch: java.lang.Throwable -> L84
            r0.f27659r = r9     // Catch: java.lang.Throwable -> L84
            r0.f27660s = r10     // Catch: java.lang.Throwable -> L84
            r0.f27663v = r4     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = cf2.f.P0(r2, r0)     // Catch: java.lang.Throwable -> L84
            if (r2 != r1) goto L5c
            return r1
        L5c:
            android.graphics.Picture r2 = (android.graphics.Picture) r2     // Catch: java.lang.Throwable -> L84
            ko2.f r4 = ao2.v0.f20219a     // Catch: java.lang.Throwable -> L84
            cf2.c r5 = new cf2.c     // Catch: java.lang.Throwable -> L84
            r6 = 0
            r5.<init>(r2, r9, r6)     // Catch: java.lang.Throwable -> L84
            r0.f27659r = r10     // Catch: java.lang.Throwable -> L84
            r0.f27660s = r6     // Catch: java.lang.Throwable -> L84
            r0.f27663v = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = kotlin.jvm.internal.j.M(r0, r4, r5)     // Catch: java.lang.Throwable -> L84
            if (r9 != r1) goto L73
            return r1
        L73:
            r7 = r10
            r10 = r9
            r9 = r7
        L76:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch: java.lang.Throwable -> L2e
            b3.h r0 = new b3.h     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L2e
            r10 = r9
            ao2.w r10 = (ao2.w) r10     // Catch: java.lang.Throwable -> L2e
            r10.Q(r0)     // Catch: java.lang.Throwable -> L2e
            goto L8d
        L84:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L88:
            ao2.w r9 = (ao2.w) r9
            r9.e0(r10)
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.c(df2.a, bl2.c):java.lang.Object");
    }

    public final Unit d() {
        int i13 = this.f136535a;
        Object obj = this.f136536b;
        switch (i13) {
            case 0:
                x xVar = (x) ((w) obj);
                if (Build.VERSION.SDK_INT >= 34) {
                    i.f136574a.a(xVar.a(), xVar.f136605a);
                } else {
                    xVar.getClass();
                }
                break;
            default:
                ((KotSpringLinearLayout) obj).b();
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: Removed duplicated region for block: B:307:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0916  */
    @Override // do2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r24, bl2.c r25) {
        /*
            Method dump skipped, instructions count: 2666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.emit(java.lang.Object, bl2.c):java.lang.Object");
    }
}
