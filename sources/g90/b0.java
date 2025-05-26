package g90;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class b0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f64509a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64510b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f64511c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f64512d;

    /* renamed from: e, reason: collision with root package name */
    public final String f64513e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64514f;

    public b0(String collageId, String tappedCutoutItemId, l0 pinalyticsState, boolean z13, String str, String str2) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        Intrinsics.checkNotNullParameter(tappedCutoutItemId, "tappedCutoutItemId");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f64509a = collageId;
        this.f64510b = tappedCutoutItemId;
        this.f64511c = pinalyticsState;
        this.f64512d = z13;
        this.f64513e = str;
        this.f64514f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f64509a, b0Var.f64509a) && Intrinsics.d(this.f64510b, b0Var.f64510b) && Intrinsics.d(this.f64511c, b0Var.f64511c) && this.f64512d == b0Var.f64512d && Intrinsics.d(this.f64513e, b0Var.f64513e) && Intrinsics.d(this.f64514f, b0Var.f64514f);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f64512d, jq.b.a(this.f64511c, cb.d(this.f64510b, this.f64509a.hashCode() * 31, 31), 31), 31);
        String str = this.f64513e;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64514f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CutoutCloseupVMState(collageId=");
        sb3.append(this.f64509a);
        sb3.append(", tappedCutoutItemId=");
        sb3.append(this.f64510b);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f64511c);
        sb3.append(", isCollageAd=");
        sb3.append(this.f64512d);
        sb3.append(", rootPinUid=");
        sb3.append(this.f64513e);
        sb3.append(", rootPinId=");
        return a.a.p(sb3, this.f64514f, ")");
    }
}
