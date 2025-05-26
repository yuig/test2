package zz1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzz1/b;", "Lnl1/d;", "", "<init>", "()V", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b extends r {

    /* renamed from: d0, reason: collision with root package name */
    public Function1 f143158d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltIconButton f143159e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltButton f143160f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f143161g0;

    /* renamed from: h0, reason: collision with root package name */
    public qr1.a f143162h0;

    /* renamed from: i0, reason: collision with root package name */
    public gr1.j f143163i0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f143157c0 = true;

    /* renamed from: j0, reason: collision with root package name */
    public final d4 f143164j0 = d4.ACCOUNT_RECOVERY_RESILIENCE;

    /* renamed from: k0, reason: collision with root package name */
    public final a4 f143165k0 = a4.ACCOUNT_ALREADY_LINKED;

    public final void Y7(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int j13 = event.j();
        if (j13 == yz1.a.close_button) {
            if ((event instanceof om1.l ? (om1.l) event : null) != null) {
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLOSE_BUTTON, (r18 & 4) != 0 ? null : g0.MOVE_GOOGLE_LOGIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function1 = this.f143158d0;
                if (function1 != null) {
                    function1.invoke(b02.b.f20771a);
                    return;
                }
                return;
            }
            return;
        }
        if (j13 == yz1.a.create_password_button) {
            if ((event instanceof xl1.a ? (xl1.a) event : null) != null) {
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CREATE_PASSWORD_BUTTON, (r18 & 4) != 0 ? null : g0.MOVE_GOOGLE_LOGIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function12 = this.f143158d0;
                if (function12 != null) {
                    function12.invoke(b02.g.f20777a);
                    return;
                }
                return;
            }
            return;
        }
        if (j13 == yz1.a.link_google_account_text) {
            if ((event instanceof rn1.f ? (rn1.f) event : null) != null) {
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.MOVE_GOOGLE_LOGIN_LINK, (r18 & 4) != 0 ? null : g0.MOVE_GOOGLE_LOGIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function13 = this.f143158d0;
                if (function13 != null) {
                    qr1.a aVar = this.f143162h0;
                    if (aVar == null) {
                        Intrinsics.r("accountAlreadyLinkedData");
                        throw null;
                    }
                    gr1.j jVar = this.f143163i0;
                    if (jVar != null) {
                        function13.invoke(new b02.h(aVar, jVar));
                    } else {
                        Intrinsics.r("pendingSocialConnectData");
                        throw null;
                    }
                }
            }
        }
    }

    public final void Z7(a02.c eventFlow) {
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        this.f143158d0 = eventFlow;
    }

    public final void a8(boolean z13) {
        this.f143157c0 = z13;
    }

    public final void b8(gr1.j socialConnectData) {
        Intrinsics.checkNotNullParameter(socialConnectData, "socialConnectData");
        this.f143163i0 = socialConnectData;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getH0() {
        return this.f143165k0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f143164j0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = yz1.b.fragment_account_taken_password_option;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(yz1.a.close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143159e0 = (GestaltIconButton) findViewById;
        View findViewById2 = onCreateView.findViewById(yz1.a.create_password_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f143160f0 = (GestaltButton) findViewById2;
        View findViewById3 = onCreateView.findViewById(yz1.a.link_google_account_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f143161g0 = (GestaltText) findViewById3;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltIconButton gestaltIconButton = this.f143159e0;
        if (gestaltIconButton == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        if (this.f143157c0) {
            com.bumptech.glide.c.u1(gestaltIconButton);
        } else {
            com.bumptech.glide.c.d0(gestaltIconButton);
        }
        gestaltIconButton.u(new a(this, 0));
        GestaltButton gestaltButton = this.f143160f0;
        if (gestaltButton == null) {
            Intrinsics.r("createPasswordButton");
            throw null;
        }
        gestaltButton.e(new a(this, 1));
        GestaltText gestaltText = this.f143161g0;
        if (gestaltText != null) {
            gestaltText.j(new a(this, 2));
        } else {
            Intrinsics.r("moveGoogleLinkText");
            throw null;
        }
    }
}
