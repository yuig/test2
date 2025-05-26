package yq1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.core.error.UnauthException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139962i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s2 f139963j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(s2 s2Var, int i13) {
        super(1);
        this.f139962i = i13;
        this.f139963j = s2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        boolean z13 = true;
        boolean z14 = true;
        int i13 = this.f139962i;
        final int i14 = 0;
        final s2 s2Var = this.f139963j;
        switch (i13) {
            case 0:
                s2Var.f7().d(new of0.a(new mf0.l()));
                mr1.a aVar = s2Var.f139991e0;
                if (aVar == null) {
                    Intrinsics.r("accountSwitcher");
                    throw null;
                }
                if (((lb2.n) aVar).l()) {
                    nx.d0 s73 = s2Var.s7();
                    h32.f1 f1Var = h32.f1.USER_SWITCH_ATTEMPT;
                    wy0 f13 = ((b60.d) s2Var.getActiveUserManager()).f();
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
                qr1.c authUser = (qr1.c) obj;
                Intrinsics.f(authUser);
                s2Var.getClass();
                Intrinsics.checkNotNullParameter(authUser, "authUser");
                com.pinterest.identity.authentication.a aVar2 = s2Var.f139992f0;
                if (aVar2 != null) {
                    aVar2.b(authUser, s2Var.requireArguments());
                    return Unit.f80348a;
                }
                Intrinsics.r("authNavigationHelper");
                throw null;
            case 2:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                int i15 = s2.f139988y0;
                s2Var.getClass();
                if (th3 instanceof UnauthException.AuthenticationError.WrongPasswordResetError) {
                    s2Var.d8(vq1.d.incorrect_password_try_again, false);
                    m60.w f73 = s2Var.f7();
                    GestaltTextField gestaltTextField = s2Var.f140000n0;
                    if (gestaltTextField == null) {
                        Intrinsics.r("emailEditText");
                        throw null;
                    }
                    ji0.k kVar = new ji0.k(gestaltTextField.B0());
                    kVar.f76271b = new View.OnClickListener() { // from class: yq1.p2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = i14;
                            s2 this$0 = s2Var;
                            switch (i16) {
                                case 0:
                                    int i17 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i18 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = s2.f139988y0;
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
                    final boolean z15 = z14 ? 1 : 0;
                    kVar.f76272c = new View.OnClickListener() { // from class: yq1.p2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i16 = z15;
                            s2 this$0 = s2Var;
                            switch (i16) {
                                case 0:
                                    int i17 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i18 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = s2.f139988y0;
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
                    int i16 = vq1.d.incorrect_password_try_again;
                    Context requireContext = s2Var.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    Intrinsics.checkNotNullParameter(requireContext, "<this>");
                    Object systemService = requireContext.getSystemService("accessibility");
                    Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
                    AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
                    if (accessibilityManager.isEnabled()) {
                        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                        Intrinsics.checkNotNullExpressionValue(enabledAccessibilityServiceList, "getEnabledAccessibilityServiceList(...)");
                        List<AccessibilityServiceInfo> list = enabledAccessibilityServiceList;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                if ((((AccessibilityServiceInfo) it.next()).eventTypes & 32768) != 0) {
                                    s2Var.d8(i16, z13);
                                }
                            }
                        }
                    }
                    z13 = false;
                    s2Var.d8(i16, z13);
                } else if (th3 instanceof UnauthException.AuthenticationError.SafeModeError) {
                    m60.w f74 = s2Var.f7();
                    GestaltTextField gestaltTextField2 = s2Var.f140000n0;
                    if (gestaltTextField2 == null) {
                        Intrinsics.r("emailEditText");
                        throw null;
                    }
                    ji0.d dVar = new ji0.d(gestaltTextField2.B0());
                    final int i17 = 2;
                    dVar.f76246b = new View.OnClickListener() { // from class: yq1.p2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i17;
                            s2 this$0 = s2Var;
                            switch (i162) {
                                case 0:
                                    int i172 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i18 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = s2.f139988y0;
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
                    dVar.f76247c = new View.OnClickListener() { // from class: yq1.p2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i162 = i18;
                            s2 this$0 = s2Var;
                            switch (i162) {
                                case 0:
                                    int i172 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z7 = this$0.Z7();
                                    lr1.h hVar = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                                    this$0.Y7(Z7.b(hVar, bs1.c.m(requireActivity), null));
                                    break;
                                case 1:
                                    int i182 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z72 = this$0.Z7();
                                    lr1.h hVar2 = lr1.h.GoogleUnifiedAuthMethod;
                                    FragmentActivity requireActivity2 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    this$0.Y7(Z72.b(hVar2, bs1.c.m(requireActivity2), null));
                                    break;
                                case 2:
                                    int i19 = s2.f139988y0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    lb2.q Z73 = this$0.Z7();
                                    lr1.h hVar3 = lr1.h.FacebookLoginMethod;
                                    FragmentActivity requireActivity3 = this$0.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    this$0.Y7(Z73.b(hVar3, bs1.c.m(requireActivity3), null));
                                    break;
                                default:
                                    int i23 = s2.f139988y0;
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
                } else if (th3 instanceof UnauthException.AuthenticationError.FacebookDeprecatedError) {
                    vy.m mVar = s2Var.f139989c0;
                    if (mVar == null) {
                        Intrinsics.r("analyticsApi");
                        throw null;
                    }
                    mVar.a("remove_fb_signup.android_login_signup");
                    if (s2Var.a8().b()) {
                        GestaltButtonSocial gestaltButtonSocial = s2Var.f140006t0;
                        if (gestaltButtonSocial == null) {
                            Intrinsics.r("facebookBtSocial");
                            throw null;
                        }
                        kh2.b0.O(gestaltButtonSocial, r2.f139966j);
                    } else {
                        GestaltButton gestaltButton = s2Var.f140003q0;
                        if (gestaltButton == null) {
                            Intrinsics.r("facebookBt");
                            throw null;
                        }
                        bs1.c.s(gestaltButton, r2.f139967k);
                    }
                    ConstraintLayout constraintLayout = s2Var.f139998l0;
                    if (constraintLayout == null) {
                        Intrinsics.r("facebookErrorBanner");
                        throw null;
                    }
                    constraintLayout.setVisibility(0);
                } else {
                    com.pinterest.identity.authentication.a aVar3 = s2Var.f139992f0;
                    if (aVar3 == null) {
                        Intrinsics.r("authNavigationHelper");
                        throw null;
                    }
                    aVar3.a(false, th3);
                }
                return Unit.f80348a;
            case 3:
                ao1.b it2 = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return ao1.b.e(it2, bs1.c.h2(String.valueOf(s2Var.f140009w0)), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            case 4:
                yl1.l bind = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                int i19 = vq1.d.continue_gplus;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                u50.k0 text = new u50.k0(i19, new ArrayList(0));
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f139348a = text;
                gz1.b bVar = s2Var.f139995i0;
                if (bVar != null) {
                    bind.f139350c = bVar.c(null, true, 0) ? fm1.c.VISIBLE : fm1.c.GONE;
                    return Unit.f80348a;
                }
                Intrinsics.r("googlePlayServices");
                throw null;
            default:
                am1.h bind2 = (am1.h) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                gz1.b bVar2 = s2Var.f139995i0;
                if (bVar2 == null) {
                    Intrinsics.r("googlePlayServices");
                    throw null;
                }
                boolean c13 = bVar2.c(null, true, 0);
                bind2.getClass();
                bind2.f15541d = c13 ? fm1.c.VISIBLE : fm1.c.GONE;
                return Unit.f80348a;
        }
    }
}
