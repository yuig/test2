package r90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f106867a;

    public d(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f106867a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f106867a, ((d) obj).f106867a);
    }

    public final int hashCode() {
        return this.f106867a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CutoutEditorSectionRequestArgs(id="), this.f106867a, ")");
    }
}
