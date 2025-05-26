package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f70483a;

    public k(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f70483a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f70483a, ((k) obj).f70483a);
    }

    public final int hashCode() {
        return this.f70483a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Refresh(id="), this.f70483a, ")");
    }
}
