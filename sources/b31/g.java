package b31;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.i3;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import h32.a4;
import h32.d4;
import kh2.k3;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import q5.x;
import rm1.q;
import rq.o3;
import so.t1;
import w01.e0;
import yk1.i;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb31/g;", "Lyk1/k;", "Lz21/b;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class g extends a implements z21.b {
    public static final /* synthetic */ int N0 = 0;
    public GestaltText A0;
    public GestaltText B0;
    public GestaltText C0;
    public GestaltButton D0;
    public RelativeLayout E0;
    public WebImageView F0;
    public GestaltText G0;
    public GestaltText H0;
    public GestaltButton I0;
    public View J0;
    public z21.a K0;
    public boolean L0;
    public final d4 M0 = d4.ABOUT_DRAWER;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f21438j0;

    /* renamed from: k0, reason: collision with root package name */
    public t1 f21439k0;

    /* renamed from: l0, reason: collision with root package name */
    public GestaltSpinner f21440l0;

    /* renamed from: m0, reason: collision with root package name */
    public ScrollView f21441m0;

    /* renamed from: n0, reason: collision with root package name */
    public HorizontalScrollView f21442n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltDivider f21443o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltIconButton f21444p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltText f21445q0;

    /* renamed from: r0, reason: collision with root package name */
    public LinearLayout f21446r0;

    /* renamed from: s0, reason: collision with root package name */
    public GestaltIconButton f21447s0;

    /* renamed from: t0, reason: collision with root package name */
    public LinearLayout f21448t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltIconButton f21449u0;

    /* renamed from: v0, reason: collision with root package name */
    public LinearLayout f21450v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltIconButton f21451w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltText f21452x0;

    /* renamed from: y0, reason: collision with root package name */
    public GestaltText f21453y0;

    /* renamed from: z0, reason: collision with root package name */
    public GestaltText f21454z0;

    public static final SpannableStringBuilder b8(g gVar, String str) {
        gVar.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        o3 o3Var = new o3(gVar, 3);
        spannableStringBuilder.append((CharSequence) str);
        Context requireContext = gVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        f0.h.m(requireContext, spannableStringBuilder, 0, str.length(), o3Var);
        return spannableStringBuilder;
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Intrinsics.f(navigation);
        Object i03 = navigation.i0("com.pinterest.EXTRAS_PROFILE_DISPLAY");
        r41.e eVar = i03 instanceof r41.e ? (r41.e) i03 : null;
        if (eVar == null) {
            eVar = r41.e.Pinner;
        }
        if (eVar != null) {
            this.L0 = eVar == r41.e.Business;
        } else {
            Intrinsics.r("profileDisplay");
            throw null;
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        BitmapDrawable bitmapDrawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin_one_and_a_half);
        q qVar = q.CANCEL;
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        Context context = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = gestaltToolbarImpl.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int drawableRes = qVar.drawableRes(context, dl2.b.f1(context2));
        Context context3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(context3, "requireContext(...)");
        int i13 = eo1.b.color_themed_icon_default;
        Intrinsics.checkNotNullParameter(context3, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context3.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context3, "context");
        if (drawable2 != null) {
            drawable = sh.f.d(i13 == 0 ? context3.getColor(df0.a.f54892a) : context3.getColor(i13), context3, drawable2);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bitmapDrawable = d7.b.p0(drawable, resources, dimensionPixelSize, dimensionPixelSize);
        } else {
            bitmapDrawable = null;
        }
        String string = getString(x0.cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gestaltToolbarImpl.T(bitmapDrawable, string);
        if (e8()) {
            GestaltButton gestaltButton = this.D0;
            if (gestaltButton != null) {
                gestaltToolbarImpl.c(gestaltButton);
            } else {
                Intrinsics.r("editButton");
                throw null;
            }
        }
    }

    @Override // yk1.k
    public final m V7() {
        t1 t1Var = this.f21439k0;
        if (t1Var == null) {
            Intrinsics.r("profileAboutDrawerPresenterFactory");
            throw null;
        }
        String d83 = d8();
        boolean e83 = e8();
        boolean z13 = this.L0;
        uk1.e eVar = this.f21438j0;
        if (eVar != null) {
            return t1Var.a(d83, e83, z13, ((uk1.a) eVar).d(d8()));
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final void c8() {
        d7.g.s(Navigation.w1(i3.a()), f7());
    }

    public final String d8() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_USER_ID") : null;
        return v03 == null ? "" : v03;
    }

    public final boolean e8() {
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        return f13 != null && dl2.b.S1(f13, d8());
    }

    public final void f8(nk1.h followState) {
        Intrinsics.checkNotNullParameter(followState, "followState");
        if (followState == nk1.h.FOLLOWING) {
            GestaltIconButton gestaltIconButton = this.f21444p0;
            if (gestaltIconButton == null) {
                Intrinsics.r("followUserIcon");
                throw null;
            }
            gestaltIconButton.t(e.f21429m);
            GestaltText gestaltText = this.f21445q0;
            if (gestaltText == null) {
                Intrinsics.r("followUserIconText");
                throw null;
            }
            gestaltText.i(e.f21430n);
            GestaltButton gestaltButton = this.I0;
            if (gestaltButton != null) {
                gestaltButton.d(e.f21431o);
                return;
            } else {
                Intrinsics.r("toastFollowButton");
                throw null;
            }
        }
        if (followState == nk1.h.NOT_FOLLOWING) {
            GestaltIconButton gestaltIconButton2 = this.f21444p0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("followUserIcon");
                throw null;
            }
            gestaltIconButton2.t(e.f21432p);
            GestaltText gestaltText2 = this.f21445q0;
            if (gestaltText2 == null) {
                Intrinsics.r("followUserIconText");
                throw null;
            }
            gestaltText2.i(e.f21433q);
            GestaltButton gestaltButton2 = this.I0;
            if (gestaltButton2 != null) {
                gestaltButton2.d(e.f21434r);
            } else {
                Intrinsics.r("toastFollowButton");
                throw null;
            }
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF35260t() {
        return e8() ? a4.USER_SELF : a4.USER_OTHERS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF35259s() {
        return this.M0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = nz1.d.fragment_profile_about_drawer;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(nz1.c.loading_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f21440l0 = (GestaltSpinner) findViewById;
        View findViewById2 = onCreateView.findViewById(nz1.c.about_drawer_scroll_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f21441m0 = (ScrollView) findViewById2;
        View findViewById3 = onCreateView.findViewById(nz1.c.action_items_scroll_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f21442n0 = (HorizontalScrollView) findViewById3;
        View findViewById4 = onCreateView.findViewById(nz1.c.divider);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f21443o0 = (GestaltDivider) findViewById4;
        View findViewById5 = onCreateView.findViewById(nz1.c.follow_user_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f21444p0 = (GestaltIconButton) findViewById5;
        View findViewById6 = onCreateView.findViewById(nz1.c.follower_user_action_item_text);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f21445q0 = (GestaltText) findViewById6;
        View findViewById7 = onCreateView.findViewById(nz1.c.message_user_action_item_container);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f21446r0 = (LinearLayout) findViewById7;
        View findViewById8 = onCreateView.findViewById(nz1.c.message_user_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f21447s0 = (GestaltIconButton) findViewById8;
        View findViewById9 = onCreateView.findViewById(nz1.c.call_user_action_item_container);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f21448t0 = (LinearLayout) findViewById9;
        View findViewById10 = onCreateView.findViewById(nz1.c.call_user_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f21449u0 = (GestaltIconButton) findViewById10;
        View findViewById11 = onCreateView.findViewById(nz1.c.email_user_action_item_container);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f21450v0 = (LinearLayout) findViewById11;
        View findViewById12 = onCreateView.findViewById(nz1.c.email_user_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f21451w0 = (GestaltIconButton) findViewById12;
        View findViewById13 = onCreateView.findViewById(nz1.c.verified_merchant_view);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f21452x0 = (GestaltText) findViewById13;
        View findViewById14 = onCreateView.findViewById(nz1.c.website_url_view);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.f21453y0 = (GestaltText) findViewById14;
        View findViewById15 = onCreateView.findViewById(nz1.c.followers_view);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.f21454z0 = (GestaltText) findViewById15;
        View findViewById16 = onCreateView.findViewById(nz1.c.following_count_view);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.A0 = (GestaltText) findViewById16;
        View findViewById17 = onCreateView.findViewById(nz1.c.location_view);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.C0 = (GestaltText) findViewById17;
        View findViewById18 = onCreateView.findViewById(nz1.c.about_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        this.B0 = (GestaltText) findViewById18;
        View findViewById19 = onCreateView.findViewById(nz1.c.about_drawer_follow_cta_toast);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.E0 = (RelativeLayout) findViewById19;
        View findViewById20 = onCreateView.findViewById(nz1.c.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.F0 = (WebImageView) findViewById20;
        View findViewById21 = onCreateView.findViewById(nz1.c.user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.G0 = (GestaltText) findViewById21;
        View findViewById22 = onCreateView.findViewById(nz1.c.user_follower_count);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.H0 = (GestaltText) findViewById22;
        View findViewById23 = onCreateView.findViewById(nz1.c.follow_btn);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        this.I0 = (GestaltButton) findViewById23;
        View findViewById24 = onCreateView.findViewById(nz1.c.about_drawer_overlay);
        findViewById24.setAlpha(0.0f);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "apply(...)");
        this.J0 = findViewById24;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int i13 = 2;
        this.D0 = new GestaltButton.SmallSecondaryButton(6, requireContext, (AttributeSet) null).d(e.f21427k).e(new b(this, i13));
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(nz1.c.bottom_sheet_view);
        int i14 = 0;
        if (relativeLayout != null) {
            ca2.e eVar = new ca2.e(false, new k90.a(this, i13), 0, 0, null, 0, null, new bh.b(s7(), new e0(this, 13)), false, false, 892);
            eVar.m(relativeLayout);
            BottomSheetBehavior d2 = eVar.d();
            if (d2 != null) {
                d2.R(false);
            }
            x.a(relativeLayout, new s.f(relativeLayout, eVar, this, 23, 0));
        }
        ScrollView scrollView = this.f21441m0;
        if (scrollView != null) {
            scrollView.setOnScrollChangeListener(new c(this, i14));
            return onCreateView;
        }
        Intrinsics.r("aboutDrawerScrollContainer");
        throw null;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ScrollView scrollView = this.f21441m0;
        if (scrollView == null) {
            Intrinsics.r("aboutDrawerScrollContainer");
            throw null;
        }
        scrollView.setOnScrollChangeListener(null);
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        FragmentActivity E4;
        if (this.L0 && (E4 = E4()) != null) {
            k3.W1(E4);
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity E4;
        super.onResume();
        if (!this.L0 || (E4 = E4()) == null) {
            return;
        }
        k3.N1(E4);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (e8()) {
            HorizontalScrollView horizontalScrollView = this.f21442n0;
            if (horizontalScrollView == null) {
                Intrinsics.r("aboutDrawerActionItemsContainer");
                throw null;
            }
            bs1.c.X0(horizontalScrollView);
            GestaltDivider gestaltDivider = this.f21443o0;
            if (gestaltDivider == null) {
                Intrinsics.r("actionItemsDivider");
                throw null;
            }
            j1.A0(gestaltDivider);
        } else {
            HorizontalScrollView horizontalScrollView2 = this.f21442n0;
            if (horizontalScrollView2 == null) {
                Intrinsics.r("aboutDrawerActionItemsContainer");
                throw null;
            }
            bs1.c.U1(horizontalScrollView2);
            GestaltDivider gestaltDivider2 = this.f21443o0;
            if (gestaltDivider2 == null) {
                Intrinsics.r("actionItemsDivider");
                throw null;
            }
            j1.W1(gestaltDivider2);
        }
        GestaltIconButton gestaltIconButton = this.f21444p0;
        if (gestaltIconButton == null) {
            Intrinsics.r("followUserIcon");
            throw null;
        }
        gestaltIconButton.u(new b(this, 0));
        GestaltButton gestaltButton = this.I0;
        if (gestaltButton != null) {
            gestaltButton.e(new b(this, 1));
        } else {
            Intrinsics.r("toastFollowButton");
            throw null;
        }
    }

    @Override // yk1.n
    public final void setLoadState(i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GestaltSpinner gestaltSpinner = this.f21440l0;
        if (gestaltSpinner != null) {
            s0.w(gestaltSpinner, new qv0.f(state, 1));
        } else {
            Intrinsics.r("loadingSpinner");
            throw null;
        }
    }
}
