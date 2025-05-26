package hv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f70455a;

    public e(String tagId) {
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        this.f70455a = tagId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f70455a, ((e) obj).f70455a);
    }

    public final int hashCode() {
        return this.f70455a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OpenOverlayViewColorPicker(tagId="), this.f70455a, ")");
    }
}
