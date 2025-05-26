package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f70489a;

    public r(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f70489a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f70489a, ((r) obj).f70489a);
    }

    public final int hashCode() {
        return this.f70489a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Refresh(id="), this.f70489a, ")");
    }
}
