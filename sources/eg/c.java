package eg;

import java.util.List;

/* loaded from: classes3.dex */
public final class c implements dg.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f58845a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58846b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f58847c;

    public c(String str, int i13, Object obj) {
        this.f58845a = str;
        this.f58846b = i13;
        this.f58847c = obj.getClass();
    }

    @Override // dg.a
    public final boolean a(List list) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f58846b == cVar.f58846b && this.f58845a.equals(cVar.f58845a) && this.f58847c.equals(cVar.f58847c);
    }

    public final int hashCode() {
        return this.f58847c.hashCode() + (((this.f58845a.hashCode() * 43) + this.f58846b) * 43);
    }

    public final String toString() {
        return "[DotGuard: " + this.f58845a + " " + this.f58846b + " " + this.f58847c.getName() + "]";
    }
}
