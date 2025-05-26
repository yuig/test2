package sk0;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f113044a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.q f113045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f113046c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f113047d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f113048e;

    public /* synthetic */ a(i0 i0Var, rm1.q qVar, int i13, int i14) {
        this(i0Var, qVar, i13, (i14 & 8) != 0, false);
    }

    public static a e(a aVar, boolean z13) {
        i0 name = aVar.f113044a;
        rm1.q icon = aVar.f113045b;
        int i13 = aVar.f113046c;
        boolean z14 = aVar.f113048e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new a(name, icon, i13, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f113044a, aVar.f113044a) && this.f113045b == aVar.f113045b && this.f113046c == aVar.f113046c && this.f113047d == aVar.f113047d && this.f113048e == aVar.f113048e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113048e) + ep.b.e(this.f113047d, ep.b.b(this.f113046c, (this.f113045b.hashCode() + (this.f113044a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FloatingToolDisplayState(name=");
        sb3.append(this.f113044a);
        sb3.append(", icon=");
        sb3.append(this.f113045b);
        sb3.append(", type=");
        sb3.append(this.f113046c);
        sb3.append(", isEnabled=");
        sb3.append(this.f113047d);
        sb3.append(", iconNeedsMirror=");
        return a.a.r(sb3, this.f113048e, ")");
    }

    public a(i0 name, rm1.q icon, int i13, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f113044a = name;
        this.f113045b = icon;
        this.f113046c = i13;
        this.f113047d = z13;
        this.f113048e = z14;
    }
}
