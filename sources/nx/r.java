package nx;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends kg.a {

    /* renamed from: f, reason: collision with root package name */
    public final List f92452f;

    public r(List impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f92452f = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f92452f, ((r) obj).f92452f);
    }

    public final int hashCode() {
        return this.f92452f.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Article(impressions="), this.f92452f, ")");
    }
}
