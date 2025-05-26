package ni1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90732i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z1 f90733j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(z1 z1Var, int i13) {
        super(1);
        this.f90732i = i13;
        this.f90733j = z1Var;
    }

    public final y2 b(y2 vmState) {
        int i13 = this.f90732i;
        z1 z1Var = this.f90733j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                ((s1) z1Var).getClass();
                return y2.b(vmState, null, null, null, false, false, null, null, true, false, false, false, 0, false, false, null, null, null, null, null, null, null, -4194305, 4194303);
            case 2:
                Intrinsics.checkNotNullParameter(vmState, "it");
                return y2.b(vmState, null, null, null, false, false, null, null, false, false, false, false, ((p1) z1Var).f90779a, false, false, null, null, null, null, null, null, null, -1, 4194302);
            default:
                Intrinsics.checkNotNullParameter(vmState, "it");
                return y2.b(vmState, null, null, ((o1) z1Var).f90760a, false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, null, null, null, -131073, 4194303);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f90732i) {
            case 0:
                u0 it = (u0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((y2) obj);
    }
}
