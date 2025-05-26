package y9;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: f, reason: collision with root package name */
    public long f138097f;

    /* renamed from: g, reason: collision with root package name */
    public long f138098g;

    @Override // y9.e, y9.d
    public final boolean equals(Object obj) {
        if ((obj instanceof f) && super.equals(obj)) {
            f fVar = (f) obj;
            if (this.f138097f == fVar.f138097f && this.f138098g == fVar.f138098g) {
                return true;
            }
        }
        return false;
    }

    @Override // y9.e, y9.d
    public final int hashCode() {
        return Long.hashCode(this.f138098g) + (Long.hashCode(this.f138097f) * 31) + (super.hashCode() * 31);
    }

    @Override // y9.e, y9.d
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FrameData(frameStartNanos=");
        sb3.append(this.f138093b);
        sb3.append(", frameDurationUiNanos=");
        sb3.append(this.f138094c);
        sb3.append(", frameDurationCpuNanos=");
        sb3.append(this.f138096e);
        sb3.append(", frameDurationTotalNanos=");
        sb3.append(this.f138097f);
        sb3.append(", frameOverrunNanos=");
        sb3.append(this.f138098g);
        sb3.append(", isJank=");
        sb3.append(this.f138095d);
        sb3.append(", states=");
        return d7.g.k(sb3, this.f138092a, ')');
    }
}
