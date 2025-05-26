package xe1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final x f134822j = new x(0);

    /* renamed from: k, reason: collision with root package name */
    public static final x f134823k = new x(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134824i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i13) {
        super(1);
        this.f134824i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f134824i;
        switch (i13) {
            case 0:
                String it = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                break;
            default:
                String it2 = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
