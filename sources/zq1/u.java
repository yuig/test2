package zq1;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.core.error.UnauthException;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yq1.y0;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142729i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f142730j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, int i13) {
        super(1);
        this.f142729i = i13;
        this.f142730j = vVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f142729i;
        v vVar = this.f142730j;
        switch (i13) {
            case 2:
                Intrinsics.f(th3);
                vVar.getClass();
                if (!(th3 instanceof UnauthException.AuthenticationError.Wrong2FACodeError)) {
                    vVar.f142735e.a(false, th3);
                    return;
                }
                y0 y0Var = (y0) ((s) vVar.getView());
                String errorMessage = y0Var.getString(vq1.d.wrong_code_at_login);
                Intrinsics.checkNotNullExpressionValue(errorMessage, "getString(...)");
                GestaltTextField anchorView = y0Var.f140063n0;
                if (anchorView == null) {
                    Intrinsics.r("verificationCodeEditText");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                Intrinsics.checkNotNullParameter(anchorView, "anchorView");
                oe0.h hVar = y0Var.G;
                if (hVar != null) {
                    String name = y0.class.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    hVar.b(errorMessage, anchorView, name, false);
                    return;
                }
                return;
            default:
                com.pinterest.identity.authentication.a aVar = vVar.f142735e;
                Intrinsics.f(th3);
                aVar.a(false, th3);
                return;
        }
    }

    public final void e(xj2.c cVar) {
        int i13 = this.f142729i;
        v vVar = this.f142730j;
        switch (i13) {
            case 0:
                ((y0) ((s) vVar.getView())).b8(yk1.i.LOADING, vq1.d.two_factor_verification_logging_you_in);
                break;
            default:
                ((y0) ((s) vVar.getView())).b8(yk1.i.LOADING, vq1.d.two_factor_verification_requesting_new_code);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f142729i) {
            case 0:
                e((xj2.c) obj);
                break;
            case 1:
                qr1.c cVar = (qr1.c) obj;
                v vVar = this.f142730j;
                nx.d0 d0Var = vVar.f142734d.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                nx.d0.v(d0Var, f1.MFA_LOGIN_SUCCESS, null, false, 12);
                Intrinsics.f(cVar);
                vVar.f142735e.b(cVar, null);
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                e((xj2.c) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
