package g72;

import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class f1 {

    @NotNull
    public static final e1 Companion = new e1();

    /* renamed from: a, reason: collision with root package name */
    public final float f63982a;

    public f1(int i13, float f13) {
        if (1 == (i13 & 1)) {
            this.f63982a = f13;
        } else {
            kg.t.b1(i13, 1, d1.f63964b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Float.compare(this.f63982a, ((f1) obj).f63982a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f63982a);
    }

    public final String toString() {
        return d7.g.i(new StringBuilder("FloatValue(_0="), this.f63982a, ")");
    }

    public f1(float f13) {
        this.f63982a = f13;
    }
}
