package nx;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends kg.a {

    /* renamed from: f, reason: collision with root package name */
    public final List f92455f;

    public s(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f92455f = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f92455f, ((s) obj).f92455f);
    }

    public final int hashCode() {
        return this.f92455f.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Pin(impressions="), this.f92455f, ")");
    }
}
