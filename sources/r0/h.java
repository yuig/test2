package r0;

import java.util.List;

/* loaded from: classes2.dex */
public final class h extends r {

    /* renamed from: j */
    public final int f105518j;

    /* renamed from: k */
    public final String f105519k;

    /* renamed from: l */
    public final List f105520l;

    public h(int i13, String str, List list) {
        this.f105518j = i13;
        this.f105519k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f105520l = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f105518j == ((h) rVar).f105518j) {
            h hVar = (h) rVar;
            if (this.f105519k.equals(hVar.f105519k) && this.f105520l.equals(hVar.f105520l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f105518j ^ 1000003) * 1000003) ^ this.f105519k.hashCode()) * 1000003) ^ this.f105520l.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ConstantQuality{value=");
        sb3.append(this.f105518j);
        sb3.append(", name=");
        sb3.append(this.f105519k);
        sb3.append(", typicalSizes=");
        return a.c.j(sb3, this.f105520l, "}");
    }
}
