package m90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final t f86697j = new t(0);

    /* renamed from: k, reason: collision with root package name */
    public static final t f86698k = new t(1);

    /* renamed from: l, reason: collision with root package name */
    public static final t f86699l = new t(2);

    /* renamed from: m, reason: collision with root package name */
    public static final t f86700m = new t(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13) {
        super(1);
        this.f86701i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f86701i) {
            case 0:
                j1 vmState = (j1) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return vmState.f86667a;
            case 1:
                f1 vmState2 = (f1) obj;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                return vmState2.f86649a;
            case 2:
                cn1.d0 bind = (cn1.d0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i13 = m60.x0.search;
                bind.getClass();
                bind.f28172b = new u50.k0(i13);
                return Unit.f80348a;
            default:
                in1.b it = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = eo1.c.space_0;
                return in1.b.e(it, null, false, new hn1.n(i14, i14, i14, i14), 7);
        }
    }
}
