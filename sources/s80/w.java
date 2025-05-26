package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final r72.y1 f111834a;

    public w(r72.y1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f111834a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f111834a, ((w) obj).f111834a);
    }

    public final int hashCode() {
        return this.f111834a.hashCode();
    }

    public final String toString() {
        return "TextAdded(item=" + this.f111834a + ")";
    }
}
