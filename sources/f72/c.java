package f72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final String f61237a;

    public c(int i13, String str) {
        if (1 == (i13 & 1)) {
            this.f61237a = str;
        } else {
            kg.t.b1(i13, 1, a.f61221b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f61237a, ((c) obj).f61237a);
    }

    public final int hashCode() {
        return this.f61237a.hashCode();
    }

    public final String toString() {
        return "id=" + this.f61237a;
    }
}
