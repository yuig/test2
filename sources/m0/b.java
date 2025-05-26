package m0;

import java.util.ArrayList;
import java.util.List;
import l0.s;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final s f85250a;

    /* renamed from: b, reason: collision with root package name */
    public final s f85251b;

    /* renamed from: c, reason: collision with root package name */
    public final List f85252c;

    public b(s sVar, s sVar2, ArrayList arrayList) {
        if (sVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f85250a = sVar;
        if (sVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f85251b = sVar2;
        this.f85252c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f85250a.equals(bVar.f85250a) && this.f85251b.equals(bVar.f85251b) && this.f85252c.equals(bVar.f85252c);
    }

    public final int hashCode() {
        return ((((this.f85250a.hashCode() ^ 1000003) * 1000003) ^ this.f85251b.hashCode()) * 1000003) ^ this.f85252c.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{primarySurfaceEdge=");
        sb3.append(this.f85250a);
        sb3.append(", secondarySurfaceEdge=");
        sb3.append(this.f85251b);
        sb3.append(", outConfigs=");
        return a.c.j(sb3, this.f85252c, "}");
    }
}
