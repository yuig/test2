package ab1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import bb1.s;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l4;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1722c;

    public /* synthetic */ j(l lVar, String str, int i13) {
        this.f1720a = i13;
        this.f1721b = lVar;
        this.f1722c = str;
    }

    @Override // ak2.a
    public final void run() {
        yb0.n a13;
        int i13 = this.f1720a;
        String accountEmail = this.f1722c;
        l this$0 = this.f1721b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(accountEmail, "$accountEmail");
                i92.k kVar = ((s) ((ya1.d) this$0.getView())).f22553k0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                kVar.k(l52.c.settings_enable_mfa_confirm_password_forgot_email_sent);
                s sVar = (s) ((ya1.d) this$0.getView());
                sVar.getClass();
                Intrinsics.checkNotNullParameter(accountEmail, "accountEmail");
                w f73 = sVar.f7();
                int i14 = yb0.n.f138503p;
                Context requireContext = sVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                String string = sVar.getString(l52.c.settings_enable_mfa_confirm_password_forgot_alert_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Context requireContext2 = sVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                String string2 = sVar.getString(l52.c.settings_enable_mfa_confirm_password_forgot_alert_message);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                SpannableStringBuilder D = f0.h.D(requireContext2, string2, accountEmail);
                String string3 = sVar.getString(x0.okay);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = sVar.getString(l52.c.settings_enable_mfa_confirm_password_forgot_alert_resend_email);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                a13 = xa0.j.a(requireContext, string, D, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : null, (r20 & 64) != 0 ? yb0.k.f138492k : new h81.b(sVar, 11), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
                f73.d(new yb0.e(a13));
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(accountEmail, "$password");
                s sVar2 = (s) ((ya1.d) this$0.getView());
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(accountEmail, "validatedPassword");
                w f74 = sVar2.f7();
                NavigationImpl w13 = Navigation.w1(l4.b());
                w13.y0(accountEmail, "arg_verified_password");
                String str = this$0.f1727c;
                if (str != null) {
                    w13.y0(str, "arg_verified_email");
                }
                f74.d(w13);
                return;
        }
    }
}
