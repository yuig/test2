package qm0;

import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104285i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0 f104286j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(p0 p0Var, int i13) {
        super(2);
        this.f104285i = i13;
        this.f104286j = p0Var;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f104285i;
        p0 p0Var = this.f104286j;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                k3.g((om0.z) p0Var.Z0.getValue(), null, null, new i0(p0Var, 0), new i0(p0Var, 1), new i0(p0Var, 2), new i0(p0Var, 3), new i0(p0Var, 4), oVar, 0, 6);
                break;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                p0.k9(p0Var, oVar, 8);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f104285i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
