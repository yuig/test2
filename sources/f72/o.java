package f72;

import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* renamed from: a, reason: collision with root package name */
    public final int f61322a;

    public o(int i13, int i14) {
        if ((i13 & 1) == 0) {
            this.f61322a = 0;
        } else {
            this.f61322a = i14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f61322a == ((o) obj).f61322a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61322a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ReactionCountsEntity(likes="), this.f61322a, ")");
    }
}
