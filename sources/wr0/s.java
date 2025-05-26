package wr0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import com.pinterest.feature.profile.lego.empty.LegoEmptyStateView;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import so.p7;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwr0/s;", "Lyq0/b0;", "Lyq0/a0;", "Lwr0/f;", "<init>", "()V", "engagementTab_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class s extends d0<yq0.a0> implements f {
    public i92.k A0;
    public final d4 B0 = d4.SOCIAL_MANAGER;

    /* renamed from: z0, reason: collision with root package name */
    public p7 f130914z0;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(3283, new yq0.k(this, 20));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Navigation navigation = this.I;
        if (navigation == null || !navigation.S("com.pinterest.EXTRA_SHOW_TOOL_BAR", false)) {
            ((GestaltToolbarImpl) toolbar).B();
        } else {
            ((GestaltToolbarImpl) toolbar).b0(getResources().getText(mg0.c.engagement_tab_title));
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        p7 p7Var = this.f130914z0;
        if (p7Var != null) {
            return p7Var.a();
        }
        Intrinsics.r("engagementTabPresenterFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF77582e1() {
        return this.B0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(mg0.b.fragment_engagement_tab, mg0.a.engagement_recycler_view);
        eVar.f979c = mg0.a.engagement_tab_empty_state_container;
        eVar.c(mg0.a.engagement_tab_swipe_refresh_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = mg0.b.fragment_engagement_tab;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f(true);
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        LegoEmptyStateView legoEmptyStateView = new LegoEmptyStateView(requireContext);
        String string = legoEmptyStateView.getResources().getString(mg0.c.engagement_tab_empty_state_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoEmptyStateView.e(string);
        legoEmptyStateView.a();
        O8(legoEmptyStateView, 17);
        fo1.a i73 = i7();
        if (i73 != null) {
            rm1.q qVar = rm1.q.ARROW_BACK;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            int drawableRes = qVar.drawableRes(requireContext2, dl2.b.f1(requireContext3));
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
            gestaltToolbarImpl.o();
            gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, x0.cancel);
            gestaltToolbarImpl.m();
        }
        super.onViewCreated(v13, bundle);
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(mg0.a.engagement_toolbar);
    }
}
