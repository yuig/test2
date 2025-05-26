package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f83843a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f83844b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83845c;

    public b(u50.i0 title, u50.i0 message, int i13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f83843a = title;
        this.f83844b = message;
        this.f83845c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f83843a, bVar.f83843a) && Intrinsics.d(this.f83844b, bVar.f83844b) && this.f83845c == bVar.f83845c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83845c) + ep.b.d(this.f83844b, this.f83843a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AllSavesEmptyState(title=");
        sb3.append(this.f83843a);
        sb3.append(", message=");
        sb3.append(this.f83844b);
        sb3.append(", iconResId=");
        return a.a.n(sb3, this.f83845c, ")");
    }
}
