package com.pinterest.identity.account;

import a.z0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.n;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.password.StrongPasswordTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.settings.SettingsRoundHeaderView;
import df.j1;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.y1;
import m60.x0;
import pk.a0;
import rm1.q;
import u50.f0;
import we1.a2;
import yk1.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/identity/account/h;", "Lyk1/k;", "Lcom/pinterest/identity/account/d;", "Lcom/pinterest/identity/account/l;", "Lnx/a;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class h extends b implements d, l, nx.a {
    public static final /* synthetic */ int H0 = 0;
    public GestaltButton A0;
    public GestaltTextField B0;
    public GestaltTextField C0;
    public GestaltTextField D0;
    public StrongPasswordTextField E0;
    public c F0;
    public final d4 G0;

    /* renamed from: j0, reason: collision with root package name */
    public n f49781j0;

    /* renamed from: k0, reason: collision with root package name */
    public mr1.a f49782k0;

    /* renamed from: l0, reason: collision with root package name */
    public lb2.d f49783l0;

    /* renamed from: m0, reason: collision with root package name */
    public mo1.d f49784m0;

    /* renamed from: n0, reason: collision with root package name */
    public y1 f49785n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f49786o0 = "";

    /* renamed from: p0, reason: collision with root package name */
    public String f49787p0 = "";

    /* renamed from: q0, reason: collision with root package name */
    public String f49788q0 = "";

    /* renamed from: r0, reason: collision with root package name */
    public String f49789r0 = "";

    /* renamed from: s0, reason: collision with root package name */
    public String f49790s0 = "";

    /* renamed from: t0, reason: collision with root package name */
    public String f49791t0 = "";

    /* renamed from: u0, reason: collision with root package name */
    public String f49792u0 = "";

    /* renamed from: v0, reason: collision with root package name */
    public String f49793v0 = "";

    /* renamed from: w0, reason: collision with root package name */
    public SettingsRoundHeaderView f49794w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltText f49795x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltAvatar f49796y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltAvatar f49797z0;

    public h() {
        this.E = vq1.c.unlink_account_email_password_bottom_sheet;
        this.G0 = d4.UNLINK_ACCOUNT;
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        this.f49791t0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_USERNAME");
        this.f49792u0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_EXPIRATION");
        this.f49793v0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_TOKEN");
        this.f49786o0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_LBA_FULL_NAME");
        this.f49787p0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_URL");
        this.f49788q0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_BUSINESS_AVATAR_ID");
        this.f49789r0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_OWNER_AVATAR_URL");
        this.f49790s0 = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_UNLINK_ACCOUNT_OWNER_AVATAR_ID");
    }

    @Override // yk1.k
    public final m V7() {
        lb2.d dVar = this.f49783l0;
        if (dVar == null) {
            Intrinsics.r("accountManager");
            throw null;
        }
        mr1.a aVar = this.f49782k0;
        if (aVar != null) {
            return new k(dVar, aVar);
        }
        Intrinsics.r("accountSwitcher");
        throw null;
    }

    public final void b8() {
        c cVar = this.F0;
        if (cVar != null) {
            GestaltTextField gestaltTextField = this.B0;
            if (gestaltTextField == null) {
                Intrinsics.r("emailTextField");
                throw null;
            }
            String B0 = gestaltTextField.B0();
            StrongPasswordTextField strongPasswordTextField = this.E0;
            if (strongPasswordTextField == null) {
                Intrinsics.r("strongPasswordTextField");
                throw null;
            }
            ((k) cVar).r3(B0, strongPasswordTextField.i());
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF44790o0() {
        return this.G0;
    }

    @Override // com.pinterest.identity.account.b, nl1.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.D(E4);
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.A0 = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(f.f49778i);
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(vq1.b.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f49794w0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = onCreateView.findViewById(vq1.b.description_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f49795x0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(vq1.b.ba_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f49796y0 = (GestaltAvatar) findViewById3;
        View findViewById4 = onCreateView.findViewById(vq1.b.parent_account_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f49797z0 = (GestaltAvatar) findViewById4;
        View findViewById5 = onCreateView.findViewById(vq1.b.email_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.B0 = (GestaltTextField) findViewById5;
        View findViewById6 = onCreateView.findViewById(vq1.b.password_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.C0 = (GestaltTextField) findViewById6;
        View findViewById7 = onCreateView.findViewById(vq1.b.confirm_password_edit_text);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.D0 = (GestaltTextField) findViewById7;
        View findViewById8 = onCreateView.findViewById(vq1.b.strong_password_field);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.E0 = (StrongPasswordTextField) findViewById8;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            a0.d1(E4);
        }
        super.onDetach();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) v13.findViewById(vq1.b.bottom_sheet_view);
        int i13 = 0;
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        SettingsRoundHeaderView settingsRoundHeaderView = this.f49794w0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        settingsRoundHeaderView.d0(q.CANCEL);
        settingsRoundHeaderView.k0(vq1.d.unlink_ba_email_password_header_title);
        settingsRoundHeaderView.g0(new a2(this, 29));
        settingsRoundHeaderView.setElevation(0.0f);
        GestaltButton gestaltButton = this.A0;
        if (gestaltButton == null) {
            Intrinsics.r("unlinkButton");
            throw null;
        }
        settingsRoundHeaderView.T(gestaltButton);
        GestaltButton gestaltButton2 = this.A0;
        if (gestaltButton2 == null) {
            Intrinsics.r("unlinkButton");
            throw null;
        }
        a0.m(gestaltButton2, new g(this, i13));
        GestaltText gestaltText = this.f49795x0;
        if (gestaltText == null) {
            Intrinsics.r("descriptionTextView");
            throw null;
        }
        CharSequence string = j1.a0(getString(x0.unlink_ba_email_password_description, this.f49786o0));
        Intrinsics.checkNotNullExpressionValue(string, "fromHtml(...)");
        Intrinsics.checkNotNullParameter(string, "string");
        a0.q(gestaltText, new f0(string));
        GestaltAvatar gestaltAvatar = this.f49796y0;
        if (gestaltAvatar == null) {
            Intrinsics.r("businessAccountAvatar");
            throw null;
        }
        gestaltAvatar.H2(new g(this, 1));
        GestaltAvatar gestaltAvatar2 = this.f49797z0;
        if (gestaltAvatar2 == null) {
            Intrinsics.r("parentAccountAvatar");
            throw null;
        }
        gestaltAvatar2.H2(new g(this, 2));
        GestaltTextField gestaltTextField = this.B0;
        if (gestaltTextField == null) {
            Intrinsics.r("emailTextField");
            throw null;
        }
        l3.c.M0(gestaltTextField, this);
        GestaltTextField gestaltTextField2 = this.C0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("newPasswordTextField");
            throw null;
        }
        l3.c.M0(gestaltTextField2, this);
        GestaltTextField gestaltTextField3 = this.D0;
        if (gestaltTextField3 == null) {
            Intrinsics.r("confirmNewPasswordTextField");
            throw null;
        }
        l3.c.M0(gestaltTextField3, this);
        y1 y1Var = this.f49785n0;
        if (y1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (y1Var.e()) {
            GestaltTextField gestaltTextField4 = this.C0;
            if (gestaltTextField4 == null) {
                Intrinsics.r("newPasswordTextField");
                throw null;
            }
            gestaltTextField4.setVisibility(8);
            GestaltTextField gestaltTextField5 = this.D0;
            if (gestaltTextField5 == null) {
                Intrinsics.r("confirmNewPasswordTextField");
                throw null;
            }
            gestaltTextField5.setVisibility(8);
            StrongPasswordTextField strongPasswordTextField = this.E0;
            if (strongPasswordTextField == null) {
                Intrinsics.r("strongPasswordTextField");
                throw null;
            }
            strongPasswordTextField.setVisibility(0);
            GestaltTextField gestaltTextField6 = this.B0;
            if (gestaltTextField6 == null) {
                Intrinsics.r("emailTextField");
                throw null;
            }
            l3.c.M0(gestaltTextField6, new l() { // from class: com.pinterest.identity.account.e
                @Override // com.pinterest.identity.account.l
                public final void s1(int i14, String str) {
                    int i15 = h.H0;
                    h this$0 = h.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
                    this$0.b8();
                }
            });
            StrongPasswordTextField strongPasswordTextField2 = this.E0;
            if (strongPasswordTextField2 != null) {
                strongPasswordTextField2.g(new z0(this, 28));
            } else {
                Intrinsics.r("strongPasswordTextField");
                throw null;
            }
        }
    }

    @Override // com.pinterest.identity.account.l
    public final void s1(int i13, String text) {
        c cVar;
        Intrinsics.checkNotNullParameter(text, "text");
        if (i13 == vq1.b.email_edit_text) {
            c cVar2 = this.F0;
            if (cVar2 != null) {
                ((k) cVar2).q3(text);
                return;
            }
            return;
        }
        if (i13 == vq1.b.password_edit_text) {
            c cVar3 = this.F0;
            if (cVar3 != null) {
                ((k) cVar3).s3(text);
                return;
            }
            return;
        }
        if (i13 != vq1.b.confirm_password_edit_text || (cVar = this.F0) == null) {
            return;
        }
        ((k) cVar).p3(text);
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return null;
    }
}
