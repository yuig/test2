package yy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f140460a;

    public j(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f140460a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f140460a, ((j) obj).f140460a);
    }

    public final int hashCode() {
        return this.f140460a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UseCaseSeen(id="), this.f140460a, ")");
    }
}
