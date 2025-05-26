package com.pinterest.creatorHub.feature.creatorpathways;

import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import yk1.n;
import yk1.t;

/* loaded from: classes5.dex */
public final class j extends t implements ca2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uk1.d pinalytics, q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
    }

    @Override // ca2.b
    public void o2(int i13) {
        if (i13 == 4) {
            ((f) ((c) getView())).P7();
        }
    }

    public void p3(a action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i13 = h.f44792a[action.ordinal()];
        if (i13 == 1) {
            ((f) ((c) getView())).P7();
            getPinalytics().t(new i0(d4.CREATOR_PATHWAYS, null, null, g0.CREATOR_FUND_ELIGIBILITY_PATHWAY, null, u0.DISMISS_BUTTON), null, null, f1.TAP, null, null, false);
            return;
        }
        if (i13 != 2) {
            if (i13 != 3) {
                return;
            }
            i iVar = i.f44794k;
            n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            iVar.invoke(view);
            ((f) ((c) getView())).P7();
            return;
        }
        i iVar2 = i.f44793j;
        n view2 = getView();
        Intrinsics.checkNotNullExpressionValue(view2, "<get-view>(...)");
        iVar2.invoke(view2);
        ((f) ((c) getView())).P7();
        getPinalytics().t(new i0(d4.CREATOR_PATHWAYS, null, null, g0.CREATOR_FUND_ELIGIBILITY_PATHWAY, null, u0.CREATE_STORY_PIN_BUTTON), null, null, f1.TAP, null, null, false);
    }
}
