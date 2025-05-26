package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Laj/j;", "", "", "a", "Ljava/lang/Long;", "runtimeFreeMemory", "b", "runtimeMaxMemory", "c", "runtimeTotalMemory", "", "d", "Ljava/lang/Integer;", "webviewCount", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("runtime_free")
    public Long runtimeFreeMemory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("runtime_max")
    public Long runtimeMaxMemory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("runtime_total")
    public Long runtimeTotalMemory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("web_view_count")
    public Integer webviewCount;

    public j() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.runtimeFreeMemory, jVar.runtimeFreeMemory) && Intrinsics.d(this.runtimeMaxMemory, jVar.runtimeMaxMemory) && Intrinsics.d(this.runtimeTotalMemory, jVar.runtimeTotalMemory) && Intrinsics.d(this.webviewCount, jVar.webviewCount);
    }

    public final int hashCode() {
        Long l13 = this.runtimeFreeMemory;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.runtimeMaxMemory;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.runtimeTotalMemory;
        int hashCode3 = (hashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.webviewCount;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MemorySignals(runtimeFreeMemory=" + this.runtimeFreeMemory + ", runtimeMaxMemory=" + this.runtimeMaxMemory + ", runtimeTotalMemory=" + this.runtimeTotalMemory + ", webviewCount=" + this.webviewCount + ")";
    }

    public j(int i13) {
        this.runtimeFreeMemory = null;
        this.runtimeMaxMemory = null;
        this.runtimeTotalMemory = null;
        this.webviewCount = null;
    }
}
