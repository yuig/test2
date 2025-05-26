package ns;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f91944j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f91945k = new o(1);

    /* renamed from: l, reason: collision with root package name */
    public static final o f91946l = new o(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91947i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f91947i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91947i) {
            case 0:
                t vmState = (t) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return vmState.f91957a;
            case 1:
                c it = (c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return c.e(it, true, false, false, false, null, null, 62);
            default:
                l0 it2 = (l0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return l0.b(it2, null, null, 27);
        }
    }
}
