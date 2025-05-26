package cc2;

import h32.r3;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f27511a;

    /* renamed from: b, reason: collision with root package name */
    public long f27512b;

    /* renamed from: c, reason: collision with root package name */
    public r3 f27513c;

    /* renamed from: d, reason: collision with root package name */
    public qc2.c f27514d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27515e;

    public final long a(long j13) {
        r3 r3Var = this.f27513c;
        return ((r3Var == null || r3Var == r3.PLAYING) && this.f27512b > 0 && this.f27514d.getTrackingEvent() != qc2.c.Below50.getTrackingEvent() && this.f27514d.getTrackingEvent() != qc2.c.InvalidVisibility.getTrackingEvent()) ? j13 : this.f27511a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f27511a == dVar.f27511a && this.f27512b == dVar.f27512b && this.f27513c == dVar.f27513c && this.f27514d == dVar.f27514d && this.f27515e == dVar.f27515e;
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f27512b, Long.hashCode(this.f27511a) * 31, 31);
        r3 r3Var = this.f27513c;
        return Boolean.hashCode(this.f27515e) + ((this.f27514d.hashCode() + ((c13 + (r3Var == null ? 0 : r3Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        long j13 = this.f27511a;
        long j14 = this.f27512b;
        r3 r3Var = this.f27513c;
        qc2.c cVar = this.f27514d;
        boolean z13 = this.f27515e;
        StringBuilder u13 = a.a.u("EventTracker(playerTimeStamp=", j13, ", videoDuration=");
        u13.append(j14);
        u13.append(", playbackState=");
        u13.append(r3Var);
        u13.append(", viewability=");
        u13.append(cVar);
        u13.append(", previousAudibility=");
        u13.append(z13);
        u13.append(")");
        return u13.toString();
    }
}
