package cy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;
import wm1.k0;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f53425j = new g(0);

    /* renamed from: k, reason: collision with root package name */
    public static final g f53426k = new g(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53427i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13) {
        super(1);
        this.f53427i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f53427i) {
            case 0:
                k0 bind = (k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.h endItem = new wm1.h(wm1.d.ARROW_FORWARD);
                bind.getClass();
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                return Unit.f80348a;
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.next), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
