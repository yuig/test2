package pd2;

import a.cb;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class x extends p0 {

    @NotNull
    public static final w Companion = new w();

    /* renamed from: b, reason: collision with root package name */
    public boolean f99879b;

    public x(boolean z13) {
        this.f99879b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f99879b == ((x) obj).f99879b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99879b);
    }

    public final String toString() {
        return cb.m(new StringBuilder("Bool(value="), this.f99879b, ')');
    }
}
