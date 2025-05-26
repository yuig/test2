package pe1;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.v0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import de1.r0;
import h32.a4;
import h32.g0;
import h32.y3;
import java.util.HashMap;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lh0.f4;
import lh0.k2;
import m60.w;
import nx.d0;
import pk.a0;
import q5.a2;
import so.w3;
import tj0.b0;
import we1.q1;
import we1.x1;
import we1.y1;
import yk1.v;
import yq0.z;
import z32.c2;
import z32.d2;
import z32.f2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lpe1/p;", "Ljd1/d;", "Lpe1/u;", "Lwe1/x1;", "Lqe1/a;", "<init>", "()V", "pe1/l", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class p extends b implements u, x1, qe1.a {
    public static final /* synthetic */ int H1 = 0;
    public int A1;
    public i B1;
    public i C1;
    public boolean D1;
    public boolean E1;
    public final j F1;
    public final j G1;

    /* renamed from: h1, reason: collision with root package name */
    public b0 f99970h1;

    /* renamed from: i1, reason: collision with root package name */
    public w3 f99971i1;

    /* renamed from: j1, reason: collision with root package name */
    public e02.a f99972j1;

    /* renamed from: k1, reason: collision with root package name */
    public com.pinterest.feature.pin.j f99973k1;

    /* renamed from: l1, reason: collision with root package name */
    public lb0.r f99974l1;

    /* renamed from: m1, reason: collision with root package name */
    public f4 f99975m1;

    /* renamed from: n1, reason: collision with root package name */
    public k2 f99976n1;

    /* renamed from: o1, reason: collision with root package name */
    public vy.m f99977o1;

    /* renamed from: p1, reason: collision with root package name */
    public lb0.q f99978p1;

    /* renamed from: q1, reason: collision with root package name */
    public v f99979q1;

    /* renamed from: r1, reason: collision with root package name */
    public l f99980r1;

    /* renamed from: s1, reason: collision with root package name */
    public ov1.k f99981s1;

    /* renamed from: t1, reason: collision with root package name */
    public LinearLayout f99982t1;

    /* renamed from: u1, reason: collision with root package name */
    public y1 f99983u1;

    /* renamed from: v1, reason: collision with root package name */
    public AppBarLayout f99984v1;

    /* renamed from: w1, reason: collision with root package name */
    public GestaltText f99985w1;

    /* renamed from: x1, reason: collision with root package name */
    public GestaltText f99986x1;

    /* renamed from: y1, reason: collision with root package name */
    public z32.f f99987y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f99988z1;

    /* JADX WARN: Type inference failed for: r1v0, types: [pe1.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pe1.j] */
    public p() {
        i iVar = i.NONE;
        this.B1 = iVar;
        this.C1 = iVar;
        final int i13 = 1;
        this.D1 = true;
        final int i14 = 0;
        this.F1 = new com.google.android.material.appbar.h(this) { // from class: pe1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f99960b;

            {
                this.f99960b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            
                if (r5.l() == true) goto L13;
             */
            @Override // com.google.android.material.appbar.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(com.google.android.material.appbar.AppBarLayout r5, int r6) {
                /*
                    r4 = this;
                    int r5 = r2
                    r0 = 0
                    pe1.p r1 = r4.f99960b
                    java.lang.String r2 = "this$0"
                    switch(r5) {
                        case 0: goto L91;
                        default: goto La;
                    }
                La:
                    int r5 = pe1.p.H1
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                    boolean r5 = r1.E1
                    if (r5 != 0) goto L15
                    goto L90
                L15:
                    we1.y1 r5 = r1.f99983u1
                    if (r5 == 0) goto L21
                    boolean r5 = r5.l()
                    r2 = 1
                    if (r5 != r2) goto L21
                    goto L22
                L21:
                    r2 = r0
                L22:
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto L2f
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    int r5 = r5.getHeight()
                    goto L30
                L2f:
                    r5 = r0
                L30:
                    android.content.Context r3 = r1.requireContext()
                    int r3 = kh2.k3.k0(r3)
                    int r3 = r3 + r5
                    we1.y1 r5 = r1.f99983u1
                    if (r5 == 0) goto L42
                    int r5 = r5.k()
                    goto L43
                L42:
                    r5 = r0
                L43:
                    if (r2 == 0) goto L47
                    int r3 = r3 + r5
                    goto L48
                L47:
                    r3 = r0
                L48:
                    boolean r5 = r1.I9(r6, r3, r0)
                    java.lang.String r6 = "<set-?>"
                    if (r2 == 0) goto L66
                    if (r5 == 0) goto L55
                    pe1.i r0 = pe1.i.RESTORED
                    goto L57
                L55:
                    pe1.i r0 = pe1.i.TRANSPARENT
                L57:
                    pe1.i r2 = r1.B1
                    if (r0 == r2) goto L6d
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
                    r1.B1 = r0
                    boolean r6 = r1.f91282J
                    r1.M9(r6)
                    goto L6d
                L66:
                    pe1.i r0 = pe1.i.NONE
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
                    r1.B1 = r0
                L6d:
                    if (r5 == 0) goto L80
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto L90
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.q()
                    int r6 = eo1.b.color_themed_background_default
                    r5.M(r6)
                    goto L90
                L80:
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto L90
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.s()
                    int r6 = eo1.b.color_themed_transparent
                    r5.M(r6)
                L90:
                    return
                L91:
                    int r5 = pe1.p.H1
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                    android.widget.LinearLayout r5 = r1.f99982t1
                    if (r5 == 0) goto L9f
                    int r5 = r5.getHeight()
                    goto La0
                L9f:
                    r5 = r0
                La0:
                    fo1.a r2 = r1.i7()
                    if (r2 == 0) goto Lad
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r2 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r2
                    int r2 = r2.getHeight()
                    goto Lae
                Lad:
                    r2 = r0
                Lae:
                    int r0 = java.lang.Math.max(r2, r0)
                    int r5 = r5 - r0
                    int r6 = java.lang.Math.abs(r6)
                    if (r6 < r5) goto Lc5
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto Ld0
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.q()
                    goto Ld0
                Lc5:
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto Ld0
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.s()
                Ld0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pe1.j.a(com.google.android.material.appbar.AppBarLayout, int):void");
            }
        };
        this.G1 = new com.google.android.material.appbar.h(this) { // from class: pe1.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f99960b;

            {
                this.f99960b = this;
            }

            @Override // com.google.android.material.appbar.f
            public final void a(AppBarLayout appBarLayout, int i15) {
                /*
                    this = this;
                    int r5 = r2
                    r0 = 0
                    pe1.p r1 = r4.f99960b
                    java.lang.String r2 = "this$0"
                    switch(r5) {
                        case 0: goto L91;
                        default: goto La;
                    }
                La:
                    int r5 = pe1.p.H1
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                    boolean r5 = r1.E1
                    if (r5 != 0) goto L15
                    goto L90
                L15:
                    we1.y1 r5 = r1.f99983u1
                    if (r5 == 0) goto L21
                    boolean r5 = r5.l()
                    r2 = 1
                    if (r5 != r2) goto L21
                    goto L22
                L21:
                    r2 = r0
                L22:
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto L2f
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    int r5 = r5.getHeight()
                    goto L30
                L2f:
                    r5 = r0
                L30:
                    android.content.Context r3 = r1.requireContext()
                    int r3 = kh2.k3.k0(r3)
                    int r3 = r3 + r5
                    we1.y1 r5 = r1.f99983u1
                    if (r5 == 0) goto L42
                    int r5 = r5.k()
                    goto L43
                L42:
                    r5 = r0
                L43:
                    if (r2 == 0) goto L47
                    int r3 = r3 + r5
                    goto L48
                L47:
                    r3 = r0
                L48:
                    boolean r5 = r1.I9(r6, r3, r0)
                    java.lang.String r6 = "<set-?>"
                    if (r2 == 0) goto L66
                    if (r5 == 0) goto L55
                    pe1.i r0 = pe1.i.RESTORED
                    goto L57
                L55:
                    pe1.i r0 = pe1.i.TRANSPARENT
                L57:
                    pe1.i r2 = r1.B1
                    if (r0 == r2) goto L6d
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
                    r1.B1 = r0
                    boolean r6 = r1.f91282J
                    r1.M9(r6)
                    goto L6d
                L66:
                    pe1.i r0 = pe1.i.NONE
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
                    r1.B1 = r0
                L6d:
                    if (r5 == 0) goto L80
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto L90
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.q()
                    int r6 = eo1.b.color_themed_background_default
                    r5.M(r6)
                    goto L90
                L80:
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto L90
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.s()
                    int r6 = eo1.b.color_themed_transparent
                    r5.M(r6)
                L90:
                    return
                L91:
                    int r5 = pe1.p.H1
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                    android.widget.LinearLayout r5 = r1.f99982t1
                    if (r5 == 0) goto L9f
                    int r5 = r5.getHeight()
                    goto La0
                L9f:
                    r5 = r0
                La0:
                    fo1.a r2 = r1.i7()
                    if (r2 == 0) goto Lad
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r2 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r2
                    int r2 = r2.getHeight()
                    goto Lae
                Lad:
                    r2 = r0
                Lae:
                    int r0 = java.lang.Math.max(r2, r0)
                    int r5 = r5 - r0
                    int r6 = java.lang.Math.abs(r6)
                    if (r6 < r5) goto Lc5
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto Ld0
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.q()
                    goto Ld0
                Lc5:
                    fo1.a r5 = r1.i7()
                    if (r5 == 0) goto Ld0
                    com.pinterest.gestalt.toolbar.GestaltToolbarImpl r5 = (com.pinterest.gestalt.toolbar.GestaltToolbarImpl) r5
                    r5.s()
                Ld0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pe1.j.a(com.google.android.material.appbar.AppBarLayout, int):void");
            }
        };
    }

    public static int C9(int i13, float f13, int i14) {
        float f14 = 1 - f13;
        return Color.argb((int) ((Color.alpha(i13) * f14) + (Color.alpha(i14) * f13)), (int) ((Color.red(i13) * f14) + (Color.red(i14) * f13)), (int) ((Color.green(i13) * f14) + (Color.green(i14) * f13)), (int) ((Color.blue(i13) * f14) + (Color.blue(i14) * f13)));
    }

    public final z32.f D9() {
        if (this.f99987y1 == null) {
            Navigation navigation = this.I;
            Integer valueOf = navigation != null ? Integer.valueOf(navigation.J1("com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE")) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                z32.f.Companion.getClass();
                this.f99987y1 = z32.d.a(intValue);
            }
        }
        return this.f99987y1;
    }

    public com.google.android.material.appbar.h E9() {
        return this.G1;
    }

    public final f2 F9() {
        d2 d2Var = f2.Companion;
        int O = com.bumptech.glide.d.O(this, "com.pinterest.STRUCTURED_FEED_QUICK_SAVE_ICON", 0);
        d2Var.getClass();
        f2 a13 = d2.a(O);
        if (a13 == null) {
            a13 = f2.NONE;
        }
        f2 f2Var = f2.NONE;
        return a13 != f2Var ? a13 : f2Var;
    }

    public final AnimatorSet G9(int i13, int i14, long j13) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j13);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new k(this, i13, i14, 1));
        Unit unit = Unit.f80348a;
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new k(this, i13, i14, 0));
        Intrinsics.checkNotNullExpressionValue(ofFloat2, "apply(...)");
        animatorSet.playTogether(f0.l(ofFloat, ofFloat2));
        return animatorSet;
    }

    public void H9() {
        q1 q1Var;
        LinearLayout view;
        if (this.B1 == i.NONE || this.C1 != i.RESTORED) {
            return;
        }
        int i13 = this.A1;
        FragmentActivity requireActivity = requireActivity();
        l0.j1(requireActivity.getWindow(), false);
        if (this.D1) {
            if (requireActivity.getWindow().getStatusBarColor() != 0) {
                requireActivity.getWindow().setStatusBarColor(0);
            }
            fo1.a i73 = i7();
            if (i73 != null) {
                GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
                gestaltToolbarImpl.M(eo1.b.color_themed_transparent);
                if (this.D1) {
                    Drawable u13 = gestaltToolbarImpl.u();
                    Context requireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    u13.setTint(dl2.b.x0(requireContext, eo1.a.base_color_grayscale_0));
                    gestaltToolbarImpl.S(u13);
                }
            }
        } else {
            long j13 = this.f99988z1 ? 100L : 550L;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            G9(dl2.b.x0(requireContext2, eo1.a.sema_color_background_default), 0, j13).start();
            this.f99988z1 = false;
        }
        Window window = requireActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        a0.f1(window);
        a2 l03 = k3.l0(requireContext());
        f5.e f13 = l03 != null ? l03.f102400a.f(7) : null;
        if (f13 != null) {
            i13 = f13.f61084d;
        }
        requireActivity.getWindow().setNavigationBarColor(bs1.c.C(this, eo1.b.color_themed_background_default));
        fo1.a i74 = i7();
        if (i74 != null) {
            GestaltToolbarImpl gestaltToolbarImpl2 = (GestaltToolbarImpl) i74;
            ViewGroup.LayoutParams layoutParams = gestaltToolbarImpl2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
            }
            CollapsingToolbarLayout.LayoutParams layoutParams2 = (CollapsingToolbarLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, k3.k0(requireContext()), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            gestaltToolbarImpl2.setLayoutParams(layoutParams2);
        }
        FragmentActivity E4 = E4();
        cp1.p pVar = E4 instanceof cp1.p ? (cp1.p) E4 : null;
        if (pVar != null) {
            pVar.setPadForStatusBar(true);
        }
        y1 y1Var = this.f99983u1;
        ViewGroup.LayoutParams layoutParams3 = y1Var != null ? y1Var.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i14;
        }
        com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        r70.a aVar2 = aVar instanceof r70.a ? aVar : null;
        if (aVar2 != null && (view = aVar2.getView()) != null) {
            view.setPaddingRelative(0, 0, 0, i13);
        }
        i iVar = i.TRANSPARENT;
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.C1 = iVar;
        y1 y1Var2 = this.f99983u1;
        if (y1Var2 == null || (q1Var = y1Var2.f129706d) == null) {
            return;
        }
        q1Var.X(true);
    }

    public final boolean I9(int i13, int i14, boolean z13) {
        if (z13) {
            return Math.abs(i13) >= 1;
        }
        y1 y1Var = this.f99983u1;
        return i13 != 0 && Math.abs(i13) >= (y1Var != null ? y1Var.j() : 0) - i14;
    }

    public void J9() {
        q1 q1Var;
        LinearLayout view;
        if (this.B1 == i.NONE || this.C1 != i.TRANSPARENT) {
            return;
        }
        FragmentActivity requireActivity = requireActivity();
        l0.j1(requireActivity.getWindow(), true);
        if (this.D1) {
            a0.d1(requireActivity);
            fo1.a i73 = i7();
            if (i73 != null) {
                GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
                gestaltToolbarImpl.M(eo1.b.color_themed_background_default);
                Drawable u13 = gestaltToolbarImpl.u();
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                u13.setTint(dl2.b.x0(requireContext, eo1.a.sema_color_icon_default));
                gestaltToolbarImpl.S(u13);
            }
        } else {
            long j13 = this.f99988z1 ? 100L : 550L;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            G9(0, dl2.b.x0(requireContext2, eo1.a.sema_color_background_default), j13).start();
            this.f99988z1 = false;
            Window window = requireActivity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            Configuration configuration = getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
            a0.j1(window, configuration);
        }
        fo1.a i74 = i7();
        if (i74 != null) {
            GestaltToolbarImpl gestaltToolbarImpl2 = (GestaltToolbarImpl) i74;
            ViewGroup.LayoutParams layoutParams = gestaltToolbarImpl2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
            }
            CollapsingToolbarLayout.LayoutParams layoutParams2 = (CollapsingToolbarLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, 0, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            gestaltToolbarImpl2.setLayoutParams(layoutParams2);
        }
        FragmentActivity E4 = E4();
        cp1.p pVar = E4 instanceof cp1.p ? (cp1.p) E4 : null;
        if (pVar != null) {
            pVar.setPadForStatusBar(false);
        }
        int k03 = k3.k0(requireContext());
        y1 y1Var = this.f99983u1;
        ViewGroup.LayoutParams layoutParams3 = y1Var != null ? y1Var.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            int i13 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = -k03;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = i13;
        }
        com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
        r70.a aVar = sVar != null ? sVar.f49234i : null;
        r70.a aVar2 = aVar instanceof r70.a ? aVar : null;
        if (aVar2 != null && (view = aVar2.getView()) != null) {
            view.setPaddingRelative(0, 0, 0, 0);
        }
        i iVar = i.RESTORED;
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.C1 = iVar;
        y1 y1Var2 = this.f99983u1;
        if (y1Var2 == null || (q1Var = y1Var2.f129706d) == null) {
            return;
        }
        q1Var.X(false);
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public void K7() {
        super.K7();
        this.f99988z1 = true;
        M9(true);
    }

    public void K9(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.f99983u1 = new y1(requireContext);
        this.f99984v1 = (AppBarLayout) view.findViewById(f62.c.structured_feed_feed_appbarlayout);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(f62.c.structured_feed_hero_layout);
        this.f99982t1 = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.addView(this.f99983u1);
            linearLayout.getLayoutParams();
            linearLayout.setPaddingRelative(0, linearLayout.getResources().getDimensionPixelSize(eo1.c.toolbar_height), 0, 0);
        }
        fo1.a i73 = i7();
        if (i73 != null) {
            ((GestaltToolbarImpl) i73).s();
        }
        AppBarLayout appBarLayout = this.f99984v1;
        if (appBarLayout != null) {
            appBarLayout.b(E9());
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public void L7() {
        this.f99988z1 = true;
        J9();
        super.L7();
    }

    public boolean L9() {
        return D9() == z32.f.GULP;
    }

    @Override // yq0.t
    public final void M8(boolean z13) {
        ov1.k kVar = this.f99981s1;
        if (kVar == null || !kVar.c()) {
            super.M8(z13);
            return;
        }
        se0.c f83 = f8();
        if (f83 != null) {
            f83.showLoadingSpinner(false);
        }
        ov1.k kVar2 = this.f99981s1;
        if (kVar2 != null) {
            kVar2.h(z13);
        }
    }

    public final void M9(boolean z13) {
        if (z13) {
            int i13 = m.f99965a[this.B1.ordinal()];
            if (i13 == 1) {
                H9();
            } else {
                if (i13 != 2) {
                    return;
                }
                J9();
            }
        }
    }

    public void Q3(re1.r headerModel) {
        GestaltText A;
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        y1 y1Var = this.f99983u1;
        int i13 = 0;
        if (y1Var != null) {
            y1Var.n(re1.r.a(headerModel, null, null, null, new n(this, i13), 1835007));
        }
        y1 y1Var2 = this.f99983u1;
        if (y1Var2 != null && y1Var2.l()) {
            if (this.C1 == i.NONE) {
                i iVar = i.RESTORED;
                Intrinsics.checkNotNullParameter(iVar, "<set-?>");
                this.C1 = iVar;
            }
            this.A1 = getResources().getDimensionPixelSize(eo1.c.space_400);
            AppBarLayout appBarLayout = this.f99984v1;
            View childAt = appBarLayout != null ? appBarLayout.getChildAt(0) : null;
            if (childAt != null) {
                fo1.a i73 = i7();
                childAt.setMinimumHeight(i73 != null ? ((GestaltToolbarImpl) i73).getHeight() : getResources().getDimensionPixelSize(eo1.c.toolbar_height));
            }
            LinearLayout linearLayout = this.f99982t1;
            if (linearLayout != null) {
                linearLayout.setPaddingRelative(0, 0, 0, 0);
            }
        }
        fo1.a i74 = i7();
        if (i74 != null) {
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i74;
            gestaltToolbarImpl.setPaddingRelative(getResources().getDimensionPixelSize(eo1.c.space_200), gestaltToolbarImpl.getPaddingTop(), getResources().getDimensionPixelSize(eo1.c.space_200), gestaltToolbarImpl.getPaddingBottom());
        }
        fo1.a i75 = i7();
        if (i75 != null && (A = ((GestaltToolbarImpl) i75).A()) != null) {
            A.setPaddingRelative(getResources().getDimensionPixelSize(eo1.c.space_200), A.getPaddingTop(), A.getPaddingEnd(), A.getPaddingBottom());
        }
        y1 y1Var3 = this.f99983u1;
        if (y1Var3 != null) {
            y1Var3.setVisibility(0);
        }
        this.E1 = true;
    }

    @Override // jd1.d, sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(34, new o(this, 0));
        int[] iArr = mj0.j.f87276a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        d0 s73 = s7();
        qa2.n W8 = W8();
        uj2.q p73 = p7();
        b0 b0Var = this.f99970h1;
        if (b0Var == null) {
            Intrinsics.r("oneTapSavePinVideoGridCellFactory");
            throw null;
        }
        mj0.j.b(adapter, requireContext, s73, W8, p73, b0Var);
        adapter.G(37, new o(this, 1));
        adapter.G(38, new o(this, 2));
    }

    @Override // jd1.d, sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        qa2.n a13;
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        int O = com.bumptech.glide.d.O(this, "com.pinterest.STRUCTURED_FEED_PINS_DISPLAY", c2.NONE.getValue());
        c2.Companion.getClass();
        int i13 = 1;
        if (z32.a2.a(O) == c2.SHOPPING_GRID) {
            a13 = super.T8(pinActionHandler);
        } else {
            a13 = new qa2.f(s7(), y32.f.CLOSEUP_LONGPRESS, pinActionHandler, v9()).a(new yk1.a(getResources(), requireContext().getTheme()));
            a13.f103320a.Y = true;
        }
        a13.f103320a.f128780k0 = F9() != f2.NONE ? new wa2.z(new n(this, i13)) : null;
        return a13;
    }

    @Override // jd1.d, yk1.k
    public yk1.m V7() {
        w3 w3Var = this.f99971i1;
        if (w3Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        id1.h o93 = o9(requireContext);
        String a13 = r9() != null ? n00.b.a(n00.c.SHOPPING_FULL_FEED_FIELDS) : n00.b.a(n00.c.STRUCTURED_FEED_FIELDS);
        e02.a aVar = this.f99972j1;
        if (aVar == null) {
            Intrinsics.r("boardRouter");
            throw null;
        }
        f2 F9 = F9();
        com.pinterest.feature.pin.j jVar = this.f99973k1;
        if (jVar == null) {
            Intrinsics.r("pinAction");
            throw null;
        }
        f4 f4Var = this.f99975m1;
        if (f4Var == null) {
            Intrinsics.r("structuredFeedExperiments");
            throw null;
        }
        nx.f0 n93 = n9();
        lb0.r rVar = this.f99974l1;
        if (rVar == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        t a14 = w3Var.a(id1.h.a(o93, a13, aVar, F9, jVar, f4Var, n93, rVar));
        if (r9() != null) {
            jd1.d.y9(this, a14);
        }
        return a14;
    }

    @Override // jd1.d
    public final String g9() {
        return com.bumptech.glide.d.Z(this, "com.pinterest.STRUCTURED_FEED_ENDPOINT", "");
    }

    @Override // jd1.d
    public final HashMap h9() {
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", "");
        HashMap h93 = super.h9();
        if (Z.length() > 0) {
            h93.put("request_params", Z);
        }
        Navigation navigation = this.I;
        String str = null;
        String v03 = navigation != null ? navigation.v0("source_identifier") : null;
        if (v03 != null && v03.length() != 0) {
            str = v03;
        }
        if (str != null) {
            h93.put("source_identifier", str);
        }
        return h93;
    }

    @Override // jd1.d
    /* renamed from: j9 */
    public final boolean getU0() {
        return (D9() == z32.f.TEXT_ONLY || L9()) ? false : true;
    }

    @Override // jd1.d
    public final g0 k9() {
        return null;
    }

    @Override // jd1.d, yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(f62.d.fragment_structured_feed_multisection, f62.c.p_recycler_view);
        eVar.c(f62.c.structured_feed_multisection_swipe_container);
        eVar.f979c = f62.c.structured_feed_multisection_empty_state_container;
        return eVar;
    }

    @Override // jd1.d, sq0.e, yq0.t
    public final v0 n8() {
        return t9();
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        ov1.f fVar = new ov1.f(0, Integer.valueOf(f62.c.structured_feed_multisection_empty_state_container), 3);
        uk1.d p93 = p9();
        uj2.q p73 = p7();
        w f73 = f7();
        int hashCode = hashCode();
        k2 k2Var = this.f99976n1;
        if (k2Var == null) {
            Intrinsics.r("oneBarLibraryExperiments");
            throw null;
        }
        vy.m mVar = this.f99977o1;
        if (mVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        b60.b activeUserManager = getActiveUserManager();
        lb0.q qVar = this.f99978p1;
        if (qVar == null) {
            Intrinsics.r("prefsManagerPersisted");
            throw null;
        }
        ov1.e eVar = ov1.e.MULTIPLE_DESELECTABLE;
        r0 r0Var = r0.STRUCTURED_FEED_LANDING_SCREEN;
        Intrinsics.f(requireContext);
        this.f99981s1 = new ov1.k(requireContext, onCreateView, fVar, p93, p73, f73, true, hashCode, mVar, activeUserManager, qVar, k2Var, eVar, r0Var, 237568);
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f99988z1 = true;
        J9();
        super.onDestroy();
    }

    @Override // jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f99988z1 = true;
        AppBarLayout appBarLayout = this.f99984v1;
        if (appBarLayout != null) {
            appBarLayout.l(E9());
        }
        AppBarLayout appBarLayout2 = this.f99984v1;
        if (appBarLayout2 != null) {
            appBarLayout2.l(this.F1);
        }
        J9();
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        this.f99988z1 = true;
        J9();
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f99988z1 = true;
        M9(true);
    }

    @Override // jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (L9()) {
            K9(v13);
            return;
        }
        if (D9() == z32.f.TEXT_ONLY) {
            String u93 = u9();
            String Z = com.bumptech.glide.d.Z(this, "com.pinterest.STRUCTURED_FEED_SUBTITLE", "");
            if (u93 == null || Z == null) {
                return;
            }
            this.f99984v1 = (AppBarLayout) v13.findViewById(f62.c.structured_feed_feed_appbarlayout);
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            GestaltText gestaltText = new GestaltText(6, requireContext, (AttributeSet) null);
            gestaltText.i(new d91.l(u93, 19));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int dimensionPixelSize = gestaltText.getResources().getDimensionPixelSize(eo1.c.structured_feed_header_horizontal_padding);
            gestaltText.setPaddingRelative(dimensionPixelSize, gestaltText.getResources().getDimensionPixelSize(eo1.c.toolbar_height), dimensionPixelSize, 0);
            gestaltText.setLayoutParams(layoutParams);
            this.f99985w1 = gestaltText;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            GestaltText gestaltText2 = new GestaltText(6, requireContext2, (AttributeSet) null);
            gestaltText2.i(new d91.l(Z, 18));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            int dimensionPixelSize2 = gestaltText2.getResources().getDimensionPixelSize(eo1.c.structured_feed_header_horizontal_padding);
            int dimensionPixelSize3 = gestaltText2.getResources().getDimensionPixelSize(eo1.c.space_200);
            gestaltText2.setPaddingRelative(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize3);
            gestaltText2.setLayoutParams(layoutParams2);
            this.f99986x1 = gestaltText2;
            LinearLayout linearLayout = (LinearLayout) v13.findViewById(f62.c.structured_feed_hero_layout);
            this.f99982t1 = linearLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                linearLayout.addView(this.f99985w1);
                linearLayout.addView(this.f99986x1);
            }
            AppBarLayout appBarLayout = this.f99984v1;
            if (appBarLayout != null) {
                appBarLayout.b(this.F1);
            }
        }
    }

    @Override // jd1.d
    public final String r9() {
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("shop_source") : null;
        if (v03 == null || v03.length() == 0) {
            return null;
        }
        return v03;
    }

    @Override // jd1.d
    public final String u9() {
        return com.bumptech.glide.d.Z(this, "com.pinterest.STRUCTURED_FEED_TITLE", "");
    }

    @Override // jd1.d
    public String v9() {
        return "shop_feed";
    }

    @Override // jd1.d
    public final a4 x9() {
        a4 a4Var = a4.FEED_RELATED_PRODUCTS;
        int O = com.bumptech.glide.d.O(this, "com.pinterest.STRUCTURED_FEED_VIEW_PARAMETER", a4Var.getValue());
        a4.Companion.getClass();
        a4 a13 = y3.a(O);
        return a13 == null ? a4Var : a13;
    }
}
