package ae1;

import android.content.Context;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import xk2.m;
import xk2.v;
import yq0.z;

/* loaded from: classes5.dex */
public final class f extends BaseRecyclerContainerView implements d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f15054b;

    /* renamed from: c, reason: collision with root package name */
    public final v f15055c;

    /* renamed from: d, reason: collision with root package name */
    public b f15056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f15055c = m.b(e.f15053i);
        setOrientation(0);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f15055c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return mz1.f.view_color_filters_carousel;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return mz1.e.color_filters_carousel;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f15054b) {
            return;
        }
        this.f15054b = true;
        this.videoViewabilityRecyclerListenerProvider = ((jb) ((g) generatedComponent())).f113494l;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER, new h81.b(this, 27));
    }
}
