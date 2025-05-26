package c31;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f25599j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f25600k = new n(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25601i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f25601i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25601i) {
            case 0:
                cn1.d0 bind = (cn1.d0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.getClass();
                bind.f28178h = fm1.c.GONE;
                return Unit.f80348a;
            default:
                h31.f vmState = (h31.f) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return vmState.f66811a;
        }
    }
}
