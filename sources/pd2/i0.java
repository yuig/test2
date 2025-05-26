package pd2;

import a.cb;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class i0 extends p0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* renamed from: b, reason: collision with root package name */
    public int f99845b;

    public i0(int i13) {
        this.f99845b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f99845b == ((i0) obj).f99845b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99845b);
    }

    public final String toString() {
        return cb.l(new StringBuilder("Int(value="), this.f99845b, ')');
    }
}
