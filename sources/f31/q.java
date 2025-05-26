package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    public final kh2.n f61027a;

    public q(c contentCreate) {
        Intrinsics.checkNotNullParameter(contentCreate, "contentCreate");
        this.f61027a = contentCreate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f61027a, ((q) obj).f61027a);
    }

    public final int hashCode() {
        return this.f61027a.hashCode();
    }

    public final String toString() {
        return "LaunchCreationMenuActionSheetModal(contentCreate=" + this.f61027a + ")";
    }
}
