package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f70487a;

    public o(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f70487a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f70487a, ((o) obj).f70487a);
    }

    public final int hashCode() {
        return this.f70487a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FetchStela(id="), this.f70487a, ")");
    }
}
