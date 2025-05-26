package dl1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55219i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f55220j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m f55221k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(q0 q0Var, m mVar, int i13) {
        super(1);
        this.f55219i = i13;
        this.f55220j = q0Var;
        this.f55221k = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f55219i;
        m mVar = this.f55221k;
        q0 q0Var = this.f55220j;
        switch (i13) {
            case 0:
                uj2.q remoteObservable = (uj2.q) obj;
                Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
                return uj2.q.z(remoteObservable, q0Var.s(mVar, false).I(1L).J(remoteObservable));
            case 1:
                s sVar = (s) obj;
                q0Var.f55282o.remove(mVar);
                Intrinsics.f(sVar);
                q0Var.H(mVar, sVar, true);
                return Unit.f80348a;
            default:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                q0Var.f55282o.remove(mVar);
                return uj2.b0.g(it);
        }
    }
}
