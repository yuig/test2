package zm;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class a extends d {
    @Override // zm.d
    public final int a(int i13) {
        return i13 <= 8 ? RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY_FILTER_ITEM : RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER;
    }

    @Override // zm.d
    public final int c() {
        return 10;
    }
}
