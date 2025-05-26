package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f96598a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f96599b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f96600c;

    /* renamed from: d, reason: collision with root package name */
    public final String f96601d;

    public t1(i0 images, q0 metadata, s1 overlay, String id3) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f96598a = images;
        this.f96599b = metadata;
        this.f96600c = overlay;
        this.f96601d = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Intrinsics.d(this.f96598a, t1Var.f96598a) && Intrinsics.d(this.f96599b, t1Var.f96599b) && Intrinsics.d(this.f96600c, t1Var.f96600c) && Intrinsics.d(this.f96601d, t1Var.f96601d);
    }

    public final int hashCode() {
        return this.f96601d.hashCode() + ((this.f96600c.hashCode() + ((this.f96599b.hashCode() + (this.f96598a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SectionPreviewState(images=" + this.f96598a + ", metadata=" + this.f96599b + ", overlay=" + this.f96600c + ", id=" + this.f96601d + ")";
    }
}
