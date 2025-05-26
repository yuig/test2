package zl2;

import am2.c0;
import am2.v0;
import am2.w0;
import dm2.u0;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends in2.h {

    /* renamed from: e, reason: collision with root package name */
    public static final ym2.g f142101e;

    static {
        ym2.g e13 = ym2.g.e("clone");
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        f142101e = e13;
    }

    @Override // in2.h
    public final List h() {
        am2.c cVar = am2.c.DECLARATION;
        v0 v0Var = w0.f15602a;
        ym2.g gVar = f142101e;
        am2.g gVar2 = this.f72868b;
        u0 E0 = u0.E0(gVar2, gVar, cVar, v0Var);
        dm2.d t03 = gVar2.t0();
        q0 q0Var = q0.f80391a;
        E0.y0(null, t03, q0Var, q0Var, q0Var, fn2.d.e(gVar2).e(), c0.OPEN, am2.s.f15575c);
        return e0.b(E0);
    }
}
