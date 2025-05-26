package ae1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import sq0.e0;

/* loaded from: classes5.dex */
public final class h extends vq0.b {
    @Override // vq0.g
    /* renamed from: D3, reason: merged with bridge method [inline-methods] */
    public final void r3(d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        ((f) view).getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER;
    }

    @Override // vq0.g
    public final e0 p3() {
        return this;
    }
}
