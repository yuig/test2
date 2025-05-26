package a41;

import a.cb;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.c2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.base.LockableViewPager;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.profile.lego.header.view.LegoUserProfileHeader;
import com.pinterest.gestalt.animation.FlingBehavior;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.actionbar.LegoActionBar;
import com.pinterest.ui.grid.NestedCoordinatorLayout;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh2.a1;
import kh2.j1;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.u2;
import lh0.z3;
import m60.x0;
import rq.t0;
import so.a2;
import so.w1;
import so.x1;
import y01.p1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"La41/r;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "La41/t;", "La41/p0;", "Loc2/j;", "Lcom/pinterest/framework/screens/k;", "<init>", "()V", "l3/c", "a41/f", "profile_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"SetPaddingUsageIssue"})
/* loaded from: classes2.dex */
public final class r extends a<t> implements p0, com.pinterest.framework.screens.k {
    public static final /* synthetic */ int P1 = 0;
    public so.v A0;
    public final xk2.k A1;
    public u2 B0;
    public final xk2.k B1;
    public zp.j C0;
    public final xk2.k C1;
    public a2 D0;
    public final xk2.k D1;
    public lb0.r E0;
    public final xk2.k E1;
    public c2 F0;
    public final xk2.k F1;
    public rg0.s G0;
    public final xk2.k G1;
    public g70.h H0;
    public final xk2.k H1;
    public CoordinatorLayout I0;
    public final xk2.k I1;
    public AppBarLayout J0;
    public Function0 J1;
    public PinterestSwipeRefreshLayout K0;
    public Function0 K1;
    public CollapsingToolbarLayout L0;
    public boolean L1;
    public RelativeLayout M0;
    public final m M1;
    public GestaltIconButton N0;
    public final m1 N1;
    public GestaltIconButton O0;
    public final d4 O1;
    public GestaltIconButton P0;
    public GestaltButton Q0;
    public LegoUserProfileHeader R0;
    public UserProfileHeader S0;
    public LegoActionBar T0;
    public LinearLayout U0;
    public GestaltTabLayout V0;
    public FrameLayout W0;
    public GestaltText X0;
    public RelativeLayout Y0;
    public ViewGroup Z0;

    /* renamed from: a1, reason: collision with root package name */
    public GestaltAvatar f646a1;

    /* renamed from: b1, reason: collision with root package name */
    public View f647b1;

    /* renamed from: c1, reason: collision with root package name */
    public GestaltIconButton f648c1;

    /* renamed from: d1, reason: collision with root package name */
    public View f649d1;

    /* renamed from: e1, reason: collision with root package name */
    public GestaltIconButton f650e1;

    /* renamed from: f1, reason: collision with root package name */
    public GestaltIconButton f651f1;

    /* renamed from: g1, reason: collision with root package name */
    public GestaltStaticSearchBar f652g1;

    /* renamed from: h1, reason: collision with root package name */
    public GestaltText f653h1;

    /* renamed from: i1, reason: collision with root package name */
    public GestaltText f654i1;

    /* renamed from: j1, reason: collision with root package name */
    public i41.d f655j1;

    /* renamed from: k1, reason: collision with root package name */
    public ur0.e f656k1;

    /* renamed from: n1, reason: collision with root package name */
    public o0 f659n1;

    /* renamed from: r0, reason: collision with root package name */
    public yk1.v f663r0;

    /* renamed from: r1, reason: collision with root package name */
    public final xk2.k f664r1;

    /* renamed from: s0, reason: collision with root package name */
    public yk1.j f665s0;

    /* renamed from: s1, reason: collision with root package name */
    public final xk2.k f666s1;

    /* renamed from: t0, reason: collision with root package name */
    public i92.k f667t0;

    /* renamed from: t1, reason: collision with root package name */
    public l0 f668t1;

    /* renamed from: u0, reason: collision with root package name */
    public zf0.f f669u0;

    /* renamed from: u1, reason: collision with root package name */
    public long f670u1;

    /* renamed from: v0, reason: collision with root package name */
    public hf0.c f671v0;

    /* renamed from: v1, reason: collision with root package name */
    public boolean f672v1;

    /* renamed from: w0, reason: collision with root package name */
    public a11.d f673w0;

    /* renamed from: w1, reason: collision with root package name */
    public boolean f674w1;

    /* renamed from: x0, reason: collision with root package name */
    public uk1.e f675x0;

    /* renamed from: x1, reason: collision with root package name */
    public final HashSet f676x1;

    /* renamed from: y0, reason: collision with root package name */
    public w1 f677y0;

    /* renamed from: y1, reason: collision with root package name */
    public final xk2.k f678y1;

    /* renamed from: z0, reason: collision with root package name */
    public x1 f679z0;

    /* renamed from: z1, reason: collision with root package name */
    public final xk2.k f680z1;

    /* renamed from: l1, reason: collision with root package name */
    public final Handler f657l1 = new Handler();

    /* renamed from: m1, reason: collision with root package name */
    public k0 f658m1 = k0.Expanded;

    /* renamed from: o1, reason: collision with root package name */
    public final int[] f660o1 = {0, 0};

    /* renamed from: p1, reason: collision with root package name */
    public final int[] f661p1 = {0, 0};

    /* renamed from: q1, reason: collision with root package name */
    public final int[] f662q1 = {0, 0};

