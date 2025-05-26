package k31;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f78235a;

    public a(List previews) {
        Intrinsics.checkNotNullParameter(previews, "previews");
        this.f78235a = previews;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f78235a, ((a) obj).f78235a);
    }

    public final int hashCode() {
        return this.f78235a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("IdeaPreviewCarouselDisplayState(previews="), this.f78235a, ")");
    }
}
