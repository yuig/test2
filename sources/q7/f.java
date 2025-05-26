package q7;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f102632a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102633b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102634c;

    public f(String str, String str2, String str3) {
        this.f102632a = str;
        this.f102633b = str2;
        this.f102634c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f102632a, fVar.f102632a) && Objects.equals(this.f102633b, fVar.f102633b) && Objects.equals(this.f102634c, fVar.f102634c);
    }

    public final int hashCode() {
        int hashCode = this.f102632a.hashCode() * 31;
        String str = this.f102633b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f102634c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
