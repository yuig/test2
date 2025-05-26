package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f106910c = new d(c.f106905d, k.f106951a);

    /* renamed from: a, reason: collision with root package name */
    public final c f106911a;

    /* renamed from: b, reason: collision with root package name */
    public final l f106912b;

    public d(c ids, l source) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f106911a = ids;
        this.f106912b = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f106911a, dVar.f106911a) && Intrinsics.d(this.f106912b, dVar.f106912b);
    }

    public final int hashCode() {
        return this.f106912b.hashCode() + (this.f106911a.hashCode() * 31);
    }

    public final String toString() {
        return "CollagePreview(ids=" + this.f106911a + ", source=" + this.f106912b + ")";
    }
}
