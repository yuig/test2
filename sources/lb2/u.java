package lb2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82814i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f82815j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ qr1.u f82816k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(x xVar, qr1.u uVar, int i13) {
        super(1);
        this.f82814i = i13;
        this.f82815j = xVar;
        this.f82816k = uVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f82814i;
        qr1.u uVar = this.f82816k;
        x xVar = this.f82815j;
        switch (i13) {
            case 1:
                or1.i iVar = xVar.f82831j;
                or1.e eVar = or1.e.FAILURE;
                String logoutReason = uVar.f105037d;
                Intrinsics.checkNotNullExpressionValue(logoutReason, "logoutReason");
                iVar.k(eVar, logoutReason, th3);
                break;
            case 2:
                xVar.f82831j.j(or1.g.PLATFORM_LOGOUT_ERROR, th3, new w(uVar, 0));
                break;
            default:
                xVar.f82831j.j(or1.g.USER_LOGOUT_ERROR, th3, new w(uVar, 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f82814i) {
            case 0:
                or1.i iVar = this.f82815j.f82831j;
                or1.e eVar = or1.e.ATTEMPT;
                String logoutReason = this.f82816k.f105037d;
                Intrinsics.checkNotNullExpressionValue(logoutReason, "logoutReason");
                iVar.k(eVar, logoutReason, null);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
