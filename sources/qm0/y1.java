package qm0;

import a.cb;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class y1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104361a;

    /* renamed from: b, reason: collision with root package name */
    public final v7 f104362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104363c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f104364d;

    /* renamed from: e, reason: collision with root package name */
    public final o82.j0 f104365e;

    /* renamed from: f, reason: collision with root package name */
    public final sk0.y f104366f;

    /* renamed from: g, reason: collision with root package name */
    public final i91.b f104367g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f104368h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f104369i;

    /* renamed from: j, reason: collision with root package name */
    public final zy.l0 f104370j;

    public y1(String boardId, v7 v7Var, String boardSessionId, wa2.m pinFeatureConfig, o82.j0 sectionVMState, sk0.y boardToolsVMState, i91.b previewState, boolean z13, boolean z14, zy.l0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(boardToolsVMState, "boardToolsVMState");
        Intrinsics.checkNotNullParameter(previewState, "previewState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f104361a = boardId;
        this.f104362b = v7Var;
        this.f104363c = boardSessionId;
        this.f104364d = pinFeatureConfig;
        this.f104365e = sectionVMState;
        this.f104366f = boardToolsVMState;
        this.f104367g = previewState;
        this.f104368h = z13;
        this.f104369i = z14;
        this.f104370j = pinalyticsState;
    }

    public static y1 b(y1 y1Var, String str, v7 v7Var, o82.j0 j0Var, sk0.y yVar, i91.b bVar, boolean z13, boolean z14, zy.l0 l0Var, int i13) {
        String boardId = (i13 & 1) != 0 ? y1Var.f104361a : str;
        v7 v7Var2 = (i13 & 2) != 0 ? y1Var.f104362b : v7Var;
        String boardSessionId = y1Var.f104363c;
        wa2.m pinFeatureConfig = y1Var.f104364d;
        o82.j0 sectionVMState = (i13 & 16) != 0 ? y1Var.f104365e : j0Var;
        sk0.y boardToolsVMState = (i13 & 32) != 0 ? y1Var.f104366f : yVar;
        i91.b previewState = (i13 & 64) != 0 ? y1Var.f104367g : bVar;
        boolean z15 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? y1Var.f104368h : z13;
        boolean z16 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? y1Var.f104369i : z14;
        zy.l0 pinalyticsState = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? y1Var.f104370j : l0Var;
        y1Var.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(boardToolsVMState, "boardToolsVMState");
        Intrinsics.checkNotNullParameter(previewState, "previewState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new y1(boardId, v7Var2, boardSessionId, pinFeatureConfig, sectionVMState, boardToolsVMState, previewState, z15, z16, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Intrinsics.d(this.f104361a, y1Var.f104361a) && Intrinsics.d(this.f104362b, y1Var.f104362b) && Intrinsics.d(this.f104363c, y1Var.f104363c) && Intrinsics.d(this.f104364d, y1Var.f104364d) && Intrinsics.d(this.f104365e, y1Var.f104365e) && Intrinsics.d(this.f104366f, y1Var.f104366f) && Intrinsics.d(this.f104367g, y1Var.f104367g) && this.f104368h == y1Var.f104368h && this.f104369i == y1Var.f104369i && Intrinsics.d(this.f104370j, y1Var.f104370j);
    }

    public final int hashCode() {
        int hashCode = this.f104361a.hashCode() * 31;
        v7 v7Var = this.f104362b;
        return this.f104370j.hashCode() + ep.b.e(this.f104369i, ep.b.e(this.f104368h, (this.f104367g.hashCode() + ((this.f104366f.hashCode() + ep.b.c(this.f104365e.f93634a, (this.f104364d.hashCode() + cb.d(this.f104363c, (hashCode + (v7Var == null ? 0 : v7Var.hashCode())) * 31, 31)) * 31, 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "BoardLandingVMState(boardId=" + this.f104361a + ", board=" + this.f104362b + ", boardSessionId=" + this.f104363c + ", pinFeatureConfig=" + this.f104364d + ", sectionVMState=" + this.f104365e + ", boardToolsVMState=" + this.f104366f + ", previewState=" + this.f104367g + ", hasPendingCollaboratorInvites=" + this.f104368h + ", groupMessageRequestInProgress=" + this.f104369i + ", pinalyticsState=" + this.f104370j + ")";
    }
}
