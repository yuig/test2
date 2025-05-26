package g40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f63493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63494b;

    public d(String __typename, String id3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f63493a = __typename;
        this.f63494b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f63493a, dVar.f63493a) && Intrinsics.d(this.f63494b, dVar.f63494b);
    }

    public final int hashCode() {
        return this.f63494b.hashCode() + (this.f63493a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f63493a);
        sb3.append(", id=");
        return a.a.p(sb3, this.f63494b, ")");
    }
}
