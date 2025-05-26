package zz1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.wy0;
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
import so.oa;
import so.v8;
import so.x8;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzz1/z;", "Lnl1/d;", "", "<init>", "()V", "recoveryV2p_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class z extends v {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f143257p0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public i92.k f143258c0;

    /* renamed from: d0, reason: collision with root package name */
    public lb2.q f143259d0;

    /* renamed from: e0, reason: collision with root package name */
    public v8 f143260e0;

    /* renamed from: g0, reason: collision with root package name */
    public Function1 f143262g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltIconButton f143263h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltText f143264i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltButton f143265j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f143266k0;

    /* renamed from: l0, reason: collision with root package name */
    public qr1.a f143267l0;

    /* renamed from: m0, reason: collision with root package name */
    public gr1.j f143268m0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f143261f0 = true;

    /* renamed from: n0, reason: collision with root package name */
    public final d4 f143269n0 = d4.ACCOUNT_RECOVERY_RESILIENCE;

    /* renamed from: o0, reason: collision with root package name */
    public final a4 f143270o0 = a4.CONFIRM_MOVE_GOOGLE_LOGIN;

    public final void Y7(gm1.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int j13 = event.j();
        if (j13 == yz1.a.close_button) {
            if ((event instanceof om1.l ? (om1.l) event : null) != null) {
                s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLOSE_BUTTON, (r18 & 4) != 0 ? null : g0.MOVE_GOOGLE_LOGIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Function1 function1 = this.f143262g0;
                if (function1 != null) {
                    function1.invoke(b02.b.f20771a);
                    return;
                }
                return;
            }
            return;
        }
        if (j13 != yz1.a.move_google_link_button) {
            if (j13 == yz1.a.create_password_text) {
                if ((event instanceof rn1.f ? (rn1.f) event : null) != null) {
                    s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CREATE_PASSWORD_LINK, (r18 & 4) != 0 ? null : g0.MOVE_GOOGLE_LOGIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                    Function1 function12 = this.f143262g0;
                    if (function12 != null) {
                        qr1.a aVar = this.f143267l0;
                        if (aVar == null) {
                            Intrinsics.r("accountAlreadyLinkedData");
                            throw null;
                        }
                        gr1.j jVar = this.f143268m0;
                        if (jVar != null) {
                            function12.invoke(new b02.c(aVar, jVar));
                            return;
                        } else {
                            Intrinsics.r("pendingSocialConnectData");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if ((event instanceof xl1.a ? (xl1.a) event : null) != null) {
            s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.MOVE_GOOGLE_LOGIN_BUTTON, (r18 & 4) != 0 ? null : g0.MOVE_GOOGLE_LOGIN, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            lb2.q qVar = this.f143259d0;
            if (qVar == null) {
                Intrinsics.r("authManager");
                throw null;
            }
            v8 v8Var = this.f143260e0;
            if (v8Var == null) {
                Intrinsics.r("forceSocialConnectFactory");
                throw null;
            }
            gr1.j jVar2 = this.f143268m0;
            if (jVar2 == null) {
                Intrinsics.r("pendingSocialConnectData");
                throw null;
            }
            x8 x8Var = (x8) v8Var.f114673a.f114692e;
            gr1.g connectStrategy = new gr1.g(jVar2);
            oa oaVar = x8Var.f114707a;
            connectStrategy.f65999d = (cr1.a) oaVar.A2.get();
            connectStrategy.f66000e = (or1.i) oaVar.f114015y5.get();
            Intrinsics.checkNotNullParameter(connectStrategy, "connectStrategy");
            dl2.b.q(connectStrategy.e(), or1.d.CONTROLLER, connectStrategy, qVar.f82805e).r(tk2.e.f118017c).l(wj2.c.a()).o(new yx1.l(14, new x(this, 0)), new yx1.l(15, new x(this, 1)));
        }
    }

    public final void Z7(a02.c eventFlow) {
        Intrinsics.checkNotNullParameter(eventFlow, "eventFlow");
        this.f143262g0 = eventFlow;
    }

    public final void a8(boolean z13) {
        this.f143261f0 = z13;
    }

    public final void b8(gr1.j socialConnectData) {
        Intrinsics.checkNotNullParameter(socialConnectData, "socialConnectData");
        this.f143268m0 = socialConnectData;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF140468f0() {
        return this.f143270o0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140467e0() {
        return this.f143269n0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.E = yz1.b.fragment_move_google_link;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(yz1.a.close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143263h0 = (GestaltIconButton) findViewById;
        View findViewById2 = onCreateView.findViewById(yz1.a.move_google_link_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f143264i0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(yz1.a.move_google_link_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f143265j0 = (GestaltButton) findViewById3;
        View findViewById4 = onCreateView.findViewById(yz1.a.create_password_text);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f143266k0 = (GestaltText) findViewById4;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        String string;
        super.onResume();
        qr1.a aVar = this.f143267l0;
        if (aVar != null) {
            if (aVar == null) {
                Intrinsics.r("accountAlreadyLinkedData");
                throw null;
            }
            String conflictingEmail = aVar.getConflictingEmail();
            if (conflictingEmail == null || conflictingEmail.length() == 0) {
                int i13 = yz1.c.gbl_move_google_login_description;
                Object[] objArr = new Object[3];
                qr1.a aVar2 = this.f143267l0;
                if (aVar2 == null) {
                    Intrinsics.r("accountAlreadyLinkedData");
                    throw null;
                }
                objArr[0] = aVar2.getConflictingUsername();
                wy0 f13 = ((b60.d) getActiveUserManager()).f();
                String z43 = f13 != null ? f13.z4() : null;
                objArr[1] = z43 != null ? z43 : "";
                qr1.a aVar3 = this.f143267l0;
                if (aVar3 == null) {
                    Intrinsics.r("accountAlreadyLinkedData");
                    throw null;
                }
                objArr[2] = aVar3.getConflictingUsername();
                string = getString(i13, objArr);
            } else {
                int i14 = yz1.c.gbl_move_google_login_description_conflicting_email;
                Object[] objArr2 = new Object[4];
                qr1.a aVar4 = this.f143267l0;
                if (aVar4 == null) {
                    Intrinsics.r("accountAlreadyLinkedData");
                    throw null;
                }
                objArr2[0] = aVar4.getConflictingUsername();
                wy0 f14 = ((b60.d) getActiveUserManager()).f();
                String z44 = f14 != null ? f14.z4() : null;
                objArr2[1] = z44 != null ? z44 : "";
                qr1.a aVar5 = this.f143267l0;
                if (aVar5 == null) {
                    Intrinsics.r("accountAlreadyLinkedData");
                    throw null;
                }
                objArr2[2] = aVar5.getConflictingUsername();
                qr1.a aVar6 = this.f143267l0;
                if (aVar6 == null) {
                    Intrinsics.r("accountAlreadyLinkedData");
                    throw null;
                }
                objArr2[3] = aVar6.getConflictingEmail();
                string = getString(i14, objArr2);
            }
            Intrinsics.f(string);
            GestaltText gestaltText = this.f143264i0;
            if (gestaltText != null) {
                pk.a0.p(gestaltText, string);
            } else {
                Intrinsics.r("moveGoogleLinkDescription");
                throw null;
            }
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        GestaltIconButton gestaltIconButton = this.f143263h0;
        if (gestaltIconButton == null) {
            Intrinsics.r("closeButton");
            throw null;
        }
        if (this.f143261f0) {
            com.bumptech.glide.c.u1(gestaltIconButton);
        } else {
            com.bumptech.glide.c.d0(gestaltIconButton);
        }
        gestaltIconButton.u(new y(this, 0));
        GestaltButton gestaltButton = this.f143265j0;
        if (gestaltButton == null) {
            Intrinsics.r("moveGoogleLinkButton");
            throw null;
        }
        gestaltButton.e(new y(this, 1));
        GestaltText gestaltText = this.f143266k0;
        if (gestaltText != null) {
            gestaltText.j(new y(this, 2));
        } else {
            Intrinsics.r("createPasswordText");
            throw null;
        }
    }
}
