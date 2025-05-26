package wr1;

import com.pinterest.error.NetworkResponseError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final l82.h0 f131034b;

    public z0(o82.i0 multiSectionStateTransformer) {
        Intrinsics.checkNotNullParameter(multiSectionStateTransformer, "multiSectionStateTransformer");
        this.f131034b = b(multiSectionStateTransformer, new kotlin.jvm.internal.d0() { // from class: wr1.u0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((q) obj).f130995d;
            }
        }, new kotlin.jvm.internal.d0() { // from class: wr1.v0
            @Override // kotlin.jvm.internal.d0, rl2.t
            public final Object get(Object obj) {
                return ((a1) obj).f130940c;
            }
        }, w0.f131025i);
    }

    public static final String g(z0 z0Var, Throwable th3) {
        v.f1 f1Var;
        qz.d M;
        z0Var.getClass();
        NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
        if (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) {
            return null;
        }
        return M.f105384d;
    }

    public static q0 h(h32.i0 i0Var) {
        return new q0(new zy.e0(new zy.a(com.bumptech.glide.d.z0(i0Var, t0.f131008p), h32.f1.TAP, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        a1 vmState = (a1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        return l82.d.d(new q(se0.f.NONE, null, null, new o82.a0(kotlin.collections.e0.b(new o82.y0(null, null, false, 7))), null), vmState).e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x023f, code lost:
    
        if (r5 == null) goto L64;
     */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r20, u50.o r21, l82.i0 r22, l82.e r23) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wr1.z0.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }
}
