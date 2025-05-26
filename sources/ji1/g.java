package ji1;

import android.content.Context;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.n1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import eb2.k;
import h32.h2;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import m60.r0;
import m60.t0;
import m60.v0;
import nx.d0;
import nx.o0;
import nx.v;
import so.c6;
import so.jb;
import xk2.m;
import yq0.z;

/* loaded from: classes5.dex */
public final class g extends BaseRecyclerContainerView implements v, ky.h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f76300b;

    /* renamed from: c, reason: collision with root package name */
    public c6 f76301c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f76302d;

    /* renamed from: e, reason: collision with root package name */
    public ii1.e f76303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        inject();
        this.f76302d = m.b(e.f76297i);
        getPinterestRecyclerView().a(new k(false, 0, 0, getResources().getDimensionPixelSize(r0.margin_half), 0));
        setPinalytics(pinalytics);
        new n1().b(getPinterestRecyclerView().f52531a);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final zy.m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        if (d0Var == null) {
            return super.createImpressionLoggers(clock, d0Var, pinalyticsManager);
        }
        zy.m[] mVarArr = new zy.m[1];
        c6 c6Var = this.f76301c;
        if (c6Var != null) {
            mVarArr[0] = c6Var.a(d0Var, h2.STORY_CAROUSEL);
            return mVarArr;
        }
        Intrinsics.r("pinImpressionLoggerFactory");
        throw null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f76302d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return v0.view_story_video_carousel_container;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return t0.video_carousel_horizontal_recycler;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f76300b) {
            return;
        }
        this.f76300b = true;
        jb jbVar = (jb) ((h) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        this.f76301c = (c6) jbVar.f113485c.f114447q.get();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        ii1.e eVar = this.f76303e;
        if (eVar == null) {
            return null;
        }
        int size = eVar.d().size() - 1;
        String str = eVar.f72326g;
        if (str == null) {
            str = "";
        }
        return j.x(eVar.f72324e, str, size, 0, eVar.f72327h, null, null, 52);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        ii1.e eVar = this.f76303e;
        if (eVar != null) {
            return eVar.f72324e.y(eVar.f72328i);
        }
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        d0 pinalytics = getPinalytics();
        if (pinalytics != null) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM, new p91.v(24, this, pinalytics));
        }
        adapter.G(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM, new f(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM_HIDDEN, new f(this, 1));
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.CAROUSEL;
    }
}
