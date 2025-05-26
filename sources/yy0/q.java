package yy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f140470a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f140471b;

    public q(String id3, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f140470a = id3;
        this.f140471b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f140470a, qVar.f140470a) && this.f140471b == qVar.f140471b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140471b) + (this.f140470a.hashCode() * 31);
    }

    public final String toString() {
        return "ToggleUseCaseSelection(id=" + this.f140470a + ", deleteRemovedPinsOnApi=" + this.f140471b + ")";
    }
}
