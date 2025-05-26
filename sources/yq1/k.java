package yq1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.identity.authentication.view.SuggestedDomainsView;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import i2.y3;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyq1/k;", "Lyk1/k;", "Lzq1/b;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class k extends b0 implements zq1.b {
    public static final /* synthetic */ int R0 = 0;
    public zq1.a A0;
    public PinterestLoadingLayout B0;
    public SuggestedDomainsView C0;
    public GestaltTextField D0;
    public GestaltButtonSocial E0;
    public GestaltButtonSocial F0;
    public GestaltButtonSocial G0;
    public GestaltButton H0;
    public GestaltButton I0;
    public GestaltButton J0;
    public GestaltText K0;
    public GestaltText L0;
    public boolean M0;
    public String N0;
    public final ParcelableSnapshotMutableState O0;
    public final d4 P0;
    public final a4 Q0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f139876j0;

    /* renamed from: k0, reason: collision with root package name */
    public lb2.q f139877k0;

    /* renamed from: l0, reason: collision with root package name */
    public m60.e f139878l0;

    /* renamed from: m0, reason: collision with root package name */
    public dy.a f139879m0;

    /* renamed from: n0, reason: collision with root package name */
    public b20.c f139880n0;

    /* renamed from: o0, reason: collision with root package name */
    public mr1.a f139881o0;

    /* renamed from: p0, reason: collision with root package name */
    public il1.a f139882p0;

    /* renamed from: q0, reason: collision with root package name */
    public wk2.a f139883q0;

    /* renamed from: r0, reason: collision with root package name */
    public wk2.a f139884r0;

    /* renamed from: s0, reason: collision with root package name */
    public wk2.a f139885s0;

    /* renamed from: t0, reason: collision with root package name */
    public vy.m f139886t0;

    /* renamed from: u0, reason: collision with root package name */
    public com.pinterest.identity.authentication.a f139887u0;

    /* renamed from: v0, reason: collision with root package name */
    public lh0.y1 f139888v0;

    /* renamed from: w0, reason: collision with root package name */
    public cr1.b f139889w0;

    /* renamed from: x0, reason: collision with root package name */
    public androidx.appcompat.widget.x f139890x0;

    /* renamed from: y0, reason: collision with root package name */
    public so.d0 f139891y0;

    /* renamed from: z0, reason: collision with root package name */
    public lb0.q f139892z0;

    public k() {
        br1.f fVar = br1.f.Simple;
        int i13 = vq1.d.unauth_splash_page_1_line_1;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        u50.k0 k0Var = new u50.k0(i13, new ArrayList(0));
        int i14 = vq1.d.unauth_splash_page_1_line_2;
        String[] formatArgs2 = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
        u50.k0 k0Var2 = new u50.k0(i14, new ArrayList(0));
        int i15 = vq1.d.unauth_splash_page_1_full_text;
        String[] formatArgs3 = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs3, "formatArgs");
        this.O0 = bs1.c.u1(new br1.f0(fVar, false, false, false, false, true, false, k0Var, k0Var2, new u50.k0(i15, new ArrayList(0))), y3.f71400a);
        this.P0 = d4.SPLASH;
        this.Q0 = a4.SPLASH_CONTINUE_EMAIL;
    }

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        getAnalyticsApi().a("unauth_home");
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Bundle arguments;
        Navigation navigation;
        Parcelable A0;
        Bundle arguments2;
        uk1.e eVar = this.f139876j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        lb2.q qVar = this.f139877k0;
        if (qVar == null) {
            Intrinsics.r("authManager");
            throw null;
        }
        com.pinterest.identity.authentication.a aVar = this.f139887u0;
        if (aVar == null) {
            Intrinsics.r("authNavigationHelper");
            throw null;
        }
        b20.c cVar = this.f139880n0;
        if (cVar == null) {
            Intrinsics.r("authInfoProvider");
            throw null;
        }
        mr1.a aVar2 = this.f139881o0;
        if (aVar2 == null) {
            Intrinsics.r("accountSwitcher");
            throw null;
        }
        cr1.b bVar = this.f139889w0;
        if (bVar == null) {
            Intrinsics.r("authenticationService");
            throw null;
        }
        vy.m analyticsApi = getAnalyticsApi();
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        mr1.b m13 = bs1.c.m(requireActivity);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_PIN_ID", "key");
        String X = com.bumptech.glide.d.X(this, "com.pinterest.EXTRA_PIN_ID");
        String str = X.length() == 0 ? null : X;
        boolean F = com.bumptech.glide.d.F(this, "com.pinterest.EXTRA_BLOCK_AUTOLOGIN");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_MAGIC_LINK", "key");
        ScreenDescription screenDescription = this.f76937a;
        if (screenDescription == null || (arguments = screenDescription.getF49207c()) == null) {
            arguments = getArguments();
        }
        if (arguments == null || !arguments.containsKey("com.pinterest.EXTRA_MAGIC_LINK")) {
            Bundle arguments3 = getArguments();
            if (arguments3 == null || !arguments3.containsKey("com.pinterest.EXTRA_MAGIC_LINK") ? (navigation = this.I) == null || (A0 = navigation.A0()) == null : (arguments2 = getArguments()) == null || (A0 = arguments2.getParcelable("com.pinterest.EXTRA_MAGIC_LINK")) == null) {
                A0 = null;
            }
        } else {
            A0 = arguments.getParcelable("com.pinterest.EXTRA_MAGIC_LINK");
        }
        Uri uri = A0 instanceof Uri ? (Uri) A0 : null;
        lh0.y1 b83 = b8();
        b60.b activeUserManager = getActiveUserManager();
        so.d0 d0Var = this.f139891y0;
        if (d0Var == null) {
            Intrinsics.r("magicLoginFactory");
            throw null;
        }
        lb0.q qVar2 = this.f139892z0;
        if (qVar2 != null) {
            return new zq1.j(g13, p73, qVar, aVar, cVar, aVar2, bVar, analyticsApi, m13, F, str, uri, b83, activeUserManager, d0Var, qVar2);
        }
        Intrinsics.r("prefsManagerPersisted");
        throw null;
    }

    public final lh0.y1 b8() {
        lh0.y1 y1Var = this.f139888v0;
        if (y1Var != null) {
            return y1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final br1.f0 c8() {
        return (br1.f0) this.O0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (bs1.c.o1(r0) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d8(gm1.c r6) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yq1.k.d8(gm1.c):void");
    }

    public final boolean e8() {
        try {
            PackageManager packageManager = requireContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Intrinsics.checkNotNullParameter(packageManager, "packageManager");
            Intrinsics.checkNotNullParameter("com.facebook.katana", "packageName");
            packageManager.getPackageInfo("com.facebook.katana", 1);
            return true;
        } catch (PackageManager.NameNotFoundException | DeadSystemException unused) {
            return false;
        }
    }

    public final void f8() {
        getAnalyticsApi().a("facebook_continue_button_click");
        zq1.a aVar = this.A0;
        if (aVar != null) {
            zq1.j jVar = (zq1.j) aVar;
            jVar.getPinalytics().X(h32.u0.FACEBOOK_CONNECT);
            jVar.q3(lr1.h.FacebookAuthenticationMethod, null);
        }
    }

    public final void g8() {
        getAnalyticsApi().a("gplus_button_continue_click");
        zq1.a aVar = this.A0;
        if (aVar != null) {
            zq1.j jVar = (zq1.j) aVar;
            jVar.getPinalytics().X(h32.u0.GPLUS_CONNECT);
            jVar.q3(lr1.h.GoogleUnifiedAuthMethod, null);
        }
    }

    public final vy.m getAnalyticsApi() {
        vy.m mVar = this.f139886t0;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.r("analyticsApi");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getD0() {
        return this.Q0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getC0() {
        return this.P0;
    }

    public final void h8() {
        getAnalyticsApi().a("line_button_continue_click");
        zq1.a aVar = this.A0;
        if (aVar != null) {
            zq1.j jVar = (zq1.j) aVar;
            jVar.getPinalytics().X(h32.u0.LINE_CONNECT);
            jVar.q3(lr1.h.LineAuthenticationMethod, null);
        }
    }

    public final void i8(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        GestaltTextField gestaltTextField = this.D0;
        if (gestaltTextField != null) {
            gestaltTextField.X(new dl1.i0(email, 9));
        } else {
            Intrinsics.r("userInputEt");
            throw null;
        }
    }

    public final void j8(boolean z13) {
        if (!z13) {
            ep.b.C(null, f7());
            return;
        }
        m60.w f73 = f7();
        mf0.l lVar = new mf0.l();
        lVar.f87125c0 = true;
        f73.d(new of0.a(lVar));
    }

    public final void k8(br1.f0 f0Var) {
        this.O0.setValue(f0Var);
    }

    public final void l8(String str) {
        GestaltTextField gestaltTextField = this.D0;
        if (gestaltTextField == null) {
            Intrinsics.r("userInputEt");
            throw null;
        }
        TextInputEditText o03 = gestaltTextField.o0();
        o03.requestFocus();
        o03.selectAll();
        hf0.b.k(o03);
        ph.a.p(gestaltTextField, new dl1.i0(str, 11));
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lh0.y1 b83 = b8();
        z3 z3Var = lh0.a4.f83297a;
        if (b83.g("control", z3Var)) {
            nx.d0.v(s7(), h32.f1.UNAUTH_EX_PRELOAD_CONTROL, null, false, 12);
        } else if (b8().g("enabled", z3Var)) {
            nx.d0.v(s7(), h32.f1.UNAUTH_EX_PRELOAD_ENABLED, null, false, 12);
        }
        this.E = vq1.c.fragment_authentication_landing;
        lh0.y1 b84 = b8();
        z3 activate = z3.ACTIVATE_EXPERIMENT;
        if (b84.a("enabled_animations", activate)) {
            k8(br1.f0.a(c8(), br1.f.PhaseOne, false, false, false, false, true, null, null, null, 958));
        } else if (b8().a("enabled_layout_fixes", activate)) {
            k8(br1.f0.a(c8(), null, true, true, true, true, true, null, null, null, 897));
        } else if (b8().a("enabled_all", activate)) {
            k8(br1.f0.a(c8(), br1.f.PhaseOne, true, true, true, true, true, null, null, null, 896));
        }
        lh0.y1 b85 = b8();
        Intrinsics.checkNotNullParameter("enabled_copy_one", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((lh0.g1) b85.f83514a).k("ap_activation_splash_screen_us_bytedance_copy_v1_android", "enabled_copy_one", activate)) {
            k8(br1.f0.a(c8(), null, false, false, false, false, false, u50.g0.b(new String[0], vq1.d.unauth_splash_header_variant_1_line_1), u50.g0.b(new String[0], vq1.d.unauth_splash_header_variant_1_line_2), u50.g0.b(new String[0], vq1.d.unauth_splash_header_variant_1_full_text), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK));
            return;
        }
        lh0.y1 b86 = b8();
        Intrinsics.checkNotNullParameter("enabled_copy_two", "group");
        Intrinsics.checkNotNullParameter(activate, "activate");
        if (((lh0.g1) b86.f83514a).k("ap_activation_splash_screen_us_bytedance_copy_v1_android", "enabled_copy_two", activate)) {
            k8(br1.f0.a(c8(), null, false, false, false, false, false, u50.g0.b(new String[0], vq1.d.unauth_splash_header_variant_2_line_1), u50.g0.b(new String[0], vq1.d.unauth_splash_header_variant_2_line_2), u50.g0.b(new String[0], vq1.d.unauth_splash_header_variant_2_full_text), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK));
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.remove("com.pinterest.EXTRA_BLOCK_AUTOLOGIN");
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            navigation.J0();
        }
        super.onDetach();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(vq1.b.loading_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.B0 = (PinterestLoadingLayout) findViewById;
        View findViewById2 = v13.findViewById(vq1.b.suggested_domains_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.C0 = (SuggestedDomainsView) findViewById2;
        View findViewById3 = v13.findViewById(vq1.b.email_address);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.D0 = (GestaltTextField) findViewById3;
        if (b8().b()) {
            View findViewById4 = v13.findViewById(vq1.b.gplus_social);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            this.E0 = (GestaltButtonSocial) findViewById4;
            View findViewById5 = v13.findViewById(vq1.b.facebook_social);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            this.F0 = (GestaltButtonSocial) findViewById5;
            View findViewById6 = v13.findViewById(vq1.b.line_social);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
            this.G0 = (GestaltButtonSocial) findViewById6;
        } else {
            View findViewById7 = v13.findViewById(vq1.b.gplus);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
            this.H0 = (GestaltButton) findViewById7;
            View findViewById8 = v13.findViewById(vq1.b.facebook);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
            this.I0 = (GestaltButton) findViewById8;
            View findViewById9 = v13.findViewById(vq1.b.line);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
            this.J0 = (GestaltButton) findViewById9;
        }
        if (!b8().b()) {
            GestaltButton gestaltButton = this.H0;
            if (gestaltButton == null) {
                Intrinsics.r("gplusBtGestalt");
                throw null;
            }
            bs1.c.s(gestaltButton, d.f139822j);
        }
        View findViewById10 = v13.findViewById(vq1.b.email_auto_correction_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.K0 = (GestaltText) findViewById10;
        PinterestLoadingLayout pinterestLoadingLayout = this.B0;
        if (pinterestLoadingLayout == null) {
            Intrinsics.r("loadingLayout");
            throw null;
        }
        final int i13 = 0;
        pinterestLoadingLayout.setVisibility(0);
        final int i14 = 1;
        if (b8().b()) {
            GestaltButtonSocial gestaltButtonSocial = this.E0;
            if (gestaltButtonSocial == null) {
                Intrinsics.r("gplusBtGestaltSocial");
                throw null;
            }
            gestaltButtonSocial.s(new gm1.a(this) { // from class: yq1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f139769b;

                {
                    this.f139769b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i13;
                    k this$0 = this.f139769b;
                    switch (i15) {
                        case 0:
                            int i16 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 1:
                            int i17 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 2:
                            int i18 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 3:
                            int i19 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "event");
                            if (it instanceof rn1.g) {
                                zq1.a aVar = this$0.A0;
                                if (aVar != null) {
                                    zq1.j jVar = (zq1.j) aVar;
                                    nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                    h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                    h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("authOption", jVar.f142699o);
                                    Unit unit = Unit.f80348a;
                                    nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                                }
                                androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                int i23 = vq1.b.fragment_wrapper;
                                wk2.a aVar2 = this$0.f139884r0;
                                if (aVar2 == null) {
                                    Intrinsics.r("recoverAccountFragmentProvider");
                                    throw null;
                                }
                                Object obj = aVar2.get();
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                mo1.c.c(supportFragmentManager, i23, (Fragment) obj, true, mo1.a.FADE, 32);
                                return;
                            }
                            return;
                        case 4:
                            int i24 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 5:
                            int i25 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 6:
                            int i26 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 7:
                            int i27 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 8:
                            int i28 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 9:
                            int i29 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        default:
                            int i33 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                    }
                }
            });
        } else {
            GestaltButton gestaltButton2 = this.H0;
            if (gestaltButton2 == null) {
                Intrinsics.r("gplusBtGestalt");
                throw null;
            }
            gestaltButton2.e(new gm1.a(this) { // from class: yq1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f139769b;

                {
                    this.f139769b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i15 = i14;
                    k this$0 = this.f139769b;
                    switch (i15) {
                        case 0:
                            int i16 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 1:
                            int i17 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 2:
                            int i18 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 3:
                            int i19 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "event");
                            if (it instanceof rn1.g) {
                                zq1.a aVar = this$0.A0;
                                if (aVar != null) {
                                    zq1.j jVar = (zq1.j) aVar;
                                    nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                    h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                    h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("authOption", jVar.f142699o);
                                    Unit unit = Unit.f80348a;
                                    nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                                }
                                androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                int i23 = vq1.b.fragment_wrapper;
                                wk2.a aVar2 = this$0.f139884r0;
                                if (aVar2 == null) {
                                    Intrinsics.r("recoverAccountFragmentProvider");
                                    throw null;
                                }
                                Object obj = aVar2.get();
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                mo1.c.c(supportFragmentManager, i23, (Fragment) obj, true, mo1.a.FADE, 32);
                                return;
                            }
                            return;
                        case 4:
                            int i24 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 5:
                            int i25 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 6:
                            int i26 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 7:
                            int i27 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 8:
                            int i28 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 9:
                            int i29 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        default:
                            int i33 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                    }
                }
            });
        }
        final int i15 = 2;
        ((GestaltTextField) v13.findViewById(vq1.b.email_address)).Z(new gm1.a(this) { // from class: yq1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f139769b;

            {
                this.f139769b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i15;
                k this$0 = this.f139769b;
                switch (i152) {
                    case 0:
                        int i16 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 1:
                        int i17 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 2:
                        int i18 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 3:
                        int i19 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.g) {
                            zq1.a aVar = this$0.A0;
                            if (aVar != null) {
                                zq1.j jVar = (zq1.j) aVar;
                                nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                HashMap hashMap = new HashMap();
                                hashMap.put("authOption", jVar.f142699o);
                                Unit unit = Unit.f80348a;
                                nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                            }
                            androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            int i23 = vq1.b.fragment_wrapper;
                            wk2.a aVar2 = this$0.f139884r0;
                            if (aVar2 == null) {
                                Intrinsics.r("recoverAccountFragmentProvider");
                                throw null;
                            }
                            Object obj = aVar2.get();
                            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            mo1.c.c(supportFragmentManager, i23, (Fragment) obj, true, mo1.a.FADE, 32);
                            return;
                        }
                        return;
                    case 4:
                        int i24 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 5:
                        int i25 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 6:
                        int i26 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 7:
                        int i27 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 8:
                        int i28 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 9:
                        int i29 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    default:
                        int i33 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                }
            }
        });
        ComposeView composeView = (ComposeView) v13.findViewById(vq1.b.unauth_splash_screen);
        p1.p1 p1Var = new p1.p1(this, 13);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(p1Var, true, -1291151285));
        View findViewById11 = v13.findViewById(vq1.b.facebook_deprecated_banner);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.L0 = (GestaltText) findViewById11;
        if (b8().f()) {
            GestaltText gestaltText = this.L0;
            if (gestaltText == null) {
                Intrinsics.r("facebookDeprecationBanner");
                throw null;
            }
            final int i16 = 3;
            gestaltText.j(new gm1.a(this) { // from class: yq1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f139769b;

                {
                    this.f139769b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i16;
                    k this$0 = this.f139769b;
                    switch (i152) {
                        case 0:
                            int i162 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 1:
                            int i17 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 2:
                            int i18 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 3:
                            int i19 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "event");
                            if (it instanceof rn1.g) {
                                zq1.a aVar = this$0.A0;
                                if (aVar != null) {
                                    zq1.j jVar = (zq1.j) aVar;
                                    nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                    h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                    h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("authOption", jVar.f142699o);
                                    Unit unit = Unit.f80348a;
                                    nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                                }
                                androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                int i23 = vq1.b.fragment_wrapper;
                                wk2.a aVar2 = this$0.f139884r0;
                                if (aVar2 == null) {
                                    Intrinsics.r("recoverAccountFragmentProvider");
                                    throw null;
                                }
                                Object obj2 = aVar2.get();
                                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                mo1.c.c(supportFragmentManager, i23, (Fragment) obj2, true, mo1.a.FADE, 32);
                                return;
                            }
                            return;
                        case 4:
                            int i24 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 5:
                            int i25 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 6:
                            int i26 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 7:
                            int i27 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 8:
                            int i28 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 9:
                            int i29 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        default:
                            int i33 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                    }
                }
            });
            gestaltText.i(new h(this, i15));
        }
        GestaltText gestaltText2 = (GestaltText) v13.findViewById(vq1.b.terms_tv);
        androidx.appcompat.widget.x xVar = this.f139890x0;
        if (xVar == null) {
            Intrinsics.r("termsAndPrivacyHelper");
            throw null;
        }
        Intrinsics.f(gestaltText2);
        xVar.r(gestaltText2, vq1.h.PERSONAL, true);
        final int i17 = 4;
        ((GestaltButton) v13.findViewById(vq1.b.continue_email_bt)).e(new gm1.a(this) { // from class: yq1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f139769b;

            {
                this.f139769b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i17;
                k this$0 = this.f139769b;
                switch (i152) {
                    case 0:
                        int i162 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 1:
                        int i172 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 2:
                        int i18 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 3:
                        int i19 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.g) {
                            zq1.a aVar = this$0.A0;
                            if (aVar != null) {
                                zq1.j jVar = (zq1.j) aVar;
                                nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                HashMap hashMap = new HashMap();
                                hashMap.put("authOption", jVar.f142699o);
                                Unit unit = Unit.f80348a;
                                nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                            }
                            androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            int i23 = vq1.b.fragment_wrapper;
                            wk2.a aVar2 = this$0.f139884r0;
                            if (aVar2 == null) {
                                Intrinsics.r("recoverAccountFragmentProvider");
                                throw null;
                            }
                            Object obj2 = aVar2.get();
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            mo1.c.c(supportFragmentManager, i23, (Fragment) obj2, true, mo1.a.FADE, 32);
                            return;
                        }
                        return;
                    case 4:
                        int i24 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 5:
                        int i25 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 6:
                        int i26 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 7:
                        int i27 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 8:
                        int i28 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 9:
                        int i29 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    default:
                        int i33 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                }
            }
        });
        if (b8().b()) {
            GestaltButtonSocial gestaltButtonSocial2 = this.F0;
            if (gestaltButtonSocial2 == null) {
                Intrinsics.r("facebookBtGestaltSocial");
                throw null;
            }
            kh2.b0.O(gestaltButtonSocial2, c.f139805m);
            if (b8().f()) {
                GestaltButtonSocial gestaltButtonSocial3 = this.F0;
                if (gestaltButtonSocial3 == null) {
                    Intrinsics.r("facebookBtGestaltSocial");
                    throw null;
                }
                kh2.b0.O(gestaltButtonSocial3, c.f139806n);
            } else {
                GestaltButtonSocial gestaltButtonSocial4 = this.F0;
                if (gestaltButtonSocial4 == null) {
                    Intrinsics.r("facebookBtGestaltSocial");
                    throw null;
                }
                final int i18 = 5;
                gestaltButtonSocial4.s(new gm1.a(this) { // from class: yq1.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k f139769b;

                    {
                        this.f139769b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i152 = i18;
                        k this$0 = this.f139769b;
                        switch (i152) {
                            case 0:
                                int i162 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 1:
                                int i172 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 2:
                                int i182 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 3:
                                int i19 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "event");
                                if (it instanceof rn1.g) {
                                    zq1.a aVar = this$0.A0;
                                    if (aVar != null) {
                                        zq1.j jVar = (zq1.j) aVar;
                                        nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                        h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                        h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("authOption", jVar.f142699o);
                                        Unit unit = Unit.f80348a;
                                        nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                                    }
                                    androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                    int i23 = vq1.b.fragment_wrapper;
                                    wk2.a aVar2 = this$0.f139884r0;
                                    if (aVar2 == null) {
                                        Intrinsics.r("recoverAccountFragmentProvider");
                                        throw null;
                                    }
                                    Object obj2 = aVar2.get();
                                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                    mo1.c.c(supportFragmentManager, i23, (Fragment) obj2, true, mo1.a.FADE, 32);
                                    return;
                                }
                                return;
                            case 4:
                                int i24 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 5:
                                int i25 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 6:
                                int i26 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 7:
                                int i27 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 8:
                                int i28 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 9:
                                int i29 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            default:
                                int i33 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                        }
                    }
                });
            }
            GestaltButtonSocial gestaltButtonSocial5 = this.G0;
            if (gestaltButtonSocial5 == null) {
                Intrinsics.r("lineBtGestaltSocial");
                throw null;
            }
            kh2.b0.O(gestaltButtonSocial5, new h(this, i14));
            final int i19 = 6;
            gestaltButtonSocial5.s(new gm1.a(this) { // from class: yq1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f139769b;

                {
                    this.f139769b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i19;
                    k this$0 = this.f139769b;
                    switch (i152) {
                        case 0:
                            int i162 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 1:
                            int i172 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 2:
                            int i182 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 3:
                            int i192 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "event");
                            if (it instanceof rn1.g) {
                                zq1.a aVar = this$0.A0;
                                if (aVar != null) {
                                    zq1.j jVar = (zq1.j) aVar;
                                    nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                    h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                    h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("authOption", jVar.f142699o);
                                    Unit unit = Unit.f80348a;
                                    nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                                }
                                androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                int i23 = vq1.b.fragment_wrapper;
                                wk2.a aVar2 = this$0.f139884r0;
                                if (aVar2 == null) {
                                    Intrinsics.r("recoverAccountFragmentProvider");
                                    throw null;
                                }
                                Object obj2 = aVar2.get();
                                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                mo1.c.c(supportFragmentManager, i23, (Fragment) obj2, true, mo1.a.FADE, 32);
                                return;
                            }
                            return;
                        case 4:
                            int i24 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 5:
                            int i25 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 6:
                            int i26 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 7:
                            int i27 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 8:
                            int i28 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 9:
                            int i29 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        default:
                            int i33 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                    }
                }
            });
        } else {
            GestaltButton gestaltButton3 = this.I0;
            if (gestaltButton3 == null) {
                Intrinsics.r("facebookBtGestalt");
                throw null;
            }
            bs1.c.s(gestaltButton3, d.f139823k);
            if (b8().f()) {
                GestaltButton gestaltButton4 = this.I0;
                if (gestaltButton4 == null) {
                    Intrinsics.r("facebookBtGestalt");
                    throw null;
                }
                bs1.c.s(gestaltButton4, c.f139804l);
            } else {
                GestaltButton gestaltButton5 = this.I0;
                if (gestaltButton5 == null) {
                    Intrinsics.r("facebookBtGestalt");
                    throw null;
                }
                bs1.c.s(gestaltButton5, d.f139824l);
                final int i23 = 7;
                gestaltButton5.e(new gm1.a(this) { // from class: yq1.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ k f139769b;

                    {
                        this.f139769b = this;
                    }

                    @Override // gm1.a
                    public final void h3(gm1.c it) {
                        int i152 = i23;
                        k this$0 = this.f139769b;
                        switch (i152) {
                            case 0:
                                int i162 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 1:
                                int i172 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 2:
                                int i182 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 3:
                                int i192 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "event");
                                if (it instanceof rn1.g) {
                                    zq1.a aVar = this$0.A0;
                                    if (aVar != null) {
                                        zq1.j jVar = (zq1.j) aVar;
                                        nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                        h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                        h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("authOption", jVar.f142699o);
                                        Unit unit = Unit.f80348a;
                                        nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                                    }
                                    androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                    int i232 = vq1.b.fragment_wrapper;
                                    wk2.a aVar2 = this$0.f139884r0;
                                    if (aVar2 == null) {
                                        Intrinsics.r("recoverAccountFragmentProvider");
                                        throw null;
                                    }
                                    Object obj2 = aVar2.get();
                                    Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                    mo1.c.c(supportFragmentManager, i232, (Fragment) obj2, true, mo1.a.FADE, 32);
                                    return;
                                }
                                return;
                            case 4:
                                int i24 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 5:
                                int i25 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 6:
                                int i26 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 7:
                                int i27 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 8:
                                int i28 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            case 9:
                                int i29 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                            default:
                                int i33 = k.R0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                Intrinsics.checkNotNullParameter(it, "it");
                                this$0.d8(it);
                                return;
                        }
                    }
                });
            }
            GestaltButton gestaltButton6 = this.J0;
            if (gestaltButton6 == null) {
                Intrinsics.r("lineBtGestalt");
                throw null;
            }
            bs1.c.s(gestaltButton6, new j(this, i14));
            final int i24 = 8;
            gestaltButton6.e(new gm1.a(this) { // from class: yq1.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f139769b;

                {
                    this.f139769b = this;
                }

                @Override // gm1.a
                public final void h3(gm1.c it) {
                    int i152 = i24;
                    k this$0 = this.f139769b;
                    switch (i152) {
                        case 0:
                            int i162 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 1:
                            int i172 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 2:
                            int i182 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 3:
                            int i192 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "event");
                            if (it instanceof rn1.g) {
                                zq1.a aVar = this$0.A0;
                                if (aVar != null) {
                                    zq1.j jVar = (zq1.j) aVar;
                                    nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                    h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                    h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("authOption", jVar.f142699o);
                                    Unit unit = Unit.f80348a;
                                    nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                                }
                                androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                int i232 = vq1.b.fragment_wrapper;
                                wk2.a aVar2 = this$0.f139884r0;
                                if (aVar2 == null) {
                                    Intrinsics.r("recoverAccountFragmentProvider");
                                    throw null;
                                }
                                Object obj2 = aVar2.get();
                                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                mo1.c.c(supportFragmentManager, i232, (Fragment) obj2, true, mo1.a.FADE, 32);
                                return;
                            }
                            return;
                        case 4:
                            int i242 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 5:
                            int i25 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 6:
                            int i26 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 7:
                            int i27 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 8:
                            int i28 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        case 9:
                            int i29 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                        default:
                            int i33 = k.R0;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.d8(it);
                            return;
                    }
                }
            });
        }
        GestaltText gestaltText3 = this.K0;
        if (gestaltText3 == null) {
            Intrinsics.r("emailAutoCorrectionTv");
            throw null;
        }
        final int i25 = 9;
        gestaltText3.j(new gm1.a(this) { // from class: yq1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f139769b;

            {
                this.f139769b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i25;
                k this$0 = this.f139769b;
                switch (i152) {
                    case 0:
                        int i162 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 1:
                        int i172 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 2:
                        int i182 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 3:
                        int i192 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.g) {
                            zq1.a aVar = this$0.A0;
                            if (aVar != null) {
                                zq1.j jVar = (zq1.j) aVar;
                                nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                HashMap hashMap = new HashMap();
                                hashMap.put("authOption", jVar.f142699o);
                                Unit unit = Unit.f80348a;
                                nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                            }
                            androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            int i232 = vq1.b.fragment_wrapper;
                            wk2.a aVar2 = this$0.f139884r0;
                            if (aVar2 == null) {
                                Intrinsics.r("recoverAccountFragmentProvider");
                                throw null;
                            }
                            Object obj2 = aVar2.get();
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            mo1.c.c(supportFragmentManager, i232, (Fragment) obj2, true, mo1.a.FADE, 32);
                            return;
                        }
                        return;
                    case 4:
                        int i242 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 5:
                        int i252 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 6:
                        int i26 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 7:
                        int i27 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 8:
                        int i28 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 9:
                        int i29 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    default:
                        int i33 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                }
            }
        });
        SuggestedDomainsView suggestedDomainsView = this.C0;
        if (suggestedDomainsView == null) {
            Intrinsics.r("suggestedDomainsView");
            throw null;
        }
        bs1.c.X0(suggestedDomainsView);
        SuggestedDomainsView suggestedDomainsView2 = this.C0;
        if (suggestedDomainsView2 == null) {
            Intrinsics.r("suggestedDomainsView");
            throw null;
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "also(...)");
        suggestedDomainsView2.a(country);
        SuggestedDomainsView suggestedDomainsView3 = this.C0;
        if (suggestedDomainsView3 == null) {
            Intrinsics.r("suggestedDomainsView");
            throw null;
        }
        j clickHandler = new j(this, i13);
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        suggestedDomainsView3.f49829b.f23778e = clickHandler;
        GestaltTextField gestaltTextField = this.D0;
        if (gestaltTextField == null) {
            Intrinsics.r("userInputEt");
            throw null;
        }
        final int i26 = 10;
        gestaltTextField.Z(new gm1.a(this) { // from class: yq1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f139769b;

            {
                this.f139769b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i152 = i26;
                k this$0 = this.f139769b;
                switch (i152) {
                    case 0:
                        int i162 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 1:
                        int i172 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 2:
                        int i182 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 3:
                        int i192 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof rn1.g) {
                            zq1.a aVar = this$0.A0;
                            if (aVar != null) {
                                zq1.j jVar = (zq1.j) aVar;
                                nx.d0 d0Var = jVar.getPresenterPinalytics().f122379a;
                                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                                h32.f1 f1Var = h32.f1.UNAUTH_ACCOUNT_RECOVERY_FB_BANNER_CLICK;
                                h32.g0 g0Var = h32.g0.RECOVER_ACCOUNT_VIEW;
                                HashMap hashMap = new HashMap();
                                hashMap.put("authOption", jVar.f142699o);
                                Unit unit = Unit.f80348a;
                                nx.d0.B(d0Var, f1Var, g0Var, null, hashMap, 20);
                            }
                            androidx.fragment.app.w0 supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            int i232 = vq1.b.fragment_wrapper;
                            wk2.a aVar2 = this$0.f139884r0;
                            if (aVar2 == null) {
                                Intrinsics.r("recoverAccountFragmentProvider");
                                throw null;
                            }
                            Object obj2 = aVar2.get();
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            mo1.c.c(supportFragmentManager, i232, (Fragment) obj2, true, mo1.a.FADE, 32);
                            return;
                        }
                        return;
                    case 4:
                        int i242 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 5:
                        int i252 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 6:
                        int i262 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 7:
                        int i27 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 8:
                        int i28 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    case 9:
                        int i29 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                    default:
                        int i33 = k.R0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.d8(it);
                        return;
                }
            }
        });
        GestaltTextField gestaltTextField2 = this.D0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("userInputEt");
            throw null;
        }
        gestaltTextField2.addOnLayoutChangeListener(new i());
        super.onViewCreated(v13, bundle);
        lh0.y1 b83 = b8();
        z3 z3Var = lh0.a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) b83.f83514a;
        if (g1Var.o("ppm_unauth_preload_gate", "enabled", z3Var) || g1Var.l("ppm_unauth_preload_gate")) {
            androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), ao2.v0.f20219a, null, new g(this, null), 2);
        }
    }
}
