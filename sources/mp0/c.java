package mp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87897i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f87898j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f87897i = i13;
        this.f87898j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d dVar = this.f87898j;
        int i13 = this.f87897i;
        switch (i13) {
            case 0:
                rn1.f it = (rn1.f) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        dVar.L();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        dVar.L();
                        break;
                }
                break;
            default:
                rn1.f it2 = (rn1.f) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        dVar.L();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        dVar.L();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
