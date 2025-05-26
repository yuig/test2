package fb2;

import android.content.Context;
import androidx.appcompat.widget.q;
import androidx.recyclerview.widget.b1;
import com.pinterest.ui.snappablecarousel.SnappableCarouselLayoutManager;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public abstract class b extends BaseRecyclerContainerView {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f61613f = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f61614b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61615c;

    /* renamed from: d, reason: collision with root package name */
    public final v f61616d;

    /* renamed from: e, reason: collision with root package name */
    public d f61617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i13, int i14) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f61615c = i14;
        this.f61616d = m.b(a.f61612i);
        int i15 = ((int) (hf0.b.f69002b / 2)) - ((i13 / 2) + i14);
        getPinterestRecyclerView().f52531a.setPaddingRelative(i15, 0, i15, 0);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        g41.a aVar = new g41.a(this, 21);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SnappableCarouselLayoutManager layoutManager = new SnappableCarouselLayoutManager(aVar, context, new q(this, 2), this.f61615c, 48);
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        return new b1(layoutManager);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f61616d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return k42.e.view_snappable_carousel;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return k42.d.snappable_carousel;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f61614b) {
            return;
        }
        this.f61614b = true;
        this.videoViewabilityRecyclerListenerProvider = ((jb) ((e) generatedComponent())).f113494l;
    }
}
