package g72;

import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f64125a;

    public v(int i13, boolean z13) {
        if (1 == (i13 & 1)) {
            this.f64125a = z13;
        } else {
            kg.t.b1(i13, 1, t.f64109b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f64125a == ((v) obj).f64125a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64125a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("BooleanValue(_0="), this.f64125a, ")");
    }

    public v(boolean z13) {
        this.f64125a = z13;
    }
}
