package xd2;

import a.cb;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f134638a = 8;

    /* renamed from: b, reason: collision with root package name */
    public final int f134639b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f134640c = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f134638a == aVar.f134638a && this.f134639b == aVar.f134639b && this.f134640c == aVar.f134640c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134640c) + ep.b.b(this.f134639b, Integer.hashCode(this.f134638a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Config(colorBits=");
        sb3.append(this.f134638a);
        sb3.append(", depthBits=");
        sb3.append(this.f134639b);
        sb3.append(", stencilBits=");
        return cb.l(sb3, this.f134640c, ')');
    }
}
