package la0;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82389i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f82390j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i13) {
        super(1);
        this.f82389i = i13;
        this.f82390j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f82389i;
        f0 f0Var = this.f82390j;
        switch (i13) {
            case 0:
                String collageId = (String) obj;
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                int i14 = f0.V0;
                kh2.j.x2(f0Var.l9(), new j(collageId));
                break;
            default:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = f0.V0;
                kh2.j.x2(f0Var.l9(), h.f82406a);
                break;
        }
        return Unit.f80348a;
    }
}
