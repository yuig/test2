package l0;

import java.util.List;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final s f81202a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81203b;

    public c(s sVar, List list) {
        if (sVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f81202a = sVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f81203b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f81202a.equals(cVar.f81202a) && this.f81203b.equals(cVar.f81203b);
    }

    public final int hashCode() {
        return ((this.f81202a.hashCode() ^ 1000003) * 1000003) ^ this.f81203b.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{surfaceEdge=");
        sb3.append(this.f81202a);
        sb3.append(", outConfigs=");
        return a.c.j(sb3, this.f81203b, "}");
    }
}
