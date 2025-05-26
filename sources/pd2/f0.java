package pd2;

import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class f0 extends p0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* renamed from: b, reason: collision with root package name */
    public float f99839b;

    public f0(float f13) {
        this.f99839b = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Float.compare(this.f99839b, ((f0) obj).f99839b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f99839b);
    }

    public final String toString() {
        return d7.g.h(new StringBuilder("Float(value="), this.f99839b, ')');
    }
}
