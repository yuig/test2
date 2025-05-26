package lq0;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import com.pinterest.feature.conversation.view.ContactRequestPreviewWarningView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import so.oa;

/* loaded from: classes5.dex */
public final class j0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f84340a;

    public j0(o0 o0Var) {
        this.f84340a = o0Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dq0.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f84340a.f84393p1 = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull eq0.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o0 o0Var = this.f84340a;
        if (o0Var.W8().b()) {
            f30 f30Var = event.f59917a;
            String p03 = f30Var != null ? bs1.c.p0(f30Var) : null;
            if (df.j1.U0(p03)) {
                o0Var.f9().X(new kl0.c(p03, 18));
                o0Var.g9().t(d.f84283x);
                f30 f30Var2 = event.f59917a;
                o0Var.f84394q1 = f30Var2 != null ? f30Var2.getUid() : null;
                return;
            }
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().k(xc0.i.add_pin_to_message_composer_failure);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull eq0.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o0 o0Var = this.f84340a;
        if (o0Var.f91282J) {
            return;
        }
        o0Var.f84393p1 = true;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        o0 o0Var = this.f84340a;
        o0Var.f84380c1 = false;
        o0Var.f84379b1 = false;
        fo1.a i73 = o0Var.i7();
        Intrinsics.g(i73, "null cannot be cast to non-null type com.pinterest.gestalt.toolbar.GestaltToolbarImpl");
        o0Var.S7((GestaltToolbarImpl) i73);
        ContactRequestPreviewWarningView contactRequestPreviewWarningView = o0Var.L1;
        if (contactRequestPreviewWarningView != null) {
            k3.R1(contactRequestPreviewWarningView, false);
            LinearLayout linearLayout = o0Var.J1;
            if (linearLayout != null) {
                k3.R1(linearLayout, true);
                o0Var.n9(o0Var.f84388k1);
                o0Var.p9();
                ur0.g.d(i32.y0.ANDROID_INBOX_CONVERSATION_TAKEOVER_AFTER_CONTACT_REQ_ACCEPTED, o0Var, null);
                return;
            }
            Intrinsics.r("messageBar");
            throw null;
        }
        Intrinsics.r("previewWarningView");
        throw null;
    }
}
