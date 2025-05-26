package com.pinterest.activity.pin.view.pdp;

import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tq.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/pinterest/activity/pin/view/pdp/PdpCloseupCarouselView$createLayoutManagerContract$1", "Landroidx/recyclerview/widget/PinterestLinearLayoutManager;", "closeup_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PdpCloseupCarouselView$createLayoutManagerContract$1 extends PinterestLinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.l2
    public final void W0(RecyclerView recyclerView, w2 w2Var, int i13) {
        s sVar = new s(recyclerView != null ? recyclerView.getContext() : null, 0);
        sVar.f19651a = i13;
        X0(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int t1(w2 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return 1;
    }
}
