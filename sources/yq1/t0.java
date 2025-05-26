package yq1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.core.error.UnauthException;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140013i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0 f140014j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, int i13) {
        super(1);
        this.f140013i = i13;
        this.f140014j = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        final int i13 = 0;
        int i14 = this.f140013i;
        final u0 u0Var = this.f140014j;
        switch (i14) {
            case 0:
                mr1.a aVar = u0Var.f140036f0;
                if (aVar == null) {
                    Intrinsics.r("accountSwitcher");
                    throw null;
                }
                if (((lb2.n) aVar).l()) {
                    nx.d0 s73 = u0Var.s7();
                    h32.f1 f1Var = h32.f1.USER_SWITCH_ATTEMPT;
                    wy0 f13 = ((b60.d) u0Var.getActiveUserManager()).f();
                    if (f13 == null || (str = f13.getUid()) == null) {
                        str = "";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("group_id", a60.a.b());
                    hashMap.put("group_count", String.valueOf(a60.a.a(null).getAll().size()));
                    s73.g(f1Var, str, hashMap, false);
                }
                return Unit.f80348a;
            case 1:
                qr1.c cVar = (qr1.c) obj;
                com.pinterest.identity.authentication.a aVar2 = u0Var.f140035e0;
                if (aVar2 == null) {
                    Intrinsics.r("authNavigationHelper");
                    throw null;
                }
                Intrinsics.f(cVar);
                aVar2.b(cVar, null);
                return Unit.f80348a;
            case 2:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                int i15 = u0.f140032o0;
                u0Var.getClass();
                if (th3 instanceof UnauthException.AuthenticationError.WrongPasswordResetError) {
                    m60.w f73 = u0Var.f7();
                    String str2 = u0Var.f140043m0;
                    if (str2 == null) {
                        Intrinsics.r("email");
                        throw null;
                    }
                    ji0.k kVar = new ji0.k(str2);
                    kVar.f76271b = new View.OnClickListener() { // from class: yq1.s0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i13;
                            u0 this$0 = u0Var;
                            switch (i16) {
                                case 0:
                                    int i17 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i18 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z74 = this$0.Z7();
                                    lr1.h hVar4 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity4 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                                    this$0.Y7(Z74.b(hVar4, bs1.c.m(requireActivity4), null));
                                    break;
                            }
                        }
                    };
                    final int i16 = 1;
                    kVar.f76272c = new View.OnClickListener() { // from class: yq1.s0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i16;
                            u0 this$0 = u0Var;
                            switch (i162) {
                                case 0:
                                    int i17 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i18 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z74 = this$0.Z7();
                                    lr1.h hVar4 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity4 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                                    this$0.Y7(Z74.b(hVar4, bs1.c.m(requireActivity4), null));
                                    break;
                            }
                        }
                    };
                    f73.d(new jc0.v(kVar, false, 0L, 30));
                } else if (th3 instanceof UnauthException.AuthenticationError.BadPasswordError) {
                    Context requireContext = u0Var.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    String string = u0Var.getString(vq1.d.incorrect_password);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = u0Var.getString(vq1.d.reset_your_password);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    SpannableStringBuilder B = f0.h.B(requireContext, string, "%1$s", string2, -1, null);
                    GestaltTextField gestaltTextField = u0Var.f140040j0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("passwordEditText");
                        throw null;
                    }
                    gestaltTextField.X(new zp.s0(B, 24));
                } else if (th3 instanceof UnauthException.AuthenticationError.SafeModeError) {
                    m60.w f74 = u0Var.f7();
                    String str3 = u0Var.f140043m0;
                    if (str3 == null) {
                        Intrinsics.r("email");
                        throw null;
                    }
                    ji0.d dVar = new ji0.d(str3);
                    final int i17 = 2;
                    dVar.f76246b = new View.OnClickListener() { // from class: yq1.s0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i17;
                            u0 this$0 = u0Var;
                            switch (i162) {
                                case 0:
                                    int i172 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i18 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z74 = this$0.Z7();
                                    lr1.h hVar4 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity4 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                                    this$0.Y7(Z74.b(hVar4, bs1.c.m(requireActivity4), null));
                                    break;
                            }
                        }
                    };
                    final int i18 = 3;
                    dVar.f76247c = new View.OnClickListener() { // from class: yq1.s0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i18;
                            u0 this$0 = u0Var;
                            switch (i162) {
                                case 0:
                                    int i172 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i182 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = u0.f140032o0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z74 = this$0.Z7();
                                    lr1.h hVar4 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity4 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                                    this$0.Y7(Z74.b(hVar4, bs1.c.m(requireActivity4), null));
                                    break;
                            }
                        }
                    };
                    f74.d(new jc0.v(dVar, false, 0L, 30));
                } else {
                    com.pinterest.identity.authentication.a aVar3 = u0Var.f140035e0;
                    if (aVar3 == null) {
                        Intrinsics.r("authNavigationHelper");
                        throw null;
                    }
                    aVar3.a(false, th3);
                }
                return Unit.f80348a;
            default:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, d7.g.q(u0Var.getResources(), vq1.d.login_password_fail, "getString(...)"), null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }
}
