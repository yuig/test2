package l71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;

/* loaded from: classes5.dex */
public final class t extends s {
    @Override // l71.f
    public final boolean B() {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PICKER_CAROUSEL;
    }

    @Override // l71.f
    public final b0 w(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        kk2.b j13 = b0.j(e0.b(new n71.a()));
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }
}
