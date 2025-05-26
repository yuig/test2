package ww;

import a.cb;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public k f131178a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f131179b;

    /* renamed from: c, reason: collision with root package name */
    public long f131180c;

    /* renamed from: d, reason: collision with root package name */
    public long f131181d;

    /* renamed from: e, reason: collision with root package name */
    public long f131182e;

    /* renamed from: f, reason: collision with root package name */
    public long f131183f;

    /* renamed from: g, reason: collision with root package name */
    public long f131184g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f131178a == iVar.f131178a && this.f131179b == iVar.f131179b && this.f131180c == iVar.f131180c && this.f131181d == iVar.f131181d && this.f131182e == iVar.f131182e && this.f131183f == iVar.f131183f && this.f131184g == iVar.f131184g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f131184g) + a.a.c(this.f131183f, a.a.c(this.f131182e, a.a.c(this.f131181d, a.a.c(this.f131180c, ep.b.e(this.f131179b, this.f131178a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        k kVar = this.f131178a;
        boolean z13 = this.f131179b;
        long j13 = this.f131180c;
        long j14 = this.f131181d;
        long j15 = this.f131182e;
        long j16 = this.f131183f;
        long j17 = this.f131184g;
        StringBuilder sb3 = new StringBuilder("VideoMetadata(previousVideoState=");
        sb3.append(kVar);
        sb3.append(", previousPlayWhenReady=");
        sb3.append(z13);
        sb3.append(", lastPlaybackPositionMs=");
        sb3.append(j13);
        cb.v(sb3, ", totalDurationMs=", j14, ", quartileFirstMs=");
        sb3.append(j15);
        cb.v(sb3, ", quartileSecondMs=", j16, ", quartileThirdMs=");
        return a.a.o(sb3, j17, ")");
    }
}
