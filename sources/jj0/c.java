package jj0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.w;
import mj0.j;
import nr0.l;
import nx.b0;
import oj0.g;
import oj0.h;
import oj0.i;
import qz.f0;
import v31.f;
import x02.i2;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class c extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final String L;
    public final i2 M;
    public final Function0 N;
    public final h O;
    public final w P;
    public final b0 Q;
    public final v R;
    public final v S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String boardId, i2 pinRepository, g0 pageSizeProvider, Function0 shouldLoad, h hVar, i oneTapSaveListener, w eventManager, String remoteUrl, x12.a pagedListService, l viewBinderDelegate, wa2.i pinFeatureConfig, b0 pinAuxHelper) {
        super(remoteUrl, viewBinderDelegate, null, null, null, new ke0.a[]{gh0.b.R(), gh0.b.N()}, null, pagedListService, null, 0L, null, 7900);
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(shouldLoad, "shouldLoad");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.L = boardId;
        this.M = pinRepository;
        this.N = shouldLoad;
        this.O = hVar;
        this.P = eventManager;
        this.Q = pinAuxHelper;
        v b13 = m.b(new b(this, 0));
        this.R = b13;
        this.S = m.b(new b(this, 1));
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.BOARD_PIN_FEED));
        f0Var.e("page_size", pageSizeProvider.d());
        this.f49121k = f0Var;
        int[] iArr = j.f87276a;
        j.a(this, pinFeatureConfig, (g) b13.getValue(), true, null, null, 48);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        if (itemsToSet.isEmpty() && this.f49127q.size() == 1 && (getItem(0) instanceof f)) {
            return;
        }
        if (this.O != null) {
            ((g) this.R.getValue()).c();
        }
        super.b0(itemsToSet, z13);
    }

    @Override // wt1.b
    public final boolean i() {
        return ((Boolean) this.N.invoke()).booleanValue();
    }
}
