package h90;

import a.cb;
import com.pinterest.api.model.pi0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f68247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68248b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68249c;

    /* renamed from: d, reason: collision with root package name */
    public final pi0.a f68250d;

    /* renamed from: e, reason: collision with root package name */
    public final String f68251e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f68252f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f68253g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.l0 f68254h;

    /* renamed from: i, reason: collision with root package name */
    public final o82.j0 f68255i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f68256j;

    public f0(String str, String assetPinId, String assetUserId, pi0.a assetType, String collageId, boolean z13, boolean z14, zy.l0 pinalyticsVMState, o82.j0 listVMState, HashMap auxData) {
        Intrinsics.checkNotNullParameter(assetPinId, "assetPinId");
        Intrinsics.checkNotNullParameter(assetUserId, "assetUserId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f68247a = str;
        this.f68248b = assetPinId;
        this.f68249c = assetUserId;
        this.f68250d = assetType;
        this.f68251e = collageId;
        this.f68252f = z13;
        this.f68253g = z14;
        this.f68254h = pinalyticsVMState;
        this.f68255i = listVMState;
        this.f68256j = auxData;
    }

    public static f0 b(f0 f0Var, zy.l0 l0Var, o82.j0 j0Var, int i13) {
        String str = f0Var.f68247a;
        String assetPinId = f0Var.f68248b;
        String assetUserId = f0Var.f68249c;
        pi0.a assetType = f0Var.f68250d;
        String collageId = f0Var.f68251e;
        boolean z13 = f0Var.f68252f;
        boolean z14 = f0Var.f68253g;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            l0Var = f0Var.f68254h;
        }
        zy.l0 pinalyticsVMState = l0Var;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            j0Var = f0Var.f68255i;
        }
        o82.j0 listVMState = j0Var;
        HashMap auxData = f0Var.f68256j;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(assetPinId, "assetPinId");
        Intrinsics.checkNotNullParameter(assetUserId, "assetUserId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return new f0(str, assetPinId, assetUserId, assetType, collageId, z13, z14, pinalyticsVMState, listVMState, auxData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f68247a, f0Var.f68247a) && Intrinsics.d(this.f68248b, f0Var.f68248b) && Intrinsics.d(this.f68249c, f0Var.f68249c) && this.f68250d == f0Var.f68250d && Intrinsics.d(this.f68251e, f0Var.f68251e) && this.f68252f == f0Var.f68252f && this.f68253g == f0Var.f68253g && Intrinsics.d(this.f68254h, f0Var.f68254h) && Intrinsics.d(this.f68255i, f0Var.f68255i) && Intrinsics.d(this.f68256j, f0Var.f68256j);
    }

    public final int hashCode() {
        String str = this.f68247a;
        return this.f68256j.hashCode() + ep.b.c(this.f68255i.f93634a, jq.b.a(this.f68254h, ep.b.e(this.f68253g, ep.b.e(this.f68252f, cb.d(this.f68251e, (this.f68250d.hashCode() + cb.d(this.f68249c, cb.d(this.f68248b, (str == null ? 0 : str.hashCode()) * 31, 31), 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CutoutCloseupItemVMState(assetId=");
        sb3.append(this.f68247a);
        sb3.append(", assetPinId=");
        sb3.append(this.f68248b);
        sb3.append(", assetUserId=");
        sb3.append(this.f68249c);
        sb3.append(", assetType=");
        sb3.append(this.f68250d);
        sb3.append(", collageId=");
        sb3.append(this.f68251e);
        sb3.append(", isCollageAd=");
        sb3.append(this.f68252f);
        sb3.append(", hideRelatedFeedOnStart=");
        sb3.append(this.f68253g);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f68254h);
        sb3.append(", listVMState=");
        sb3.append(this.f68255i);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f68256j, ")");
    }
}
