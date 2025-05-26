package d9;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class e extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54013b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54014c;

    /* renamed from: d, reason: collision with root package name */
    public final String f54015d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f54013b = str;
        this.f54014c = str2;
        this.f54015d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.f54014c, eVar.f54014c) && Objects.equals(this.f54013b, eVar.f54013b) && Objects.equals(this.f54015d, eVar.f54015d);
    }

    public final int hashCode() {
        String str = this.f54013b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f54014c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f54015d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // d9.j
    public final String toString() {
        return this.f54025a + ": language=" + this.f54013b + ", description=" + this.f54014c + ", text=" + this.f54015d;
    }
}
