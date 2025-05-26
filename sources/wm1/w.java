package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends z {

    /* renamed from: b, reason: collision with root package name */
    public final rl2.g0 f130339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(rl2.g0 image) {
        super(a0.IMAGE);
        Intrinsics.checkNotNullParameter(image, "image");
        this.f130339b = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f130339b, ((w) obj).f130339b);
    }

    public final int hashCode() {
        return this.f130339b.hashCode();
    }

    public final String toString() {
        return "ImageDisplayState(image=" + this.f130339b + ")";
    }
}
