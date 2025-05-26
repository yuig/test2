package r0;

import android.location.Location;
import java.io.File;

/* loaded from: classes2.dex */
public final class d extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final long f105502b;

    /* renamed from: c, reason: collision with root package name */
    public final long f105503c;

    /* renamed from: d, reason: collision with root package name */
    public final File f105504d;

    public d(long j13, long j14, File file) {
        this.f105502b = j13;
        this.f105503c = j14;
        this.f105504d = file;
    }

    @Override // gh0.b
    public final long M() {
        return this.f105503c;
    }

    @Override // gh0.b
    public final long O() {
        return this.f105502b;
    }

    @Override // gh0.b
    public final Location P() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f105502b == dVar.f105502b && this.f105503c == dVar.f105503c && this.f105504d.equals(dVar.f105504d);
    }

    public final int hashCode() {
        long j13 = this.f105502b;
        int i13 = (((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003;
        long j14 = this.f105503c;
        return ((i13 ^ ((int) ((j14 >>> 32) ^ j14))) * (-721379959)) ^ this.f105504d.hashCode();
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f105502b + ", durationLimitMillis=" + this.f105503c + ", location=null, file=" + this.f105504d + "}";
    }
}
