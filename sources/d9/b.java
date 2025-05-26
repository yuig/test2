package d9;

import a.cb;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b extends j {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f54001b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f54001b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f54025a.equals(bVar.f54025a) && Arrays.equals(this.f54001b, bVar.f54001b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54001b) + cb.d(this.f54025a, 527, 31);
    }
}
