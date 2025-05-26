package ic2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public double f72100a = 0.0d;

    /* renamed from: b, reason: collision with root package name */
    public double f72101b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public final float f72102c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f72103d = false;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f72104e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f72105f = -9223372036854775807L;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f72100a, aVar.f72100a) == 0 && Double.compare(this.f72101b, aVar.f72101b) == 0 && Float.compare(this.f72102c, aVar.f72102c) == 0 && this.f72103d == aVar.f72103d && this.f72104e == aVar.f72104e && this.f72105f == aVar.f72105f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f72105f) + ep.b.e(this.f72104e, ep.b.e(this.f72103d, a.a.a(this.f72102c, a.c.a(this.f72101b, Double.hashCode(this.f72100a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "LatestEventData(viewWidth=" + this.f72100a + ", viewHeight=" + this.f72101b + ", volumeStream=" + this.f72102c + ", muteState=" + this.f72103d + ", wifiConnected=" + this.f72104e + ", videoDuration=" + this.f72105f + ")";
    }
}
