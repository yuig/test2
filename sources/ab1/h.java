package ab1;

import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.l4;
import h32.f1;
import h32.u0;
import jk2.l1;
import jk2.v;
import jk2.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import nx.d0;
import pk.a0;
import x02.x2;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class h extends t {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f1715a;

    /* renamed from: b, reason: collision with root package name */
    public final w f1716b;

    /* renamed from: c, reason: collision with root package name */
    public wy0 f1717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w eventManager, uk1.d presenterPinalytics, x2 userRepository, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f1715a = userRepository;
        this.f1716b = eventManager;
    }

    @Override // yk1.b
    public final void onActivate() {
        l1 A = this.f1715a.d0().P("me").H(tk2.e.f118017c).A(wj2.c.a());
        ta1.c cVar = new ta1.c(16, new g(this, 0));
        ck2.c cVar2 = ck2.i.f27923c;
        xj2.c F = new x(new v(A, cVar, cVar2, 1), new g51.h(this, 6), 1).F(new ta1.c(17, new g(this, 1)), new ta1.c(18, new g(this, 2)), cVar2, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        ya1.c view = (ya1.c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((bb1.p) view).f22540m0 = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((bb1.p) ((ya1.c) getView())).f22540m0 = null;
        super.onUnbind();
    }

    public final void p3(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        wy0 wy0Var = this.f1717c;
        if (wy0Var != null) {
            String N2 = wy0Var.N2();
            int i13 = 1;
            if (N2 != null && z.i(N2, email, true)) {
                d0.v(getPinalytics(), f1.MFA_SUCCESS_EMAIL_VERIFICATION, null, false, 12);
                NavigationImpl w13 = Navigation.w1((ScreenLocation) l4.f51092g.getValue());
                w13.y0(email, "arg_verified_email");
                this.f1716b.d(w13);
                return;
            }
            bb1.p pVar = (bb1.p) ((ya1.c) getView());
            pVar.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.MFA_INVALID_EMAIL, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            GestaltText gestaltText = pVar.f22541n0;
            if (gestaltText == null) {
                Intrinsics.r("confirmEmailTitle");
                throw null;
            }
            a0.o(gestaltText, l52.c.settings_enable_mfa_confirm_email_error_title, new Object[0]);
            GestaltText gestaltText2 = pVar.f22542o0;
            if (gestaltText2 == null) {
                Intrinsics.r("confirmEmailDescription");
                throw null;
            }
            a0.o(gestaltText2, l52.c.settings_enable_mfa_confirm_email_error_description, new Object[0]);
            GestaltText gestaltText3 = pVar.f22544q0;
            if (gestaltText3 == null) {
                Intrinsics.r("incorrectEmailText");
                throw null;
            }
            gestaltText3.i(new bb1.o(pVar, i13));
            GestaltTextField gestaltTextField = pVar.f22543p0;
            if (gestaltTextField != null) {
                gestaltTextField.X(new bb1.o(pVar, 2));
            } else {
                Intrinsics.r("emailEditableText");
                throw null;
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        ya1.c view = (ya1.c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((bb1.p) view).f22540m0 = this;
    }
}
