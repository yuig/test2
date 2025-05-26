package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Laj/h;", "", "Laj/e;", "a", "Laj/e;", "batterySignals", "Laj/f;", "b", "Laj/f;", "browserSignals", "Laj/j;", "c", "Laj/j;", "memorySignals", "Laj/k;", "d", "Laj/k;", "networkSignals", "Laj/n;", "e", "Laj/n;", "playStoreSignals", "", "f", "Ljava/lang/String;", "buildName", "", "g", "Ljava/lang/Long;", "remainingDataPartitionSpaceKilobytes", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("battery")
    @NotNull
    public final e batterySignals;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("browser")
    @NotNull
    public final f browserSignals;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("android_mem_info")
    @NotNull
    public j memorySignals;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("network")
    @NotNull
    public final k networkSignals;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("play_store")
    @NotNull
    public final n playStoreSignals;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("build")
    public String buildName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("remaining_data_partition_space")
    public Long remainingDataPartitionSpaceKilobytes;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.batterySignals, hVar.batterySignals) && Intrinsics.d(this.browserSignals, hVar.browserSignals) && Intrinsics.d(this.memorySignals, hVar.memorySignals) && Intrinsics.d(this.networkSignals, hVar.networkSignals) && Intrinsics.d(this.playStoreSignals, hVar.playStoreSignals) && Intrinsics.d(this.buildName, hVar.buildName) && Intrinsics.d(this.remainingDataPartitionSpaceKilobytes, hVar.remainingDataPartitionSpaceKilobytes);
    }

    public final int hashCode() {
        int hashCode = (this.playStoreSignals.hashCode() + ((this.networkSignals.hashCode() + ((this.memorySignals.hashCode() + ((this.browserSignals.hashCode() + (this.batterySignals.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.buildName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l13 = this.remainingDataPartitionSpaceKilobytes;
        return hashCode2 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSignals(batterySignals=" + this.batterySignals + ", browserSignals=" + this.browserSignals + ", memorySignals=" + this.memorySignals + ", networkSignals=" + this.networkSignals + ", playStoreSignals=" + this.playStoreSignals + ", buildName=" + this.buildName + ", remainingDataPartitionSpaceKilobytes=" + this.remainingDataPartitionSpaceKilobytes + ")";
    }

    public h(int i13) {
        e batterySignals = new e(0);
        f browserSignals = new f(0);
        j memorySignals = new j(0);
        k networkSignals = new k(0);
        n playStoreSignals = new n(0);
        Intrinsics.checkNotNullParameter(batterySignals, "batterySignals");
        Intrinsics.checkNotNullParameter(browserSignals, "browserSignals");
        Intrinsics.checkNotNullParameter(memorySignals, "memorySignals");
        Intrinsics.checkNotNullParameter(networkSignals, "networkSignals");
        Intrinsics.checkNotNullParameter(playStoreSignals, "playStoreSignals");
        this.batterySignals = batterySignals;
        this.browserSignals = browserSignals;
        this.memorySignals = memorySignals;
        this.networkSignals = networkSignals;
        this.playStoreSignals = playStoreSignals;
        this.buildName = null;
        this.remainingDataPartitionSpaceKilobytes = null;
    }
}
