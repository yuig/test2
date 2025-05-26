package r02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.settings.SettingsRoundHeaderView;
import ea1.u0;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lr02/s0;", "Lnl1/d;", "<init>", "()V", "gi2/b", "r02/l0", "r02/m0", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class s0 extends e {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f105802t0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f105803c0 = 20971520;

    /* renamed from: d0, reason: collision with root package name */
    public final m1 f105804d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d4 f105805e0;

    /* renamed from: f0, reason: collision with root package name */
    public String f105806f0;

    /* renamed from: g0, reason: collision with root package name */
    public String f105807g0;

    /* renamed from: h0, reason: collision with root package name */
    public Group f105808h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltText f105809i0;

    /* renamed from: j0, reason: collision with root package name */
    public LinearLayout f105810j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltIcon f105811k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f105812l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f105813m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltTextField f105814n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f105815o0;

    /* renamed from: p0, reason: collision with root package name */
    public String f105816p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f105817q0;

    /* renamed from: r0, reason: collision with root package name */
    public String f105818r0;

    /* renamed from: s0, reason: collision with root package name */
    public final o0 f105819s0;

    public s0() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(8, new c0(this, 1)));
        int i13 = 29;
        this.f105804d0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(s02.x.class), new u0(a13, 28), new ca1.m(a13, i13), new ca1.n(this, a13, i13));
        this.f105805e0 = d4.REPORTS_AND_VIOLATION_CENTER;
        xk2.m.b(new yv1.i(this, 14));
        this.f105819s0 = new o0(this, 0);
    }

    public final void Y7(m0 m0Var) {
        int i13 = n0.f105778a[m0Var.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            Group group = this.f105808h0;
            if (group == null) {
                Intrinsics.r("groupPdfAdded");
                throw null;
            }
            group.setVisibility(8);
            GestaltText gestaltText = this.f105809i0;
            if (gestaltText == null) {
                Intrinsics.r("tvErrorUploadFile");
                throw null;
            }
            gestaltText.i(f.f105743x);
            LinearLayout linearLayout = this.f105810j0;
            if (linearLayout == null) {
                Intrinsics.r("containerSubmitUploadFile");
                throw null;
            }
            linearLayout.setVisibility(0);
            linearLayout.setBackgroundResource(m60.s0.rounded_rect_grid_pin_placeholder);
            GestaltIcon gestaltIcon = this.f105811k0;
            if (gestaltIcon == null) {
                Intrinsics.r("iconSubmitUploadPdf");
                throw null;
            }
            dl2.b.z(gestaltIcon, f.f105745z);
            GestaltText gestaltText2 = this.f105812l0;
            if (gestaltText2 == null) {
                Intrinsics.r("tvSubmitUploadPdfDescription");
                throw null;
            }
            gestaltText2.i(f.A);
            GestaltText gestaltText3 = this.f105813m0;
            if (gestaltText3 != null) {
                gestaltText3.i(f.B);
                return;
            } else {
                Intrinsics.r("tvUploadedFilename");
                throw null;
            }
        }
        if (i13 == 2) {
            Group group2 = this.f105808h0;
            if (group2 == null) {
                Intrinsics.r("groupPdfAdded");
                throw null;
            }
            group2.setVisibility(0);
            GestaltText gestaltText4 = this.f105809i0;
            if (gestaltText4 == null) {
                Intrinsics.r("tvErrorUploadFile");
                throw null;
            }
            gestaltText4.i(f.C);
            LinearLayout linearLayout2 = this.f105810j0;
            if (linearLayout2 == null) {
                Intrinsics.r("containerSubmitUploadFile");
                throw null;
            }
            linearLayout2.setVisibility(8);
            GestaltText gestaltText5 = this.f105813m0;
            if (gestaltText5 != null) {
                gestaltText5.i(new o0(this, i14));
                return;
            } else {
                Intrinsics.r("tvUploadedFilename");
                throw null;
            }
        }
        if (i13 != 3) {
            Group group3 = this.f105808h0;
            if (group3 == null) {
                Intrinsics.r("groupPdfAdded");
                throw null;
            }
            group3.setVisibility(8);
            GestaltText gestaltText6 = this.f105809i0;
            if (gestaltText6 == null) {
                Intrinsics.r("tvErrorUploadFile");
                throw null;
            }
            gestaltText6.i(f.f105738s);
            LinearLayout linearLayout3 = this.f105810j0;
            if (linearLayout3 == null) {
                Intrinsics.r("containerSubmitUploadFile");
                throw null;
            }
            linearLayout3.setVisibility(0);
            linearLayout3.setBackgroundResource(c52.b.rounded_edittext_background);
            GestaltIcon gestaltIcon2 = this.f105811k0;
            if (gestaltIcon2 == null) {
                Intrinsics.r("iconSubmitUploadPdf");
                throw null;
            }
            dl2.b.z(gestaltIcon2, f.f105740u);
            GestaltText gestaltText7 = this.f105812l0;
            if (gestaltText7 == null) {
                Intrinsics.r("tvSubmitUploadPdfDescription");
                throw null;
            }
            gestaltText7.i(f.f105741v);
            GestaltText gestaltText8 = this.f105813m0;
            if (gestaltText8 == null) {
                Intrinsics.r("tvUploadedFilename");
                throw null;
            }
            gestaltText8.i(f.f105742w);
            this.f105807g0 = null;
            this.f105806f0 = null;
            return;
        }
        Group group4 = this.f105808h0;
        if (group4 == null) {
            Intrinsics.r("groupPdfAdded");
            throw null;
        }
        group4.setVisibility(8);
        GestaltText gestaltText9 = this.f105809i0;
        if (gestaltText9 == null) {
            Intrinsics.r("tvErrorUploadFile");
            throw null;
        }
        gestaltText9.i(f.D);
        LinearLayout linearLayout4 = this.f105810j0;
        if (linearLayout4 == null) {
            Intrinsics.r("containerSubmitUploadFile");
            throw null;
        }
        linearLayout4.setVisibility(0);
        linearLayout4.setBackgroundResource(h02.b.rvc_bg_submit_stroke_red);
        GestaltIcon gestaltIcon3 = this.f105811k0;
        if (gestaltIcon3 == null) {
            Intrinsics.r("iconSubmitUploadPdf");
            throw null;
        }
        dl2.b.z(gestaltIcon3, f.f105735p);
        GestaltText gestaltText10 = this.f105812l0;
        if (gestaltText10 == null) {
            Intrinsics.r("tvSubmitUploadPdfDescription");
            throw null;
        }
        gestaltText10.i(f.f105736q);
        GestaltText gestaltText11 = this.f105813m0;
        if (gestaltText11 == null) {
            Intrinsics.r("tvUploadedFilename");
            throw null;
        }
        gestaltText11.i(f.f105737r);
        this.f105807g0 = null;
        this.f105806f0 = null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getO0() {
        return this.f105805e0;
    }

    @Override // nl1.d
    public final Function1 h7() {
        return this.f105819s0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = h02.d.rvc_submit_appeal;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(h02.c.header_submit_appeal);
        settingsRoundHeaderView.g0(new k0(this, 0));
        settingsRoundHeaderView.k0(h02.e.rvc_submit_appeal_title);
        View findViewById = onCreateView.findViewById(h02.c.gp_pdf_added);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f105808h0 = (Group) findViewById;
        View findViewById2 = onCreateView.findViewById(h02.c.gt_error_upload_file);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f105809i0 = (GestaltText) findViewById2;
        View findViewById3 = onCreateView.findViewById(h02.c.container_submit_upload_file);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f105810j0 = (LinearLayout) findViewById3;
        View findViewById4 = onCreateView.findViewById(h02.c.gi_submit_upload_pdf);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f105811k0 = (GestaltIcon) findViewById4;
        View findViewById5 = onCreateView.findViewById(h02.c.gt_submit_upload_pdf_description);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f105812l0 = (GestaltText) findViewById5;
        View findViewById6 = onCreateView.findViewById(h02.c.gt_uploaded_filename);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f105813m0 = (GestaltText) findViewById6;
        View findViewById7 = onCreateView.findViewById(h02.c.gt_submit_textarea);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f105814n0 = (GestaltTextField) findViewById7;
        GestaltIcon gestaltIcon = this.f105811k0;
        if (gestaltIcon != null) {
            gestaltIcon.setOnClickListener(new k0(this, 1));
            return onCreateView;
        }
        Intrinsics.r("iconSubmitUploadPdf");
        throw null;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        int i13 = 3;
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new r0(this, null), 3);
        this.f105816p0 = com.bumptech.glide.d.Z(this, "EXTRA_PARAM_ACTION_ID", "");
        this.f105817q0 = com.bumptech.glide.d.Z(this, "EXTRA_PARAM_USER_ID", "");
        this.f105818r0 = com.bumptech.glide.d.Z(this, "EXTRA_PARAM_OBJECT_ID", "");
        LinearLayout linearLayout = this.f105810j0;
        if (linearLayout == null) {
            Intrinsics.r("containerSubmitUploadFile");
            throw null;
        }
        linearLayout.setVisibility(com.bumptech.glide.d.G(this, "EXTRA_PARAM_ATTACHMENT_ENABLED", false) ? 0 : 8);
        this.f105815o0 = com.bumptech.glide.d.G(this, "EXTRA_PARAM_IS_YOUR_ACCOUNT_TAB", false);
        ((s02.x) this.f105804d0.getValue()).h();
        ((GestaltButton) v13.findViewById(h02.c.gt_submit_appeal_cancel)).setOnClickListener(new k0(this, 2));
        ((GestaltButton) v13.findViewById(h02.c.gt_submit_appeal_submit)).setOnClickListener(new k0(this, i13));
        ((GestaltIcon) v13.findViewById(h02.c.gi_pdf_added_remove)).setOnClickListener(new k0(this, 4));
    }
}
