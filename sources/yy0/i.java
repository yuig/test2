package yy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f140459a;

    public i(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f140459a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f140459a, ((i) obj).f140459a);
    }

    public final int hashCode() {
        return this.f140459a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UseCaseClicked(id="), this.f140459a, ")");
    }
}
