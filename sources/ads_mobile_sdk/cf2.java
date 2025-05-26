package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class cf2 {

    /* renamed from: a, reason: collision with root package name */
    public final ue2 f3892a;

    /* renamed from: b, reason: collision with root package name */
    public final ye2 f3893b;

    public cf2(ue2 serverRequest, ye2 serverResponse) {
        Intrinsics.checkNotNullParameter(serverRequest, "serverRequest");
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f3892a = serverRequest;
        this.f3893b = serverResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf2)) {
            return false;
        }
        cf2 cf2Var = (cf2) obj;
        return Intrinsics.d(this.f3892a, cf2Var.f3892a) && Intrinsics.d(this.f3893b, cf2Var.f3893b);
    }

    public final int hashCode() {
        return this.f3893b.hashCode() + (this.f3892a.f12050a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerTransaction(serverRequest=" + this.f3892a + ", serverResponse=" + this.f3893b + ")";
    }
}
