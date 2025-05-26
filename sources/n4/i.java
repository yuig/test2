package n4;

import a.cb;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f89181e = new i(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f89182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f89183b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89184c;

    /* renamed from: d, reason: collision with root package name */
    public final int f89185d;

    public i(int i13, int i14, int i15, int i16) {
        this.f89182a = i13;
        this.f89183b = i14;
        this.f89184c = i15;
        this.f89185d = i16;
    }

    public final long a() {
        return d7.b.a(this.f89182a, this.f89183b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f89182a == iVar.f89182a && this.f89183b == iVar.f89183b && this.f89184c == iVar.f89184c && this.f89185d == iVar.f89185d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89185d) + ep.b.b(this.f89184c, ep.b.b(this.f89183b, Integer.hashCode(this.f89182a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntRect.fromLTRB(");
        sb3.append(this.f89182a);
        sb3.append(", ");
        sb3.append(this.f89183b);
        sb3.append(", ");
        sb3.append(this.f89184c);
        sb3.append(", ");
        return cb.l(sb3, this.f89185d, ')');
    }
}
