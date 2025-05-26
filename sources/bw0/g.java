package bw0;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f23984a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f23985b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f23986c;

    public g(LinkedHashSet setOfPageIds, Set setOfPageIdToMediaId, Set setOfPageIdToImageSignature) {
        Intrinsics.checkNotNullParameter(setOfPageIds, "setOfPageIds");
        Intrinsics.checkNotNullParameter(setOfPageIdToMediaId, "setOfPageIdToMediaId");
        Intrinsics.checkNotNullParameter(setOfPageIdToImageSignature, "setOfPageIdToImageSignature");
        this.f23984a = setOfPageIds;
        this.f23985b = setOfPageIdToMediaId;
        this.f23986c = setOfPageIdToImageSignature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f23984a, gVar.f23984a) && Intrinsics.d(this.f23985b, gVar.f23985b) && Intrinsics.d(this.f23986c, gVar.f23986c);
    }

    public final int hashCode() {
        return this.f23986c.hashCode() + ((this.f23985b.hashCode() + (this.f23984a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreviousSessionMediaInfo(setOfPageIds=" + this.f23984a + ", setOfPageIdToMediaId=" + this.f23985b + ", setOfPageIdToImageSignature=" + this.f23986c + ")";
    }
}
