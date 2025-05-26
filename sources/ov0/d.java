package ov0;

import com.pinterest.api.model.vx;
import com.pinterest.api.model.zq;
import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import dl1.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends h0 {
    public String E;

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        ArrayList H0 = CollectionsKt.H0(itemsToSet);
        if (itemsToSet.isEmpty() && this.E.length() > 0) {
            H0.add(0, new vx(this.E));
        }
        super.b0(H0, z13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        if (item instanceof zq) {
            return 4;
        }
        return item instanceof vx ? 6 : -1;
    }
}
