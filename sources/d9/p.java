package d9;

import a.cb;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class p extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54039b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54040c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f54039b = str2;
        this.f54040c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f54025a.equals(pVar.f54025a) && Objects.equals(this.f54039b, pVar.f54039b) && Objects.equals(this.f54040c, pVar.f54040c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f54025a, 527, 31);
        String str = this.f54039b;
        int hashCode = (d2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f54040c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // d9.j
    public final String toString() {
        return this.f54025a + ": url=" + this.f54040c;
    }
}
