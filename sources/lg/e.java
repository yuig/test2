package lg;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ig.b f83187a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f83188b;

    public e(ig.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f83187a = bVar;
        this.f83188b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f83187a.equals(eVar.f83187a)) {
            return Arrays.equals(this.f83188b, eVar.f83188b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f83187a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f83188b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f83187a + ", bytes=[...]}";
    }
}
