package s80;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c5 implements d5 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f111486a;

    public c5(yk2.o options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f111486a = options;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5) && Intrinsics.d(this.f111486a, ((c5) obj).f111486a);
    }

    public final int hashCode() {
        return this.f111486a.hashCode();
    }

    public final String toString() {
        return "ShowCollageOptionsSheet(options=" + this.f111486a + ")";
    }
}
