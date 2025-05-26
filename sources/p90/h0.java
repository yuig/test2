package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f99192a;

    public h0(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f99192a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f99192a, ((h0) obj).f99192a);
    }

    public final int hashCode() {
        return this.f99192a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NavigateToCutoutEditor(id="), this.f99192a, ")");
    }
}
