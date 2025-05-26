package zz1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzz1/h;", "Lnl1/d;", "", "<init>", "()V", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class h extends t {

    /* renamed from: d0, reason: collision with root package name */
    public GestaltTextField f143194d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltIconButton f143195e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltButton f143196f0;

    /* renamed from: g0, reason: collision with root package name */
    public Function1 f143197g0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f143193c0 = d4.HALF_MODAL;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f143198h0 = true;

    /* renamed from: i0, reason: collision with root package name */
    public String f143199i0 = new String();

    public final void Y7(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int j13 = event.j();
        if (j13 == yz1.a.email_field) {
            if (event instanceof xn1.a) {
                String valueOf = String.valueOf(((xn1.a) event).f135436c);
                boolean z13 = valueOf.length() > 0 && !Intrinsics.d(valueOf, this.f143199i0) && tr1.b.c(valueOf);
                GestaltButton gestaltButton = this.f143196f0;
                if (gestaltButton != null) {
                    gestaltButton.d(new fx1.d(z13, 8));
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
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_DISMISS, (r18 & 2) != 0 ? null : u0.AUTH_COLLECTION_EMAIL_INPUT, (r18 & 4) != 0 ? null : g0.EMAIL_UPDATE_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function1 = this.f143197g0;
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
            g0 g0Var = g0.EMAIL_UPDATE_MODAL;
            s73.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0.UPDATE_BUTTON, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            Function1 function12 = this.f143197g0;
            if (function12 != null) {
                GestaltTextField gestaltTextField = this.f143194d0;
                if (gestaltTextField != null) {
                    function12.invoke(new b02.l(gestaltTextField.B0(), g0Var));
                } else {
                    Intrinsics.r("emailField");
                    throw null;
                }
            }
        }
    }

    public final void Z7(boolean z13) {
        this.f143198h0 = z13;
    }

    public final void a8(String currentEmail) {
        Intrinsics.checkNotNullParameter(currentEmail, "currentEmail");
        this.f143199i0 = currentEmail;
    }

    public final void b8(a02.c eventFlow) {
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        this.f143197g0 = eventFlow;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.f143193c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = yz1.b.update_email_fragment;
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(yz1.a.email_field);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143194d0 = (GestaltTextField) findViewById;
        View findViewById2 = view.findViewById(yz1.a.gestalt_continue_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f143196f0 = (GestaltButton) findViewById2;
        View findViewById3 = view.findViewById(yz1.a.close_button_recovery);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById3;
        this.f143195e0 = gestaltIconButton;
        if (this.f143198h0) {
            if (gestaltIconButton == null) {
                Intrinsics.r("closeBtn");
                throw null;
            }
            com.bumptech.glide.c.u1(gestaltIconButton);
        } else {
            if (gestaltIconButton == null) {
                Intrinsics.r("closeBtn");
                throw null;
            }
            com.bumptech.glide.c.d0(gestaltIconButton);
        }
        GestaltTextField gestaltTextField = this.f143194d0;
        if (gestaltTextField == null) {
            Intrinsics.r("emailField");
            throw null;
        }
        gestaltTextField.g0();
        GestaltButton gestaltButton = this.f143196f0;
        if (gestaltButton == null) {
            Intrinsics.r("btnContinue");
            throw null;
        }
        gestaltButton.e(new g(this, 0));
        GestaltTextField gestaltTextField2 = this.f143194d0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("emailField");
            throw null;
        }
        gestaltTextField2.Z(new g(this, 1));
        GestaltIconButton gestaltIconButton2 = this.f143195e0;
        if (gestaltIconButton2 != null) {
            gestaltIconButton2.u(new g(this, 2));
        } else {
            Intrinsics.r("closeBtn");
            throw null;
        }
    }
}
