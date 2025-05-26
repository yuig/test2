package sf1;

import com.pinterest.api.model.qk0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e1 f112802i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f112803j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ qk0 f112804k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e1 e1Var, h1 h1Var, qk0 qk0Var) {
        super(0);
        this.f112802i = e1Var;
        this.f112803j = h1Var;
        this.f112804k = qk0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j1 j1Var = this.f112802i.G;
        if (j1Var != null) {
            qf1.c action = new qf1.c(this.f112803j.f112602a, this.f112804k);
            Intrinsics.checkNotNullParameter(action, "action");
            ((rf1.p0) j1Var).l4(action, null);
        }
        return Unit.f80348a;
    }
}
