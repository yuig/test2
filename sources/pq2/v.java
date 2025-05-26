package pq2;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

/* loaded from: classes4.dex */
public final class v extends w {

    /* renamed from: d, reason: collision with root package name */
    public final k f101089d;

    public v(z0 z0Var, Call.Factory factory, p pVar, k kVar) {
        super(z0Var, factory, pVar);
        this.f101089d = kVar;
    }

    @Override // pq2.w
    public final Object b(g0 g0Var, Object[] objArr) {
        i iVar = (i) this.f101089d.a(g0Var);
        bl2.c frame = (bl2.c) objArr[objArr.length - 1];
        try {
            ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
            oVar.v();
            oVar.e(new z(iVar, 1));
            iVar.x1(new a0(oVar, 1));
            Object u13 = oVar.u();
            if (u13 == cl2.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return u13;
        } catch (Exception e13) {
            return ao2.m0.n0(e13, frame);
        }
    }
}
