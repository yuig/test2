package b11;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import dl1.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21018i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j0 f21019j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(j0 j0Var, int i13) {
        super(1);
        this.f21018i = i13;
        this.f21019j = j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f21018i;
        j0 j0Var = this.f21019j;
        switch (i13) {
            case 0:
                f30 f30Var = (f30) obj;
                Intrinsics.f(f30Var);
                j0Var.z0(b40.O(f30Var), Boolean.FALSE);
                return Unit.f80348a;
            case 1:
                v0 updatedModel = (v0) obj;
                Intrinsics.checkNotNullParameter(updatedModel, "updatedModel");
                return Boolean.valueOf(Intrinsics.d(((f30) updatedModel.f55290b).getUid(), j0Var.f21043u));
            default:
                v32.c O = b40.O((f30) ((v0) obj).f55290b);
                if (O != j0Var.f21047y) {
                    j0Var.z0(O, Boolean.FALSE);
                }
                return Unit.f80348a;
        }
    }
}
