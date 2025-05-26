package com.pinterest.qrCodeLogin;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import ea1.t0;
import ea1.u0;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/pinterest/qrCodeLogin/z;", "Lmm1/l;", "<init>", "()V", "gi2/b", "qrCodeLogin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class z extends a {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f50362q0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public final m1 f50363g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d4 f50364h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltIcon f50365i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltSpinner f50366j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltText f50367k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltText f50368l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltButtonGroup f50369m0;

    /* renamed from: n0, reason: collision with root package name */
    public FrameLayout f50370n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltIcon f50371o0;

    /* renamed from: p0, reason: collision with root package name */
    public LinearLayout f50372p0;

    public z() {
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new ax1.a(5, new t0(this, 28)));
        int i13 = 26;
        this.f50363g0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(j0.class), new u0(a13, 25), new ca1.m(a13, i13), new ca1.n(this, a13, i13));
        this.f50364h0 = d4.UNKNOWN_VIEW;
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(l0.fragment_qr_code_login, true, 0, 100, true, false, new yv1.i(this, 10), 612);
    }

    public final j0 d8() {
        return (j0) this.f50363g0.getValue();
    }

    public final void e8(i iVar) {
        GestaltIcon gestaltIcon = this.f50371o0;
        if (gestaltIcon == null) {
            Intrinsics.r("pinterestIcon");
            throw null;
        }
        gestaltIcon.g2(new y(iVar, 0));
        FrameLayout frameLayout = this.f50370n0;
        if (frameLayout == null) {
            Intrinsics.r("qrIconContainer");
            throw null;
        }
        frameLayout.setVisibility(iVar.b());
        LinearLayout linearLayout = this.f50372p0;
        if (linearLayout == null) {
            Intrinsics.r("qrCodeTextsContainer");
            throw null;
        }
        linearLayout.setVisibility(iVar.a());
        GestaltButtonGroup gestaltButtonGroup = this.f50369m0;
        if (gestaltButtonGroup == null) {
            Intrinsics.r("buttonGroup");
            throw null;
        }
        gestaltButtonGroup.a(new y(iVar, 1));
        GestaltText gestaltText = this.f50367k0;
        if (gestaltText == null) {
            Intrinsics.r("titleText");
            throw null;
        }
        pp2.a.k(gestaltText, new y(iVar, 2));
        GestaltText gestaltText2 = this.f50368l0;
        if (gestaltText2 != null) {
            pp2.a.k(gestaltText2, new y(iVar, 3));
        } else {
            Intrinsics.r("descriptionText");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35233h() {
        return this.f50364h0;
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Unit unit;
        String v03;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(k0.qr_login_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50366j0 = (GestaltSpinner) findViewById;
        View findViewById2 = v13.findViewById(k0.qr_login_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50365i0 = (GestaltIcon) findViewById2;
        View findViewById3 = v13.findViewById(k0.qr_login_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50367k0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(k0.qr_login_description);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50368l0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(k0.qr_login_button_group);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50369m0 = (GestaltButtonGroup) findViewById5;
        View findViewById6 = v13.findViewById(k0.qr_login_icon_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f50370n0 = (FrameLayout) findViewById6;
        View findViewById7 = v13.findViewById(k0.qr_login_pinterest_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f50371o0 = (GestaltIcon) findViewById7;
        View findViewById8 = v13.findViewById(k0.qr_login_container);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f50372p0 = (LinearLayout) findViewById8;
        GestaltButtonGroup gestaltButtonGroup = this.f50369m0;
        if (gestaltButtonGroup == null) {
            Intrinsics.r("buttonGroup");
            throw null;
        }
        gestaltButtonGroup.b(new gh1.e(this, 29));
        Navigation navigation = this.I;
        if (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_QR_CODE_LOGIN_TOKEN")) == null) {
            unit = null;
        } else {
            j0 d83 = d8();
            h32.i0 p13 = s7().p();
            if (p13 == null) {
                p13 = new h32.i0(null, null, null, null, null, null);
            }
            d83.h(p13, v03);
            unit = Unit.f80348a;
        }
        if (unit == null) {
            e8(e.f50305g);
        }
        a8(u.f50337j);
        GestaltIcon gestaltIcon = this.f50365i0;
        if (gestaltIcon == null) {
            Intrinsics.r("qrCodeIcon");
            throw null;
        }
        dl2.b.z(gestaltIcon, u.f50339l);
        GestaltIcon gestaltIcon2 = this.f50371o0;
        if (gestaltIcon2 == null) {
            Intrinsics.r("pinterestIcon");
            throw null;
        }
        dl2.b.z(gestaltIcon2, u.f50341n);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new x(this, null), 3);
    }
}
