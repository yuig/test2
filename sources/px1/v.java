package px1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final q f101702a;

    public v(q filterSelection) {
        Intrinsics.checkNotNullParameter(filterSelection, "filterSelection");
        this.f101702a = filterSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f101702a, ((v) obj).f101702a);
    }

    public final int hashCode() {
        return this.f101702a.hashCode();
    }

    public final String toString() {
        return "SelectionModalDismissed(filterSelection=" + this.f101702a + ")";
    }
}
