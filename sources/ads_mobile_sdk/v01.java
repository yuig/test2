package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v01 {

    /* renamed from: a, reason: collision with root package name */
    public String f12272a;

    /* renamed from: b, reason: collision with root package name */
    public String f12273b;

    /* renamed from: c, reason: collision with root package name */
    public int f12274c;

    /* renamed from: d, reason: collision with root package name */
    public nl0 f12275d;

    /* renamed from: e, reason: collision with root package name */
    public int f12276e;

    public /* synthetic */ v01() {
        this("", "", 0, nl0.SCAR_REQUEST_TYPE_UNSPECIFIED, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v01)) {
            return false;
        }
        v01 v01Var = (v01) obj;
        return Intrinsics.d(this.f12272a, v01Var.f12272a) && Intrinsics.d(this.f12273b, v01Var.f12273b) && this.f12274c == v01Var.f12274c && this.f12275d == v01Var.f12275d && this.f12276e == v01Var.f12276e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12276e) + ((this.f12275d.hashCode() + kh2.n3.f(this.f12274c, kh2.j1.t(this.f12272a.hashCode() * 31, this.f12273b))) * 31);
    }

    public final String toString() {
        String str = this.f12272a;
        String str2 = this.f12273b;
        int i13 = this.f12274c;
        nl0 nl0Var = this.f12275d;
        int i14 = this.f12276e;
        StringBuilder w13 = a.a.w("InternalRequestTraceMeta(internalRequestId=", str, ", gwsQueryId=", str2, ", sequenceNumber=");
        w13.append(i13);
        w13.append(", scarRequestType=");
        w13.append(nl0Var);
        w13.append(", mediationChainLength=");
        return a.a.n(w13, i14, ")");
    }

    public v01(String internalRequestId, String gwsQueryId, int i13, nl0 scarRequestType, int i14) {
        Intrinsics.checkNotNullParameter(internalRequestId, "internalRequestId");
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        Intrinsics.checkNotNullParameter(scarRequestType, "scarRequestType");
        this.f12272a = internalRequestId;
        this.f12273b = gwsQueryId;
        this.f12274c = i13;
        this.f12275d = scarRequestType;
        this.f12276e = i14;
    }
}
