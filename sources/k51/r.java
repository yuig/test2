package k51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final k41.f f78333a;

    public r(k41.f viewOption) {
        Intrinsics.checkNotNullParameter(viewOption, "viewOption");
        this.f78333a = viewOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f78333a == ((r) obj).f78333a;
    }

    public final int hashCode() {
        return this.f78333a.hashCode();
    }

    public final String toString() {
        return "ViewOptionsItemSelected(viewOption=" + this.f78333a + ")";
    }
}
