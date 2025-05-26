package pe1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kc1.w;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.f4;
import nx.f0;
import so.x3;
import we1.q1;
import we1.y1;
import z32.f2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpe1/d;", "Lpe1/p;", "Lml1/q;", "<init>", "()V", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends a {
    public static final /* synthetic */ int P1 = 0;
    public boolean L1;
    public x3 M1;
    public final c N1 = new c(this);
    public final cj0.e O1 = new cj0.e(this, 4);

    @Override // pe1.p
    public final com.google.android.material.appbar.h E9() {
        return this.O1;
    }

    @Override // pe1.p
    public final void H9() {
        boolean z13 = this.C1 == i.RESTORED;
        super.H9();
        if (z13 || (this.L1 && this.C1 != i.NONE)) {
            f7().f(new te1.b(false));
            if (this.L1) {
                this.L1 = false;
            }
        }
    }

    @Override // pe1.p
    public final void J9() {
        boolean z13 = this.C1 == i.TRANSPARENT;
        super.J9();
        if (z13) {
            f7().f(new te1.b(true));
        }
    }

    @Override // pe1.p, sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
    }

    @Override // pe1.p
    public final void K9(View view) {
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
        }
        AppBarLayout appBarLayout = this.f99984v1;
        if (appBarLayout != null) {
            appBarLayout.b(this.O1);
        }
    }

    @Override // pe1.p, sq0.e, yq0.t, yk1.k, nl1.d
    public final void L7() {
        super.L7();
    }

    @Override // pe1.p
    public final boolean L9() {
        int O = com.bumptech.glide.d.O(this, "com.pinterest.STRUCTURED_FEED_LANDING_PAGE_HEADER_STYLE", 0);
        z32.f.Companion.getClass();
        return z32.d.a(O) == z32.f.PINTEREST_PICKS;
    }

    @Override // pe1.p, we1.x1
    public final void Q3(re1.r headerModel) {
        q1 i13;
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        if (this.C1 == i.NONE) {
            i iVar = i.RESTORED;
            Intrinsics.checkNotNullParameter(iVar, "<set-?>");
            this.C1 = iVar;
        }
        y1 y1Var = this.f99983u1;
        if (y1Var != null) {
            y1Var.n(re1.r.a(headerModel, null, null, null, new w(this, 25), 1835007));
        }
        this.A1 = getResources().getDimensionPixelSize(eo1.c.space_400);
        y1 y1Var2 = this.f99983u1;
        if (y1Var2 != null && (i13 = y1Var2.i()) != null) {
            i13.setPaddingRelative(i13.getPaddingStart(), 0, i13.getPaddingEnd(), i13.getPaddingBottom());
        }
        if (this.C1 != i.TRANSPARENT) {
            int k03 = k3.k0(requireContext());
            y1 y1Var3 = this.f99983u1;
            ViewGroup.LayoutParams layoutParams = y1Var3 != null ? y1Var3.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int marginStart = marginLayoutParams.getMarginStart();
                int marginEnd = marginLayoutParams.getMarginEnd();
                int i14 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = -k03;
                marginLayoutParams.setMarginEnd(marginEnd);
                marginLayoutParams.bottomMargin = i14;
            }
        }
        LinearLayout linearLayout = this.f99982t1;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(0, 0, 0, 0);
        }
        y1 y1Var4 = this.f99983u1;
        if (y1Var4 != null) {
            y1Var4.setVisibility(0);
        }
        this.E1 = true;
    }

    @Override // pe1.p, jd1.d, yk1.k
    public final yk1.m V7() {
        x3 x3Var = this.M1;
        if (x3Var == null) {
            Intrinsics.r("pinterestPicksPresenterFactory");
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
        f0 n93 = n9();
        lb0.r rVar = this.f99974l1;
        if (rVar == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        h a14 = x3Var.a(id1.h.a(o93, a13, aVar, F9, jVar, f4Var, n93, rVar));
        if (r9() != null) {
            jd1.d.y9(this, a14);
        }
        return a14;
    }

    @Override // sq0.e
    public final int Y8() {
        if (L9()) {
            return 0;
        }
        return super.Y8();
    }

    @Override // pe1.p, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        f7().h(this.N1);
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // pe1.p, jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f7().j(this.N1);
        super.onDestroyView();
    }

    @Override // pe1.p, nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        this.L1 = true;
        super.onResume();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onStart() {
        this.L1 = true;
        M9(true);
        super.onStart();
    }

    @Override // pe1.p, jd1.d, sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        fo1.a i73 = i7();
        if (i73 != null) {
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
            gestaltToolbarImpl.C();
            gestaltToolbarImpl.z().setVisibility(8);
        }
        this.D1 = false;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        v13.setBackgroundColor(dl2.b.x0(requireContext, eo1.a.sema_color_background_default));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        this.L1 = true;
        M9(true);
        super.onViewStateRestored(bundle);
    }

    @Override // pe1.p, jd1.d
    public final String v9() {
        return "feed_holiday_finds";
    }
}
