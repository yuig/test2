package k31;

import kotlin.jvm.internal.Intrinsics;
import p1.x0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f78236a;

    /* renamed from: b, reason: collision with root package name */
    public final float f78237b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f78238c;

    public b(f previewStyle, float f13, x0 contentPadding) {
        Intrinsics.checkNotNullParameter(previewStyle, "previewStyle");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        this.f78236a = previewStyle;
        this.f78237b = f13;
        this.f78238c = contentPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f78236a, bVar.f78236a) && n4.e.a(this.f78237b, bVar.f78237b) && Intrinsics.d(this.f78238c, bVar.f78238c);
    }

    public final int hashCode() {
        return this.f78238c.hashCode() + a.a.a(this.f78237b, this.f78236a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "IdeaPreviewCarouselDisplayStyle(previewStyle=" + this.f78236a + ", spacing=" + n4.e.b(this.f78237b) + ", contentPadding=" + this.f78238c + ")";
    }

    public b() {
        this(new f(), 0, androidx.compose.foundation.layout.b.b(0.0f, 3));
    }
}
