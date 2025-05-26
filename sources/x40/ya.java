package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ya {

    /* renamed from: a, reason: collision with root package name */
    public final String f133737a;

    public ya(String str) {
        this.f133737a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya) && Intrinsics.d(this.f133737a, ((ya) obj).f133737a);
    }

    public final int hashCode() {
        String str = this.f133737a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f133737a, ")");
    }
}
