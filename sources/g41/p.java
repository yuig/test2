package g41;

import a41.u;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.wy0;
import com.pinterest.base.LockableViewPager;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.x0;
import so.e2;
import y01.p1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lg41/p;", "Lkr/a;", "Ld41/a;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class p extends k<d41.a> {

    /* renamed from: m0, reason: collision with root package name */
    public static final /* synthetic */ int f63529m0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public e2 f63530g0;

    /* renamed from: h0, reason: collision with root package name */
    public f0 f63531h0;

    /* renamed from: j0, reason: collision with root package name */
    public ek2.j f63533j0;

    /* renamed from: i0, reason: collision with root package name */
    public String f63532i0 = "";

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f63534k0 = d4.USER;

    /* renamed from: l0, reason: collision with root package name */
    public final a4 f63535l0 = a4.USER_FOLLOWING;

    public static final void b8(p pVar, wy0 wy0Var) {
        Integer valueOf;
        b20.c cVar = pVar.X;
        if (cVar == null || cVar.j() != 1) {
            int intValue = wy0Var.X2().intValue();
            Integer r33 = wy0Var.r3();
            Intrinsics.checkNotNullExpressionValue(r33, "getInterestFollowingCount(...)");
            valueOf = Integer.valueOf(intValue - r33.intValue());
        } else {
            valueOf = wy0Var.P2();
        }
        String string = pVar.getResources().getString(nz1.f.creator_profile_following, Integer.valueOf(Math.max(0, valueOf.intValue())));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pVar.d8(string);
    }

    @Override // kr.a, nl1.d
    public final void K7() {
        super.K7();
        if (com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_COUNT", true)) {
            e8();
        }
    }

    @Override // kr.a, nl1.d
    public final void L7() {
        ek2.j jVar = this.f63533j0;
        if (jVar != null && !jVar.isDisposed()) {
            bk2.c.dispose(jVar);
        }
        super.L7();
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (!com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", false)) {
            ((GestaltToolbarImpl) toolbar).B();
            return;
        }
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.g0();
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, le0.h.content_description_back_arrow);
        gestaltToolbarImpl.m();
    }

    @Override // kr.a
    public final LockableViewPager W7(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(nz1.c.content_pager_vw);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        return (LockableViewPager) findViewById;
    }

    public final String c8() {
        if (this.f63532i0.length() == 0) {
            this.f63532i0 = com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "");
        }
        return this.f63532i0;
    }

    public final void d8(String str) {
        GestaltText gestaltText;
        if (com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", false) && !com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_WRAP_IN_APP_BAR", true)) {
            fo1.a i73 = i7();
            if (i73 != null) {
                ((GestaltToolbarImpl) i73).c0(str, fm1.c.VISIBLE);
                return;
            }
            return;
        }
        View view = getView();
        if (view == null || (gestaltText = (GestaltText) view.findViewById(nz1.c.followers_count_text)) == null) {
            return;
        }
        gestaltText.i(new b31.f(str, 4));
    }

    public final void e8() {
        ek2.j jVar = this.f63533j0;
        if (jVar != null && !jVar.isDisposed()) {
            bk2.c.dispose(jVar);
        }
        this.f63533j0 = (ek2.j) A7().L(c8()).F(new u(15, new p1(this, 29)), new u(16, o.f63528i), ck2.i.f27923c, ck2.i.f27924d);
    }

    @Override // kr.a, uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getS0() {
        return this.f63535l0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getQ0() {
        return this.f63534k0;
    }

    @Override // kr.a, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String c83 = c8();
        f0 f0Var = this.f63531h0;
        if (f0Var == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var.S(c83.length() > 0, "No user ID for CreatorProfileFollowingFragment", new Object[0]);
        this.E = com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_WRAP_IN_APP_BAR", true) ? nz1.d.profile_following_fragment : nz1.d.profile_following_fragment_no_app_bar;
        e2 e2Var = this.f63530g0;
        if (e2Var != null) {
            this.Y = e2Var.a(c83, com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_BOARDS_TAB", true));
        } else {
            Intrinsics.r("adapterFactory");
            throw null;
        }
    }

    @Override // kr.a, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        b20.c cVar = this.X;
        if (cVar != null) {
            cVar.x(false);
        }
        View findViewById = v13.findViewById(nz1.c.following_tab_layout);
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById;
        if (gestaltTabLayout.f33150z != 1) {
            gestaltTabLayout.f33150z = 1;
            gestaltTabLayout.h();
        }
        if (1 != gestaltTabLayout.C) {
            gestaltTabLayout.C = 1;
            gestaltTabLayout.h();
        }
        ek.e tab = b0.U(gestaltTabLayout, bs1.c.f2(gestaltTabLayout, nz1.f.pinners), 0, 12);
        Intrinsics.checkNotNullParameter(tab, "tab");
        ArrayList arrayList = gestaltTabLayout.f33126b;
        gestaltTabLayout.d(tab, 0, arrayList.isEmpty());
        gestaltTabLayout.D(tab);
        if (com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_BOARDS_TAB", true)) {
            ek.e tab2 = b0.U(gestaltTabLayout, bs1.c.f2(gestaltTabLayout, nz1.f.boards), 0, 12);
            Intrinsics.checkNotNullParameter(tab2, "tab");
            gestaltTabLayout.d(tab2, 1, arrayList.isEmpty());
            gestaltTabLayout.D(tab2);
        }
        b20.c cVar2 = this.X;
        gestaltTabLayout.b(new ka0.h(this, cVar2 != null ? (LockableViewPager) cVar2.f21278a : null, 3));
        bs1.c.R1(gestaltTabLayout, arrayList.size() > 1);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        b20.c cVar3 = this.X;
        if (cVar3 != null) {
            cVar3.w(0, true);
        }
        if (com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_COUNT", true)) {
            e8();
            return;
        }
        String string = getResources().getString(x0.following);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        d8(string);
    }

    @Override // kr.a, nl1.d
    public final String q7() {
        return c8();
    }
}
