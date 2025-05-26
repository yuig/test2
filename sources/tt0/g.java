package tt0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119112i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f119113j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k kVar, int i13) {
        super(1);
        this.f119112i = i13;
        this.f119113j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k kVar = this.f119113j;
        int i13 = this.f119112i;
        switch (i13) {
            case 0:
                Exception it = (Exception) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        kVar.g();
                        it.printStackTrace();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        kVar.g();
                        it.printStackTrace();
                        break;
                }
                break;
            default:
                Exception it2 = (Exception) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        kVar.g();
                        it2.printStackTrace();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        kVar.g();
                        it2.printStackTrace();
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
