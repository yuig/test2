package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f61002a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.q f61003b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f61004c;

    /* renamed from: d, reason: collision with root package name */
    public final int f61005d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f61006e;

    /* renamed from: f, reason: collision with root package name */
    public final y f61007f;

    public g(int i13, rm1.q qVar, Integer num, int i14, boolean z13, y clickEvent) {
        Intrinsics.checkNotNullParameter(clickEvent, "clickEvent");
        this.f61002a = i13;
        this.f61003b = qVar;
        this.f61004c = num;
        this.f61005d = i14;
        this.f61006e = z13;
        this.f61007f = clickEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f61002a == gVar.f61002a && this.f61003b == gVar.f61003b && Intrinsics.d(this.f61004c, gVar.f61004c) && this.f61005d == gVar.f61005d && this.f61006e == gVar.f61006e && Intrinsics.d(this.f61007f, gVar.f61007f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f61002a) * 31;
        rm1.q qVar = this.f61003b;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Integer num = this.f61004c;
        return this.f61007f.hashCode() + ep.b.e(this.f61006e, ep.b.b(this.f61005d, (hashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        return "IconDisplayState(iconRes=" + this.f61002a + ", icon=" + this.f61003b + ", contentDescriptionRes=" + this.f61004c + ", iconTintRes=" + this.f61005d + ", enabled=" + this.f61006e + ", clickEvent=" + this.f61007f + ")";
    }
}
