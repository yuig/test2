package zz1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzz1/l;", "Lnl1/d;", "", "<init>", "()V", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class l extends u {

    /* renamed from: c0, reason: collision with root package name */
    public GestaltText f143207c0;

    /* renamed from: d0, reason: collision with root package name */
    public GestaltText f143208d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltButton f143209e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltText f143210f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltIconButton f143211g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f143212h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f143213i0 = new String();

    /* renamed from: j0, reason: collision with root package name */
    public String f143214j0 = new String();

    /* renamed from: k0, reason: collision with root package name */
    public boolean f143215k0 = true;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f143216l0;

    /* renamed from: m0, reason: collision with root package name */
    public vy.m f143217m0;

    /* renamed from: n0, reason: collision with root package name */
    public Function1 f143218n0;

    public final void Y7(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int j13 = event.j();
        int i13 = yz1.a.txtNoUseCurrentEmail;
        b02.e eVar = b02.e.f20775a;
        if (j13 == i13) {
            if (event instanceof rn1.f) {
                vy.m mVar = this.f143217m0;
                if (mVar == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                mVar.a("recovery_v2_fb_click_change_email");
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_CLICK, (r18 & 2) != 0 ? null : u0.AUTH_COLLECTION_EMAIL_INPUT, (r18 & 4) != 0 ? null : g0.CONFIRM_EMAIL_UPDATE_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function1 = this.f143218n0;
                if (function1 != null) {
                    function1.invoke(eVar);
                    return;
                }
                return;
            }
            return;
        }
        if (j13 != yz1.a.btn_update_email) {
            if (j13 == yz1.a.close_button_recovery && (event instanceof om1.l)) {
                vy.m mVar2 = this.f143217m0;
                if (mVar2 == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                mVar2.a("recovery_v2_fb_confirm_email_dismiss");
                nx.d0.B(s7(), f1.AUTH_COLLECTION_DISMISS, g0.CONFIRM_EMAIL_UPDATE_MODAL, null, null, 28);
                Function1 function12 = this.f143218n0;
                if (function12 != null) {
                    function12.invoke(b02.b.f20771a);
                    return;
                }
                return;
            }
            return;
        }
        if (event instanceof xl1.a) {
            if (this.f143212h0) {
                vy.m mVar3 = this.f143217m0;
                if (mVar3 == null) {
                    Intrinsics.r("analyticsApi");
                    throw null;
                }
                mVar3.a("recovery_v2_fb_click_change_email");
                Function1 function13 = this.f143218n0;
                if (function13 != null) {
                    function13.invoke(eVar);
                    return;
                }
                return;
            }
            vy.m mVar4 = this.f143217m0;
            if (mVar4 == null) {
                Intrinsics.r("analyticsApi");
                throw null;
            }
            mVar4.a("recovery_v2_fb_email_updated");
            Function1 function14 = this.f143218n0;
            if (function14 != null) {
                function14.invoke(new b02.l(this.f143213i0, g0.CONFIRM_EMAIL_UPDATE_MODAL));
            }
        }
    }

    public final void Z7(boolean z13) {
        this.f143215k0 = z13;
    }

    public final void a8(a02.c eventFlow) {
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        this.f143218n0 = eventFlow;
    }

    public final void b8(boolean z13) {
        this.f143216l0 = z13;
    }

    public final void c8() {
        String string;
        Context context = getContext();
        if (context == null) {
            FragmentActivity E4 = E4();
            context = E4 != null ? E4.getApplicationContext() : null;
            if (context == null) {
                return;
            }
        }
        String str = "";
        if (!this.f143212h0 ? (string = context.getString(yz1.c.gbl_confirm_email_description_alternative)) != null : (string = context.getString(yz1.c.gbl_confirm_email_description)) != null) {
            str = string;
        }
        if (this.f143216l0) {
            GestaltText gestaltText = this.f143207c0;
            if (gestaltText == null) {
                Intrinsics.r("header");
                throw null;
            }
            gestaltText.i(k.f143202j);
            str = context.getString(yz1.c.gbl_confirm_urgent_email_description_alternative, this.f143213i0, this.f143214j0);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        if (this.f143213i0.length() == 0) {
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.AUTH_COLLECTION_FAIL, (r18 & 2) != 0 ? null : u0.GOOGLE_CONTINUE_BUTTON, (r18 & 4) != 0 ? null : g0.CONFIRM_EMAIL_UPDATE_MODAL, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        GestaltText gestaltText2 = this.f143208d0;
        if (gestaltText2 == null) {
            Intrinsics.r("txtDescription");
            throw null;
        }
        String str2 = this.f143213i0;
        if (str2 == null) {
            str2 = this.f143214j0;
        }
        f0.h.n(context, gestaltText2, str, str2);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getR0() {
        return d4.UNKNOWN_VIEW;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = yz1.b.confirm_email_fragment;
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(yz1.a.textView24);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143207c0 = (GestaltText) findViewById;
        View findViewById2 = view.findViewById(yz1.a.txt_description_confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f143208d0 = (GestaltText) findViewById2;
        View findViewById3 = view.findViewById(yz1.a.btn_update_email);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f143209e0 = (GestaltButton) findViewById3;
        View findViewById4 = view.findViewById(yz1.a.txtNoUseCurrentEmail);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f143210f0 = (GestaltText) findViewById4;
        View findViewById5 = view.findViewById(yz1.a.close_button_recovery);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById5;
        this.f143211g0 = gestaltIconButton;
        if (this.f143215k0) {
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
        GestaltButton gestaltButton = this.f143209e0;
        if (gestaltButton == null) {
            Intrinsics.r("btnUpdateEmail");
            throw null;
        }
        gestaltButton.e(new j(this, 0));
        GestaltText gestaltText = this.f143210f0;
        if (gestaltText == null) {
            Intrinsics.r("txtNoUseCurrentEmail");
            throw null;
        }
        gestaltText.j(new j(this, 1));
        GestaltIconButton gestaltIconButton2 = this.f143211g0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("closeBtn");
            throw null;
        }
        gestaltIconButton2.u(new j(this, 2));
        c8();
    }
}
