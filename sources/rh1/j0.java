package rh1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108190i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k0 f108191j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, int i13) {
        super(1);
        this.f108190i = i13;
        this.f108191j = k0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f108190i;
        k0 k0Var = this.f108191j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        bs1.c.X0(k0Var.I);
                        break;
                    default:
                        bs1.c.X0(k0Var.K);
                        break;
                }
                return Unit.f80348a;
            case 1:
                switch (i13) {
                    case 0:
                        bs1.c.X0(k0Var.I);
                        break;
                    default:
                        bs1.c.X0(k0Var.K);
                        break;
                }
                return Unit.f80348a;
            case 2:
                rm1.k bind = (rm1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(j.f108182t);
                k0Var.getClass();
                bind.c(d7.b.Z(false));
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                k0Var.getClass();
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(false), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }
}
