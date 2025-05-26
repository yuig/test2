package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Laj/k;", "", "", "a", "Ljava/lang/Integer;", "activeNetworkState", "", "b", "Ljava/lang/Boolean;", "isActiveNetworkMetered", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("active_network_state")
    public Integer activeNetworkState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("active_network_metered")
    public Boolean isActiveNetworkMetered;

    public k() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.activeNetworkState, kVar.activeNetworkState) && Intrinsics.d(this.isActiveNetworkMetered, kVar.isActiveNetworkMetered);
    }

    public final int hashCode() {
        Integer num = this.activeNetworkState;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.isActiveNetworkMetered;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSignals(activeNetworkState=" + this.activeNetworkState + ", isActiveNetworkMetered=" + this.isActiveNetworkMetered + ")";
    }

    public k(int i13) {
        this.activeNetworkState = null;
        this.isActiveNetworkMetered = null;
    }
}
