package lm0;

import a.cb;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class x0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f83907a;

    /* renamed from: b, reason: collision with root package name */
    public final v7 f83908b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83909c;

    /* renamed from: d, reason: collision with root package name */
    public final String f83910d;

    /* renamed from: e, reason: collision with root package name */
    public final wa2.m f83911e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f83912f;

    /* renamed from: g, reason: collision with root package name */
    public final sk0.y f83913g;

    /* renamed from: h, reason: collision with root package name */
    public final um0.w0 f83914h;

    /* renamed from: i, reason: collision with root package name */
    public final o82.j0 f83915i;

    /* renamed from: j, reason: collision with root package name */
    public final zy.l0 f83916j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f83917k;

    /* renamed from: l, reason: collision with root package name */
    public final c1 f83918l;

    public x0(String boardId, v7 v7Var, String boardSessionId, String storyRequestParams, wa2.m pinFeatureConfig, z0 viewOptionsVMState, sk0.y boardToolsVMState, um0.w0 organizeVMState, o82.j0 sectionVMState, zy.l0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(viewOptionsVMState, "viewOptionsVMState");
        Intrinsics.checkNotNullParameter(boardToolsVMState, "boardToolsVMState");
        Intrinsics.checkNotNullParameter(organizeVMState, "organizeVMState");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f83907a = boardId;
        this.f83908b = v7Var;
        this.f83909c = boardSessionId;
        this.f83910d = storyRequestParams;
        this.f83911e = pinFeatureConfig;
        this.f83912f = viewOptionsVMState;
        this.f83913g = boardToolsVMState;
        this.f83914h = organizeVMState;
        this.f83915i = sectionVMState;
        this.f83916j = pinalyticsState;
        this.f83917k = organizeVMState.f122779i;
        this.f83918l = viewOptionsVMState.f83922a;
    }

    public static x0 b(x0 x0Var, String str, v7 v7Var, wa2.m mVar, z0 z0Var, sk0.y yVar, um0.w0 w0Var, o82.j0 j0Var, zy.l0 l0Var, int i13) {
        String boardId = (i13 & 1) != 0 ? x0Var.f83907a : str;
        v7 v7Var2 = (i13 & 2) != 0 ? x0Var.f83908b : v7Var;
        String boardSessionId = x0Var.f83909c;
        String storyRequestParams = x0Var.f83910d;
        wa2.m pinFeatureConfig = (i13 & 16) != 0 ? x0Var.f83911e : mVar;
        z0 viewOptionsVMState = (i13 & 32) != 0 ? x0Var.f83912f : z0Var;
        sk0.y boardToolsVMState = (i13 & 64) != 0 ? x0Var.f83913g : yVar;
        um0.w0 organizeVMState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? x0Var.f83914h : w0Var;
        o82.j0 sectionVMState = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? x0Var.f83915i : j0Var;
        zy.l0 pinalyticsState = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? x0Var.f83916j : l0Var;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        Intrinsics.checkNotNullParameter(storyRequestParams, "storyRequestParams");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(viewOptionsVMState, "viewOptionsVMState");
        Intrinsics.checkNotNullParameter(boardToolsVMState, "boardToolsVMState");
        Intrinsics.checkNotNullParameter(organizeVMState, "organizeVMState");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new x0(boardId, v7Var2, boardSessionId, storyRequestParams, pinFeatureConfig, viewOptionsVMState, boardToolsVMState, organizeVMState, sectionVMState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f83907a, x0Var.f83907a) && Intrinsics.d(this.f83908b, x0Var.f83908b) && Intrinsics.d(this.f83909c, x0Var.f83909c) && Intrinsics.d(this.f83910d, x0Var.f83910d) && Intrinsics.d(this.f83911e, x0Var.f83911e) && Intrinsics.d(this.f83912f, x0Var.f83912f) && Intrinsics.d(this.f83913g, x0Var.f83913g) && Intrinsics.d(this.f83914h, x0Var.f83914h) && Intrinsics.d(this.f83915i, x0Var.f83915i) && Intrinsics.d(this.f83916j, x0Var.f83916j);
    }

    public final int hashCode() {
        int hashCode = this.f83907a.hashCode() * 31;
        v7 v7Var = this.f83908b;
        return this.f83916j.hashCode() + ep.b.c(this.f83915i.f93634a, (this.f83914h.hashCode() + ((this.f83913g.hashCode() + ((this.f83912f.hashCode() + ((this.f83911e.hashCode() + cb.d(this.f83910d, cb.d(this.f83909c, (hashCode + (v7Var == null ? 0 : v7Var.hashCode())) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "AllSavesVMState(boardId=" + this.f83907a + ", board=" + this.f83908b + ", boardSessionId=" + this.f83909c + ", storyRequestParams=" + this.f83910d + ", pinFeatureConfig=" + this.f83911e + ", viewOptionsVMState=" + this.f83912f + ", boardToolsVMState=" + this.f83913g + ", organizeVMState=" + this.f83914h + ", sectionVMState=" + this.f83915i + ", pinalyticsState=" + this.f83916j + ")";
    }
}
