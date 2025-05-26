package q91;

import com.pinterest.feature.settings.account.view.PasswordEditView;
import com.pinterest.identity.password.StrongPasswordTextField;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f103099j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(g1 g1Var, int i13) {
        super(1);
        this.f103098i = i13;
        this.f103099j = g1Var;
    }

    public final void b(xl1.a it) {
        int i13 = this.f103098i;
        g1 g1Var = this.f103099j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                g1.b8(g1Var);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                StrongPasswordTextField strongPasswordTextField = g1Var.f103121w0;
                if (strongPasswordTextField == null) {
                    Intrinsics.r("strongNewPasswordView");
                    throw null;
                }
                vr1.b i14 = strongPasswordTextField.i();
                nx.d0 s73 = g1Var.s7();
                h32.f1 f1Var = h32.f1.SUBMIT_NEW_PASSWORD;
                HashMap hashMap = new HashMap();
                rr1.a aVar = i14.f126459c;
                hashMap.put("score", String.valueOf(aVar.f109934a));
                hashMap.put("score_source", aVar.f109935b);
                hashMap.put("surface", g1Var.f103123y0 == l91.f.UPDATE ? "CHANGE_PASSWORD" : "SET_PASSWORD");
                Unit unit = Unit.f80348a;
                s73.g(f1Var, null, hashMap, false);
                p91.c0 c0Var = g1Var.A0;
                if (c0Var != null) {
                    PasswordEditView passwordEditView = g1Var.f103117s0;
                    if (passwordEditView == null) {
                        Intrinsics.r("currentPasswordView");
                        throw null;
                    }
                    String g13 = passwordEditView.g();
                    String str = i14.f126457a;
                    c0Var.q3(g13, str, str, null);
                    return;
                }
                return;
        }
    }

    public final void e() {
        int i13 = this.f103098i;
        g1 g1Var = this.f103099j;
        switch (i13) {
            case 1:
                g1.c8(g1Var);
                break;
            case 2:
            default:
                g1.c8(g1Var);
                break;
            case 3:
                int i14 = g1.D0;
                g1Var.d8();
                break;
            case 4:
                g1.c8(g1Var);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f103098i) {
            case 0:
                b((xl1.a) obj);
                break;
            case 1:
                e();
                break;
            case 2:
                b((xl1.a) obj);
                break;
            case 3:
                e();
                break;
            case 4:
                e();
                break;
            default:
                e();
                break;
        }
        return Unit.f80348a;
    }
}
