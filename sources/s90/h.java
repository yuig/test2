package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.f f111973a;

    public h(sa0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f111973a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f111973a, ((h) obj).f111973a);
    }

    public final int hashCode() {
        return this.f111973a.hashCode();
    }

    public final String toString() {
        return "CollageCutoutEditorEvent(event=" + this.f111973a + ")";
    }
}
