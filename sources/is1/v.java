package is1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final v f73649j = new v(0);

    /* renamed from: k, reason: collision with root package name */
    public static final v f73650k = new v(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73651i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i13) {
        super(1);
        this.f73651i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f73651i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Unit.f80348a;
    }
}
