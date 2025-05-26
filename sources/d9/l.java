package d9;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class l extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54027b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54028c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54029d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f54027b = str;
        this.f54028c = str2;
        this.f54029d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return Objects.equals(this.f54028c, lVar.f54028c) && Objects.equals(this.f54027b, lVar.f54027b) && Objects.equals(this.f54029d, lVar.f54029d);
    }

    public final int hashCode() {
        String str = this.f54027b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f54028c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f54029d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // d9.j
    public final String toString() {
        return this.f54025a + ": domain=" + this.f54027b + ", description=" + this.f54028c;
    }
}
