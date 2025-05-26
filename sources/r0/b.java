package r0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f105491a;

    /* renamed from: b, reason: collision with root package name */
    public final double f105492b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f105493c;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public b(double d2, int i13, Throwable th3) {
        this.f105491a = i13;
        this.f105492b = d2;
        this.f105493c = th3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f105491a == bVar.f105491a && Double.doubleToLongBits(this.f105492b) == Double.doubleToLongBits(bVar.f105492b)) {
            Throwable th3 = bVar.f105493c;
            Throwable th4 = this.f105493c;
            if (th4 == null) {
                if (th3 == null) {
                    return true;
                }
            } else if (th4.equals(th3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (this.f105491a ^ 1000003) * 1000003;
        double d2 = this.f105492b;
        int doubleToLongBits = (i13 ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)))) * 1000003;
        Throwable th3 = this.f105493c;
        return doubleToLongBits ^ (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f105491a + ", audioAmplitudeInternal=" + this.f105492b + ", errorCause=" + this.f105493c + "}";
    }
}
