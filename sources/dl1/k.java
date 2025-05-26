package dl1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f55239j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f55240k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f55241l = new k(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55242i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f55242i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55242i) {
            case 0:
                s sVar = (s) obj;
                sVar.getUid();
                sVar.toString();
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            default:
                s it = (s) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new lb0.i(it);
        }
    }
}
