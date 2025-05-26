package f72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* renamed from: a, reason: collision with root package name */
    public final String f61363a;

    public t1(int i13, String str) {
        if (1 == (i13 & 1)) {
            this.f61363a = str;
        } else {
            kg.t.b1(i13, 1, r1.f61360b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && Intrinsics.d(this.f61363a, ((t1) obj).f61363a);
    }

    public final int hashCode() {
        return this.f61363a.hashCode();
    }

    public final String toString() {
        return "id=" + this.f61363a;
    }
}
