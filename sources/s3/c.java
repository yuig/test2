package s3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110743i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f110744j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(0);
        this.f110743i = i13;
        this.f110744j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        d dVar = this.f110744j;
        int i13 = this.f110743i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        dVar.P0();
                        break;
                    default:
                        u2.o oVar = dVar.f110754n;
                        Intrinsics.g(oVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                        ((r3.d) oVar).g(dVar);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        dVar.P0();
                        break;
                    default:
                        u2.o oVar2 = dVar.f110754n;
                        Intrinsics.g(oVar2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                        ((r3.d) oVar2).g(dVar);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
