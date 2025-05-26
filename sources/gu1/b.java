package gu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f66132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66133b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66134c;

    /* renamed from: d, reason: collision with root package name */
    public final hu1.d f66135d;

    public b(int i13, int i14, int i15, hu1.d user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f66132a = i13;
        this.f66133b = i14;
        this.f66134c = i15;
        this.f66135d = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f66132a == bVar.f66132a && this.f66133b == bVar.f66133b && this.f66134c == bVar.f66134c && Intrinsics.d(this.f66135d, bVar.f66135d);
    }

    public final int hashCode() {
        return this.f66135d.hashCode() + ep.b.b(this.f66134c, ep.b.b(this.f66133b, Integer.hashCode(this.f66132a) * 31, 31), 31);
    }

    public final String toString() {
        return "NavDemoThreeDisplayState(title=" + this.f66132a + ", description=" + this.f66133b + ", buttonLabel=" + this.f66134c + ", user=" + this.f66135d + ")";
    }
}
