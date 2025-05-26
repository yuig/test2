package jp0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import h32.h2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kp0.d;
import nx.d0;
import nx.o0;
import nx.v;
import om0.m1;
import pb0.g;
import ps.p;
import ps.q;
import so.c6;
import so.jb;
import yk1.n;
import yn2.c0;
import yq0.z;
import zy.m;

/* loaded from: classes5.dex */
public final class b extends BaseRecyclerContainerView implements n, v {

    /* renamed from: b, reason: collision with root package name */
    public boolean f77279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77280c;

    /* renamed from: d, reason: collision with root package name */
    public c6 f77281d;

    /* renamed from: e, reason: collision with root package name */
    public d f77282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d0 pinalytics, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        inject();
        this.f77280c = i13;
        setPinalytics(pinalytics);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        g clock = g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        if (d0Var == null) {
            return super.createImpressionLoggers(clock, null, pinalyticsManager);
        }
        m[] mVarArr = new m[1];
        c6 c6Var = this.f77281d;
        if (c6Var != null) {
            mVarArr[0] = c6Var.a(d0Var, h2.STORY_CAROUSEL);
            return mVarArr;
        }
        Intrinsics.r("pinImpressionLoggerFactory");
        throw null;
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            return c0.t(c0.j(d7.b.O(recyclerView), a.f77278i));
        }
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return "QCM Drawer Carousel View";
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return q.ads_qcm_drawer_carousel_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return p.qcm_carousel_horizontal_recycler;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f77279b) {
            return;
        }
        this.f77279b = true;
        jb jbVar = (jb) ((c) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        this.f77281d = (c6) jbVar.f113485c.f114447q.get();
        this.f77282e = (d) jbVar.f113501s.get();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        d0 pinalytics = getPinalytics();
        if (pinalytics != null) {
            adapter.G(0, new m1(3, this, pinalytics));
        }
    }
}
