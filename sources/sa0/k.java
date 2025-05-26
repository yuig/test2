package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final u62.k f112177a;

    public k(u62.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f112177a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f112177a, ((k) obj).f112177a);
    }

    public final int hashCode() {
        return this.f112177a.hashCode();
    }

    public final String toString() {
        return "CutoutEditorViewEventOccurred(event=" + this.f112177a + ")";
    }
}
