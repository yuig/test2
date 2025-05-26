package m90;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f86659a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86660b;

    public h1(vh story) {
        Intrinsics.checkNotNullParameter(story, "story");
        this.f86659a = story;
        String id3 = story.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f86660b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && Intrinsics.d(this.f86659a, ((h1) obj).f86659a);
    }

    @Override // m90.k1
    public final String getId() {
        return this.f86660b;
    }

    public final int hashCode() {
        return this.f86659a.hashCode();
    }

    public final String toString() {
        return "PopulatedCarousel(story=" + this.f86659a + ")";
    }
}
