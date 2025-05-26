package y90;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138252i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f138253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(l82.c0 c0Var, int i13) {
        super(1);
        this.f138252i = i13;
        this.f138253j = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f138252i;
        l82.c0 c0Var = this.f138253j;
        switch (i13) {
            case 0:
                d it = (d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return d.e(it, (zy.a0) c0Var.f82212a, null, null, 13);
            default:
                x0 it2 = (x0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                zy.l0 pinalyticsState = (zy.l0) c0Var.f82213b;
                String itemId = it2.f138266a;
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
                Map experimentsGroupInfo = it2.f138269d;
                Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
                return new x0(itemId, pinalyticsState, it2.f138268c, experimentsGroupInfo);
        }
    }
}
