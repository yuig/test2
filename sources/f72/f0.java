package f72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final String f61248a;

    public f0(int i13, String str) {
        if (1 == (i13 & 1)) {
            this.f61248a = str;
        } else {
            kg.t.b1(i13, 1, d0.f61243b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f61248a, ((f0) obj).f61248a);
    }

    public final int hashCode() {
        return this.f61248a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShuffleItemPinEntity(id="), this.f61248a, ")");
    }
}
