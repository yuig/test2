package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f96456a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96457b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96458c;

    public a(rm1.q icon, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f96456a = icon;
        this.f96457b = z13;
        this.f96458c = i13;
    }

    public static a e(a aVar, boolean z13) {
        rm1.q icon = aVar.f96456a;
        int i13 = aVar.f96458c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new a(icon, z13, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96456a == aVar.f96456a && this.f96457b == aVar.f96457b && this.f96458c == aVar.f96458c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96458c) + ep.b.e(this.f96457b, this.f96456a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardActionDisplayState(icon=");
        sb3.append(this.f96456a);
        sb3.append(", enabled=");
        sb3.append(this.f96457b);
        sb3.append(", id=");
        return a.a.n(sb3, this.f96458c, ")");
    }
}
