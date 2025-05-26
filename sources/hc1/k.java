package hc1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes5.dex */
public final /* synthetic */ class k extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68727a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, int i13) {
        super(1, nVar, n.class, "handleUpdateAction", "handleUpdateAction(Lcom/pinterest/feature/settings/shared/model/UpdateAction;)V", 0);
        this.f68727a = i13;
        if (i13 != 1) {
        } else {
            super(1, nVar, n.class, "handleClickAction", "handleClickAction(I)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f68727a) {
            case 0:
                yc1.d p03 = (yc1.d) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                jc1.g gVar = ((n) this.receiver).I0;
                if (gVar != null) {
                    gVar.w3(p03);
                }
                break;
            default:
                int intValue = ((Number) obj).intValue();
                jc1.g gVar2 = ((n) this.receiver).I0;
                if (gVar2 != null) {
                    gVar2.v3(intValue);
                }
                break;
        }
        return Unit.f80348a;
    }
}
