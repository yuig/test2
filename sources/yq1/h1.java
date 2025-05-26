package yq1;

import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.core.error.UnauthException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f139865r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m1 f139866s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(m1 m1Var, bl2.c cVar) {
        super(2, cVar);
        this.f139866s = m1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        h1 h1Var = new h1(this.f139866s, cVar);
        h1Var.f139865r = obj;
        return h1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((wr1.q) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        wr1.q qVar = (wr1.q) this.f139865r;
        se0.f fVar = qVar.f130992a;
        int i13 = m1.X0;
        m1 m1Var = this.f139866s;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        m1Var.f7().d(f1.f139843a[fVar.ordinal()] == 1 ? new of0.a(new mf0.l()) : new of0.a(null));
        boolean z16 = false;
        byte b13 = 0;
        byte b14 = 0;
        wr1.p pVar = qVar.f130993b;
        if (pVar != null) {
            if (Intrinsics.d(pVar, wr1.k.f130976a)) {
                m1Var.h9(true);
                m1Var.c9().h(vq1.d.recover_account_invalid_info);
            } else if (Intrinsics.d(pVar, wr1.j.f130974a)) {
                GestaltButton gestaltButton = m1Var.Q0;
                if (gestaltButton == null) {
                    Intrinsics.r("googleLoginButton");
                    throw null;
                }
                gestaltButton.d(new mm1.i(z13, 12));
                m1Var.j9(vq1.d.recover_account_google_already_connected, vq1.d.recover_account_google_login_back_to_account);
            } else {
                int i14 = 15;
                if (Intrinsics.d(pVar, wr1.l.f130978a)) {
                    GestaltButton gestaltButton2 = m1Var.N0;
                    if (gestaltButton2 == null) {
                        Intrinsics.r("searchButton");
                        throw null;
                    }
                    gestaltButton2.d(new mm1.i(z16, i14));
                    LinearLayout linearLayout = m1Var.R0;
                    if (linearLayout == null) {
                        Intrinsics.r("passwordLoginSection");
                        throw null;
                    }
                    bs1.c.R1(linearLayout, true);
                    GestaltButton gestaltButton3 = m1Var.T0;
                    if (gestaltButton3 == null) {
                        Intrinsics.r("passwordLoginButton");
                        throw null;
                    }
                    gestaltButton3.d(new mm1.i(b14 == true ? 1 : 0, 13));
                    m1Var.j9(vq1.d.recover_account_email_already_connected, vq1.d.recover_account_password_login_back_to_account);
                } else if (Intrinsics.d(pVar, wr1.m.f130980a)) {
                    LinearLayout linearLayout2 = m1Var.O0;
                    if (linearLayout2 == null) {
                        Intrinsics.r("sendEmailSection");
                        throw null;
                    }
                    bs1.c.R1(linearLayout2, true);
                } else if (pVar instanceof wr1.o) {
                    lb2.d dVar = m1Var.G0;
                    if (dVar == null) {
                        Intrinsics.r("accountManager");
                        throw null;
                    }
                    String userName = ((wr1.o) pVar).f130983a;
                    Intrinsics.checkNotNullParameter(userName, "userName");
                    new fk2.x(dVar.f82747b.j(userName).l(tk2.e.f118017c).h(wj2.c.a()), new ua2.v(15, new lb2.a(dVar, b13 == true ? 1 : 0)), ck2.i.f27924d, ck2.i.f27923c).i(new qb1.a(10, dVar, userName), new ua2.v(16, new lb2.a(dVar, z15 ? 1 : 0)));
                }
            }
        }
        wr1.c cVar = qVar.f130994c;
        if (cVar != null) {
            if (cVar instanceof wr1.a) {
                m1Var.c9().k(vq1.d.arr_logged_in_with_google);
                com.pinterest.identity.authentication.a aVar2 = m1Var.F0;
                if (aVar2 == null) {
                    Intrinsics.r("authNavigationHelper");
                    throw null;
                }
                aVar2.b(((wr1.a) cVar).f130936a, null);
            } else if (cVar instanceof wr1.b) {
                com.pinterest.identity.authentication.a aVar3 = m1Var.F0;
                if (aVar3 == null) {
                    Intrinsics.r("authNavigationHelper");
                    throw null;
                }
                aVar3.b(((wr1.b) cVar).f130942a, null);
            }
        }
        wr1.i iVar = qVar.f130996e;
        if (iVar != null) {
            if (iVar instanceof wr1.d) {
                GestaltTextField gestaltTextField = m1Var.U0;
                if (gestaltTextField == null) {
                    Intrinsics.r("passwordField");
                    throw null;
                }
                gestaltTextField.X(new k1(m1Var, z14 ? 1 : 0));
            } else if (iVar instanceof wr1.g) {
                m1Var.c9().h(vq1.d.invalid_email);
            } else if (iVar instanceof wr1.h) {
                Throwable th3 = ((wr1.h) iVar).f130971a;
                int i15 = 3;
                if (th3 instanceof UnauthException.AuthenticationError.WrongPasswordResetError) {
                    int i16 = vq1.d.incorrect_password_try_again;
                    GestaltTextField gestaltTextField2 = m1Var.U0;
                    if (gestaltTextField2 == null) {
                        Intrinsics.r("passwordField");
                        throw null;
                    }
                    gestaltTextField2.X(new pn1.g(i16, i15)).g0();
                } else if (th3 instanceof UnauthException.AuthenticationError.BadPasswordError) {
                    int i17 = vq1.d.incorrect_password_try_again;
                    GestaltTextField gestaltTextField3 = m1Var.U0;
                    if (gestaltTextField3 == null) {
                        Intrinsics.r("passwordField");
                        throw null;
                    }
                    gestaltTextField3.X(new pn1.g(i17, i15)).g0();
                } else {
                    com.pinterest.identity.authentication.a aVar4 = m1Var.F0;
                    if (aVar4 == null) {
                        Intrinsics.r("authNavigationHelper");
                        throw null;
                    }
                    aVar4.a(false, th3);
                }
            } else if (iVar instanceof wr1.e) {
                m1Var.c9().h(vq1.d.recover_account_google_account_not_linked);
            } else if (iVar instanceof wr1.f) {
                i92.k c93 = m1Var.c9();
                String str = ((wr1.f) iVar).f130965a;
                if (str == null) {
                    str = m1Var.getString(m60.x0.generic_error);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                c93.i(str);
            }
            m1Var.d9().f130960h.e().a(wr1.s.f131000a);
        }
        return Unit.f80348a;
    }
}
