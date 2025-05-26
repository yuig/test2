package kd0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubRecentPinEmptyStateView;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubRecentPinRow;
import com.pinterest.creatorHub.feature.hub.view.components.RecentPinsModuleFooter;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.c1;
import eb2.k;
import g4.u;
import id0.e;
import jd0.i;
import jd0.j;
import kg.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ld0.f;
import lh0.a4;
import lh0.g1;
import lh0.r0;
import lh0.z3;
import nx.d0;
import ra0.l0;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f79222j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f79221i = i13;
        this.f79222j = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79221i;
        b bVar = this.f79222j;
        switch (i13) {
            case 0:
                r0 r0Var = bVar.f79223z0;
                if (r0Var == null) {
                    Intrinsics.r("creatorhubExperiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) r0Var.f83467a;
                return Boolean.valueOf(g1Var.o("android_creator_hub_paid_partnership_onboarding", "enabled", z3Var) || g1Var.l("android_creator_hub_paid_partnership_onboarding"));
            case 1:
                m170invoke();
                return Unit.f80348a;
            case 2:
                m170invoke();
                return Unit.f80348a;
            case 3:
                m170invoke();
                return Unit.f80348a;
            case 4:
                m170invoke();
                return Unit.f80348a;
            case 5:
                m170invoke();
                return Unit.f80348a;
            case 6:
                Context requireContext = bVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new f(requireContext);
            case 7:
                Context requireContext2 = bVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return new ld0.d(requireContext2);
            case 8:
                Context context = bVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                ld0.a aVar = new ld0.a(context);
                i iVar = new i(0);
                aVar.f82950a = iVar;
                View.inflate(context, rd0.c.module_creator_news, aVar);
                aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                View findViewById = aVar.findViewById(rd0.b.news_module_view_pager);
                ViewPager2 viewPager2 = (ViewPager2) findViewById;
                viewPager2.h(iVar);
                int dimensionPixelSize = viewPager2.getResources().getDimensionPixelSize(eo1.c.space_200);
                viewPager2.f19930j.m(new k(dimensionPixelSize, 0, dimensionPixelSize, 0));
                viewPager2.l(new u());
                viewPager2.k(2);
                Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
                return aVar;
            case 9:
                Context requireContext3 = bVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new CreatorHubRecentPinRow(requireContext3);
            case 10:
                Context requireContext4 = bVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return new j(requireContext4);
            case 11:
                Context requireContext5 = bVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new CreatorHubRecentPinEmptyStateView(requireContext5);
            default:
                Context context2 = bVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                RecentPinsModuleFooter recentPinsModuleFooter = new RecentPinsModuleFooter(context2);
                recentPinsModuleFooter.setLayoutParams(new FrameLayout.LayoutParams(-1, recentPinsModuleFooter.getResources().getDimensionPixelSize(eo1.c.space_400)));
                recentPinsModuleFooter.setBackground(bs1.c.f0(recentPinsModuleFooter, rd0.a.recent_pins_module_footer_bg, null, null, 6));
                return recentPinsModuleFooter;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m170invoke() {
        int i13 = this.f79221i;
        b bVar = this.f79222j;
        switch (i13) {
            case 1:
                e eVar = bVar.E0;
                if (eVar != null) {
                    b bVar2 = (b) ((fd0.b) eVar.getView());
                    d0 s73 = bVar2.s7();
                    Context requireContext = bVar2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    t.M0(s73, requireContext, ou1.e.CREATOR_HUB_TOOLS, null, null, 0, 56);
                    eVar.t3(md0.a.DRAFT_TOOL_TAPPED);
                    return;
                }
                Intrinsics.r("creatorHubViewListener");
                throw null;
            case 2:
                e eVar2 = bVar.E0;
                if (eVar2 != null) {
                    b bVar3 = (b) ((fd0.b) eVar2.getView());
                    bVar3.getClass();
                    NavigationImpl w13 = Navigation.w1(c1.c());
                    w13.Y1("com.pinterest.EXTRA_SHOW_TOOL_BAR", true);
                    Intrinsics.checkNotNullExpressionValue(w13, "apply(...)");
                    bVar3.M1(w13);
                    eVar2.t3(md0.a.ENGAGEMENT_TOOL_TAPPED);
                    return;
                }
                Intrinsics.r("creatorHubViewListener");
                throw null;
            case 3:
                e eVar3 = bVar.E0;
                if (eVar3 != null) {
                    b bVar4 = (b) ((fd0.b) eVar3.getView());
                    bVar4.getClass();
                    NavigationImpl w14 = Navigation.w1(c1.d());
                    Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
                    bVar4.M1(w14);
                    eVar3.t3(md0.a.ANALYTICS_TOOL_TAPPED);
                    return;
                }
                Intrinsics.r("creatorHubViewListener");
                throw null;
            case 4:
                e eVar4 = bVar.E0;
                if (eVar4 != null) {
                    String id3 = com.bumptech.glide.d.Q(eVar4.f72134g).getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    xj2.c o13 = eVar4.f72133f.w(id3, n00.b.a(n00.c.USER_OPTED_IN_TO_PAID_PARTNERSHIPS_FIELDS)).r(tk2.e.f118017c).l(wj2.c.a()).o(new k90.i(14, new l0(eVar4, 22)), new k90.i(15, id0.d.f72127i));
                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                    eVar4.addDisposable(o13);
                    return;
                }
                Intrinsics.r("creatorHubViewListener");
                throw null;
            default:
                e eVar5 = bVar.E0;
                if (eVar5 == null) {
                    Intrinsics.r("creatorHubViewListener");
                    throw null;
                }
                eVar5.t3(md0.a.CREATOR_TOOLS_MODULE_VIEWED);
                return;
        }
    }
}
