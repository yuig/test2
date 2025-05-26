package h80;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List f68088a;

    public f(List styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        this.f68088a = styles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f68088a, ((f) obj).f68088a);
    }

    public final int hashCode() {
        return this.f68088a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("OutpaintStylesLoaded(styles="), this.f68088a, ")");
    }
}
