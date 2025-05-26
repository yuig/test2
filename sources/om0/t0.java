package om0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements u50.o {

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f96595c = new t0(kotlin.collections.q0.f80391a);

    /* renamed from: a, reason: collision with root package name */
    public final List f96596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96597b;

    public t0(List previews) {
        Intrinsics.checkNotNullParameter(previews, "previews");
        this.f96596a = previews;
        this.f96597b = previews.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f96596a, ((t0) obj).f96596a);
    }

    public final int hashCode() {
        return this.f96596a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("SavedContentCarouselState(previews="), this.f96596a, ")");
    }
}
