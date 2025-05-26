package m62;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final f1 f85976i = new f1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r72.w0 setting = (r72.w0) obj2;
        Intrinsics.checkNotNullParameter((String) obj, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(setting, "setting");
        Intrinsics.checkNotNullParameter(setting, "<this>");
        if (setting instanceof r72.o0) {
            r72.o0 o0Var = (r72.o0) setting;
            return r72.o0.d(o0Var, o0Var.f106596c);
        }
        if (setting instanceof r72.p0) {
            r72.p0 p0Var = (r72.p0) setting;
            return r72.p0.d(p0Var, p0Var.f106611c);
        }
        if (setting instanceof r72.q0) {
            r72.q0 q0Var = (r72.q0) setting;
            return r72.q0.d(q0Var, q0Var.f106622c);
        }
        if (setting instanceof r72.r0) {
            r72.r0 r0Var = (r72.r0) setting;
            return r72.r0.d(r0Var, r0Var.f106633c);
        }
        if (setting instanceof r72.v0) {
            r72.v0 v0Var = (r72.v0) setting;
            return r72.v0.d(v0Var, v0Var.f106696c);
        }
        if (setting instanceof r72.t0) {
            r72.t0 t0Var = (r72.t0) setting;
            return r72.t0.d(t0Var, t0Var.f106660c);
        }
        if (setting instanceof r72.m0) {
            r72.m0 m0Var = (r72.m0) setting;
            return r72.m0.d(m0Var, m0Var.f106550c);
        }
        if (!(setting instanceof r72.n0)) {
            throw new NoWhenBranchMatchedException();
        }
        r72.n0 n0Var = (r72.n0) setting;
        return r72.n0.d(n0Var, n0Var.f106580c);
    }
}
