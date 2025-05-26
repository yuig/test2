package e82;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57844i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f57845j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(h0 h0Var, int i13) {
        super(1);
        this.f57844i = i13;
        this.f57845j = h0Var;
    }

    public final void b(Throwable throwable) {
        int i13 = this.f57844i;
        h0 h0Var = this.f57845j;
        switch (i13) {
            case 0:
                if (throwable != null) {
                    h0Var.f57865g.q(throwable, "SendShareService: inviteUserExternalSent failed", tb0.p.SHARING);
                    break;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0Var.f57865g.q(throwable, "SendShareService: inviteUserExternal failed", tb0.p.SHARING);
                break;
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0Var.f57865g.q(throwable, "SendShareService: inviteUserExternal failed", tb0.p.SHARING);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f57844i) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
