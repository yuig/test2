package q7;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f102644a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102645b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102646c;

    /* renamed from: d, reason: collision with root package name */
    public final String f102647d;

    /* renamed from: e, reason: collision with root package name */
    public final String f102648e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f102644a = str;
        this.f102645b = str2;
        this.f102646c = str3;
        this.f102647d = str4;
        this.f102648e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f102644a, iVar.f102644a) && Objects.equals(this.f102645b, iVar.f102645b) && Objects.equals(this.f102646c, iVar.f102646c) && Objects.equals(this.f102647d, iVar.f102647d) && Objects.equals(this.f102648e, iVar.f102648e);
    }

    public final int hashCode() {
        String str = this.f102644a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f102645b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f102646c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f102647d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f102648e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
