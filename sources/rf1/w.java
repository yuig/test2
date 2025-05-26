package rf1;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long f107921a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f107922b;

    public w() {
        HashMap pageDurationInMs = new HashMap();
        Intrinsics.checkNotNullParameter(pageDurationInMs, "pageDurationInMs");
        this.f107921a = 0L;
        this.f107922b = pageDurationInMs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f107921a == wVar.f107921a && Intrinsics.d(this.f107922b, wVar.f107922b);
    }

    public final int hashCode() {
        return this.f107922b.hashCode() + (Long.hashCode(this.f107921a) * 31);
    }

    public final String toString() {
        return "IdeaPinDurationData(totalDurationInMs=" + this.f107921a + ", pageDurationInMs=" + this.f107922b + ")";
    }
}
