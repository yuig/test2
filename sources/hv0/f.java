package hv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f70456a;

    public f(String tagId) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        this.f70456a = tagId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f70456a, ((f) obj).f70456a);
    }

    public final int hashCode() {
        return this.f70456a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OpenOverlayViewColorPickerSticky(tagId="), this.f70456a, ")");
    }
}
