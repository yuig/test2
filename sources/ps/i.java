package ps;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f101233j = new i(0);

    /* renamed from: k, reason: collision with root package name */
    public static final i f101234k = new i(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101235i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13) {
        super(1);
        this.f101235i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101235i) {
            case 0:
                ((Boolean) obj).getClass();
                break;
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj, "$this$null");
                break;
        }
        return Unit.f80348a;
    }
}
