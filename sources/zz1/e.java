package zz1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzz1/e;", "Lnl1/d;", "", "<init>", "()V", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class e extends s {

    /* renamed from: d0, reason: collision with root package name */
    public GestaltTextField f143186d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltButton f143187e0;

    /* renamed from: f0, reason: collision with root package name */
    public Function1 f143188f0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltText f143190h0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f143185c0 = d4.HALF_MODAL;

    /* renamed from: g0, reason: collision with root package name */
    public String f143189g0 = new String();

    public final void Y7(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int j13 = event.j();
        if (j13 == yz1.a.email_field) {
            if (event instanceof xn1.a) {
                String valueOf = String.valueOf(((xn1.a) event).f135436c);
                boolean z13 = valueOf.length() > 0 && !Intrinsics.d(valueOf, this.f143189g0) && tr1.b.c(valueOf);
                GestaltButton gestaltButton = this.f143187e0;
                if (gestaltButton != null) {
                    gestaltButton.d(new fx1.d(z13, 7));
                    return;
                } else {
                    Intrinsics.r("btnContinue");
                    throw null;
                }
            }
            return;
        }
        if (j13 != yz1.a.gestalt_continue_button) {
            if (j13 == yz1.a.close_button_recovery && (event instanceof om1.l)) {
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_DISMISS, (r18 & 2) != 0 ? null : u0.AUTH_COLLECTION_EMAIL_INPUT, (r18 & 4) != 0 ? null : g0.BOUNCED_EMAIL_COLLECTION_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function1 = this.f143188f0;
                if (function1 != null) {
                    function1.invoke(b02.b.f20771a);
                    return;
                }
                return;
            }
            return;
        }
        if (event instanceof xl1.a) {
            nx.d0 s73 = s7();
            f1 f1Var = f1.AUTH_COLLECTION_CLICK;
            g0 g0Var = g0.BOUNCED_EMAIL_COLLECTION_MODAL;
            s73.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0.UPDATE_BUTTON, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            Function1 function12 = this.f143188f0;
            if (function12 != null) {
                GestaltTextField gestaltTextField = this.f143186d0;
                if (gestaltTextField != null) {
                    function12.invoke(new b02.l(gestaltTextField.B0(), g0Var));
                } else {
                    Intrinsics.r("emailField");
                    throw null;
                }
            }
        }
    }

    public final void Z7(String currentEmail) {
        Intrinsics.checkNotNullParameter(currentEmail, "currentEmail");
        this.f143189g0 = currentEmail;
    }

    public final void a8(a02.c eventFlow) {
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        this.f143188f0 = eventFlow;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f143185c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = yz1.b.bounced_email_collection_fragment;
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(yz1.a.email_field);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143186d0 = (GestaltTextField) findViewById;
        View findViewById2 = view.findViewById(yz1.a.gestalt_continue_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f143187e0 = (GestaltButton) findViewById2;
        View findViewById3 = view.findViewById(yz1.a.invalid_email_upsell_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f143190h0 = (GestaltText) findViewById3;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        GestaltText gestaltText = this.f143190h0;
        if (gestaltText == null) {
            Intrinsics.r("invalidEmailUpsellText");
            throw null;
        }
        String string = getString(yz1.c.invalid_email_upsell_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = this.f143189g0;
        if (str == null) {
            str = "";
        }
        f0.h.n(requireActivity, gestaltText, string, str);
        GestaltTextField gestaltTextField = this.f143186d0;
        if (gestaltTextField == null) {
            Intrinsics.r("emailField");
            throw null;
        }
        gestaltTextField.g0();
        GestaltButton gestaltButton = this.f143187e0;
        if (gestaltButton == null) {
            Intrinsics.r("btnContinue");
            throw null;
        }
        gestaltButton.e(new d(this, 0));
        GestaltTextField gestaltTextField2 = this.f143186d0;
        if (gestaltTextField2 != null) {
            gestaltTextField2.Z(new d(this, 1));
        } else {
            Intrinsics.r("emailField");
            throw null;
        }
    }
}
