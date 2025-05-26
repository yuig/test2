package aj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Laj/o;", "", "Laj/d;", "a", "Laj/d;", "appStats", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("app")
    @NotNull
    public final d appStats;

    public o(d appStats) {
        Intrinsics.checkNotNullParameter(appStats, "appStats");
        this.appStats = appStats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.appStats, ((o) obj).appStats);
    }

    public final int hashCode() {
        return this.appStats.hashCode();
    }

    public final String toString() {
        return "QualitySignals(appStats=" + this.appStats + ")";
    }
}
