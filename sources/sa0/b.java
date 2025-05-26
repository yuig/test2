package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final u62.k f112160a;

    public b(u62.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f112160a = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f112160a, ((b) obj).f112160a);
    }

    public final int hashCode() {
        return this.f112160a.hashCode();
    }

    public final String toString() {
        return "CutoutEditorUiEvent(event=" + this.f112160a + ")";
    }
}
