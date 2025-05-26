package a7;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f1206a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1207b;

    static {
        d7.n0.Q(0);
        d7.n0.Q(1);
    }

    public u(String str, String str2) {
        this.f1206a = d7.n0.Z(str);
        this.f1207b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return Objects.equals(this.f1206a, uVar.f1206a) && Objects.equals(this.f1207b, uVar.f1207b);
    }

    public final int hashCode() {
        int hashCode = this.f1207b.hashCode() * 31;
        String str = this.f1206a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
