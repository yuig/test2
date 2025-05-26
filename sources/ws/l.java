package ws;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131063i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f131064j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, int i13) {
        super(0);
        this.f131063i = i13;
        this.f131064j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f131063i;
        o oVar = this.f131064j;
        switch (i13) {
            case 0:
                Context requireContext = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                xs.g gVar = new xs.g(requireContext, oVar.f8(), new mq.z(oVar.j8().f131047l.e(), 4));
                gVar.setLayoutParams(new androidx.coordinatorlayout.widget.c(-1, -1));
                return gVar;
            default:
                Context requireContext2 = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new s(requireContext2, oVar.f8(), oVar.j8().f131047l.e(), 0);
        }
    }
}
