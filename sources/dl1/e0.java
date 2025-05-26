package dl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55213i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f55214j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f55215k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(s sVar, q0 q0Var) {
        super(1);
        this.f55213i = 0;
        this.f55215k = sVar;
        this.f55214j = q0Var;
    }

    public final s b(s localModel) {
        int i13 = this.f55213i;
        s updatedModelFromRemote = this.f55215k;
        q0 q0Var = this.f55214j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(localModel, "localModel");
                fl1.e eVar = q0Var.f55273f;
                Intrinsics.checkNotNullExpressionValue(updatedModelFromRemote, "$updatedModelFromRemote");
                return eVar.a(localModel, updatedModelFromRemote);
            default:
                Intrinsics.checkNotNullParameter(localModel, "localModelAfterRemoteUpdate");
                fl1.e eVar2 = q0Var.f55273f;
                Intrinsics.checkNotNullExpressionValue(updatedModelFromRemote, "$remoteModel");
                return eVar2.a(localModel, updatedModelFromRemote);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f55213i) {
            case 0:
                s sVar = this.f55215k;
                if (sVar != null) {
                    this.f55214j.u(sVar);
                }
                break;
        }
        return b((s) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(q0 q0Var, s sVar, int i13) {
        super(1);
        this.f55213i = i13;
        this.f55214j = q0Var;
        this.f55215k = sVar;
    }
}
