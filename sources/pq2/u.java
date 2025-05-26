package pq2;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;

/* loaded from: classes2.dex */
public final class u extends w {

    /* renamed from: d, reason: collision with root package name */
    public final k f101087d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f101088e;

    public u(z0 z0Var, Call.Factory factory, p pVar, k kVar, boolean z13) {
        super(z0Var, factory, pVar);
        this.f101087d = kVar;
        this.f101088e = z13;
    }

    @Override // pq2.w
    public final Object b(g0 g0Var, Object[] objArr) {
        i iVar = (i) this.f101087d.a(g0Var);
        bl2.c frame = (bl2.c) objArr[objArr.length - 1];
        try {
            if (!this.f101088e) {
                return ao2.m0.g(iVar, frame);
            }
            Intrinsics.g(iVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
            oVar.v();
            oVar.e(new z(iVar, 0));
            iVar.x1(new a0(oVar, 0));
            Object u13 = oVar.u();
            if (u13 == cl2.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return u13;
        } catch (LinkageError e13) {
            throw e13;
        } catch (ThreadDeath e14) {
            throw e14;
        } catch (VirtualMachineError e15) {
            throw e15;
        } catch (Throwable th3) {
            return ao2.m0.n0(th3, frame);
        }
    }
}
