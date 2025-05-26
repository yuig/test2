package th2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f117658a;

    public d(List samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        this.f117658a = samples;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f117658a, ((d) obj).f117658a);
    }

    public final int hashCode() {
        return this.f117658a.hashCode();
    }

    public final String toString() {
        return d7.g.k(new StringBuilder("AnrSampleList(samples="), this.f117658a, ')');
    }
}
