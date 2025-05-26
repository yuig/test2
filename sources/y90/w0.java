package y90;

import java.util.HashMap;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f138264b;

    public w0(lt.j pinalyticsStateTransformer) {
        Intrinsics.checkNotNullParameter(pinalyticsStateTransformer, "pinalyticsStateTransformer");
        this.f138264b = b(pinalyticsStateTransformer, new kotlin.jvm.internal.d0() { // from class: y90.s0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((d) obj).f138143b;
            }
        }, new kotlin.jvm.internal.d0() { // from class: y90.t0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((x0) obj).f138267b;
            }
        }, v0.f138259i);
    }

    public static void g(w0 w0Var, l82.e eVar, h32.u0 u0Var, h32.g0 g0Var, HashMap auxData, int i13) {
        if ((i13 & 2) != 0) {
            g0Var = null;
        }
        h32.f1 eventType = h32.f1.TAP;
        w0Var.getClass();
        x0 x0Var = (x0) eVar.f82219b;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        eVar.a(new m0(g3.p0(x0Var.f138267b, null, u0Var, g0Var, null, eventType, auxData, 19)));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        x0 vmState = (x0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e resultBuilder = l82.d.d(new d(bs1.c.h2(vmState.f138266a), 14), vmState);
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        l82.h0 lens = this.f138264b;
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
        Intrinsics.checkNotNullParameter(vmState, "<this>");
        String str = (String) vmState.f138269d.get("android_collage_refinement");
        resultBuilder.a(new j0(vmState.f138266a, v50.a.a(str) || v50.a.b(str), vmState.f138268c));
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        resultBuilder.a(a.f138123a);
        return resultBuilder.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r3 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0164  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r21, u50.o r22, l82.i0 r23, l82.e r24) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y90.w0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