    public r() {
        xk2.n nVar = xk2.n.NONE;
        this.f664r1 = xk2.m.a(nVar, new h(this, 13));
        this.f666s1 = xk2.m.a(nVar, new h(this, 0));
        this.f676x1 = new HashSet();
        this.f678y1 = xk2.m.a(nVar, new h(this, 4));
        this.f680z1 = xk2.m.a(nVar, new h(this, 12));
        this.A1 = xk2.m.a(nVar, new h(this, 17));
        this.B1 = xk2.m.a(nVar, new h(this, 14));
        this.C1 = xk2.m.a(nVar, new h(this, 15));
        this.D1 = xk2.m.a(nVar, new h(this, 10));
        this.E1 = xk2.m.a(nVar, new h(this, 3));
        this.F1 = xk2.m.a(nVar, new h(this, 2));
        this.G1 = xk2.m.a(nVar, new h(this, 1));
        this.H1 = xk2.m.a(nVar, new h(this, 5));
        this.I1 = xk2.m.a(nVar, new h(this, 16));
        this.J1 = o.f637j;
        this.K1 = o.f638k;
        this.M1 = new m(this);
        int i13 = 19;
        xk2.k a13 = xk2.m.a(nVar, new uv0.f(i13, new kl0.w(this, i13)));
        int i14 = 20;
        this.N1 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(y31.p0.class), new ml0.v(a13, i13), new kl0.x(null, a13, i14), new kl0.y(this, a13, i14));
        this.O1 = d4.USER;
    }

    public static void C8(GestaltIconButton gestaltIconButton, f0 f0Var) {
        gestaltIconButton.t(new p1(f0Var, 26));
        ViewGroup.LayoutParams layoutParams = gestaltIconButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = f0Var.f591c;
        gestaltIconButton.setLayoutParams(marginLayoutParams);
        gestaltIconButton.u(new lq0.o(21, gestaltIconButton, f0Var));
    }

    public static void D8(View view, boolean z13, boolean z14) {
        if (!z13) {
            if (view.getVisibility() == 0) {
                bs1.c.X0(view);
            }
        } else if (z14 && !t8(view)) {
            bs1.c.U1(view);
        } else {
            if (z14 || !t8(view)) {
                return;
            }
            bs1.c.X0(view);
        }
    }

    public static boolean t8(View view) {
        return view.getVisibility() == 0 && view.getAlpha() > 0.0f;
    }

    public static void w8(ViewGroup viewGroup, h hVar) {
        viewGroup.setAlpha(f.FadeIn.getStartAlpha());
        bs1.c.X0(viewGroup);
        viewGroup.setOnClickListener(new t0(24, hVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static u32.i y8(String str) {
        switch (str.hashCode()) {
            case -1383797171:
                if (str.equals("boards")) {
                    return u32.i.BOARDS;
                }
                return null;
            case -632094656:
                if (str.equals("collages")) {
                    return u32.i.COLLAGES;
                }
                return null;
            case 3441022:
                if (str.equals("pins")) {
                    return u32.i.PINS;
                }
                return null;
            case 109211271:
                if (str.equals("saved")) {
                    return u32.i.SAVED;
                }
                return null;
            case 1028554472:
                if (str.equals("created")) {
                    return u32.i.CREATED;
                }
                return null;
            default:
                return null;
        }
    }

    public final void A8(boolean z13) {
        AppBarLayout appBarLayout = this.J0;
        if (appBarLayout == null) {
            Intrinsics.r("container");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
        CoordinatorLayout.Behavior behavior = cVar != null ? cVar.f17900a : null;
        FlingBehavior flingBehavior = behavior instanceof FlingBehavior ? (FlingBehavior) behavior : null;
        if (flingBehavior != null) {
            flingBehavior.W(z13);
        }
        ArrayList t13 = ((t) a8()).t();
        Intrinsics.checkNotNullExpressionValue(t13, "<get-fragments>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = t13.iterator();
        while (it.hasNext()) {
            View view = ((Fragment) it.next()).getView();
            NestedCoordinatorLayout nestedCoordinatorLayout = view instanceof NestedCoordinatorLayout ? (NestedCoordinatorLayout) view : null;
            if (nestedCoordinatorLayout != null) {
                arrayList.add(nestedCoordinatorLayout);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NestedCoordinatorLayout) it2.next()).setNestedScrollingEnabled(z13);
        }
        ArrayList t14 = ((t) a8()).t();
        Intrinsics.checkNotNullExpressionValue(t14, "<get-fragments>(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = t14.iterator();
        while (it3.hasNext()) {
            ComponentCallbacks componentCallbacks = (Fragment) it3.next();
            b bVar = componentCallbacks instanceof b ? (b) componentCallbacks : null;
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            b bVar2 = (b) it4.next();
            if (z13) {
                View view2 = ((gq0.d) bVar2).getView();
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup != null) {
                    gq0.d.h9(viewGroup, true);
                }
            } else {
                View view3 = ((gq0.d) bVar2).getView();
                ViewGroup viewGroup2 = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                if (viewGroup2 != null) {
                    gq0.d.h9(viewGroup2, false);
                }
            }
        }
    }

    public final void B8(z92.c actionBarState) {
        Intrinsics.checkNotNullParameter(actionBarState, "actionBarState");
        if (actionBarState instanceof z92.a) {
            z92.a aVar = (z92.a) actionBarState;
            if (!aVar.e()) {
                LegoActionBar legoActionBar = this.T0;
                if (legoActionBar != null) {
                    bs1.c.X0(legoActionBar);
                    return;
                } else {
                    Intrinsics.r("followActionBar");
                    throw null;
                }
            }
            LegoActionBar legoActionBar2 = this.T0;
            if (legoActionBar2 == null) {
                Intrinsics.r("followActionBar");
                throw null;
            }
            z92.g a13 = aVar.a();
            if (a13 != null) {
                legoActionBar2.h(a13);
            }
            z92.g c13 = aVar.c();
            if (c13 != null) {
                legoActionBar2.j(c13);
            }
            z92.d b13 = aVar.b();
            if (b13 != null) {
                legoActionBar2.i(b13);
            }
            z92.d d2 = aVar.d();
            if (d2 != null) {
                legoActionBar2.k(d2);
            }
            bs1.c.U1(legoActionBar2);
            return;
        }
        if (actionBarState instanceof z92.b) {
            z92.b bVar = (z92.b) actionBarState;
            LinearLayout linearLayout = this.U0;
            if (linearLayout == null) {
                Intrinsics.r("newActionBar");
                throw null;
            }
            linearLayout.removeAllViews();
            for (z92.d dVar : bVar.a()) {
                LinearLayout linearLayout2 = this.U0;
                if (linearLayout2 == null) {
                    Intrinsics.r("newActionBar");
                    throw null;
                }
                if (linearLayout2.getChildCount() > 0) {
                    LinearLayout linearLayout3 = this.U0;
                    if (linearLayout3 == null) {
                        Intrinsics.r("newActionBar");
                        throw null;
                    }
                    View view = new View(requireContext());
                    view.setLayoutParams(new LinearLayout.LayoutParams(view.getResources().getDimensionPixelSize(eo1.c.space_200), -1));
                    linearLayout3.addView(view);
                }
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                GestaltButton gestaltButton = new GestaltButton(0, 14, requireContext, (AttributeSet) null);
                int a14 = dVar.a();
                int b14 = dVar.b();
                int c14 = dVar.c();
                int d13 = dVar.d();
                Function0 e13 = dVar.e();
                gestaltButton.d(new zx0.d(c14, 12));
                Context requireContext2 = requireContext();
                Object obj = d5.a.f53679a;
                gestaltButton.setBackgroundTintList(ColorStateList.valueOf(requireContext2.getColor(a14)));
                gestaltButton.setTextColor(requireContext().getColor(b14));
                gestaltButton.setContentDescription(gestaltButton.getResources().getString(c14));
                gestaltButton.setMinWidth(gestaltButton.getResources().getDimensionPixelSize(m60.r0.lego_action_bar_primary_button_min_width));
                gestaltButton.setId(d13);
                j1.o1(gestaltButton, 1);
                gestaltButton.e(new defpackage.a(20, e13));
                gestaltButton.setGravity(17);
                LinearLayout linearLayout4 = this.U0;
                if (linearLayout4 == null) {
                    Intrinsics.r("newActionBar");
                    throw null;
                }
                linearLayout4.addView(gestaltButton);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E8(android.view.View r14, a41.f r15) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a41.r.E8(android.view.View, a41.f):void");
    }

    public final void F8(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (n8()) {
            kh2.j.x2((y31.p0) this.N1.getValue(), new y31.z(user));
            return;
        }
        i41.d dVar = this.f655j1;
        if (dVar != null) {
            dVar.s3(user);
        }
    }

    public final void G8(c92.n media) {
        Intrinsics.checkNotNullParameter(media, "media");
        if (n8()) {
            ((l82.c) ((y31.p0) this.N1.getValue()).c()).a(new y31.y(media));
        } else {
            i41.d dVar = this.f655j1;
            if (dVar != null) {
                dVar.r3(media);
            }
        }
    }

    public final void H8(m0 toolbarState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        GestaltIconButton gestaltIconButton = this.N0;
        if (gestaltIconButton == null) {
            Intrinsics.r("profileActionsLeftIcon");
            throw null;
        }
        C8(gestaltIconButton, toolbarState.b());
        GestaltIconButton gestaltIconButton2 = this.O0;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("profileActionsCenterRightIcon");
            throw null;
        }
        C8(gestaltIconButton2, toolbarState.a());
        GestaltIconButton gestaltIconButton3 = this.P0;
        if (gestaltIconButton3 == null) {
            Intrinsics.r("profileActionsRightIcon");
            throw null;
        }
        C8(gestaltIconButton3, toolbarState.d());
        GestaltButton gestaltButton = this.Q0;
        if (gestaltButton == null) {
            Intrinsics.r("profileActionsRightButton");
            throw null;
        }
        e0 c13 = toolbarState.c();
        if (c13.a()) {
            bs1.c.X0(gestaltButton);
        } else {
            gestaltButton.d(new p1(c13, 25)).e(new l11.p(c13, 6));
            bs1.c.U1(gestaltButton);
        }
        RelativeLayout relativeLayout = this.M0;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(bs1.c.C(this, toolbarState.e() ? eo1.b.sema_color_background_transparent : eo1.b.color_themed_background_default));
        } else {
            Intrinsics.r("profileActionsToolbar");
            throw null;
        }
    }

    public final void I8(boolean z13, boolean z14) {
        GestaltText gestaltText = this.X0;
        if (gestaltText == null) {
            Intrinsics.r("profileName");
            throw null;
        }
        gestaltText.i(new i31.a(z13, 5));
        if (z13) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int U = bs1.c.U(nz1.a.lego_profile_tabs_top_spacing, resources);
            RelativeLayout relativeLayout = this.Y0;
            if (relativeLayout == null) {
                Intrinsics.r("tabsNameAndAvatarContainer");
                throw null;
            }
            relativeLayout.setPaddingRelative(relativeLayout.getPaddingStart(), U, relativeLayout.getPaddingEnd(), U);
        } else {
            RelativeLayout relativeLayout2 = this.Y0;
            if (relativeLayout2 == null) {
                Intrinsics.r("tabsNameAndAvatarContainer");
                throw null;
            }
            relativeLayout2.setPaddingRelative(relativeLayout2.getPaddingStart(), 0, relativeLayout2.getPaddingEnd(), 0);
        }
        GestaltTabLayout gestaltTabLayout = this.V0;
        if (gestaltTabLayout != null) {
            bs1.c.R1(gestaltTabLayout, z14);
        } else {
            Intrinsics.r("tabLayout");
            throw null;
        }
    }

    public final void J8(o0 tabState) {
        ek.h hVar;
        Intrinsics.checkNotNullParameter(tabState, "tabState");
        this.f659n1 = tabState;
        List a13 = tabState.a();
        int b13 = tabState.b();
        ((t) a8()).N(b13, a13);
        List list = a13;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            p41.b bVar = (p41.b) obj;
            GestaltTabLayout gestaltTabLayout = this.V0;
            if (gestaltTabLayout == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            arrayList.add(kh2.b0.U(gestaltTabLayout, bVar.a(), bVar.b(), 8));
            i13 = i14;
        }
        GestaltTabLayout gestaltTabLayout2 = this.V0;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout2.E(b13, arrayList);
        if (x8()) {
            GestaltTabLayout gestaltTabLayout3 = this.V0;
            if (gestaltTabLayout3 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            gestaltTabLayout3.post(new v.j(this, tabState, b13, 11));
        }
        final boolean m83 = m8();
        final boolean x83 = x8();
        if (m83 || x83) {
            GestaltTabLayout gestaltTabLayout4 = this.V0;
            if (gestaltTabLayout4 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            int size = gestaltTabLayout4.f33126b.size();
            for (int i15 = 0; i15 < size; i15++) {
                GestaltTabLayout gestaltTabLayout5 = this.V0;
                if (gestaltTabLayout5 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                ek.e n13 = gestaltTabLayout5.n(i15);
                if (n13 != null && (hVar = n13.f59131h) != null) {
                    hVar.setOnClickListener(new View.OnClickListener() { // from class: a41.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l0 l0Var;
                            int i16 = r.P1;
                            r this$0 = this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            if (x83 && this$0.x8()) {
                                ((t) this$0.a8()).M();
                            }
                            if (!m83 || (l0Var = this$0.f668t1) == null) {
                                return;
                            }
                            ((d0) l0Var).H3();
                        }
                    });
                }
            }
        }
        A8(!m8());
        if (this.f45638e0 != null) {
            b20.c b83 = b8();
            if (b13 < 0) {
                b13 = 0;
            }
            b83.w(b13, false);
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        CoordinatorLayout coordinatorLayout = this.I0;
        if (coordinatorLayout != null) {
            bs1.c.M1(coordinatorLayout);
        } else {
            Intrinsics.r("root");
            throw null;
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if ((Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_CREATE_RESULT_CODE") || Intrinsics.d(code, "com.pinterest.EXTRA_BOARD_CREATE_RESULT_CODE_FROM_JUMPSTART")) && result.containsKey("com.pinterest.EXTRA_NEWLY_CREATED_BOARD_ID")) {
            String o83 = o8();
            wy0 f13 = ((b60.d) getActiveUserManager()).f();
            if (Intrinsics.d(o83, f13 != null ? f13.getUid() : null)) {
                String string = result.getString("com.pinterest.EXTRA_NEWLY_CREATED_BOARD_ID", "");
                l0 l0Var = this.f668t1;
                if (l0Var != null) {
                    Intrinsics.f(string);
                    ((d0) l0Var).I3(string);
                }
            }
        }
    }

    @Override // com.pinterest.framework.screens.k
    public final void P4(Bundle bundle) {
        String string = bundle != null ? bundle.getString("com.pinterest.EXTRA_PROFILE_TAB", "") : null;
        u32.i y83 = y8(string != null ? string : "");
        int i13 = 0;
        if (y83 == null) {
            b8().w(0, true);
            return;
        }
        o0 o0Var = this.f659n1;
        if (o0Var != null) {
            Iterator it = o0Var.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (((p41.b) it.next()).c() == y83) {
                    break;
                } else {
                    i13++;
                }
            }
            v8(o0Var, i13);
        }
    }

    @Override // nl1.d
    public final void Q7(boolean z13) {
        boolean z14 = this.f91282J;
        this.f45645l0 = true;
        super.Q7(z13);
        this.f45645l0 = false;
        if (z14 == z13 || !c8()) {
            return;
        }
        ((t) a8()).F(z13);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        CoordinatorLayout coordinatorLayout = this.I0;
        if (coordinatorLayout == null) {
            return null;
        }
        if (coordinatorLayout != null) {
            return coordinatorLayout;
        }
        Intrinsics.r("root");
        throw null;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        if (!n8()) {
            x1 x1Var = this.f679z0;
            if (x1Var == null) {
                Intrinsics.r("profileHeaderPresenterFactory");
                throw null;
            }
            String o83 = o8();
            r41.e l83 = l8();
            r41.i p83 = p8();
            a11.d dVar = this.f673w0;
            if (dVar == null) {
                Intrinsics.r("clickThroughHelperFactory");
                throw null;
            }
            a11.n a13 = dVar.a(s7());
            uk1.e eVar = this.f675x0;
            if (eVar == null) {
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            }
            this.f655j1 = x1Var.a(o83, l83, p83, a13, this.M1, ((uk1.a) eVar).f(s7(), ""), p7(), com.bumptech.glide.d.Z(this, "extra_invite_code", "").length() > 0, new p(this));
        }
        a2 a2Var = this.D0;
        if (a2Var == null) {
            Intrinsics.r("profilePresenterFactory");
            throw null;
        }
        uk1.e eVar2 = this.f675x0;
        if (eVar2 == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar2).f(s7(), "");
        p41.d dVar2 = (p41.d) this.f680z1.getValue();
        r41.e l84 = l8();
        String o84 = o8();
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_PIN_ID", "");
        boolean m83 = m8();
        boolean n83 = n8();
        boolean q83 = q8();
        r41.i p84 = p8();
        r41.g gVar = r41.g.Other;
        int O = com.bumptech.glide.d.O(this, "PROFILE_NAVIGATION_ORIGIN", gVar.ordinal());
        r41.g.Companion.getClass();
        r41.g a14 = r41.f.a(O);
        r41.g gVar2 = a14 == null ? gVar : a14;
        r41.a aVar = r41.b.Companion;
        int O2 = com.bumptech.glide.d.O(this, "ADS_ONLY_PROFILE_ORIGIN", r41.b.Unknown.ordinal());
        aVar.getClass();
        return a2Var.a(f13, dVar2, l84, o84, Z, m83, n83, q83, p84, gVar2, r41.a.a(O2), com.bumptech.glide.d.Z(this, "extra_invite_code", ""));
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        this.f45645l0 = c8() && !((t) a8()).J();
        return super.generateLoggingContext();
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF104325c1() {
        xk2.k kVar = this.f678y1;
        return ((a4) kVar.getValue()) != null ? (a4) kVar.getValue() : s8() ? a4.USER_SELF : a4.USER_OTHERS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF105799k0() {
        return this.O1;
    }

    public final zf0.f j8() {
        zf0.f fVar = this.f669u0;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("educationHelper");
        throw null;
    }

    public final u2 k8() {
        u2 u2Var = this.B0;
        if (u2Var != null) {
            return u2Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final r41.e l8() {
        r41.e eVar = r41.e.Pinner;
        int O = com.bumptech.glide.d.O(this, "PROFILE_DISPLAY", eVar.ordinal());
        r41.e.Companion.getClass();
        r41.e a13 = r41.d.a(O);
        return a13 == null ? eVar : a13;
    }

    public final boolean m8() {
        return ((Boolean) this.B1.getValue()).booleanValue();
    }

    public final boolean n8() {
        return ((Boolean) this.C1.getValue()).booleanValue();
    }

    public final String o8() {
        return (String) this.I1.getValue();
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = nz1.d.fragment_user_profile_with_swipe_refresh;
        if (kotlin.text.z.j(o8())) {
            String j13 = a.a.j("User profile launched with invalid user ID: ", o8());
            b6().o(j13, new IllegalStateException(j13));
            D5();
            return;
        }
        this.f45640g0 = 2;
        w1 w1Var = this.f677y0;
        if (w1Var == null) {
            Intrinsics.r("profilePagerAdapterFactory");
            throw null;
        }
        boolean x83 = x8();
        xk2.k kVar = this.f680z1;
        ArrayList e13 = pe.i.e1((p41.d) kVar.getValue());
        ((p41.d) kVar.getValue()).getClass();
        f8(w1Var.a(o8(), e13, new o0(pe.i.r((p41.d) kVar.getValue()), 0).e(), x83));
        if (n8()) {
            ((y31.p0) this.N1.getValue()).h(o8(), s8(), l8());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        LegoUserProfileHeader legoUserProfileHeader;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(nz1.c.user_profile_header_container);
        if (n8()) {
            Context context = onCreateView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            UserProfileHeader userProfileHeader = new UserProfileHeader(context, null, 0);
            this.S0 = userProfileHeader;
            legoUserProfileHeader = userProfileHeader;
        } else {
            Context context2 = onCreateView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            LegoUserProfileHeader legoUserProfileHeader2 = new LegoUserProfileHeader(context2, null, 0);
            this.R0 = legoUserProfileHeader2;
            legoUserProfileHeader = legoUserProfileHeader2;
        }
        relativeLayout.addView(legoUserProfileHeader);
        ViewGroup.LayoutParams layoutParams = legoUserProfileHeader.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        legoUserProfileHeader.setLayoutParams(layoutParams);
        View findViewById = onCreateView.findViewById(nz1.c.user_profile);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.I0 = (CoordinatorLayout) findViewById;
        View findViewById2 = onCreateView.findViewById(nz1.c.user_profile_app_bar_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.J0 = (AppBarLayout) findViewById2;
        this.K0 = (PinterestSwipeRefreshLayout) onCreateView.findViewById(nz1.c.profile_swipe_refresh_layout);
        View findViewById3 = onCreateView.findViewById(nz1.c.user_profile_collapsing_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.L0 = (CollapsingToolbarLayout) findViewById3;
        View findViewById4 = onCreateView.findViewById(nz1.c.profile_actions_toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.M0 = (RelativeLayout) findViewById4;
        View findViewById5 = onCreateView.findViewById(m60.t0.user_profile_actions_left_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.N0 = (GestaltIconButton) findViewById5;
        View findViewById6 = onCreateView.findViewById(m60.t0.user_profile_actions_center_right_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.O0 = (GestaltIconButton) findViewById6;
        View findViewById7 = onCreateView.findViewById(m60.t0.user_profile_actions_right_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.P0 = (GestaltIconButton) findViewById7;
        View findViewById8 = onCreateView.findViewById(m60.t0.user_profile_actions_right_button);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.Q0 = (GestaltButton) findViewById8;
        View findViewById9 = onCreateView.findViewById(nz1.c.user_other_profile_lego_action_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.T0 = (LegoActionBar) findViewById9;
        View findViewById10 = onCreateView.findViewById(nz1.c.user_other_profile_new_action_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.U0 = (LinearLayout) findViewById10;
        View findViewById11 = onCreateView.findViewById(nz1.c.user_profile_tabs);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.V0 = (GestaltTabLayout) findViewById11;
        View findViewById12 = onCreateView.findViewById(nz1.c.user_profile_name_container);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.W0 = (FrameLayout) findViewById12;
        View findViewById13 = onCreateView.findViewById(nz1.c.user_profile_name);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.X0 = (GestaltText) findViewById13;
        View findViewById14 = onCreateView.findViewById(nz1.c.tabs_avatar_container);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.Y0 = (RelativeLayout) findViewById14;
        View findViewById15 = onCreateView.findViewById(nz1.c.profile_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.Z0 = (ViewGroup) findViewById15;
        View findViewById16 = onCreateView.findViewById(nz1.c.profile_user_avatar_component);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.f646a1 = (GestaltAvatar) findViewById16;
        View findViewById17 = onCreateView.findViewById(nz1.c.user_profile_collapsed_avatar_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.f647b1 = findViewById17;
        View findViewById18 = onCreateView.findViewById(nz1.c.user_profile_collapsed_navigation_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        this.f648c1 = (GestaltIconButton) findViewById18;
        View findViewById19 = onCreateView.findViewById(nz1.c.user_profile_collapsed_navigation_icon_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.f649d1 = findViewById19;
        View findViewById20 = onCreateView.findViewById(m60.t0.user_profile_collapsed_options_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.f650e1 = (GestaltIconButton) findViewById20;
        View findViewById21 = onCreateView.findViewById(nz1.c.user_profile_collapsed_share_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.f651f1 = (GestaltIconButton) findViewById21;
        View findViewById22 = onCreateView.findViewById(nz1.c.user_profile_search_with_actions_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.f652g1 = (GestaltStaticSearchBar) findViewById22;
        View findViewById23 = onCreateView.findViewById(nz1.c.private_profile_title);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        this.f653h1 = (GestaltText) findViewById23;
        View findViewById24 = onCreateView.findViewById(nz1.c.private_profile_description);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        this.f654i1 = (GestaltText) findViewById24;
        return onCreateView;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AppBarLayout appBarLayout = this.J0;
        if (appBarLayout == null) {
            Intrinsics.r("container");
            throw null;
        }
        appBarLayout.l((com.google.android.material.appbar.h) this.E1.getValue());
        this.f657l1.removeCallbacksAndMessages(null);
        HashSet hashSet = this.f676x1;
        ArrayList Q = CollectionsKt.Q(CollectionsKt.F0(hashSet));
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Animator) next).isRunning()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Animator) it2.next()).cancel();
        }
        hashSet.clear();
        this.f668t1 = null;
        this.f659n1 = null;
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        FragmentActivity E4;
        if (r8() && !k8().e() && (E4 = E4()) != null) {
            k3.W1(E4);
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity E4;
        super.onResume();
        if (r8() && !k8().e() && (E4 = E4()) != null) {
            k3.N1(E4);
        }
        nl1.d Z7 = Z7();
        if (Z7 != null) {
            Z7.onResume();
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        GestaltTabLayout gestaltTabLayout = this.V0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        outState.putInt("SAVED_STATE_KEY_SELECTED_TAB_POSITION", gestaltTabLayout.m());
        super.onSaveInstanceState(outState);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(view, "view");
        if (kotlin.text.z.j(o8())) {
            return;
        }
        B8(z92.a.f141417e);
        ViewGroup viewGroup = this.Z0;
        if (viewGroup == null) {
            Intrinsics.r("collapsedStateAvatarContainer");
            throw null;
        }
        w8(viewGroup, new h(this, 6));
        GestaltIconButton gestaltIconButton = this.f648c1;
        if (gestaltIconButton == null) {
            Intrinsics.r("collapsedStateNavigationIcon");
            throw null;
        }
        w8(gestaltIconButton, new h(this, 7));
        GestaltIconButton gestaltIconButton2 = this.f650e1;
        if (gestaltIconButton2 == null) {
            Intrinsics.r("collapsedStateOptionsIcon");
            throw null;
        }
        w8(gestaltIconButton2, new h(this, 8));
        GestaltIconButton gestaltIconButton3 = this.f651f1;
        if (gestaltIconButton3 == null) {
            Intrinsics.r("collapsedStateShareIcon");
            throw null;
        }
        w8(gestaltIconButton3, new h(this, 9));
        int i13 = 0;
        if (m8()) {
            GestaltAvatar gestaltAvatar = this.f646a1;
            if (gestaltAvatar == null) {
                Intrinsics.r("collapsedStateAvatar");
                throw null;
            }
            gestaltAvatar.H2(i.f612r);
            z8(false, false);
            if (this.L1) {
                ur0.e eVar = this.f656k1;
                if (eVar != null) {
                    this.f657l1.post(eVar);
                }
                this.L1 = false;
            }
            AppBarLayout appBarLayout = this.J0;
            if (appBarLayout == null) {
                Intrinsics.r("container");
                throw null;
            }
            appBarLayout.setEnabled(false);
            appBarLayout.setNestedScrollingEnabled(false);
            ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
            androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
            CoordinatorLayout.Behavior behavior = cVar != null ? cVar.f17900a : null;
            AppBarLayout.Behavior behavior2 = behavior instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) behavior : null;
            if (behavior2 != null) {
                behavior2.T(new n());
            }
            CollapsingToolbarLayout collapsingToolbarLayout = this.L0;
            if (collapsingToolbarLayout == null) {
                Intrinsics.r("collapsibleHeader");
                throw null;
            }
            collapsingToolbarLayout.setEnabled(false);
            collapsingToolbarLayout.setNestedScrollingEnabled(false);
            A8(false);
        } else {
            z8(true, false);
            AppBarLayout appBarLayout2 = this.J0;
            if (appBarLayout2 == null) {
                Intrinsics.r("container");
                throw null;
            }
            appBarLayout2.b((com.google.android.material.appbar.h) this.E1.getValue());
        }
        if (m8()) {
            RelativeLayout relativeLayout = this.M0;
            if (relativeLayout == null) {
                Intrinsics.r("profileActionsToolbar");
                throw null;
            }
            bs1.c.X0(relativeLayout);
        } else {
            RelativeLayout relativeLayout2 = this.M0;
            if (relativeLayout2 == null) {
                Intrinsics.r("profileActionsToolbar");
                throw null;
            }
            bs1.c.U1(relativeLayout2);
        }
        super.onViewCreated(view, bundle);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.K0;
        if (pinterestSwipeRefreshLayout != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            int V = bs1.c.V(requireContext, eo1.c.lego_spacing_vertical_medium) * 2;
            pinterestSwipeRefreshLayout.C = true;
            pinterestSwipeRefreshLayout.e();
            float f13 = V;
            pinterestSwipeRefreshLayout.p(pinterestSwipeRefreshLayout.f44877k != null ? r5 - ((se0.q) r7).f112418a.f112406d : 0, f13, f13);
            pinterestSwipeRefreshLayout.k();
            pinterestSwipeRefreshLayout.f44880n = new c(this, i13);
            if (m8()) {
                pinterestSwipeRefreshLayout.setEnabled(false);
                pinterestSwipeRefreshLayout.setNestedScrollingEnabled(false);
                pinterestSwipeRefreshLayout.n(false);
            }
        }
        GestaltTabLayout gestaltTabLayout = this.V0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        int i14 = 2;
        gestaltTabLayout.b(new ka0.h(this, (LockableViewPager) b8().f21278a, i14));
        GestaltTabLayout gestaltTabLayout2 = this.V0;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        Y7(new q(this, gestaltTabLayout2));
        Y7(new th0.b(this, i14));
        o0 o0Var = this.f659n1;
        if (o0Var == null) {
            boolean x83 = x8();
            xk2.k kVar = this.f680z1;
            if (x83) {
                ArrayList r13 = pe.i.r((p41.d) kVar.getValue());
                u32.i I = ((t) a8()).I();
                Iterator it = r13.iterator();
                int i15 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i15 = -1;
                        break;
                    } else if (((p41.b) it.next()).c() == I) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 < 0) {
                    i15 = 0;
                }
                ArrayList r14 = pe.i.r((p41.d) kVar.getValue());
                if (i15 < 0) {
                    i15 = 0;
                }
                o0Var = new o0(r14, i15);
            } else {
                ((p41.d) kVar.getValue()).getClass();
                o0Var = new o0(pe.i.r((p41.d) kVar.getValue()), 0);
            }
        }
        int d2 = o0Var.d();
        int i16 = bundle != null ? bundle.getInt("SAVED_STATE_KEY_SELECTED_TAB_POSITION", d2) : d2;
        if (i16 >= 0 && i16 < o0Var.e().size()) {
            d2 = i16;
        }
        o0 c13 = o0.c(o0Var, d2);
        ((LockableViewPager) b8().f21278a).A(c13.d());
        if (this.f659n1 == null) {
            J8(c13);
        }
        if (com.bumptech.glide.d.G(this, "PROFILE_SHOULD_ADD_BACKGROUND", false)) {
            LockableViewPager lockableViewPager = (LockableViewPager) b8().f21278a;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            lockableViewPager.setBackgroundColor(bs1.c.A(requireContext2, eo1.b.color_themed_background_default));
        }
        LegoUserProfileHeader legoUserProfileHeader = this.R0;
        i41.d dVar = this.f655j1;
        if (legoUserProfileHeader != null && dVar != null) {
            yk1.j jVar = this.f665s0;
            if (jVar == null) {
                Intrinsics.r("mvpBinder");
                throw null;
            }
            jVar.d(legoUserProfileHeader, dVar);
        }
        if (n8()) {
            ViewGroup viewGroup2 = this.Z0;
            if (viewGroup2 == null) {
                Intrinsics.r("collapsedStateAvatarContainer");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.removeRule(20);
            layoutParams3.setMarginStart(s8() ? bs1.c.X(this, eo1.c.space_400) : 0);
            layoutParams3.setMarginEnd(0);
            viewGroup2.setLayoutParams(layoutParams3);
            ViewGroup viewGroup3 = this.Z0;
            if (viewGroup3 == null) {
                Intrinsics.r("collapsedStateAvatarContainer");
                throw null;
            }
            viewGroup3.setPaddingRelative(0, viewGroup3.getPaddingTop(), 0, viewGroup3.getPaddingBottom());
            FrameLayout frameLayout = this.W0;
            if (frameLayout == null) {
                Intrinsics.r("profileNameContainer");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
            layoutParams5.addRule(16, m60.t0.user_profile_collapsed_options_icon);
            layoutParams5.addRule(17, nz1.c.profile_user_avatar);
            layoutParams5.setMarginStart(getResources().getDimensionPixelSize(eo1.c.space_200));
            layoutParams5.setMarginEnd(getResources().getDimensionPixelSize(eo1.c.space_1600));
            frameLayout.setLayoutParams(layoutParams5);
            FrameLayout frameLayout2 = this.W0;
            if (frameLayout2 == null) {
                Intrinsics.r("profileNameContainer");
                throw null;
            }
            frameLayout2.setOnClickListener(new com.pinterest.feature.home.view.c(this, 28));
            GestaltText gestaltText = this.X0;
            if (gestaltText == null) {
                Intrinsics.r("profileName");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams6 = gestaltText.getLayoutParams();
            if (layoutParams6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams6.width = -2;
            gestaltText.setLayoutParams(layoutParams6);
            UserProfileHeader userProfileHeader = this.S0;
            if (userProfileHeader != null) {
                userProfileHeader.d0(this.M1);
                userProfileHeader.setEventIntake(((y31.p0) this.N1.getValue()).c());
            }
            kotlin.jvm.internal.j.z(bf.b.S(this), null, null, new l(this, null), 3);
        }
        k8().a();
        lb0.r rVar = this.E0;
        if (rVar == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        boolean f14 = rVar.f("PREF_COMMENT_DISABLED_MODAL_SHOWN", false);
        wy0 f15 = ((b60.d) getActiveUserManager()).f();
        if (f15 == null || (bool = f15.r4()) == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        if (f14 || !booleanValue || f15 == null || !Intrinsics.d(f15.h3(), Boolean.TRUE)) {
            return;
        }
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        yb0.n nVar = new yb0.n(requireContext3);
        String string = getString(nz1.f.comments_disabled_alert_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.w(string);
        nVar.u(getString(nz1.f.comments_disabled_alert_subtitle));
        String string2 = getString(x0.got_it_simple);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        nVar.q(string2);
        nVar.m("");
        lb0.r rVar2 = this.E0;
        if (rVar2 == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        rVar2.i("PREF_COMMENT_DISABLED_MODAL_SHOWN", true);
        cb.x(nVar, f7());
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public final View p5() {
        return getView();
    }

    public final r41.i p8() {
        return (r41.i) this.A1.getValue();
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, nl1.d
    public final String q7() {
        return o8();
    }

    public final boolean q8() {
        if (!r8() || s8()) {
            return false;
        }
        u2 k83 = k8();
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        return k83.b("enabled_created_tab_deprecation", z3Var) || k8().b("enabled_header_update_created_tab_deprecation", z3Var);
    }

    public final boolean r8() {
        return l8() == r41.e.Business;
    }

    public final boolean s8() {
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        return f13 != null && dl2.b.S1(f13, o8());
    }

    @Override // yk1.n
    public final void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.K0;
        if (pinterestSwipeRefreshLayout == null || !pinterestSwipeRefreshLayout.f44879m) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f670u1;
        if (currentTimeMillis < 1000) {
            this.f657l1.postDelayed(new vs0.b(this, 21), 1000 - currentTimeMillis);
            return;
        }
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout2 = this.K0;
        if (pinterestSwipeRefreshLayout2 == null) {
            return;
        }
        pinterestSwipeRefreshLayout2.n(false);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        HashMap f63135d0 = super.getF63135d0();
        if (f63135d0 == null) {
            return z0.f(new Pair("pin_id", com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_PIN_ID", "")));
        }
        f63135d0.put("pin_id", com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_PIN_ID", ""));
        return f63135d0;
    }

    public final void u8(String str) {
        zp.j jVar = this.C0;
        if (jVar == null) {
            Intrinsics.r("galleryRouter");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        zp.j.b(jVar, requireContext, pw0.x.ProfileCover, 0, null, str, null, 444);
    }

    public final void v8(o0 o0Var, int i13) {
        int i14;
        GestaltTabLayout gestaltTabLayout = this.V0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = gestaltTabLayout.n(i13);
        if (n13 != null) {
            GestaltTabLayout gestaltTabLayout2 = this.V0;
            if (gestaltTabLayout2 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            ek.e n14 = gestaltTabLayout2.n(i13);
            Intrinsics.f(n14);
            View view = n14.f59129f;
            Intrinsics.f(view);
            i14 = view.getId();
        } else {
            i14 = 0;
        }
        p41.b bVar = (p41.b) CollectionsKt.U(i13, o0Var.e());
        int b13 = bVar != null ? bVar.b() : 0;
        if (n13 == null || i14 == 0 || i14 != b13) {
            return;
        }
        GestaltTabLayout gestaltTabLayout3 = this.V0;
        if (gestaltTabLayout3 != null) {
            gestaltTabLayout3.u(n13, true);
        } else {
            Intrinsics.r("tabLayout");
            throw null;
        }
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }

    public final boolean x8() {
        return l8() == r41.e.Pinner && !p8().isPublic();
    }

    public final void z8(boolean z13, boolean z14) {
        AppBarLayout appBarLayout = this.J0;
        if (appBarLayout != null) {
            appBarLayout.m(z13, z14);
        } else {
            Intrinsics.r("container");
            throw null;
        }
    }
}
