package ht0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import java.util.ArrayList;
import java.util.Iterator;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pg0.f0;
import pk.a0;
import so.w7;
import u50.k0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lht0/m;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Lod0/d;", "Lrs0/c;", "<init>", "()V", "homeFeedTuner_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m extends c<od0.d> implements rs0.c {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f70121z0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public wk2.a f70122r0;

    /* renamed from: s0, reason: collision with root package name */
    public uk1.e f70123s0;

    /* renamed from: t0, reason: collision with root package name */
    public w7 f70124t0;

    /* renamed from: u0, reason: collision with root package name */
    public g92.e f70125u0;

    /* renamed from: v0, reason: collision with root package name */
    public us0.d f70126v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltTabLayout f70127w0;

    /* renamed from: x0, reason: collision with root package name */
    public GestaltText f70128x0;

    /* renamed from: y0, reason: collision with root package name */
    public us0.d f70129y0;

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, nl1.d
    public final d4 E7() {
        return d4.HOMEFEED_CONTROL;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(xp1.d.homefeed_tuner_title_entrypoint_exp);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        gestaltToolbarImpl.e0(a0.a(requireContext));
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        Context requireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        gestaltToolbarImpl.P(qVar.drawableRes(requireContext2, dl2.b.f1(requireContext3)), eo1.b.color_themed_text_default);
        gestaltToolbarImpl.i();
        gestaltToolbarImpl.U(new lj0.a(this, 28));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        w7 w7Var = this.f70124t0;
        if (w7Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        uk1.e eVar = this.f70123s0;
        if (eVar == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        us0.d a13 = w7Var.a(((uk1.a) eVar).g());
        this.f70126v0 = a13;
        return a13;
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        if (com.bumptech.glide.d.G(this, "EXTRAS_KEY_IS_HOMEFEED_TUNER_IN_LOCAL_NAVIGATION", false)) {
            f7().f(new f0());
        }
        nl1.d.J7();
        return false;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = xp1.b.fragment_home_feed_tuner;
        wk2.a aVar = this.f70122r0;
        if (aVar == null) {
            Intrinsics.r("adapterProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        f8((jr.a) obj);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f70129y0 = null;
        super.onDestroyView();
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(xp1.a.navigation_tab_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f70127w0 = (GestaltTabLayout) findViewById;
        View findViewById2 = view.findViewById(xp1.a.tv_description_section);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f70128x0 = (GestaltText) findViewById2;
        us0.d dVar = this.f70126v0;
        if (dVar == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        ArrayList p33 = dVar.p3();
        GestaltTabLayout gestaltTabLayout = this.f70127w0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        if (gestaltTabLayout.f33150z != 2) {
            gestaltTabLayout.f33150z = 2;
            gestaltTabLayout.h();
        }
        g92.e eVar = this.f70125u0;
        if (eVar == null) {
            Intrinsics.r("themeManager");
            throw null;
        }
        int G0 = dl2.b.G0(gestaltTabLayout, ((g92.f) eVar).a() == g92.d.CLASSIC ? eo1.a.sema_space_150 : eo1.a.sema_space_200);
        ViewGroup.LayoutParams layoutParams = gestaltTabLayout.getLayoutParams();
        LinearLayoutCompat.LayoutParams layoutParams2 = layoutParams instanceof LinearLayoutCompat.LayoutParams ? (LinearLayoutCompat.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(G0);
            layoutParams2.setMarginEnd(G0);
        }
        Iterator it = p33.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            int b13 = vVar.b();
            int a13 = vVar.a();
            GestaltTabLayout gestaltTabLayout2 = this.f70127w0;
            if (gestaltTabLayout2 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            gestaltTabLayout2.c(b0.V(gestaltTabLayout2, new k0(a13, new ArrayList(0)), b13, 8));
        }
        GestaltTabLayout gestaltTabLayout3 = this.f70127w0;
        if (gestaltTabLayout3 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout3.b(new ek.i(this, 1));
        int ordinal = com.bumptech.glide.d.G(this, "EXTRAS_KEY_HOME_FEED_TUNER_IS_BOARD_TAB_INITIALLY_SELECTED", false) ? us0.e.BOARDS.ordinal() : us0.e.PINS.ordinal();
        us0.d dVar2 = this.f70126v0;
        if (dVar2 == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        dVar2.s3(ordinal);
        b8().w(ordinal, true);
        GestaltTabLayout gestaltTabLayout4 = this.f70127w0;
        if (gestaltTabLayout4 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = gestaltTabLayout4.n(ordinal);
        if (n13 != null) {
            n13.b();
        }
        Y7(new l(this, p33));
        us0.d dVar3 = this.f70126v0;
        if (dVar3 == null) {
            Intrinsics.r("presenter");
            throw null;
        }
        if (dVar3.q3()) {
            View view2 = getView();
            GestaltText gestaltText = view2 != null ? (GestaltText) view2.findViewById(xp1.a.home_feed_tuner_header) : null;
            if (gestaltText != null) {
                a0.k0(gestaltText);
            }
            GestaltTabLayout gestaltTabLayout5 = this.f70127w0;
            if (gestaltTabLayout5 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams3 = gestaltTabLayout5.getLayoutParams();
            LinearLayoutCompat.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayoutCompat.LayoutParams ? (LinearLayoutCompat.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                GestaltTabLayout gestaltTabLayout6 = this.f70127w0;
                if (gestaltTabLayout6 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                ((LinearLayout.LayoutParams) layoutParams4).topMargin = dl2.b.G0(gestaltTabLayout6, eo1.a.sema_space_negative_300);
                GestaltTabLayout gestaltTabLayout7 = this.f70127w0;
                if (gestaltTabLayout7 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                ((LinearLayout.LayoutParams) layoutParams4).bottomMargin = dl2.b.G0(gestaltTabLayout7, eo1.a.sema_space_400);
            }
            GestaltText gestaltText2 = this.f70128x0;
            if (gestaltText2 != null) {
                gestaltText2.i(k.f70115j);
            } else {
                Intrinsics.r("tabDescription");
                throw null;
            }
        }
    }
}
