package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final sa0.f f99181a;

    public d(sa0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f99181a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f99181a, ((d) obj).f99181a);
    }

    public final int hashCode() {
        return this.f99181a.hashCode();
    }

    public final String toString() {
        return "CloseupCutoutEditorEvent(event=" + this.f99181a + ")";
    }
}
