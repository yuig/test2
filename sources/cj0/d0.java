package cj0;

import a.cb;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27794a;

    /* renamed from: b, reason: collision with root package name */
    public final wa2.m f27795b;

    /* renamed from: c, reason: collision with root package name */
    public final v7 f27796c;

    /* renamed from: d, reason: collision with root package name */
    public final zo.c f27797d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27798e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27799f;

    /* renamed from: g, reason: collision with root package name */
    public final o82.j0 f27800g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.l0 f27801h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27802i;

    public d0(String boardId, wa2.m pinFeatureConfig, v7 v7Var, zo.c boardViewType, String boardSessionId, String str, o82.j0 sectionVMState, zy.l0 pinalyticsState, boolean z13) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f27794a = boardId;
        this.f27795b = pinFeatureConfig;
        this.f27796c = v7Var;
        this.f27797d = boardViewType;
        this.f27798e = boardSessionId;
        this.f27799f = str;
        this.f27800g = sectionVMState;
        this.f27801h = pinalyticsState;
        this.f27802i = z13;
    }

    public static d0 b(d0 d0Var, wa2.m mVar, v7 v7Var, zo.c cVar, o82.j0 j0Var, zy.l0 l0Var, boolean z13, int i13) {
        String boardId = d0Var.f27794a;
        wa2.m pinFeatureConfig = (i13 & 2) != 0 ? d0Var.f27795b : mVar;
        v7 v7Var2 = (i13 & 4) != 0 ? d0Var.f27796c : v7Var;
        zo.c boardViewType = (i13 & 8) != 0 ? d0Var.f27797d : cVar;
        String boardSessionId = d0Var.f27798e;
        String str = d0Var.f27799f;
        o82.j0 sectionVMState = (i13 & 64) != 0 ? d0Var.f27800g : j0Var;
        zy.l0 pinalyticsState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? d0Var.f27801h : l0Var;
        boolean z14 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? d0Var.f27802i : z13;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new d0(boardId, pinFeatureConfig, v7Var2, boardViewType, boardSessionId, str, sectionVMState, pinalyticsState, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f27794a, d0Var.f27794a) && Intrinsics.d(this.f27795b, d0Var.f27795b) && Intrinsics.d(this.f27796c, d0Var.f27796c) && this.f27797d == d0Var.f27797d && Intrinsics.d(this.f27798e, d0Var.f27798e) && Intrinsics.d(this.f27799f, d0Var.f27799f) && Intrinsics.d(this.f27800g, d0Var.f27800g) && Intrinsics.d(this.f27801h, d0Var.f27801h) && this.f27802i == d0Var.f27802i;
    }

    public final int hashCode() {
        int hashCode = (this.f27795b.hashCode() + (this.f27794a.hashCode() * 31)) * 31;
        v7 v7Var = this.f27796c;
        int d2 = cb.d(this.f27798e, (this.f27797d.hashCode() + ((hashCode + (v7Var == null ? 0 : v7Var.hashCode())) * 31)) * 31, 31);
        String str = this.f27799f;
        return Boolean.hashCode(this.f27802i) + jq.b.a(this.f27801h, ep.b.c(this.f27800g.f93634a, (d2 + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AutomagicalBoardVMState(boardId=");
        sb3.append(this.f27794a);
        sb3.append(", pinFeatureConfig=");
        sb3.append(this.f27795b);
        sb3.append(", board=");
        sb3.append(this.f27796c);
        sb3.append(", boardViewType=");
        sb3.append(this.f27797d);
        sb3.append(", boardSessionId=");
        sb3.append(this.f27798e);
        sb3.append(", storyRequestParams=");
        sb3.append(this.f27799f);
        sb3.append(", sectionVMState=");
        sb3.append(this.f27800g);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f27801h);
        sb3.append(", toolbarTitlesShown=");
        return a.a.r(sb3, this.f27802i, ")");
    }
}
