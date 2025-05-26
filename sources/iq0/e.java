package iq0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.base.LockableViewPager;
import com.pinterest.feature.search.typeahead.view.TypeaheadSearchBarContainer;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import eq0.n;
import hz.l;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z3;
import m60.r0;
import m60.x0;
import rm1.q;
import so.a7;
import so.z6;
import yk1.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liq0/e;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Lod0/d;", "Leq0/f;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends j<od0.d> implements eq0.f {
    public n1 A0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltTabLayout f73395r0;

    /* renamed from: s0, reason: collision with root package name */
    public TypeaheadSearchBarContainer f73396s0;

    /* renamed from: t0, reason: collision with root package name */
    public String f73397t0;

    /* renamed from: u0, reason: collision with root package name */
    public n f73398u0;

    /* renamed from: v0, reason: collision with root package name */
    public hq0.e f73399v0;

    /* renamed from: w0, reason: collision with root package name */
    public z6 f73400w0;

    /* renamed from: x0, reason: collision with root package name */
    public a7 f73401x0;

    /* renamed from: y0, reason: collision with root package name */
    public uk1.e f73402y0;

    /* renamed from: z0, reason: collision with root package name */
    public ip1.b f73403z0;

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        if (navigation != null) {
            String f49940b = navigation.getF49940b();
            Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
            this.f73397t0 = f49940b;
            String v03 = navigation.v0("com.pinterest.EXTRA_CONVO_THREAD_ANCHOR_ID");
            String v04 = navigation.v0("com.pinterest.EXTRA_CONVO_THREAD_ID");
            boolean G = com.bumptech.glide.d.G(this, "com.pinterest.EXTRA_CONVO_SHOULD_CREATE_NEW_THREAD", false);
            this.f73398u0 = v03 != null ? new n(v04, v03, com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_NEW_THREAD_TEXT_ANCHOR", ""), com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_CONVO_NEW_THREAD_PIN_ANCHOR_ID", ""), G) : null;
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        n1 n1Var = this.A0;
        if (n1Var == null) {
            Intrinsics.r("hairballExperiments");
            throw null;
        }
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) n1Var.f83439a;
        if (g1Var.o("android_message_composer_redesign", "enabled", z3Var) || g1Var.l("android_message_composer_redesign")) {
            ((GestaltToolbarImpl) toolbar).L(eo1.d.lego_card_rounded_top);
        }
        q qVar = q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        Context context = getContext();
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(context != null ? context.getString(xc0.i.send_a_pin) : null);
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, x0.cancel);
        gestaltToolbarImpl.u().setTint(getResources().getColor(eo1.b.color_themed_text_default, requireContext().getTheme()));
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.O(le0.d.bar_overflow, false);
    }

    @Override // yk1.k
    public final m V7() {
        z6 z6Var = this.f73400w0;
        if (z6Var == null) {
            Intrinsics.r("conversationSendAPinPresenterFactory");
            throw null;
        }
        uk1.e eVar = this.f73402y0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        ip1.b bVar = this.f73403z0;
        if (bVar == null) {
            Intrinsics.r("prefetchManager");
            throw null;
        }
        z61.b bVar2 = new z61.b();
        String str = this.f73397t0;
        if (str != null) {
            return z6Var.a(g13, bVar, bVar2, str, this.f73398u0);
        }
        Intrinsics.r("conversationId");
        throw null;
    }

    public final void j8(int i13) {
        b8().w(i13, true);
        GestaltTabLayout gestaltTabLayout = this.f73395r0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = gestaltTabLayout.n(i13);
        if (n13 != null) {
            n13.b();
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = xc0.f.fragment_conversation_send_a_pin_tab_host;
        a7 a7Var = this.f73401x0;
        if (a7Var == null) {
            Intrinsics.r("conversationSendAPinTabHostAdapterFactory");
            throw null;
        }
        String str = this.f73397t0;
        if (str == null) {
            Intrinsics.r("conversationId");
            throw null;
        }
        String uid = com.bumptech.glide.d.Q(getActiveUserManager()).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        f8(a7Var.a(str, uid, this.f73398u0));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(xc0.e.send_a_pin_tabs_layout);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73395r0 = (GestaltTabLayout) findViewById;
        View findViewById2 = onCreateView.findViewById(xc0.e.view_typeahead_search_bar_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f73396s0 = (TypeaheadSearchBarContainer) findViewById2;
        return onCreateView;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        GestaltTabLayout gestaltTabLayout = this.f73395r0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout.b(new c(this, 0));
        GestaltTabLayout gestaltTabLayout2 = this.f73395r0;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        int i13 = xc0.i.conversation_related_pins;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout2.d(b0.V(gestaltTabLayout2, bs1.c.j2(new String[0], i13), 0, 12), 0, true);
        GestaltTabLayout gestaltTabLayout3 = this.f73395r0;
        if (gestaltTabLayout3 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        int i14 = xc0.i.typeahead_yours_tab;
        if (gestaltTabLayout3 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout3.d(b0.V(gestaltTabLayout3, bs1.c.j2(new String[0], i14), 0, 12), 1, false);
        Y7(new l(this, 1));
        Object obj = b8().f21278a;
        ((LockableViewPager) obj).A(0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.following_tuner_view_pager_page_spacing);
        LockableViewPager lockableViewPager = (LockableViewPager) obj;
        int i15 = lockableViewPager.f19900m;
        lockableViewPager.f19900m = dimensionPixelSize;
        int width = lockableViewPager.getWidth();
        lockableViewPager.v(width, width, dimensionPixelSize, i15);
        lockableViewPager.requestLayout();
    }
}
