package l82;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f82264j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f82265k = new u(1);

    /* renamed from: l, reason: collision with root package name */
    public static final u f82266l = new u(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f82267i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f82267i) {
            case 0:
                h it = (h) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            case 1:
                u50.s it2 = (u50.s) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2;
            default:
                Intrinsics.checkNotNullParameter((n) obj, "$this$null");
                return Unit.f80348a;
        }
    }
}
