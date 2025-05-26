package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements u {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f27143a;

    public m(j1 image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f27143a = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f27143a, ((m) obj).f27143a);
    }

    public final int hashCode() {
        return this.f27143a.hashCode();
    }

    public final String toString() {
        return "PathGenerationCompleted(image=" + this.f27143a + ")";
    }
}
