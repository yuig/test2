package rf1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f107900a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107901b;

    /* renamed from: c, reason: collision with root package name */
    public final String f107902c;

    public t(String pinId, String creatorId, String sponsorId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(creatorId, "creatorId");
        Intrinsics.checkNotNullParameter(sponsorId, "sponsorId");
        this.f107900a = pinId;
        this.f107901b = creatorId;
        this.f107902c = sponsorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f107900a, tVar.f107900a) && Intrinsics.d(this.f107901b, tVar.f107901b) && Intrinsics.d(this.f107902c, tVar.f107902c);
    }

    public final int hashCode() {
        return this.f107902c.hashCode() + cb.d(this.f107901b, this.f107900a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SponsorshipIds(pinId=");
        sb3.append(this.f107900a);
        sb3.append(", creatorId=");
        sb3.append(this.f107901b);
        sb3.append(", sponsorId=");
        return a.a.p(sb3, this.f107902c, ")");
    }
}
