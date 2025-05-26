package qf1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends rl2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f103650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f103651b;

    /* renamed from: c, reason: collision with root package name */
    public final String f103652c;

    /* renamed from: d, reason: collision with root package name */
    public final kg.a f103653d;

    public d(String creatorId, String sponsorId, kg.a tapSource) {
        Intrinsics.checkNotNullParameter(creatorId, "creatorId");
        Intrinsics.checkNotNullParameter(sponsorId, "sponsorId");
        Intrinsics.checkNotNullParameter(tapSource, "tapSource");
        this.f103650a = sponsorId;
        this.f103651b = creatorId;
        this.f103652c = sponsorId;
        this.f103653d = tapSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f103651b, dVar.f103651b) && Intrinsics.d(this.f103652c, dVar.f103652c) && Intrinsics.d(this.f103653d, dVar.f103653d);
    }

    public final int hashCode() {
        return this.f103653d.hashCode() + cb.d(this.f103652c, this.f103651b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SponsoredAdTap(creatorId=" + this.f103651b + ", sponsorId=" + this.f103652c + ", tapSource=" + this.f103653d + ")";
    }
}
