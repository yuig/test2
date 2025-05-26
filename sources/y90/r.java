package y90;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f138231j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(d0 d0Var, int i13) {
        super(0);
        this.f138230i = i13;
        this.f138231j = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        f fVar = f.f138170a;
        h hVar = h.f138182a;
        int i13 = this.f138230i;
        d0 d0Var = this.f138231j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        int i14 = d0.f138146w0;
                        hf0.b.l(d0Var.requireActivity());
                        d0Var.a8(fVar);
                        break;
                    default:
                        int i15 = d0.f138146w0;
                        hf0.b.l(d0Var.requireActivity());
                        d0Var.a8(hVar);
                        break;
                }
                return Unit.f80348a;
            case 1:
                switch (i13) {
                    case 0:
                        int i16 = d0.f138146w0;
                        hf0.b.l(d0Var.requireActivity());
                        d0Var.a8(fVar);
                        break;
                    default:
                        int i17 = d0.f138146w0;
                        hf0.b.l(d0Var.requireActivity());
                        d0Var.a8(hVar);
                        break;
                }
                return Unit.f80348a;
            case 2:
                k1 k1Var = new k1(f1.f138173b);
                k1Var.f138199e = new vt1.a();
                x xVar = new x(d0Var);
                Intrinsics.checkNotNullParameter(xVar, "<set-?>");
                k1Var.f138199e = xVar;
                return k1Var;
            case 3:
                y yVar = new y(d0Var, 0);
                n72.m mVar = d0Var.f138148d0;
                if (mVar == null) {
                    Intrinsics.r("logger");
                    throw null;
                }
                p1 p1Var = new p1(yVar, mVar);
                x xVar2 = new x(d0Var);
                Intrinsics.checkNotNullParameter(xVar2, "<set-?>");
                p1Var.f138218g = xVar2;
                return p1Var;
            default:
                n72.b bVar = d0Var.f138147c0;
                if (bVar == null) {
                    Intrinsics.r("fontManager");
                    throw null;
                }
                u1 u1Var = new u1(bVar);
                x xVar3 = new x(d0Var);
                Intrinsics.checkNotNullParameter(xVar3, "<set-?>");
                u1Var.f138255f = xVar3;
                return u1Var;
        }
    }
}
