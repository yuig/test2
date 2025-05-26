package r0;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a */
    public final long f105542a;

    /* renamed from: b */
    public final long f105543b;

    /* renamed from: c */
    public final b f105544c;

    public j(long j13, long j14, b bVar) {
        this.f105542a = j13;
        this.f105543b = j14;
        this.f105544c = bVar;
    }

    public static j a(long j13, long j14, b bVar) {
        com.bumptech.glide.d.g("duration must be positive value.", j13 >= 0);
        com.bumptech.glide.d.g("bytes must be positive value.", j14 >= 0);
        return new j(j13, j14, bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f105542a == jVar.f105542a && this.f105543b == jVar.f105543b && this.f105544c.equals(jVar.f105544c);
    }

    public final int hashCode() {
        long j13 = this.f105542a;
        int i13 = (((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003;
        long j14 = this.f105543b;
        return ((i13 ^ ((int) ((j14 >>> 32) ^ j14))) * 1000003) ^ this.f105544c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f105542a + ", numBytesRecorded=" + this.f105543b + ", audioStats=" + this.f105544c + "}";
    }
}
