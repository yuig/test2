package ls0;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;

/* loaded from: classes5.dex */
public final class l extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84659i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f84660j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f84661k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, f30 f30Var, int i13) {
        super(0);
        this.f84659i = i13;
        this.f84660j = nVar;
        this.f84661k = f30Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f84659i) {
            case 0:
                m185invoke();
                break;
            default:
                m185invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m185invoke() {
        int i13 = this.f84659i;
        f30 f30Var = this.f84661k;
        n nVar = this.f84660j;
        switch (i13) {
            case 0:
                w wVar = nVar.f84675i;
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                wVar.d(new jo1.d(uid, true));
                break;
            default:
                w wVar2 = nVar.f84675i;
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                wVar2.d(new jo1.d(uid2, false));
                break;
        }
    }
}
