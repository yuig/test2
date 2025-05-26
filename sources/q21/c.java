package q21;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102132i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f102133j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f102132i = i13;
        this.f102133j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d dVar = this.f102133j;
        int i13 = this.f102132i;
        switch (i13) {
            case 0:
                String it = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        dVar.f102137l.setContentDescription(it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        dVar.f102137l.setContentDescription(it);
                        break;
                }
                break;
            default:
                String it2 = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        dVar.f102137l.setContentDescription(it2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        dVar.f102137l.setContentDescription(it2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
