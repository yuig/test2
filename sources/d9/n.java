package d9;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class n extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54035b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f54036c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f54035b = str;
        this.f54036c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return Objects.equals(this.f54035b, nVar.f54035b) && Arrays.equals(this.f54036c, nVar.f54036c);
    }

    public final int hashCode() {
        String str = this.f54035b;
        return Arrays.hashCode(this.f54036c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // d9.j
    public final String toString() {
        return this.f54025a + ": owner=" + this.f54035b;
    }
}
