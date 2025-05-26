package pq2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101139i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f101140j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(i iVar, int i13) {
        super(1);
        this.f101139i = i13;
        this.f101140j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar = this.f101140j;
        int i13 = this.f101139i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        iVar.cancel();
                        break;
                    default:
                        iVar.cancel();
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        iVar.cancel();
                        break;
                    default:
                        iVar.cancel();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
