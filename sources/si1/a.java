package si1;

import android.graphics.Rect;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f113003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f113005c;

    /* renamed from: d, reason: collision with root package name */
    public final int f113006d;

    public a(int i13, int i14, int i15, int i16) {
        this.f113003a = i13;
        this.f113004b = i14;
        this.f113005c = i15;
        this.f113006d = i16;
    }

    public final boolean a(int i13, int i14) {
        int i15;
        int i16;
        int i17 = this.f113003a;
        int i18 = this.f113005c;
        return i17 < i18 && (i15 = this.f113004b) < (i16 = this.f113006d) && i13 >= i17 && i13 < i18 && i14 >= i15 && i14 < i16;
    }

    public final Rect b() {
        return new Rect(this.f113003a, this.f113004b, this.f113005c, this.f113006d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f113003a == aVar.f113003a && this.f113004b == aVar.f113004b && this.f113005c == aVar.f113005c && this.f113006d == aVar.f113006d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113006d) + ep.b.b(this.f113005c, ep.b.b(this.f113004b, Integer.hashCode(this.f113003a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DataRect(left=");
        sb3.append(this.f113003a);
        sb3.append(", top=");
        sb3.append(this.f113004b);
        sb3.append(", right=");
        sb3.append(this.f113005c);
        sb3.append(", bottom=");
        return a.a.n(sb3, this.f113006d, ")");
    }
}
