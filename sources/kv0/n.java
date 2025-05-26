package kv0;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes5.dex */
public final class n extends hd1.b {
    public boolean R;

    @Override // hd1.b, com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        return getItem(i13) instanceof f30 ? RecyclerViewTypes.VIEW_TYPE_FIXED_SIZE_PIN_CELL : super.getItemViewType(i13);
    }

    @Override // wt1.b
    public final boolean i() {
        return this.R;
    }
}
