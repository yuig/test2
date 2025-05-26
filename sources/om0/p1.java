package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f96563a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f96564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96565c;

    public p1(k0 images, q0 metadata) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f96563a = images;
        this.f96564b = metadata;
        this.f96565c = images.f96532b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.d(this.f96563a, p1Var.f96563a) && Intrinsics.d(this.f96564b, p1Var.f96564b);
    }

    public final int hashCode() {
        return this.f96564b.hashCode() + (this.f96563a.f96531a.hashCode() * 31);
    }

    public final String toString() {
        return "SavesPreviewState(images=" + this.f96563a + ", metadata=" + this.f96564b + ")";
    }
}
